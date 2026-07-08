package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchCoreComponent$setCurTemplate$1", f = "TemplateSearchCoreComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409200mm6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1422350n7J LL;
    public final /* synthetic */ C1419590n2r LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409200mm6(C1422350n7J c1422350n7J, C1419590n2r c1419590n2r, InterfaceC1364105Vn<? super C1409200mm6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1422350n7J;
        this.LLILLJJLI = c1419590n2r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409200mm6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateSearchCoreComponent@b819.setCurTemplate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJILJILJ.LJII(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSearchCoreComponent@b819.setCurTemplate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
