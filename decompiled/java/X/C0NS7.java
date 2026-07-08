package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NS7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager$startRefresh$1$1$responseRaw$1", f = "PopCardRefreshManager.kt", l = {114}, m = "invokeSuspend")
public final class C0NS7 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C259800zU<PopupCardVO> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NS7(String str, C259800zU<PopupCardVO> c259800zU, String str2, int i, InterfaceC1364105Vn<? super C0NS7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c259800zU;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NS7 c0ns7 = new C0NS7(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0ns7.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0ns7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("PopCardRefreshManager@9ff3.startRefresh$1$1$responseRaw$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            boolean z = this.LLILLJJLI;
            ProductListApi productListApi = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
            String str = this.LLILLL;
            PopupCardVO popupCardVO = this.LLILZ.element;
            if (popupCardVO != null) {
                lLJFF = C2286608xc.LJFF(popupCardVO.productId);
            } else {
                lLJFF = null;
            }
            String strValueOf = String.valueOf(lLJFF);
            Integer numLJ = C2286608xc.LJ(1);
            String str2 = this.LLILZIL;
            Integer numLJ2 = C2286608xc.LJ(this.LLILZLL);
            this.LL = 1;
            obj = productListApi.refreshPinProduct(str, strValueOf, numLJ, str2, numLJ2, null, 1, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PopCardRefreshManager@9ff3.startRefresh$1$1$responseRaw$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.startRefresh$1$1$responseRaw$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
