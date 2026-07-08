package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutJsProductDetail;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductOption;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS144S1100000_30;
import kotlin.jvm.internal.AwS39S2200000_16;
import kotlin.jvm.internal.AwS42S1400000_30;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14CS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CS implements C14CT {
    public static final C14CS LIZ = new C14CS();

    @Override // X.C14CT
    public final boolean LIZ(ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData) {
        List<ShopifySkuCheckoutProductOption> list = shopifySkuCheckoutProductDetailData.options;
        if (list.isEmpty() || list.isEmpty()) {
            return true;
        }
        Iterator<ShopifySkuCheckoutProductOption> it2 = list.iterator();
        while (it2.hasNext()) {
            List<String> values = it2.next().getValues();
            if (values != null && values.size() > 1) {
                return false;
            }
        }
        return true;
    }

    public static TuxSheet LIZLLL(Context context, final String str, final C14CQ c14cq) {
        View view = new ShopifySkuCheckoutBottomSheet(context, c14cq).LJIILIIL;
        if (view != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIII = view;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.14C7
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String str2 = TuxSheet._pnsPageId;
                    if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343950De5) {
                        C14CV.LIZJ(1, str);
                        return;
                    }
                    C14CV.LIZJ(0, str);
                    Function0<Unit> function0 = c14cq.onDialogCloseAction;
                    if (function0 == null) {
                        return;
                    }
                    function0.invoke();
                }
            };
            tuxSheet.LLJLILLLLZIIL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            return tuxSheet2;
        }
        return null;
    }

    public static final String LJ(String str, Integer num, String str2, AwemeRawAd awemeRawAd) {
        String strGv;
        String strLIZIZ = C1304960k3y.LIZIZ(str);
        if (str2.length() == 0) {
            return str;
        }
        String strLIZ = C1304960k3y.LIZ(num, strLIZIZ, str2);
        Map<String, String> mapLJI = C1037200d66.LJI(UriProtector.parse(str));
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null && (strGv = iAdWebUtils.gv(strLIZ, awemeRawAd, mapLJI)) != null) {
            return strGv;
        }
        return strLIZ;
    }

    public static final void LJFF(String str, String str2, AwemeRawAd awemeRawAd, Function1<? super ShopifySkuCheckoutJsProductDetail, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1316205Dc(C1304960k3y.LIZIZ(str), str2, C1304960k3y.LIZJ(str), awemeRawAd, new AwS609S0100000_30(function1, (Function1<? super EffectPlatformBuilder, Unit>) 248), null), 3);
    }

    public static final void LJI(AwemeRawAd awemeRawAd, String str, String str2, String str3, C14CZ c14cz) {
        String strLIZIZ = str3;
        String strLIZIZ2 = C1304960k3y.LIZIZ(str2);
        if (!a0.LJJIIZI(strLIZIZ, "gid://shopify/Product/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gid://shopify/Product/");
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C14CU.LIZ(awemeRawAd, str, strLIZIZ2, str2, strLIZIZ, C2097608Jq.LJ(), new AwS609S0100000_30(c14cz, 249));
    }

    public static final TuxSheet LIZIZ(Context context, String str, String str2, AwemeRawAd awemeRawAd, Boolean bool, ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData, AwS39S2200000_16 awS39S2200000_16, AwS585S0100000_6 awS585S0100000_6, AFwS219S0000000_30 aFwS219S0000000_30, AFwS274S0000000_30 aFwS274S0000000_30, AwS42S1400000_30 awS42S1400000_30) {
        String str3 = shopifySkuCheckoutProductDetailData.productId;
        C14CR.LIZIZ(str3);
        C14CR.LIZJ(str3);
        C14CR.LIZLLL(str3, str);
        return LIZLLL(context, str3, new C14CQ(context, str3, str, str2, EnumC1783180wVI.PRODUCT_DETAIL_DATA, bool, "", shopifySkuCheckoutProductDetailData, awemeRawAd, awS39S2200000_16, awS585S0100000_6, aFwS219S0000000_30, new AwS144S1100000_30(str3, aFwS274S0000000_30, 13), awS42S1400000_30));
    }

    public static final TuxSheet LIZJ(Context context, String str, String str2, AwemeRawAd awemeRawAd, Boolean bool, String str3, AwS39S2200000_16 awS39S2200000_16, AwS585S0100000_6 awS585S0100000_6, AFwS219S0000000_30 aFwS219S0000000_30, AFwS274S0000000_30 aFwS274S0000000_30, AwS42S1400000_30 awS42S1400000_30) {
        C14CR.LIZIZ(str3);
        C14CR.LIZJ(str3);
        C14CR.LIZLLL(str3, str);
        return LIZLLL(context, str3, new C14CQ(context, str3, str, str2, EnumC1783180wVI.PRODUCT_ID, bool, str3, null, awemeRawAd, awS39S2200000_16, awS585S0100000_6, aFwS219S0000000_30, new AwS144S1100000_30(str3, aFwS274S0000000_30, 12), awS42S1400000_30));
    }
}
