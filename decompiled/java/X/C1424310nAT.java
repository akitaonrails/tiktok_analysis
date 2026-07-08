package X;

import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.creation.template.square.ui.TemplateSearchSugComponent$fetchSug$1", f = "TemplateSearchSugComponent.kt", l = {110, 112}, m = "invokeSuspend")
public final class C1424310nAT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1424300nAS LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424310nAT(C1424300nAS c1424300nAS, String str, InterfaceC1364105Vn<? super C1424310nAT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1424300nAS;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1424310nAT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("TemplateSearchSugComponent@957f.fetchSug$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateSearchSugComponent@957f.fetchSug$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1424330nAV interfaceC1424330nAVO4 = this.LLILLJJLI.O4();
            String str = this.LLILLL;
            Long l = this.LLILLJJLI.LLJJI;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            this.LL = 1;
            obj = interfaceC1424330nAVO4.LIZ(str, string, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateSearchSugComponent@957f.fetchSug$1");
                return objLJFF;
            }
        }
        SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
        if (searchSugResponse == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TemplateSearchSugComponent@957f.fetchSug$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1424320nAU c1424320nAU = new C1424320nAU(this.LLILLJJLI, searchSugResponse, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1424320nAU) == objLJFF) {
            C1C7U.LIZIZ("TemplateSearchSugComponent@957f.fetchSug$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSearchSugComponent@957f.fetchSug$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
