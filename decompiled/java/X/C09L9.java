package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09L9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$11", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09L9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L7R LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09L9(C0L7R c0l7r, InterfaceC1364105Vn<? super C09L9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l7r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09L9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$11");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJJLI().removeCallbacksAndMessages(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$11");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
