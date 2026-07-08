package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRefreshManager$startRefresh$1$1$responseRaw$1", f = "UsPopCardRefreshManager.kt", l = {121}, m = "invokeSuspend")
public final class C0NSE extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C259800zU<UsPopupCardVO> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSE(String str, C259800zU<UsPopupCardVO> c259800zU, String str2, int i, InterfaceC1364105Vn<? super C0NSE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c259800zU;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NSE c0nse = new C0NSE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0nse.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0nse;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        Object objRefreshPinProduct = obj;
        C1C7U.LIZ("UsPopCardRefreshManager@7978.startRefresh$1$1$responseRaw$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objRefreshPinProduct);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objRefreshPinProduct);
            boolean z = this.LLILLJJLI;
            UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
            String str = this.LLILLL;
            UsPopupCardVO usPopupCardVO = this.LLILZ.element;
            Integer numLJ = null;
            if (usPopupCardVO != null) {
                lLJFF = C2286608xc.LJFF(usPopupCardVO.popCardId);
            } else {
                lLJFF = null;
            }
            UsPopupCardVO usPopupCardVO2 = this.LLILZ.element;
            if (usPopupCardVO2 != null) {
                numLJ = C2286608xc.LJ(usPopupCardVO2.cardType);
            }
            Integer numLJ2 = C2286608xc.LJ(1);
            String str2 = this.LLILZIL;
            Integer numLJ3 = C2286608xc.LJ(this.LLILZLL);
            this.LL = 1;
            objRefreshPinProduct = usProductListApi.refreshPinProduct(str, lLJFF, numLJ, numLJ2, str2, numLJ3, null, 1, z, "", "", null, this);
            if (objRefreshPinProduct == objLJFF) {
                C1C7U.LIZIZ("UsPopCardRefreshManager@7978.startRefresh$1$1$responseRaw$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UsPopCardRefreshManager@7978.startRefresh$1$1$responseRaw$1");
        return objRefreshPinProduct;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
