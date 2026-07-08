package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import y5o.n0;

/* JADX INFO: renamed from: X.05VA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.FullWidthEffectCarouselScene$observeComponentCanScroll$1", f = "FullWidthEffectCarouselScene.kt", l = {}, m = "invokeSuspend")
public final class C05VA extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ n0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VA(n0 n0Var, InterfaceC1364105Vn<? super C05VA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = n0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05VA c05va = new C05VA(this.LLILLJJLI, interfaceC1364105Vn);
        c05va.LL = ((Boolean) obj).booleanValue();
        return c05va;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselScene@94d7.observeComponentCanScroll$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LLJJJJJIL.setValue(Boolean.valueOf(this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselScene@94d7.observeComponentCanScroll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
