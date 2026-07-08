package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0JKC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JKC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0JJR c0jjr, Uri uri) {
        Object objValueOf;
        String path;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("ttlive_pcs_schema_parser_error");
        if (c0jjr == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(c0jjr.getErrorCode());
        }
        c512030K6fLIZ.LIZIZ.put("error_code", objValueOf);
        String strValueOf = String.valueOf(uri);
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        strValueOf.toString();
        map.put("url", strValueOf);
        if (uri == null || (path = uri.getPath()) == null) {
            path = "";
        }
        c512030K6fLIZ.LIZIZ.put("path", path);
        if (uri == null || ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance")) == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null)) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        c512030K6fLIZ.LIZIZ.put("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        "".toString();
        map2.put("extra_info", "");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }
}
