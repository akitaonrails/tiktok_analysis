package X;

import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000607sa {
    public static final C2000607sa LIZ = new C2000607sa();

    public static void LIZ(Uri uri, String str) {
        try {
            String host = uri.getHost();
            String path = uri.getPath();
            if (C123100dR.LIZ(path)) {
                Regex regex = new Regex("/\\d+");
                if (regex.containsMatchIn(path)) {
                    path = regex.replace(path, "/number");
                }
            }
            String strLIZIZ = "";
            if (host != null && (a0.LJJIIZI(host, "webview", false) || a0.LJJIIZI(host, "lynxview", false))) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(uri2.getHost());
                    sbLIZ.append(uri2.getPath());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("origin_url", uri.toString());
            c2344009Gk.LJIIIIZZ("host_path", host + path);
            c2344009Gk.LJIIIIZZ("webview_host_path", strLIZIZ);
            c2344009Gk.LJIIIIZZ("device_type", Build.MODEL);
            c2344009Gk.LJIIIIZZ("media_source", str);
            C20684815ws.LJIILLIIL("nuj_df_deeplink", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
