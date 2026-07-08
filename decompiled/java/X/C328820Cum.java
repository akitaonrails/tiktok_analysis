package X;

import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpApi;
import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpReqBody;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpResponse;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.UserExperimentResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager$pullExpForPartialUsers$1", f = "QueryExpManager.kt", l = {129}, m = "invokeSuspend")
public final class C328820Cum extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328820Cum(int i, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328820Cum(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QueryExpManager@84cc.pullExpForPartialUsers$1");
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
            if (!this.LLILLJJLI.isEmpty() && !this.LLILLL.isEmpty()) {
                List<String> list = this.LLILLL;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
                    if (!QueryExpManager.LIZLLL(str)) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForPartialUsers$1");
                    return unit;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                    if (lLJIILIIL != null) {
                        arrayList2.add(lLJIILIIL);
                    }
                }
                QueryExpApi queryExpApi = QueryExpApi.LIZIZ;
                QueryExpReqBody queryExpReqBody = new QueryExpReqBody(C2286608xc.LJ(2), arrayList2, this.LLILLJJLI, C2286608xc.LJ(this.LLILZ));
                this.LL = 1;
                obj = queryExpApi.queryExperiment(queryExpReqBody, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForPartialUsers$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForPartialUsers$1");
                return unit2;
            }
        }
        List<UserExperimentResult> allUserExpResult = ((QueryExpResponse) obj).getAllUserExpResult();
        if (allUserExpResult != null) {
            Iterator<UserExperimentResult> it3 = allUserExpResult.iterator();
            while (it3.hasNext()) {
                QueryExpManager.LIZIZ.LJI(it3.next(), 2);
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForPartialUsers$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
