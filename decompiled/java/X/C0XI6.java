package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;

/* JADX INFO: renamed from: X.0XI6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XI6 {
    public static final C0XI6 LIZ = new C0XI6();

    public static int LIZ() {
        Boolean boolValueOf = null;
        try {
            boolValueOf = Boolean.valueOf(C0XJ9.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                return 0;
            }
            try {
                C844470XAv.LIZ.getClass();
                EnumC846100XHc networkType = NetworkUtils.getNetworkType(C844470XAv.LIZ());
                if (networkType != null) {
                    if (networkType == EnumC846100XHc.NONE) {
                        return 0;
                    }
                    if (networkType != EnumC846100XHc.MOBILE_2G && networkType != EnumC846100XHc.MOBILE_3G) {
                        try {
                            C0CF8.LIZ.getClass();
                            C0CFB c0cfbLIZIZ = C0CF8.LIZIZ();
                            if (c0cfbLIZIZ != null) {
                                if (networkType == EnumC846100XHc.WIFI) {
                                    int i = C0CFA.LIZ[c0cfbLIZIZ.ordinal()];
                                    if (i != 1) {
                                        return i != 2 ? 1 : 3;
                                    }
                                    return 5;
                                }
                                int i2 = C0CFA.LIZ[c0cfbLIZIZ.ordinal()];
                                if (i2 == 1) {
                                    return 3;
                                }
                                if (i2 == 2) {
                                    return 2;
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        return 1;
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            return 1;
        }
        return 1;
    }
}
