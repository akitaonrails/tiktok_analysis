package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.CouponApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$onDestroy$1", f = "ECProductBeforeLiveWidget.kt", l = {533}, m = "invokeSuspend")
public final class C594150NSb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C594150NSb(InterfaceC1364105Vn<? super C594150NSb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594150NSb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECProductBeforeLiveWidget@6602.onDestroy$1");
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
            C594160NSc c594160NSc = CouponApi.LIZ;
            this.LL = 1;
            if (c594160NSc.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.onDestroy$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.onDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C594150NSb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
