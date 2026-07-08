package X;

import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo.AgsWarningInfoSet;

/* JADX INFO: renamed from: X.0zzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917160zzO {
    public static final C1917160zzO LIZ = new C1917160zzO();

    public static boolean LIZ() {
        AgsWarningInfo agsWarningInfo;
        AgsWarningInfoSet agsWarningInfoSetLIZ = C1917200zzS.LIZ();
        int i = (agsWarningInfoSetLIZ == null || (agsWarningInfo = agsWarningInfoSetLIZ.itemPostWarningInfo) == null) ? 0 : agsWarningInfo.warningLevel;
        C312110CLh.LIZ.getClass();
        boolean z = C312110CLh.LIZ() < i;
        if (C312110CLh.LIZ() > i) {
            C312110CLh.LIZIZ(i);
        }
        return LIZIZ() && z;
    }

    public static boolean LIZIZ() {
        AgsWarningInfo agsWarningInfo;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        AgsWarningInfoSet agsWarningInfoSetLIZ = C1917200zzS.LIZ();
        if (agsWarningInfoSetLIZ != null && (agsWarningInfo = agsWarningInfoSetLIZ.itemPostWarningInfo) != null && agsWarningInfo.warningLevel != 0) {
            return true;
        }
        C312110CLh.LIZ.getClass();
        C312110CLh.LIZIZ(0);
        return false;
    }
}
