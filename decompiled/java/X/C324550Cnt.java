package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.ISearchReinforceInterestApi;
import com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.InterestPointReportInfo;
import com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.InterestPointResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.SearchReinforceInterestDataSource$fetchInterestInfo$1", f = "SearchReinforceInterestDataSource.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C324550Cnt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterestPointReportInfo> LLILLL;
    public final /* synthetic */ Function1<InterestPointResponse, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324550Cnt(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324550Cnt c324550Cnt = new C324550Cnt(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c324550Cnt.LLILLJJLI = obj;
        return c324550Cnt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchReinforceInterestDataSource@e548.fetchInterestInfo$1");
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
                ArrayList arrayList = new ArrayList();
                List<InterestPointReportInfo> list = this.LLILLL;
                String str = "";
                if (list != null) {
                    for (InterestPointReportInfo interestPointReportInfo : list) {
                        C1227904rF.LIZ.getClass();
                        String strLJI = C1227904rF.LJI(interestPointReportInfo);
                        if (strLJI == null) {
                            strLJI = "";
                        }
                        arrayList.add(strLJI);
                    }
                }
                C1227904rF.LIZ.getClass();
                String strLJI2 = C1227904rF.LJI(arrayList);
                ISearchReinforceInterestApi iSearchReinforceInterestApi = (ISearchReinforceInterestApi) C324560Cnu.LIZIZ.getValue();
                if (strLJI2 != null) {
                    str = strLJI2;
                }
                this.LL = 1;
                obj = iSearchReinforceInterestApi.getInterestPoint(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchReinforceInterestDataSource@e548.fetchInterestInfo$1");
                    return objLJFF;
                }
            }
            c098200Yq = (InterestPointResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1<InterestPointResponse, Unit> function1 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            function1.invoke((InterestPointResponse) c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FetchInterestInfo: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("SearchReinforceInterestDataSourceTAG", strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchReinforceInterestDataSource@e548.fetchInterestInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
