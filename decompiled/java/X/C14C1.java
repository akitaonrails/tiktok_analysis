package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service.IShopifySkuCheckoutApiService;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14C1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet$onProductDetailSuccess$2", f = "ShopifySkuCheckoutBottomSheet.kt", l = {366}, m = "invokeSuspend")
public final class C14C1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShopifySkuCheckoutBottomSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14C1(ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet, InterfaceC1364105Vn<? super C14C1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shopifySkuCheckoutBottomSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C14C1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        BotConfig botConfig;
        C1C7U.LIZ("ShopifySkuCheckoutBottomSheet@a87e.onProductDetailSuccess$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IShopifySkuCheckoutApiService iShopifySkuCheckoutApiService = (IShopifySkuCheckoutApiService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutApiService.class, false, false, false, 14, null);
            if (iShopifySkuCheckoutApiService != null) {
                String str2 = this.LLILLJJLI.LJIIL;
                if (str2 == null) {
                    str2 = "{}";
                }
                C1227904rF.LIZ.getClass();
                Gson gsonLIZLLL = C1227904rF.LIZLLL();
                AwemeRawAd awemeRawAd = this.LLILLJJLI.LIZIZ.awemeRawAd;
                if (awemeRawAd != null && (botConfig = awemeRawAd.getBotConfig()) != null) {
                    str = botConfig.extra;
                } else {
                    str = null;
                }
                String strLJIILL = gsonLIZLLL.LJIILL(new ShopifySkuCheckoutBottomSheet.ExtraInfo(str));
                this.LL = 1;
                obj = iShopifySkuCheckoutApiService.LIZIZ("1", "shopify_mcp_details", str2, strLJIILL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShopifySkuCheckoutBottomSheet@a87e.onProductDetailSuccess$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ShopifySkuCheckoutBottomSheet@a87e.onProductDetailSuccess$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutBottomSheet@a87e.onProductDetailSuccess$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
