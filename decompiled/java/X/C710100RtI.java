package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocaption.refactor.CaptionDisplayStateController$reEvaluateUIData$1", f = "CaptionDisplayStateController.kt", l = {}, m = "invokeSuspend")
public final class C710100RtI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C710670RuD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710100RtI(C710670RuD c710670RuD, InterfaceC1364105Vn<? super C710100RtI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c710670RuD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710100RtI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionDisplayStateController@662c.reEvaluateUIData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C710670RuD c710670RuD = this.LL;
        c710670RuD.LLILZ.invoke(c710670RuD.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionDisplayStateController@662c.reEvaluateUIData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
