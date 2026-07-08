package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05F2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$request$2", f = "StoreInterceptor.kt", l = {521}, m = "invokeSuspend")
public final class C05F2 extends C09AX implements Function1<InterfaceC1364105Vn<? super n>, Object> {
    public int LL;
    public final /* synthetic */ n LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05F2(n nVar, InterfaceC1364105Vn<? super C05F2> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05F2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreInterceptor@c22c.request$2");
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
            n nVar = this.LLILLJJLI;
            this.LL = 1;
            obj = shopApi.getShopFirstScreen(nVar, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoreInterceptor@c22c.request$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoreInterceptor@c22c.request$2");
        return obj;
    }
}
