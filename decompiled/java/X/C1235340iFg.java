package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;

/* JADX INFO: renamed from: X.0iFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1235340iFg {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VerificationMethodType.values().length];
        LIZ = iArr;
        try {
            iArr[VerificationMethodType.MOBILE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[VerificationMethodType.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[VerificationMethodType.PASSWORD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
