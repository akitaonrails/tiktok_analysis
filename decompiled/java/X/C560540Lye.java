package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundLoadingComponent$showErrorToast$1", f = "AIPlaygroundLoadingComponent.kt", l = {}, m = "invokeSuspend")
public final class C560540Lye extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C560580Lyi LL;
    public final /* synthetic */ C0LSZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560540Lye(C560580Lyi c560580Lyi, C0LSZ c0lsz, InterfaceC1364105Vn<? super C560540Lye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c560580Lyi;
        this.LLILLJJLI = c0lsz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560540Lye(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundLoadingComponent@75a3.showErrorToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LLJJ);
        c1389890mGx.LJIIJ(this.LLILLJJLI.LJIJ);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.showErrorToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
