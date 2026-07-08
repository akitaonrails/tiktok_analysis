package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import lth.o;

/* JADX INFO: renamed from: X.0XgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C854850XgB {
    public static final boolean LIZ(Context context) {
        if (((Boolean) C281050Azv.LIZ.getValue()).booleanValue()) {
            float fLIZLLL = C304960BxO.LIZLLL();
            float fLIZIZ = C304960BxO.LIZIZ();
            if (fLIZLLL > C2555509zt.LIZ && fLIZIZ < C2555509zt.LIZIZ) {
                return false;
            }
        } else if (!C2256151DSj.LJIILLIIL.disablePreCompile()) {
            try {
                C855240Xgo c855240XgoLIZIZ = LIZIZ(context);
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PreSyntheticMachinePerformanceLimitLevel1 ");
                sbLIZ.append(c855240XgoLIZIZ.LIZIZ);
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                if (c855240XgoLIZIZ.LIZ) {
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C201955140j.LJIIJ(C830690WiJ.LIZIZ, "isPreSyntheticMachinePerformanceLimitLevel1 error", th);
            }
        } else {
            return false;
        }
        if (o.LJIIZILJ.isLogin()) {
            return true;
        }
        return false;
    }

    public static final C855240Xgo LIZIZ(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF((ActivityManager) C786410Ut5.H2(context, "activity"), memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCbVL/HHVZso=", null));
        long j = 1024;
        int i = (int) ((memoryInfo.totalMem / j) / j);
        if (i > 0 && i < 1600) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TotalMemory min:");
            sbLIZ.append(1600);
            sbLIZ.append(" current:");
            sbLIZ.append(i);
            return new C855240Xgo(true, C2188811AlT.LIZIZ(sbLIZ));
        }
        return new C855240Xgo(false, "allow");
    }
}
