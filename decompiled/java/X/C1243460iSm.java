package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.preview.DualKnobComposablesKt$ProgressTrack$1$1", f = "DualKnobComposables.kt", l = {}, m = "invokeSuspend")
public final class C1243460iSm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C05ZL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243460iSm(float f, C05ZL c05zl, InterfaceC1364105Vn<? super C1243460iSm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = f;
        this.LLILLJJLI = c05zl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243460iSm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DualKnobComposablesKt@107a.ProgressTrack$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LJIILJJIL(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DualKnobComposablesKt@107a.ProgressTrack$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
