package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.SubscribeProductFetchStrategy$fetchOrderHistoryAndSaveToCache$2", f = "SubscribeProductFetchStrategy.kt", l = {40}, m = "invokeSuspend")
public final class C515860KKy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C515860KKy(InterfaceC1364105Vn<? super C515860KKy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C515860KKy(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscribeProductFetchStrategy@a194.fetchOrderHistoryAndSaveToCache$2");
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
            if (C513470KBt.LIZJ == null) {
                this.LL = 1;
                obj = C099A.LIZJ(3000L, new C515870KKz(null), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchOrderHistoryAndSaveToCache$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchOrderHistoryAndSaveToCache$2");
            return unit;
        }
        C513470KBt.LIZJ = (C518090KTn) obj;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchOrderHistoryAndSaveToCache$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C515860KKy(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
