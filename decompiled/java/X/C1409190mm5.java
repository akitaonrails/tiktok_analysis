package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchCoreComponent$reset$1", f = "TemplateSearchCoreComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409190mm5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1422350n7J LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409190mm5(C1422350n7J c1422350n7J, InterfaceC1364105Vn<? super C1409190mm5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1422350n7J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409190mm5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateSearchCoreComponent@b819.reset$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJ.LJIIJ(null);
        this.LL.LLJILJILJ.LJII(null);
        this.LL.LLJILLL.LJII(C2097608Jq.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSearchCoreComponent@b819.reset$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
