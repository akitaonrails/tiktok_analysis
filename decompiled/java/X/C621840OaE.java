package X;

import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem$onBind$1", f = "SearchMultiSummaryBaseAssem.kt", l = {57, 58}, m = "invokeSuspend")
public final class C621840OaE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchMultiSummaryBaseAssem<ITEM> LLILLJJLI;

    /* JADX INFO: Incorrect field signature: TITEM; */
    public final /* synthetic */ InterfaceC684740QtU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/ss/android/ugc/aweme/search/pages/result/pov/ui/multisummary/SearchMultiSummaryBaseAssem<TITEM;>;TITEM;LX/05Vn<-LX/0OaE;>;)V */
    public C621840OaE(SearchMultiSummaryBaseAssem searchMultiSummaryBaseAssem, InterfaceC684740QtU interfaceC684740QtU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchMultiSummaryBaseAssem;
        this.LLILLL = interfaceC684740QtU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621840OaE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMultiSummaryBaseAssem@ae94.onBind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.zp(this.LLILLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchMultiSummaryBaseAssem@ae94.onBind$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C03H8 c03h8 = this.LLILLJJLI;
            this.LL = 1;
            c03h8.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C0P4U c0p4u = new C0P4U(c2252611DEt, 2);
            C786410Ut5.v2().postFrameCallback(c0p4u);
            c2252611DEt.LJJII(new AwS588S0100000_9(c0p4u, 690, 42));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("SearchMultiSummaryBaseAssem@ae94.onBind$1");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (C2252671DEz.LIZ(this) == objLJFF) {
            C1C7U.LIZIZ("SearchMultiSummaryBaseAssem@ae94.onBind$1");
            return objLJFF;
        }
        this.LLILLJJLI.zp(this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchMultiSummaryBaseAssem@ae94.onBind$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
