package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import pyl.q;

/* JADX INFO: renamed from: X.0XsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectCameraFlipBackManager$observeNonEffectTriggeredState$2", f = "EffectCameraFlipComponent.kt", l = {}, m = "invokeSuspend")
public final class C862290XsB extends C09AX implements Function2<q, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1648080szO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862290XsB(C1648080szO c1648080szO, InterfaceC1364105Vn<? super C862290XsB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1648080szO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C862290XsB c862290XsB = new C862290XsB(this.LLILLJJLI, interfaceC1364105Vn);
        c862290XsB.LL = obj;
        return c862290XsB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectCameraFlipBackManager@e1bb.observeNonEffectTriggeredState$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LJ.setValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectCameraFlipBackManager@e1bb.observeNonEffectTriggeredState$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q qVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(qVar, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
