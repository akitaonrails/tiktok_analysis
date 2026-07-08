package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01CL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CL {
    public static final String LIZ(String str) {
        Uri uriLIZJ = LIZJ(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "surl");
        }
        if (C1533950q1J.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return LIZIZ(LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "channel");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "bundle");
        if (C1533950q1J.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && C1533950q1J.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynxview://");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            sbLIZ.append('/');
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final String LIZIZ(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        try {
            return uri.buildUpon().clearQuery().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return uri.toString();
        }
    }

    public static final Uri LIZJ(String str) {
        Object c098200Yq;
        if (str == null) {
            return Uri.EMPTY;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = Uri.EMPTY;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = uri;
        }
        return (Uri) c098200Yq;
    }

    public static final int LIZLLL(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
