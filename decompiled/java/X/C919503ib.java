package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C919503ib {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, Map map) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri = UriProtector.parse(str);
        Uri uriBuild = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (C770702zh.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!Intrinsics.LJFF(value, "") && value != null) {
                    if (!(value instanceof Number) && !(value instanceof String) && !(value instanceof Character)) {
                        builderBuildUpon.appendQueryParameter(str2, C1741890vQh.LJIIIIZZ(value));
                    } else {
                        builderBuildUpon.appendQueryParameter(str2, value.toString());
                    }
                }
            }
            if (builderBuildUpon != null) {
                uriBuild = builderBuildUpon.build();
            }
            return C011J.LIZ(uri, "url", String.valueOf(uriBuild)).toString();
        }
        return uri.toString();
    }

    public static Uri.Builder LIZJ(String str, Map map) {
        String strLJIIIIZZ;
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof Number) && !(value instanceof String) && !(value instanceof Character)) {
                if (value == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(value)) == null) {
                    strLJIIIIZZ = "";
                }
                builderBuildUpon.appendQueryParameter(str2, strLJIIIIZZ);
            } else {
                builderBuildUpon.appendQueryParameter(str2, value.toString());
            }
        }
        return builderBuildUpon;
    }

    public static Uri.Builder LIZLLL(String str, Map map) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.LJFF(value, "") && value != null) {
                if (!(value instanceof Number) && !(value instanceof String) && !(value instanceof Character)) {
                    builderBuildUpon.appendQueryParameter(str2, C1741890vQh.LJIIIIZZ(value));
                } else {
                    builderBuildUpon.appendQueryParameter(str2, value.toString());
                }
            }
        }
        return builderBuildUpon;
    }

    public static String LJ(String str, String str2) {
        return UriProtector.parse(str).buildUpon().path(str2).appendQueryParameter("_originalSchema", str).toString();
    }

    public static SmartRoute LIZIZ(Context context, String str, Map map, boolean z) {
        Uri.Builder builderLIZJ = LIZJ(str, map);
        if (z) {
            builderLIZJ.appendQueryParameter("fallback", null);
        }
        return SmartRouter.buildRoute(context, builderLIZJ.toString());
    }
}
