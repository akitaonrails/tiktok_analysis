package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$compressVideo$4", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09LD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C0L7R LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LD(boolean z, C0L7R c0l7r, boolean z2, InterfaceC1364105Vn<? super C09LD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c0l7r;
        this.LLILLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.compressVideo$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL) {
            C0L7R c0l7r = this.LLILLJJLI;
            if (c0l7r.LJJIIJ) {
                c0l7r.LJIIJ(this.LLILLL);
            } else {
                c0l7r.LJJJJIZL(0, this.LLILLL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.compressVideo$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
