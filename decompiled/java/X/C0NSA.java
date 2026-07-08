package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0NSA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager$requestPromotion$resp$1", f = "PopCardRefreshManager.kt", l = {517, 528}, m = "invokeSuspend")
public final class C0NSA extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSA(boolean z, C259800zU<String> c259800zU, String str, String str2, String str3, String str4, int i, InterfaceC1364105Vn<? super C0NSA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NSA c0nsa = new C0NSA(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0nsa.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0nsa;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Object popPromotionV2 = obj;
        C1C7U.LIZ("PopCardRefreshManager@9ff3.requestPromotion$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(popPromotionV2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(popPromotionV2);
            boolean z = this.LLILLJJLI;
            if (this.LLILLL) {
                this.LLILZ.element = C598410NdX.LIZ(this.LLILZIL);
                ProductListApi productListApi = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                String str = this.LLILZ.element;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILZIL);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LLILZLL);
                Long lLJIILIIL3 = C2095008Iq.LJIILIIL(this.LLIZ);
                this.LL = 1;
                popPromotionV2 = productListApi.getPopFromBroadcastV2(str, jLongValue, lLJIILIIL2, lLJIILIIL3, null, null, null, this);
                if (popPromotionV2 == objLJFF) {
                    C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPromotion$resp$1");
                    return objLJFF;
                }
            } else {
                this.LLILZ.element = a0.LJJJJZ("/", C598410NdX.LJ(this.LLILZIL, "/aweme/v1/oec/live/product/pop/promotion"));
                ProductListApi productListApi2 = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                String str2 = this.LLILZ.element;
                String str3 = this.LLILZIL;
                String str4 = this.LLIZ;
                Integer numLJ = C2286608xc.LJ(1);
                String str5 = this.LLIZLLLIL;
                Integer numLJ2 = C2286608xc.LJ(this.LLJ);
                this.LL = 2;
                popPromotionV2 = productListApi2.getPopPromotionV2(str2, str3, str4, numLJ, str5, numLJ2, null, 1, z, this);
                if (popPromotionV2 == objLJFF) {
                    C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPromotion$resp$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPromotion$resp$1");
        return popPromotionV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
