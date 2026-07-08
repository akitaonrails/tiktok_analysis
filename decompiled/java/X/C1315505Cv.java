package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$routeShopV2$handler$1$invoke$client$1$onTimingUpdate$1$1", f = "StoreInterceptor.kt", l = {436}, m = "invokeSuspend")
public final class C1315505Cv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1315505Cv(InterfaceC1364105Vn<? super C1315505Cv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1315505Cv(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreInterceptor@c22c.routeShopV2$handler$1$invoke$client$1$onTimingUpdate$1$1");
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
            this.LL = 1;
            if (C1056170dah.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("StoreInterceptor@c22c.routeShopV2$handler$1$invoke$client$1$onTimingUpdate$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreInterceptor@c22c.routeShopV2$handler$1$invoke$client$1$onTimingUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1315505Cv(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
