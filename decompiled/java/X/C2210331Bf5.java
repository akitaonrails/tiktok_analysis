package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210331Bf5 {
    public static final C2210331Bf5 LJ = new C2210331Bf5();
    public boolean LIZ;
    public C2210341Bf6 LIZIZ;
    public C2210351Bf7 LIZJ;
    public C2210361Bf8 LIZLLL;

    public final void LIZIZ(EnumC2210371Bf9 enumC2210371Bf9, String str) {
        if (!this.LIZ) {
            return;
        }
        LIZJ(EnumC2210541BfQ.DataCollection, enumC2210371Bf9, EnumC2210591BfV.Notice, str, null);
    }

    public final void LIZ(EnumC2176421AFs enumC2176421AFs, String str, long j, long j2) {
        C2210361Bf8 c2210361Bf8;
        if (!this.LIZ) {
            return;
        }
        C2210351Bf7 c2210351Bf7 = this.LIZJ;
        if (c2210351Bf7 != null) {
            try {
                c2210351Bf7.LIZ(enumC2176421AFs, str, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (j2 > 0 && (c2210361Bf8 = this.LIZLLL) != null) {
            try {
                c2210361Bf8.LIZ(enumC2176421AFs, str, j, j2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final void LIZJ(EnumC2210541BfQ enumC2210541BfQ, EnumC2210371Bf9 enumC2210371Bf9, EnumC2210591BfV enumC2210591BfV, String str, Map<String, ?> map) {
        if (this.LIZ && this.LIZIZ != null) {
            try {
                C2210341Bf6.LIZIZ(enumC2210541BfQ, enumC2210371Bf9, enumC2210591BfV, str, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2209791BeD.LJIJJ().LJIILL("AppLogExceptionHandler onException failed, ", th, new Object[0]);
            }
        }
    }
}
