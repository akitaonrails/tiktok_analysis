package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0D7E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C0D7E {
    public static final /* synthetic */ int[] LIZ;

    static {
        C0D7F.values();
        int[] iArr = new int[C0D7D.values().length];
        try {
            iArr[C0D7D.CREATE_CHECKOUT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0D7D.UPDATE_CHECKOUT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0D7D.COMPLETE_CHECKOUT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0D7D.DOWNGRADE_CHECKOUT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
