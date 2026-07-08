package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05U7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorComposablesKt$TimerText$1$1", f = "PreviewRangeSelectorComposables.kt", l = {}, m = "invokeSuspend")
public final class C05U7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C05P0<C1668650tWZ> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05U7(float f, C05P0<C1668650tWZ> c05p0, InterfaceC1364105Vn<? super C05U7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = f;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05U7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewRangeSelectorComposablesKt@6125.TimerText$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Float.compare(this.LL, this.LLILLJJLI.getValue().LL) > 0) {
            this.LLILLJJLI.setValue(new C1668650tWZ(this.LL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewRangeSelectorComposablesKt@6125.TimerText$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
