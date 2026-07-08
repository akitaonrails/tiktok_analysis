package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Pa9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel$refreshSearchDataList$1", f = "SearchLiveViewModel.kt", l = {26}, m = "invokeSuspend")
public final class C647270Pa9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchLiveViewModel LLILLJJLI;
    public final /* synthetic */ SearchRequestParam LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C647270Pa9(SearchLiveViewModel searchLiveViewModel, SearchRequestParam searchRequestParam, InterfaceC1364105Vn<? super C647270Pa9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchLiveViewModel;
        this.LLILLL = searchRequestParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C647270Pa9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLiveViewModel@5194.refreshSearchDataList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC647300PaC interfaceC647300PaC = (InterfaceC647300PaC) this.LLILLJJLI.LL.getValue().getOperator();
                SearchRequestParam searchRequestParam = this.LLILLL;
                this.LL = 1;
                obj = interfaceC647300PaC.LLJJI(searchRequestParam);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchLiveViewModel@5194.refreshSearchDataList$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.setState(new AwS589S0100000_10((SearchLiveList) obj, 203));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(new AwS589S0100000_10(e, 204));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchLiveViewModel@5194.refreshSearchDataList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
