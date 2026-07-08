package X;

import android.text.Layout;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchPovCardDocAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchPovCardDocAssem$onBind$2", f = "SearchPovCardDocAssem.kt", l = {109}, m = "invokeSuspend")
public final class C685200QuE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C607880Nso LLILLJJLI;
    public final /* synthetic */ SearchPovCardDocAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685200QuE(C607880Nso c607880Nso, SearchPovCardDocAssem searchPovCardDocAssem, InterfaceC1364105Vn<? super C685200QuE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c607880Nso;
        this.LLILLL = searchPovCardDocAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C685200QuE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long diggCount;
        C1C7U.LIZ("SearchPovCardDocAssem@40e2.onBind$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AwemeStatistics statistics = this.LLILLJJLI.LL.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            String quantityString = this.LLILLL.getContentView().getContext().getResources().getQuantityString(2131755554, (int) (diggCount % ((long) 2)), C820940WIi.LIZ(diggCount));
            C444830HcP c444830HcP = (C444830HcP) this.LLILLL.LLJLLIL.getValue();
            c444830HcP.LJIILIIL(quantityString);
            Layout layoutLIZIZ = c444830HcP.LIZIZ();
            C444830HcP c444830HcP2 = (C444830HcP) this.LLILLL.LLJLL.getValue();
            c444830HcP2.LJIILIIL(this.LLILLJJLI.LL.getDesc());
            Layout layoutLIZIZ2 = c444830HcP2.LIZIZ();
            SearchPovCardDocAssem searchPovCardDocAssem = this.LLILLL;
            C09U0 c09u0 = searchPovCardDocAssem.LLLF;
            if (c09u0 == null) {
                synchronized (searchPovCardDocAssem) {
                    c09u0 = searchPovCardDocAssem.LLLF;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        searchPovCardDocAssem.LLLF = c09u0;
                    }
                }
            }
            AbstractC2252651DEx abstractC2252651DEx = c09u0.LIZJ;
            C685210QuF c685210QuF = new C685210QuF(this.LLILLL, layoutLIZIZ2, layoutLIZIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2252651DEx, c685210QuF) == objLJFF) {
                C1C7U.LIZIZ("SearchPovCardDocAssem@40e2.onBind$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPovCardDocAssem@40e2.onBind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
