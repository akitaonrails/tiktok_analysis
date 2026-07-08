package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0NSB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRefreshManager$requestPromotion$resp$1", f = "UsPopCardRefreshManager.kt", l = {636, 644}, m = "invokeSuspend")
public final class C0NSB extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSB(boolean z, C259800zU<String> c259800zU, String str, String str2, String str3, String str4, int i, String str5, InterfaceC1364105Vn<? super C0NSB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = i;
        this.LLJI = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NSB c0nsb = new C0NSB(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0nsb.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0nsb;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Object popPromotionV2 = obj;
        C1C7U.LIZ("UsPopCardRefreshManager@7978.requestPromotion$resp$1");
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
                UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
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
                popPromotionV2 = usProductListApi.getPopFromBroadcastV2(str, jLongValue, lLJIILIIL2, lLJIILIIL3, this);
                if (popPromotionV2 == objLJFF) {
                    C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPromotion$resp$1");
                    return objLJFF;
                }
            } else {
                this.LLILZ.element = a0.LJJJJZ("/", C598410NdX.LJ(this.LLILZIL, "/aweme/v1/oec/live/product/pop/promotion"));
                UsProductListApi usProductListApi2 = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                String str2 = this.LLILZ.element;
                String str3 = this.LLILZIL;
                String str4 = this.LLIZ;
                Integer numLJ = C2286608xc.LJ(1);
                String str5 = this.LLIZLLLIL;
                Integer numLJ2 = C2286608xc.LJ(this.LLJ);
                String str6 = this.LLJI;
                this.LL = 2;
                popPromotionV2 = usProductListApi2.getPopPromotionV2(str2, str3, str4, numLJ, str5, numLJ2, null, 1, z, str6, this);
                if (popPromotionV2 == objLJFF) {
                    C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPromotion$resp$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPromotion$resp$1");
        return popPromotionV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
