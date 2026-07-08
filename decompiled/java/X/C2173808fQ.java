package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ecc.ECCDslApi;
import com.ss.android.ugc.aweme.ecommerce.ecc.EccDslManagerConfigModel;
import com.ss.android.ugc.aweme.ecommerce.ecc.PreGetDslResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08fQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ecc.ECCDslManager$loadDslList$1", f = "ECCDslManager.kt", l = {51}, m = "invokeSuspend")
public final class C2173808fQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2173808fQ(InterfaceC1364105Vn<? super C2173808fQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2173808fQ(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, Object> map;
        C1C7U.LIZ("ECCDslManager@5081.loadDslList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EccDslManagerConfigModel eccDslManagerConfigModel = C2173708fP.LIZ;
            EccDslManagerConfigModel eccDslManagerConfigModel2 = (EccDslManagerConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecc_dsl_manager_config", EccDslManagerConfigModel.class, eccDslManagerConfigModel);
            if (eccDslManagerConfigModel2 == null) {
                eccDslManagerConfigModel2 = eccDslManagerConfigModel;
            }
            if (eccDslManagerConfigModel2.dslManageEnable) {
                Keva keva = C2173908fR.LIZJ;
                long j = keva.getLong("last_load_timestamp", 0L);
                EccDslManagerConfigModel eccDslManagerConfigModel3 = (EccDslManagerConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ecc_dsl_manager_config", EccDslManagerConfigModel.class, eccDslManagerConfigModel);
                if (eccDslManagerConfigModel3 != null) {
                    eccDslManagerConfigModel = eccDslManagerConfigModel3;
                }
                long j2 = eccDslManagerConfigModel.dslFetchThrottle;
                if (System.currentTimeMillis() - j > ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j2) {
                    keva.storeLong("last_load_timestamp", System.currentTimeMillis());
                    SystemClock.elapsedRealtime();
                    C2174208fU c2174208fU = ECCDslApi.LIZ;
                    this.LL = 1;
                    obj = c2174208fU.LIZ(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("ECCDslManager@5081.loadDslList$1");
                        return objLJFF;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ecc load too frequent, throttle: ");
                    sbLIZ.append(j2);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECCDslManager@5081.loadDslList$1");
            return unit;
        }
        PreGetDslResponse preGetDslResponse = (PreGetDslResponse) ((Response) obj).data;
        if (preGetDslResponse != null) {
            map = preGetDslResponse.allDsl;
        } else {
            map = null;
        }
        if (map != null) {
            List<String> listLJJLL = C13LQ.LJJLL(C2173908fR.LIZJ.getStringArray("ecc_dsl_using_list", new String[0]));
            Map mapLIZ = C2173908fR.LIZ();
            HashMap map2 = new HashMap();
            for (String str : listLJJLL) {
                Object obj2 = ((ConcurrentHashMap) mapLIZ).get(str);
                if (obj2 != null) {
                    map2.put(str, obj2);
                }
            }
            map2.putAll(map);
            ConcurrentHashMap<String, Object> concurrentHashMap = C2173908fR.LIZ;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(map2);
            C2173908fR.LIZJ.storeString("ecc_dsl_content_map", C1741890vQh.LJIIIIZZ(map2));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("all dsl list: ");
        sbLIZ2.append(map);
        C2188811AlT.LIZIZ(sbLIZ2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECCDslManager@5081.loadDslList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2173808fQ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
