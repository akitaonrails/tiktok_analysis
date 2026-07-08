package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
public final class C388701fB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C388701fB(InterfaceC1364105Vn<? super C388701fB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C388701fB(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "live_ec_task_refresh_coupon_list"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C388701fB(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
