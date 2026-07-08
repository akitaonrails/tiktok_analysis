package X;

import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.creation.template.square.ui.TemplateSearchSugComponent$fetchSug$1$1", f = "TemplateSearchSugComponent.kt", l = {}, m = "invokeSuspend")
public final class C1424320nAU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1424300nAS LL;
    public final /* synthetic */ SearchSugResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424320nAU(C1424300nAS c1424300nAS, SearchSugResponse searchSugResponse, InterfaceC1364105Vn<? super C1424320nAU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1424300nAS;
        this.LLILLJJLI = searchSugResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1424320nAU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateSearchSugComponent@957f.fetchSug$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Z4(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSearchSugComponent@957f.fetchSug$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
