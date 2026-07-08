package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$downloadStickPointRes$2", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09LG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L7R LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LG(C0L7R c0l7r, InterfaceC1364105Vn<? super C09LG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l7r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.downloadStickPointRes$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L7R c0l7r = this.LL;
        if (c0l7r.LJJIIJ) {
            c0l7r.LJIIJ(true);
        } else {
            c0l7r.LJJJJIZL(0, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.downloadStickPointRes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
