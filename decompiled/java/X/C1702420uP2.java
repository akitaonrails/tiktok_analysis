package X;

import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.ss.android.ugc.aweme.experiment.ThreadBindCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0uP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702420uP2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ() {
        final List<ThreadBindCore> list = C587360N1y.LIZ().otherThreadBindCoreConfig;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<ThreadBindCore> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().threadName);
        }
        JatoXL.fetchTidList(C1BWL.LIZ(), new ArrayList(arrayList), new InterfaceC800630Vav() { // from class: X.0uOz
            @Override // X.InterfaceC800630Vav
            public final void LIZ(HashMap<String, Integer> map) {
                for (ThreadBindCore threadBindCore : list) {
                    Integer num = map.get(threadBindCore.threadName);
                    if (num != null) {
                        int i = threadBindCore.bindCore;
                        if (i == 1) {
                            CpusetManager.bindLittleCore(num.intValue());
                        } else if (i == 2) {
                            CpusetManager.bindBigCore(num.intValue());
                        }
                    }
                }
            }
        });
    }

    public static void LIZIZ(long j, int... iArr) {
        if (((Number) C04VH.LIZ.getValue()).intValue() != 0 && JatoXL.isInited()) {
            SystemClock.uptimeMillis();
            for (int i : iArr) {
                if ((((Number) C04VH.LIZ.getValue()).intValue() & i) == i) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 8) {
                                    if (i != 16) {
                                        if (i == 32) {
                                            JatoXL.resetRenderThread();
                                        }
                                    } else {
                                        CpusetManager.resetCoreBind();
                                    }
                                } else if (C1702430uP3.LJII) {
                                    JatoXL.requestBlockGc(j);
                                }
                            } else {
                                JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
                                C2487409ou.LIZLLL(j, new Runnable() { // from class: X.0uP1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("JatoBoostTool@735c.boost$1$2");
                                        try {
                                            JatoXL.resetRenderThread();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("JatoBoostTool@735c.boost$1$2");
                                    }
                                });
                            }
                        } else {
                            JatoXL.tryCpuBoost(j);
                        }
                    } else {
                        CpusetManager.bindBigCore();
                        C2487409ou.LIZLLL(j, new Runnable() { // from class: X.0uP0
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("JatoBoostTool@735c.boost$1$1");
                                try {
                                    CpusetManager.resetCoreBind();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("JatoBoostTool@735c.boost$1$1");
                            }
                        });
                    }
                }
            }
        }
    }
}
