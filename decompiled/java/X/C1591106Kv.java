package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsTabFragment$onViewCreated$2$3$onRefreshStart$1", f = "SearchProsConsTabFragment.kt", l = {233}, m = "invokeSuspend")
public final class C1591106Kv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C636700OyC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591106Kv(C636700OyC c636700OyC, InterfaceC1364105Vn<? super C1591106Kv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c636700OyC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1591106Kv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchProsConsTabFragment@4a61.onViewCreated$2$3$onRefreshStart$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("SearchProsConsTabFragment@4a61.onViewCreated$2$3$onRefreshStart$1");
                return objLJFF;
            }
        }
        C786410Ut5.LLLZZIL(this.LLILLJJLI.LL, 0);
        this.LLILLJJLI.LL.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchProsConsTabFragment@4a61.onViewCreated$2$3$onRefreshStart$1");
        return unit;
    }
}
