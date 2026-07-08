package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.09Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.videocreator.SeaPdpCreatorVideoMgr$fetchCreatorVideoList$1$1$1", f = "SeaPdpCreatorVideoMgr.kt", l = {}, m = "invokeSuspend")
public final class C09Y7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09YH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09Y7(C09YH c09yh, InterfaceC1364105Vn<? super C09Y7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09yh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09Y7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C09YH c09yh = this.LL;
        c09yh.LIZ.setState(new AwS605S0100000_26(c09yh, 21));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
