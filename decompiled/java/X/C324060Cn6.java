package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.ShopPrefetchDataManager$loadTabListData$2", f = "ShopPrefetchDataManager.kt", l = {150}, m = "invokeSuspend")
public final class C324060Cn6 extends C09AX implements Function1<InterfaceC1364105Vn<? super n>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1738990vM1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324060Cn6(String str, C1738990vM1 c1738990vM1, InterfaceC1364105Vn<? super C324060Cn6> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1738990vM1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324060Cn6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopPrefetchDataManager@c051.loadTabListData$2");
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
            ShopApi shopApi = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
            String str = this.LLILLJJLI;
            Long lLJFF = C2286608xc.LJFF(this.LLILLL.LJIILIIL);
            C1738990vM1 c1738990vM1 = this.LLILLL;
            String str2 = c1738990vM1.LIZLLL;
            String str3 = c1738990vM1.LIZIZ;
            this.LL = 1;
            obj = shopApi.getShopHomepageTabListJSON(str, lLJFF, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShopPrefetchDataManager@c051.loadTabListData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShopPrefetchDataManager@c051.loadTabListData$2");
        return obj;
    }
}
