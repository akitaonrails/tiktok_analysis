package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectGuideScene$play$1$1$1", f = "RecommendEffectGuide.kt", l = {}, m = "invokeSuspend")
public final class C436370H9f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C436390H9h LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436370H9f(C436390H9h c436390H9h, InterfaceC1364105Vn<? super C436370H9f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c436390H9h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436370H9f(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendEffectGuideScene@e839.play$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendEffectGuideScene@e839.play$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
