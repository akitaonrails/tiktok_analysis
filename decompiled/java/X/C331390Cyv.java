package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel$reportImpression$resp$1", f = "ShopMallMixViewModel.kt", l = {855}, m = "invokeSuspend")
public final class C331390Cyv extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<Map<String, ? extends Object>>>>, Object> {
    public int LL;
    public final /* synthetic */ ShopMallMixViewModel LLILLJJLI;
    public final /* synthetic */ n LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331390Cyv(ShopMallMixViewModel shopMallMixViewModel, n nVar, InterfaceC1364105Vn<? super C331390Cyv> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = shopMallMixViewModel;
        this.LLILLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331390Cyv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<Map<String, ? extends Object>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixViewModel@a591.reportImpression$resp$1");
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
            InterfaceC331400Cyw interfaceC331400Cyw = (InterfaceC331400Cyw) this.LLILLJJLI.LLJ.getValue().getOperator();
            n nVar = this.LLILLL;
            this.LL = 1;
            obj = interfaceC331400Cyw.reportImpression(nVar, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShopMallMixViewModel@a591.reportImpression$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShopMallMixViewModel@a591.reportImpression$resp$1");
        return obj;
    }
}
