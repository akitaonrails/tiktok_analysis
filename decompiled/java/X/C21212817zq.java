package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base.TrackParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21212817zq {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(java.lang.String r35, com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base.TrackParams r36, java.util.Map<java.lang.String, java.lang.String> r37) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212817zq.LIZ(java.lang.String, com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base.TrackParams, java.util.Map):java.lang.String");
    }

    public static final String LIZLLL(String str, TrackParams trackParams, Map<String, String> map) {
        try {
            Uri uri = UriProtector.parse(str);
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("trackParams", LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"), trackParams, map));
            str = builderBuildUpon.build().toString();
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static final String LIZIZ(int i, String str, TrackParams trackParams, String str2, Map map, String str3, String str4) {
        if (i != 5 && i != 6) {
            if (i != 100) {
                return str;
            }
            return LIZLLL(str, trackParams, map);
        }
        try {
            Uri uri = UriProtector.parse(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getHost());
            builder.path(uri.getPath());
            for (String str5 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str5, "trackParams")) {
                    builder.appendQueryParameter(str5, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str5));
                }
            }
            builder.appendQueryParameter("trackParams", LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"), trackParams, map));
            C1739720vNC.LIZ(builder, str2);
            builder.appendQueryParameter("fullScreen", String.valueOf(false));
            if (str3 != null) {
                builder.appendQueryParameter("pdp_cache_key", str3);
            }
            if (str4 != null) {
                builder.appendQueryParameter("container_params", str4);
            }
            return builder.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
