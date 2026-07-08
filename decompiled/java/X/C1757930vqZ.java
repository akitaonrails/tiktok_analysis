package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS38S0010000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.view.SeaPdpBasePopup$load$1$onComponentShown$1", f = "SeaPdpBasePopup.kt", l = {}, m = "invokeSuspend")
public final class C1757930vqZ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1760060vu0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757930vqZ(AbstractC1760060vu0 abstractC1760060vu0, InterfaceC1364105Vn<? super C1757930vqZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = abstractC1760060vu0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1757930vqZ(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpBasePopup@4beb.load$1$onComponentShown$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03DZ.LIZJ(this.LL.LIZLLL);
        C1755820vnA c1755820vnA = this.LL.LIZIZ.LJ.get();
        if (c1755820vnA != null) {
            c1755820vnA.LJ = true;
            C1755680vmw c1755680vmw = c1755820vnA.LIZ;
            boolean z = c1755820vnA.LIZJ;
            c1755680vmw.getClass();
            c1755680vmw.LIZ(new AwS38S0010000_26(false, 12));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpBasePopup@4beb.load$1$onComponentShown$1");
        return unit;
    }
}
