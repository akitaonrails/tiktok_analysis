package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C804480Vh8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC804620VhM.values().length];
        try {
            iArr[EnumC804620VhM.WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC804620VhM.MOBILE_2G.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC804620VhM.MOBILE_3G.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC804620VhM.MOBILE_4G.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
