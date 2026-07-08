package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19266310Yz extends C10YC {
    public static int LJFF(Uri uri) {
        uri.getHost();
        String strLIZIZ = C018G.LIZIZ(uri.toString(), "schema_type");
        if (!TextUtils.isEmpty(strLIZIZ)) {
            try {
                return CastIntegerProtector.parseInt(strLIZIZ);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (C086I.LIZIZ(pathSegments) || pathSegments.size() < 3 || !TextUtils.equals("share", (String) ListProtector.get(pathSegments, 0))) {
            return 0;
        }
        String str = (String) ListProtector.get(pathSegments, 1);
        ListProtector.get(pathSegments, 2);
        return C19286910ct.LIZIZ.LJI(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZLLL(android.net.Uri r18, X.C1950707kX r19) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19266310Yz.LIZLLL(android.net.Uri, X.07kX):android.net.Uri");
    }

    public static String LJ(Uri uri, String str) {
        String path = uri.getPath();
        int iIndexOf = path.indexOf(str) + str.length();
        return path.substring(iIndexOf, path.indexOf("/", iIndexOf));
    }

    @Override // X.C10YC
    public final Uri LIZ(Uri uri, C1950707kX c1950707kX) {
        boolean z;
        if (!uri.toString().contains("microapp") && !uri.toString().contains("microgame")) {
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "redirect_url"))) {
                try {
                    return UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "redirect_url"));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            if (C10Z1.LIZIZ(uri.getScheme())) {
                return uri;
            }
            try {
                return LIZLLL(uri, c1950707kX);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            string = "";
        } else {
            if (!a0.LJJIIZI(string, "microapp", false) && !a0.LJJIIZI(string, "microgame", false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Uri uri2 = UriProtector.parse(string);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "android_scheme");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "ios_scheme");
                }
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    try {
                        uri2 = UriProtector.parse(URLDecoder.decode(string, "UTF8"));
                    } catch (UnsupportedEncodingException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    string = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter + "&app_id=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "app_id") + "&token=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "token") + "&channel=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "channel") + "&iid=" + UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "iid");
                }
            }
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.equals(uri.toString(), string)) {
            Uri uri3 = UriProtector.parse(string);
            if (uri.getBooleanQueryParameter("backurl", false)) {
                Uri.Builder builderBuildUpon = uri3.buildUpon();
                builderBuildUpon.appendQueryParameter("backurl", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "backurl"));
                return builderBuildUpon.build();
            }
            return uri3;
        }
        try {
            return LIZLLL(uri, c1950707kX);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            return null;
        }
    }
}
