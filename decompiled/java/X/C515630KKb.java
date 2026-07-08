package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$1$historyOrderMapJob$1", f = "ResubscribeStrategy.kt", l = {102}, m = "invokeSuspend")
public final class C515630KKb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C518090KTn>, Object> {
    public int LL;

    public C515630KKb(InterfaceC1364105Vn<? super C515630KKb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C515630KKb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ResubscribeStrategy@84ad.resubscribe$1$historyOrderMapJob$1");
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
            obj = C099A.LIZJ(3000L, new C515660KKe(null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@84ad.resubscribe$1$historyOrderMapJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@84ad.resubscribe$1$historyOrderMapJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C518090KTn> interfaceC1364105Vn) {
        return new C515630KKb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
