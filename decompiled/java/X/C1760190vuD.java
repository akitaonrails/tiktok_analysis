package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0vuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.pendant.view.SeaPdpLynxPendant$handleShowComponent$1$2$onLoadSuccess$1", f = "SeaPdpLynxPendant.kt", l = {}, m = "invokeSuspend")
public final class C1760190vuD extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1760160vuA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1760190vuD(C1760160vuA c1760160vuA, InterfaceC1364105Vn<? super C1760190vuD> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1760160vuA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1760190vuD(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View viewLIZJ;
        C1C7U.LIZ("SeaPdpLynxPendant@b7cf.handleShowComponent$1$2$onLoadSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1760300vuO c1760300vuO = this.LL.LJIIJ;
        if (c1760300vuO != null) {
            viewLIZJ = c1760300vuO.LIZJ();
        } else {
            viewLIZJ = null;
        }
        C03DZ.LIZJ(viewLIZJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpLynxPendant@b7cf.handleShowComponent$1$2$onLoadSuccess$1");
        return unit;
    }
}
