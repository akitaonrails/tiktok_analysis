package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS81S0210000_30;
import njp.a;

/* JADX INFO: renamed from: X.14CP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet$loadProductDetail$1", f = "ShopifySkuCheckoutBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class C14CP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopifySkuCheckoutBottomSheet LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14CP(ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet, Map<String, String> map, boolean z, InterfaceC1364105Vn<? super C14CP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopifySkuCheckoutBottomSheet;
        this.LLILLJJLI = map;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C14CP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopifySkuCheckoutBottomSheet@a87e.loadProductDetail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String strLIZIZ = C1304960k3y.LIZIZ(this.LL.LIZIZ.pdpUrl);
            if (!this.LLILLL) {
                ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet = this.LL;
                shopifySkuCheckoutBottomSheet.LJFF = true;
                shopifySkuCheckoutBottomSheet.LJII();
            }
            C14CW c14cw = this.LL.LIZJ;
            if (c14cw != null) {
                c14cw.LJIIL.setLoading(true);
            }
            C14CW c14cw2 = this.LL.LIZJ;
            if (c14cw2 != null) {
                c14cw2.LIZ(false);
            }
            ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet2 = this.LL;
            C14CQ c14cq = shopifySkuCheckoutBottomSheet2.LIZIZ;
            AwemeRawAd awemeRawAd = c14cq.awemeRawAd;
            String str = c14cq.from;
            String str2 = c14cq.pdpUrl;
            String str3 = shopifySkuCheckoutBottomSheet2.LJIIJJI;
            Map<String, String> map = this.LLILLJJLI;
            C14CU.LIZ(awemeRawAd, str, strLIZIZ, str2, str3, map, new AwS81S0210000_30(shopifySkuCheckoutBottomSheet2, (ShopifySkuCheckoutBottomSheet) map, (Map<String, String>) this.LLILLL, false));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJFF(C2286608xc.LJ(2));
            C14CW c14cw3 = this.LL.LIZJ;
            if (c14cw3 != null) {
                c14cw3.LJIIL.setLoading(false);
            }
            this.LL.LIZLLL(e, this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutBottomSheet@a87e.loadProductDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
