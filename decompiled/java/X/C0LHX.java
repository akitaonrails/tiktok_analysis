package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LHX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.OnThisDayTemplatePublishComponent$publishNormal$1", f = "OnThisDayTemplatePublishComponent.kt", l = {}, m = "invokeSuspend")
public final class C0LHX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MHK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LHX(C0MHK c0mhk, InterfaceC1364105Vn<? super C0LHX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mhk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LHX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayTemplatePublishComponent@3fd8.publishNormal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.c3(false);
        this.LL.X1();
        C0MHK c0mhk = this.LL;
        c0mhk.W2(new AwS552S0100000_8(c0mhk, 655));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayTemplatePublishComponent@3fd8.publishNormal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
