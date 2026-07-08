package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVideoInputKt$rememberInitAnimationTransition$1$1", f = "TakoAIVideoInput.kt", l = {}, m = "invokeSuspend")
public final class C05AJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P0<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AJ(C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05AJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputKt@4105.rememberInitAnimationTransition$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setValue(Boolean.TRUE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputKt@4105.rememberInitAnimationTransition$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
