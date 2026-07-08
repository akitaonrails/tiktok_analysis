package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import pyl.q;

/* JADX INFO: renamed from: X.0XsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectCameraFlipBackManager$observeIncomingEffectToFlip$2", f = "EffectCameraFlipComponent.kt", l = {}, m = "invokeSuspend")
public final class C862300XsC extends C09AX implements Function2<Effect, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1648080szO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862300XsC(C1648080szO c1648080szO, InterfaceC1364105Vn<? super C862300XsC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1648080szO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862300XsC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectCameraFlipBackManager@e1bb.observeIncomingEffectToFlip$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1648080szO c1648080szO = this.LL;
        c1648080szO.LIZJ.invoke((q) c1648080szO.LJ.getValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectCameraFlipBackManager@e1bb.observeIncomingEffectToFlip$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Effect effect, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(effect, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
