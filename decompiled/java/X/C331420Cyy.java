package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel$loadMixData$mainDataSsResponse$1", f = "ShopMallMixViewModel.kt", l = {276, 289}, m = "invokeSuspend")
public final class C331420Cyy extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<n>>>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<C080U> LLILZ;
    public final /* synthetic */ n LLILZIL;
    public final /* synthetic */ ShopMallMixViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331420Cyy(boolean z, boolean z2, List<C080U> list, n nVar, ShopMallMixViewModel shopMallMixViewModel, InterfaceC1364105Vn<? super C331420Cyy> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = list;
        this.LLILZIL = nVar;
        this.LLILZLL = shopMallMixViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331420Cyy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixViewModel@a591.loadMixData$mainDataSsResponse$1");
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
            if (!this.LLILLJJLI) {
                C1741420vPw.LIZ.getClass();
                C1741420vPw.LIZ();
                InterfaceC331400Cyw interfaceC331400Cyw = (InterfaceC331400Cyw) this.LLILZLL.LLJ.getValue().getOperator();
                List<C080U> list = this.LLILZ;
                n nVar = this.LLILZIL;
                ShopMallApiWithPreload.LIZ.getClass();
                Map<String, String> mapLJ = C1771330wCB.LJ();
                this.LL = 1;
                obj = interfaceC331400Cyw.LLLLILI(list, nVar, mapLJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixData$mainDataSsResponse$1");
                    return objLJFF;
                }
            } else {
                C1741420vPw.LIZ.getClass();
                C1741420vPw.LIZ();
                InterfaceC331400Cyw interfaceC331400Cyw2 = (InterfaceC331400Cyw) this.LLILZLL.LLJ.getValue().getOperator();
                List<C080U> list2 = this.LLILZ;
                n nVar2 = this.LLILZIL;
                this.LL = 2;
                obj = interfaceC331400Cyw2.v(list2, nVar2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixData$mainDataSsResponse$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("ShopMallMixViewModel@a591.loadMixData$mainDataSsResponse$1");
        return obj;
    }
}
