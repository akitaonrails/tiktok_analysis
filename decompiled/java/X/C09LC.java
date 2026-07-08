package X;

import Y.ARunnableS103S0100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$7", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09LC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0L7R LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LC(C0L7R c0l7r, InterfaceC1364105Vn<? super C09LC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l7r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LC(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C786410Ut5.LJJZZIII(this.LL.LJIJJLI(), new ARunnableS103S0100000_3(this.LL, 45)));
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$7");
        return boolValueOf;
    }
}
