package X;

import com.bytedance.bpea.core.IBPEALazyInit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.TTPSystemAPIInit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Wu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838000Wu6 {
    public static final C838030Wu9 LIZ;

    static {
        IBPEALazyInit iBPEALazyInit;
        Object objLIZ = C04TD.LIZ(IBPEALazyInit.class, false);
        if (objLIZ != null) {
            iBPEALazyInit = (IBPEALazyInit) objLIZ;
        } else {
            if (C04TD.S1 == null) {
                synchronized (IBPEALazyInit.class) {
                    if (C04TD.S1 == null) {
                        C04TD.S1 = new TTPSystemAPIInit();
                    }
                }
            }
            iBPEALazyInit = C04TD.S1;
        }
        if (iBPEALazyInit != null) {
            iBPEALazyInit.LIZJ();
        }
        LIZ = new C838030Wu9();
    }

    public static Object LIZ(C825940Wae c825940Wae, C838110WuH c838110WuH) {
        if (C837990Wu5.LIZ(c825940Wae)) {
            LIZIZ(c825940Wae, "SandboxCheck", null, new C837850Wtr(c825940Wae));
        }
        if (c838110WuH == null) {
            return null;
        }
        return c838110WuH.invoke();
    }

    public static Object LIZIZ(C825940Wae c825940Wae, String str, C838030Wu9 c838030Wu9, Function1 function1) {
        Object objInvoke;
        C838310Wub c838310WubLIZ = C838320Wuc.LIZ(c825940Wae, str);
        try {
            try {
                try {
                    objInvoke = function1.invoke(c838310WubLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (c838030Wu9 != null) {
                        objInvoke = c838030Wu9.invoke(th, c838310WubLIZ);
                    } else {
                        throw th;
                    }
                }
                c838310WubLIZ.LJ.LIZ();
                C838280WuY.LIZ(c838310WubLIZ);
                return objInvoke;
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                c838310WubLIZ.LJFF = EnumC838050WuB.ERROR;
                c838310WubLIZ.LIZJ = e.getErrorCode();
                c838310WubLIZ.LIZLLL = e.getErrorMsg();
                c838310WubLIZ.LJI = e;
                throw e;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c838310WubLIZ.LJ.LIZ();
            C838280WuY.LIZ(c838310WubLIZ);
            throw th2;
        }
    }
}
