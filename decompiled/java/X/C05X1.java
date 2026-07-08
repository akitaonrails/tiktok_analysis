package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05X1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C05X1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C05X2.values().length];
        try {
            iArr[C05X2.PASSKEY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C05X2.PASSKEY_AND_GOOGLE_ONETAP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C05X2.GOOGLE_ONETAP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
