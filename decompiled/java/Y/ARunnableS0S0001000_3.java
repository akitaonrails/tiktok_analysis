package Y;

import X.AnonymousClass0810;
import X.C0MAY;
import X.C0VSJ;
import X.C15O7;
import X.C1C7U;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C570220MYa;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.DexCacheExpandOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS0S0001000_3 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f276i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C0VSJ c0vsjLJIIIZ = C570220MYa.LJIIIZ(true);
            if (c0vsjLJIIIZ.exists()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (((this.f276i0 * 24) * 60) * 60)) * 1000);
                File[] fileArrListFiles = c0vsjLJIIIZ.listFiles();
                if (fileArrListFiles != null) {
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        if (file.lastModified() < jCurrentTimeMillis && file.delete()) {
                            i++;
                        }
                    }
                    if (i > 0) {
                        C0MAY c0may = C0MAY.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cleaned ");
                        sbLIZ.append(i);
                        sbLIZ.append(" expired logs");
                        C201955140j.LIZLLL(c0may, "DraftLogService", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C0MAY.LIZIZ, "DraftLogService", "Clean expired logs failed", e);
        }
    }

    public static final void run$0(ARunnableS0S0001000_3 aRunnableS0S0001000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SearchCpuBooster@196c.perfLockAcquire$1");
        try {
            AnonymousClass0810.LIZ.LIZ(aRunnableS0S0001000_3.f276i0, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCpuBooster@196c.perfLockAcquire$1");
    }

    public static final void run$1(ARunnableS0S0001000_3 aRunnableS0S0001000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.dexCacheExpand$1");
        try {
            DexCacheExpandOpt.LIZ(aRunnableS0S0001000_3.f276i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.dexCacheExpand$1");
    }

    public static final void run$2(ARunnableS0S0001000_3 aRunnableS0S0001000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$2");
        try {
            final int i = aRunnableS0S0001000_3.f276i0;
            C15O7.LIZIZ(new Callable() { // from class: X.08pb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$2$1");
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("requestCount", Integer.valueOf(i));
                    JSONObject jSONObjectLJ = c2241008qG.LJ();
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("combine_settings_monitor_service", 0, jSONObjectLJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$2$1");
                    return unit;
                }
            }, C20684815ws.LJFF(), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$2");
    }

    public static final void run$3(ARunnableS0S0001000_3 aRunnableS0S0001000_3) {
        boolean zLIZ;
        C1C7U.LIZ("StoryCreativeToolsJatoHelper@ab7b.onEnterNewPage$3");
        try {
            JatoXL.resetPriority(aRunnableS0S0001000_3.f276i0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryCreativeToolsJatoHelper@ab7b.onEnterNewPage$3");
    }

    public static final void run$4(ARunnableS0S0001000_3 aRunnableS0S0001000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DraftLogService@b8d8.cleanExpiredLogs$1");
        try {
            aRunnableS0S0001000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftLogService@b8d8.cleanExpiredLogs$1");
    }

    public static final void run$5(ARunnableS0S0001000_3 aRunnableS0S0001000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcEnterInnerFlowKt@7ea2.perfLockAcquire$1");
        try {
            AnonymousClass0810.LIZ.LIZ(aRunnableS0S0001000_3.f276i0, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcEnterInnerFlowKt@7ea2.perfLockAcquire$1");
    }

    public ARunnableS0S0001000_3(int i, int i2) {
        this.$t = i2;
        this.f276i0 = i;
    }
}
