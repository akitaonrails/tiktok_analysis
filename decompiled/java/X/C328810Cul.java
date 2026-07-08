package X;

import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpApi;
import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpReqBody;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpResponse;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.UserExperimentResult;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Cul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager$pullExpForFullUsers$1", f = "QueryExpManager.kt", l = {105}, m = "invokeSuspend")
public final class C328810Cul extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C328810Cul(InterfaceC1364105Vn<? super C328810Cul> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328810Cul(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QueryExpManager@84cc.pullExpForFullUsers$1");
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
            Keva kevaLIZ = C328840Cuo.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("full_user_exp_query_time-");
            sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
            if (System.currentTimeMillis() - kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) > C328780Cui.LIZ().refreshInterval * LSPassThroughRecordSizeConfig.DEFAULT) {
                QueryExpApi queryExpApi = QueryExpApi.LIZIZ;
                Integer numLJ = C2286608xc.LJ(1);
                C13BV c13bv = C13BV.INSTANCE;
                QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                c13dvLIZIZ.add("tt_dm_light_interaction_reversal");
                c13dvLIZIZ.add("tt_ic_cameo_pair");
                QueryExpReqBody queryExpReqBody = new QueryExpReqBody(numLJ, c13bv, C1697820uHc.LIZ(c13dvLIZIZ), null);
                this.LL = 1;
                obj = queryExpApi.queryExperiment(queryExpReqBody, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForFullUsers$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForFullUsers$1");
            return unit;
        }
        QueryExpResponse queryExpResponse = (QueryExpResponse) obj;
        if (queryExpResponse.getAllUserExpResult() != null) {
            QueryExpManager queryExpManager2 = QueryExpManager.LIZIZ;
            if (C296690Bk3.LIZ()) {
                ((AtomicBoolean) QueryExpManager.LJ.getValue()).set(false);
            }
            QueryExpManager.LIZJ.evictAll();
            QueryExpManager.LIZLLL.evictAll();
            Iterator<UserExperimentResult> it2 = queryExpResponse.getAllUserExpResult().iterator();
            while (it2.hasNext()) {
                QueryExpManager.LIZIZ.LJI(it2.next(), 1);
            }
        }
        QueryExpManager queryExpManager3 = QueryExpManager.LIZIZ;
        QueryExpManager.LJ(1, QueryExpManager.LIZJ.snapshot());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QueryExpManager@84cc.pullExpForFullUsers$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C328810Cul(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
