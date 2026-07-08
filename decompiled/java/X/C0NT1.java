package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ReportActionApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NT1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.view.UsHorizontalPopCardViewV0$setPopProduct$7$1", f = "UsHorizontalPopCardViewV0.kt", l = {1125}, m = "invokeSuspend")
public final class C0NT1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0NT1(InterfaceC1364105Vn<? super C0NT1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NT1(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsHorizontalPopCardViewV0@3633.setPopProduct$7$1");
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
            C0NT3 c0nt3 = ReportActionApi.LIZ;
            this.LL = 1;
            if (c0nt3.LIZ(2, this) == objLJFF) {
                C1C7U.LIZIZ("UsHorizontalPopCardViewV0@3633.setPopProduct$7$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsHorizontalPopCardViewV0@3633.setPopProduct$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0NT1(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
