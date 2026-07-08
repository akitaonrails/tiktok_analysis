package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.preview.DualKnobComposablesKt$RangeKnob$3$1", f = "DualKnobComposables.kt", l = {}, m = "invokeSuspend")
public final class C1243450iSl extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243450iSl(Function0<Unit> function0, InterfaceC1364105Vn<? super C1243450iSl> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DualKnobComposablesKt@107a.RangeKnob$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DualKnobComposablesKt@107a.RangeKnob$3$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        f.floatValue();
        return new C1243450iSl(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
