package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0PPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel$refreshSearchDataList$1", f = "DynamicSearchBaseViewModel.kt", l = {25}, m = "invokeSuspend")
public final class C644440PPm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DynamicSearchBaseViewModel LLILLJJLI;
    public final /* synthetic */ SearchRequestParam LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644440PPm(DynamicSearchBaseViewModel dynamicSearchBaseViewModel, SearchRequestParam searchRequestParam, InterfaceC1364105Vn<? super C644440PPm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dynamicSearchBaseViewModel;
        this.LLILLL = searchRequestParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C644440PPm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DynamicSearchBaseViewModel@f405.refreshSearchDataList$1");
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
                InterfaceC644450PPn interfaceC644450PPn = (InterfaceC644450PPn) this.LLILLJJLI.wQ2().getOperator();
                SearchRequestParam searchRequestParam = this.LLILLL;
                this.LL = 1;
                obj = interfaceC644450PPn.LLZZZIL(searchRequestParam);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DynamicSearchBaseViewModel@f405.refreshSearchDataList$1");
                    return objLJFF;
                }
            }
            n nVar = (n) obj;
            nVar.LJJIIJ("client_time_stamp", String.valueOf(System.currentTimeMillis()));
            this.LLILLJJLI.setState(new AwS589S0100000_10(nVar, 190));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(new AwS589S0100000_10(e, 191));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicSearchBaseViewModel@f405.refreshSearchDataList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
