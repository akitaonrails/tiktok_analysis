package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NS9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager$requestPop$resp$1", f = "PopCardRefreshManager.kt", l = {433, 444}, m = "invokeSuspend")
public final class C0NS9 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NS9(boolean z, C259800zU<String> c259800zU, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C0NS9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NS9 c0ns9 = new C0NS9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0ns9.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0ns9;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1C7U.LIZ("PopCardRefreshManager@9ff3.requestPop$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
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
                obj = productListApi.getPopFromBroadcastV2(str, jLongValue, lLJIILIIL2, lLJIILIIL3, null, null, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPop$resp$1");
                    return objLJFF;
                }
            } else {
                this.LLILZ.element = C598410NdX.LJFF(this.LLILZIL);
                ProductListApi productListApi2 = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                String str2 = this.LLILZ.element;
                long j = CastLongProtector.parseLong(this.LLILZIL);
                String str3 = this.LLIZLLLIL;
                this.LL = 2;
                obj = productListApi2.queryPinV2(str2, j, 1, str3, 0, 1, z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPop$resp$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPop$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
