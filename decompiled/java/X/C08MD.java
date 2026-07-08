package X;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveDowngradeThreadMapSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08MD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MD {
    public static final C08MD LIZ = new C08MD();
    public static final CopyOnWriteArrayList<Integer> LIZIZ = new CopyOnWriteArrayList<>();
    public static volatile HandlerThread LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    public static void LIZ() {
        ?? linkedList;
        Double d;
        LiveDowngradeThreadMapSetting liveDowngradeThreadMapSetting = LiveDowngradeThreadMapSetting.INSTANCE;
        if (liveDowngradeThreadMapSetting.enable()) {
            Map<String, Double> value = liveDowngradeThreadMapSetting.getValue();
            if (LiveEnterRoomClickPerfOptSetting.optThreadPriorityBoostWatch()) {
                linkedList = C08MA.LIZ(value != null ? value.keySet() : null);
            } else {
                ThreadGroup threadGroup = C786410Ut5.u3().getThreadGroup();
                ThreadGroup threadGroup2 = threadGroup;
                while (threadGroup != null) {
                    threadGroup2 = threadGroup;
                    threadGroup = threadGroup.getParent();
                }
                linkedList = new LinkedList();
                if (threadGroup2 != null) {
                    int iActiveCount = (int) (((double) threadGroup2.activeCount()) * 1.5d);
                    Thread[] threadArr = new Thread[iActiveCount];
                    threadGroup2.enumerate(threadArr);
                    for (int i = 0; i < iActiveCount; i++) {
                        Thread thread = threadArr[i];
                        if (thread != null) {
                            linkedList.add(new C08MB(thread));
                        }
                    }
                }
            }
            if (value == null) {
                return;
            }
            for (C08MB c08mb : linkedList) {
                if (!TextUtils.isEmpty(c08mb.LIZ)) {
                    for (String str : value.keySet()) {
                        if (u.LJJIIJZLJL(c08mb.LIZ, str, false) && (d = value.get(str)) != null) {
                            double dDoubleValue = d.doubleValue();
                            int i2 = c08mb.LIZIZ;
                            if (c08mb.LIZJ < dDoubleValue) {
                                JatoXL.setPriority(i2, (int) dDoubleValue);
                                LIZIZ.add(Integer.valueOf(i2));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final HandlerThread LIZIZ() {
        HandlerThread handlerThread = LIZJ;
        if (handlerThread == null || !handlerThread.isAlive() || C786410Ut5.W2(handlerThread) == null) {
            synchronized (LIZ) {
                try {
                    HandlerThread handlerThread2 = LIZJ;
                    if (handlerThread2 == null || !handlerThread2.isAlive() || C786410Ut5.W2(handlerThread2) == null) {
                        HandlerThread handlerThread3 = new HandlerThread("live_handler_thr");
                        handlerThread3.start();
                        LIZJ = handlerThread3;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
