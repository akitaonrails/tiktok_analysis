package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0K74, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K74 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Uri uri, String str) {
        String string;
        String path;
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("ttlive_subscription_schema_parser_success");
        if (uri == null || (string = uri.toString()) == null) {
            string = "";
        }
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        string.toString();
        map.put("url", string);
        if (uri == null || (path = uri.getPath()) == null) {
            path = "";
        }
        c512280K7eLIZ.LIZIZ.put("path", path);
        if (str == null && (uri == null || ((str = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance")) == null && (str = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null))) {
            str = "";
        }
        c512280K7eLIZ.LIZIZ.put("show_entrance", str);
        c512280K7eLIZ.LIZLLL(C0K6J.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LIZ(EnumC490130JJz enumC490130JJz, Uri uri, String str, String str2) {
        Object objValueOf;
        String path;
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("ttlive_subscription_schema_parser_error");
        if (enumC490130JJz == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(enumC490130JJz.getErrorCode());
        }
        c512280K7eLIZ.LIZIZ.put("error_code", objValueOf);
        String strValueOf = String.valueOf(uri);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        strValueOf.toString();
        map.put("url", strValueOf);
        if (uri == null || (path = uri.getPath()) == null) {
            path = "";
        }
        c512280K7eLIZ.LIZIZ.put("path", path);
        if (str == null && (uri == null || ((str = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance")) == null && (str = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null))) {
            str = "";
        }
        c512280K7eLIZ.LIZIZ.put("show_entrance", str);
        if (str2 == null) {
            str2 = "";
        }
        Map<String, String> map2 = c512280K7eLIZ.LIZLLL;
        str2.toString();
        map2.put("extra_info", str2);
        c512280K7eLIZ.LIZLLL(C0K6J.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }
}
