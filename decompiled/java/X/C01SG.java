package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01SG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$prepareToShow$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
public final class C01SG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01SG(InterfaceC1364105Vn<? super C01SG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01SG(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01SG(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
