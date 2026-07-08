package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725490v0F {
    public final Uri LIZ;

    public C1725490v0F(Uri uri) {
        this.LIZ = uri;
    }

    public static void LIZ(C1725490v0F c1725490v0F, String str, String str2, String str3, int i) {
        Uri uriLIZLLL;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        JSONObject jSONObject = new JSONObject();
        Uri uri = c1725490v0F.LIZ;
        if (uri != null) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bdhm_bid");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1725490v0F.LIZ, "pipo_hybrid_biz");
                jSONObject.put("schema", c1725490v0F.LIZ.toString());
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    jSONObject.put("biz", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    jSONObject.put("bdhm_bid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1725490v0F.LIZ, "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (uriLIZLLL = C759510Tqn.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, "pipo_retention_event")) != null) {
                    String host = uriLIZLLL.getHost();
                    if (host != null) {
                        jSONObject.put("url_host", host);
                    }
                    String path = uriLIZLLL.getPath();
                    if (path != null) {
                        jSONObject.put("url_path", path);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        jSONObject.put("interaction", str);
        if (str2 != null) {
            jSONObject.put("action_type", str2);
        }
        if (str3 != null) {
            jSONObject.put("from", str3);
        }
        C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_universal_container_retention_popup", jSONObject, null, 12);
    }
}
