package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.CameraGuideOverlay$Render$1$1", f = "CameraGuideOverlays.kt", l = {}, m = "invokeSuspend")
public final class C0HAT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1665600tRe LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HAT(AbstractC1665600tRe abstractC1665600tRe, InterfaceC1364105Vn<? super C0HAT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1665600tRe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HAT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraGuideOverlay@62dc.Render$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CameraGuideOverlay@62dc.Render$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
