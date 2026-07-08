package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012570cSN {
    public static final C1012570cSN LIZ = new C1012570cSN();

    public static void LIZIZ(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (jSONObject.isNull(str)) {
            jSONObject.put(str, obj);
            return;
        }
        if (obj instanceof String) {
            String strOptString = jSONObject.optString(str);
            if (strOptString == null || strOptString.length() == 0) {
                jSONObject.put(str, obj);
            }
        }
    }

    public static Uri LIZJ(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        try {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str3, str)) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                while (it2.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str3, it2.next());
                }
            } else {
                builderBuildUpon.appendQueryParameter(str3, str2);
            }
        }
        return builderBuildUpon.build();
    }

    public static Uri LIZ(Aweme aweme, Uri uri, boolean z, boolean z2) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        IECommerceAnchorService iECommerceAnchorService;
        EcommerceInfo ecommerceInfo;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        EcommerceInfo ecommerceInfo2;
        IECommerceAnchorService iECommerceAnchorService2;
        if (z && (awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme)) != null && (ecommerceInfo2 = awemeRawAdLJJIJLIJ2.getEcommerceInfo()) != null && Intrinsics.LJFF(ecommerceInfo2.shouldRedirectOneStepOrder, Boolean.TRUE) && (iECommerceAnchorService2 = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null)) != null) {
            iECommerceAnchorService2.LJJJJI(uri);
        }
        if (z2 && (((awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) == null || (ecommerceInfo = awemeRawAdLJJIJLIJ.getEcommerceInfo()) == null || !Intrinsics.LJFF(ecommerceInfo.shouldRedirectOneStepOrder, Boolean.TRUE)) && (iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null)) != null && iECommerceAnchorService.LJLJJI())) {
            return uri.buildUpon().appendQueryParameter("combined_sku_osp_type", "2").build();
        }
        return uri;
    }
}
