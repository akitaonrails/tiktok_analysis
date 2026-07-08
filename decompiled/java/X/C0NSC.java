package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0NSC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi$Companion$getProductPromotionAndPrice$2", f = "UsProductListApi.kt", l = {275}, m = "invokeSuspend")
public final class C0NSC extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Pair<? extends BaseResponse<UsProductListApi.GetProductPromotionAndPriceResponse>, ? extends String>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSC(String str, String str2, String str3, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = z;
        this.LLIZLLLIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NSC c0nsc = new C0NSC(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, interfaceC1364105Vn, this.LLIZ);
        c0nsc.LLILLL = ((Boolean) obj).booleanValue();
        return c0nsc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("UsProductListApi$Companion@ca0d.getProductPromotionAndPrice$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LL;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            boolean z = this.LLILLL;
            String strLJJJJZ = a0.LJJJJZ("/", C598410NdX.LJ(this.LLILZ, "/aweme/v1/oec/live/product/promotion"));
            UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
            UsProductListApi.GetProductPromotionAndPriceRequest getProductPromotionAndPriceRequest = new UsProductListApi.GetProductPromotionAndPriceRequest(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, 1, 1, z);
            this.LL = strLJJJJZ;
            this.LLILLJJLI = 1;
            obj = usProductListApi.getProductPromotionAndPriceV2(strLJJJJZ, getProductPromotionAndPriceRequest, this);
            obj2 = strLJJJJZ;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UsProductListApi$Companion@ca0d.getProductPromotionAndPrice$2");
                return objLJFF;
            }
        }
        Pair pair = new Pair(obj, obj2);
        C1C7U.LIZIZ("UsProductListApi$Companion@ca0d.getProductPromotionAndPrice$2");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Pair<? extends BaseResponse<UsProductListApi.GetProductPromotionAndPriceResponse>, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
