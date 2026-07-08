package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0COR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COR {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;

    static {
        C0COT c0cot = new C0COT();
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZ = C452501pT.LIZ(enumC452301pR, new C1184604kG(c0cot));
        LIZIZ = C452501pT.LIZ(enumC452301pR, new C1184604kG(AFwS190S0000000_4.get$arr$(6045)));
    }

    public static final boolean LIZ(String str) {
        Object objInvoke = Boolean.FALSE;
        try {
            objInvoke = new C0COS(str).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return ((Boolean) objInvoke).booleanValue();
    }
}
