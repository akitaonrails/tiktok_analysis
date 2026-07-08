package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl$goEditPage$observeJob$1$1", f = "AutoCutAnchorMediaProcessImpl.kt", l = {}, m = "invokeSuspend")
public final class C0L4J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L4P LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4J(C0L4P c0l4p, InterfaceC1364105Vn<? super C0L4J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l4p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L4J(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.goEditPage$observeJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ();
        this.LL.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.goEditPage$observeJob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
