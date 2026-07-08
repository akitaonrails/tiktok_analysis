package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.viewmodel.DefaultSearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabApiConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Pa2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.viewmodel.DefaultSearchDynamicTabViewModel$refreshDynamicTabData$1", f = "DefaultSearchDynamicTabViewModel.kt", l = {29}, m = "invokeSuspend")
public final class C647200Pa2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DefaultSearchDynamicTabViewModel LLILLJJLI;
    public final /* synthetic */ SearchTabApiConfig LLILLL;
    public final /* synthetic */ SearchRequestParam LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C647200Pa2(DefaultSearchDynamicTabViewModel defaultSearchDynamicTabViewModel, SearchTabApiConfig searchTabApiConfig, SearchRequestParam searchRequestParam, InterfaceC1364105Vn<? super C647200Pa2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = defaultSearchDynamicTabViewModel;
        this.LLILLL = searchTabApiConfig;
        this.LLILZ = searchRequestParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C647200Pa2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSearchDynamicTabViewModel@25fc.refreshDynamicTabData$1");
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
                C647230Pa5 c647230Pa5 = this.LLILLJJLI.LL.LLILLL;
                SearchTabApiConfig searchTabApiConfig = this.LLILLL;
                SearchRequestParam searchRequestParam = this.LLILZ;
                this.LL = 1;
                obj = c647230Pa5.LJLZ(searchTabApiConfig, searchRequestParam, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DefaultSearchDynamicTabViewModel@25fc.refreshDynamicTabData$1");
                    return objLJFF;
                }
            }
            n nVar = (n) obj;
            if (nVar != null) {
                nVar.LJJIIJ("client_time_stamp", String.valueOf(System.currentTimeMillis()));
            }
            if (nVar != null) {
                this.LLILLJJLI.setState(new AwS589S0100000_10(nVar, 676));
            } else {
                this.LLILLJJLI.setState(AFwS241S0000000_10.get$arr$(620));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(new AwS589S0100000_10(e, 677));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultSearchDynamicTabViewModel@25fc.refreshDynamicTabData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
