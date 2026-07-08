package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533540q0e {
    public static final C1533540q0e LIZ = new C1533540q0e();

    public static C1533490q0Z LIZ(Forest forest, RequestParams requestParams, String str, boolean z) {
        String string;
        Integer numLJIIJJI;
        C1533570q0h c1533570q0h;
        WebResourceRequest webResourceRequest;
        Uri url;
        String str2 = "";
        if (a0.LJJJIL(str)) {
            Object obj = requestParams.webResourceRequest;
            if (!(obj instanceof WebResourceRequest) || (webResourceRequest = (WebResourceRequest) obj) == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                string = "";
            }
        } else {
            string = str;
        }
        C1533490q0Z c1533490q0Z = new C1533490q0Z(forest, requestParams, a0.LJJLL('#', string, string), z);
        c1533490q0Z.LJJJJZ = C1534080q1W.LIZ;
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        c1533510q0b.LJ = requestParams.waitLowStorageUpdate;
        c1533510q0b.LIZLLL = requestParams.waitGeckoUpdate;
        c1533510q0b.LJFF = requestParams.checkGeckoFileAvailable;
        c1533510q0b.LJI = requestParams.disableGeckoUpdate;
        c1533510q0b.LJII = requestParams.supportDirectory;
        c1533510q0b.LJIIIIZZ = requestParams.geckoSource;
        String str3 = requestParams.channel;
        if (str3 == null) {
            str3 = "";
        }
        c1533510q0b.LIZIZ = str3;
        String str4 = requestParams.bundle;
        if (str4 == null) {
            str4 = "";
        }
        c1533510q0b.LIZJ = str4;
        String str5 = requestParams.accessKey;
        boolean z2 = true;
        if (str5.length() == 0 && ((c1533570q0h = forest.getConfig().LIZIZ) == null || (str5 = c1533570q0h.LIZ) == null)) {
            str5 = "";
        }
        c1533510q0b.LIZ = str5;
        GeckoXAdapter geckoXAdapter = forest.getGeckoXAdapter();
        if (!c1533490q0Z.LJIIJ && geckoXAdapter.isGeckoCDNAndMergeConfig(c1533490q0Z)) {
            Uri uri = c1533490q0Z.LJJJJL;
            String strLIZIZ = C1942307jB.LIZIZ(uri, "only_online");
            if (strLIZIZ != null) {
                c1533490q0Z.LJJIJLIJ = Intrinsics.LJFF(strLIZIZ, "1");
            }
            String strLIZIZ2 = C1942307jB.LIZIZ(uri, "wait_gecko_update");
            if (strLIZIZ2 == null) {
                C1533510q0b c1533510q0b2 = c1533490q0Z.LJJJJLI;
                if (!c1533510q0b2.LIZLLL && !Intrinsics.LJFF(strLIZIZ2, "1")) {
                    z2 = false;
                }
                c1533510q0b2.LIZLLL = z2;
            } else {
                String strLIZIZ3 = C1942307jB.LIZIZ(uri, "dynamic");
                if (strLIZIZ3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ3)) != null) {
                    c1533490q0Z.LJJJJLI.LIZLLL = C1533400q0Q.LIZ(numLJIIJJI.intValue());
                }
            }
        } else if (c1533490q0Z.LJJJJLI.LIZ()) {
            Uri uri2 = c1533490q0Z.LJJJJL;
            String str6 = c1533490q0Z.LJJJJIZL;
            Forest forest2 = c1533490q0Z.LJJJJJ;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gecko_channel");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gecko_bundle");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gecko_access_key");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0 && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                C1533510q0b c1533510q0b3 = c1533490q0Z.LJJJJLI;
                c1533510q0b3.LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                c1533510q0b3.LIZJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() != 0) {
                    c1533490q0Z.LJJJJLI.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                }
                c1533490q0Z.LJJJJLI.LJIIIIZZ = GeckoSource.URL_QUERY;
            } else if (!c1533490q0Z.LJIILIIL) {
                forest2.getConfig().LIZJ(str6, c1533490q0Z.LJJJJLI);
            }
            if (c1533490q0Z.LJJJJLI.LIZ()) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "channel");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "bundle");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4.length() != 0 && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5.length() != 0) {
                    C1533510q0b c1533510q0b4 = c1533490q0Z.LJJJJLI;
                    c1533510q0b4.LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                    c1533510q0b4.LIZJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                }
            }
            if (a0.LJJJIL(c1533490q0Z.LJJJJLI.LIZ)) {
                C1533510q0b c1533510q0b5 = c1533490q0Z.LJJJJLI;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gecko_access_key");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "accessKey");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 != null) {
                        str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
                    }
                } else {
                    str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                }
                c1533510q0b5.LIZ = str2;
            }
        }
        if (!c1533490q0Z.LJJJJJL) {
            C086F.LIZ.getClass();
            if (C086F.LIZ()) {
                C1533510q0b c1533510q0b6 = c1533490q0Z.LJJJJLI;
                if (c1533510q0b6.LIZLLL) {
                    c1533510q0b6.LIZLLL = false;
                }
            }
        }
        if (c1533490q0Z.LJJJJLI.LJII && Intrinsics.LJFF(c1533490q0Z.LJ, File.class)) {
            c1533490q0Z.LJJJJLI.LJFF = false;
        } else {
            c1533490q0Z.LJJJJLI.LJII = false;
        }
        String strLIZ = C1533940q1I.LIZ(c1533490q0Z);
        if (strLIZ != null) {
            str = strLIZ;
        }
        c1533490q0Z.LJJJZ = str;
        return c1533490q0Z;
    }
}
