package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C895350ZAn {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC895370ZAp.values().length];
        try {
            iArr[EnumC895370ZAp.FOLLOWER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC895370ZAp.ACTIVITY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC895370ZAp.SHOP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC895310ZAj.values().length];
        try {
            iArr2[EnumC895310ZAj.DOT.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC895310ZAj.COUNT.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZIZ = iArr2;
    }
}
