package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09QW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QW {
    public static final C09QW LIZ = new C09QW();

    public static void LIZIZ(long j, long j2, Function0 function0) {
        C0CNO.LIZLLL(0L, new C09QV(j2, j, function0));
    }

    public static void LIZJ(long j, long j2, String str, String str2) {
        C0CNO.LIZLLL(0L, new C09QU(str, str2, j2, j));
    }

    public static String LIZ(String str, Uri uri, Uri uri2, String str2, String str3) {
        k kVarLJJIIZ;
        String strLJIL;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "diversion_params");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && C123100dR.LIZ(str)) {
            k kVar = GsonProtectorUtils.parse(new p(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            n nVarLJIILIIL = null;
            if (kVar != null) {
                nVarLJIILIIL = kVar.LJIILIIL();
            }
            if (nVarLJIILIIL != null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("diversion_params_for_rec")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null && !a0.LJJJIL(strLJIL)) {
                h hVar = new h();
                hVar.LJJIII(str);
                k kVar2 = GsonProtectorUtils.parse(new p(), strLJIL);
                if (kVar2 != null) {
                    n nVarLJIILIIL2 = kVar2.LJIILIIL();
                    nVarLJIILIIL2.LJJIFFI("context_product_ids", hVar);
                    String string = nVarLJIILIIL2.toString();
                    if (string != null && !a0.LJJJIL(string)) {
                        nVarLJIILIIL.LJJIIJ("diversion_params_for_rec", string);
                        Uri uriLIZ = C2817017f.LIZ(uri, "diversion_params", nVarLJIILIIL.toString());
                        if (uriLIZ != null) {
                            uri = uriLIZ;
                        }
                    }
                }
            }
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("landing_deeplink", uri2.toString());
        builderBuildUpon.appendQueryParameter("source_btm_token", str2);
        Uri uriBuild = builderBuildUpon.build();
        if (str3 == null) {
            return C416901jj.LIZIZ(uriBuild, "back_button_config").toString();
        }
        return u.LJJIFFI(uriBuild.toString(), "__CONV_ID__", str3, false);
    }
}
