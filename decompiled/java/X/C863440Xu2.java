package X;

import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$tryApplyEffect$1$1", f = "TTEPPreviewEffectLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C863440Xu2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TTEPPreviewEffectLogicComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863440Xu2(TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent, InterfaceC1364105Vn<? super C863440Xu2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tTEPPreviewEffectLogicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863440Xu2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTEPPreviewEffectLogicComponent@5edf.tryApplyEffect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.applyEffect();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTEPPreviewEffectLogicComponent@5edf.tryApplyEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
