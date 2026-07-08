package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0D5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C333520D5q {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC333530D5r.values().length];
        try {
            iArr[EnumC333530D5r.NETWORK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC333530D5r.UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC333530D5r.SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
