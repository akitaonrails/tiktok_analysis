package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.common.shopify.ShopifySkuCheckoutManager$Companion$getShopifyProductDetail$1", f = "ShopifySkuCheckoutManager.kt", l = {216, 224}, m = "invokeSuspend")
public final class C1316505Df extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeRawAd LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ Function1<ShopifySkuCheckoutProductDetailData, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1316505Df(AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, Map<String, String> map, Function1<? super ShopifySkuCheckoutProductDetailData, Unit> function1, InterfaceC1364105Vn<? super C1316505Df> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeRawAd;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = map;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1316505Df(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("ShopifySkuCheckoutManager$Companion@c0e0.getShopifyProductDetail$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getShopifyProductDetail$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            AwemeRawAd awemeRawAd = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            String str4 = this.LLILZLL;
            Map<String, String> map = this.LLIZ;
            this.LL = 1;
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C20225614By(awemeRawAd, str2, str4, str, str3, map, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getShopifyProductDetail$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1316605Dg c1316605Dg = new C1316605Dg(this.LLIZLLLIL, (ShopifySkuCheckoutProductDetailData) objLJI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1316605Dg) == objLJFF) {
            C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getShopifyProductDetail$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShopifySkuCheckoutManager$Companion@c0e0.getShopifyProductDetail$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
