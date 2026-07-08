package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NS8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager$requestPopRefresh$2", f = "PopCardRefreshManager.kt", l = {475, 485}, m = "invokeSuspend")
public final class C0NS8 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NS8(int i, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLL;
        C0NS8 c0ns8 = new C0NS8(this.LLIZLLLIL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn, z);
        c0ns8.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0ns8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Object objRefreshPinProduct = obj;
        C1C7U.LIZ("PopCardRefreshManager@9ff3.requestPopRefresh$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(objRefreshPinProduct);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objRefreshPinProduct);
            boolean z = this.LLILLJJLI;
            if (this.LLILLL) {
                String strLIZ = C598410NdX.LIZ(this.LLILZ);
                ProductListApi productListApi = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILZ);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LLILZIL);
                Long lLJIILIIL3 = C2095008Iq.LJIILIIL(this.LLILZLL);
                this.LL = 1;
                objRefreshPinProduct = productListApi.getPopFromBroadcastV2(strLIZ, jLongValue, lLJIILIIL2, lLJIILIIL3, null, null, null, this);
                if (objRefreshPinProduct == objLJFF) {
                    C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPopRefresh$2");
                    return objLJFF;
                }
            } else {
                ProductListApi productListApi2 = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                String str = this.LLILZ;
                String str2 = this.LLILZLL;
                Integer numLJ = C2286608xc.LJ(1);
                String str3 = this.LLIZ;
                Integer numLJ2 = C2286608xc.LJ(this.LLIZLLLIL);
                this.LL = 2;
                objRefreshPinProduct = productListApi2.refreshPinProduct(str, str2, numLJ, str3, numLJ2, null, 1, z, this);
                if (objRefreshPinProduct == objLJFF) {
                    C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPopRefresh$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPopRefresh$2");
        return objRefreshPinProduct;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
