package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593660NQe extends C09AY implements Function0<Map<String, DecisionMakerNetworkApi.EligibilityModel>> {
    public C593660NQe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, DecisionMakerNetworkApi.EligibilityModel> invoke() {
        Map mapLJ;
        C593670NQf c593670NQf = C593670NQf.LIZ;
        Keva keva = C593670NQf.LIZIZ;
        c593670NQf.getClass();
        try {
            mapLJ = (Map) C1703730uR9.LIZ().LJIIIIZZ(keva.getString(C593670NQf.LIZ(), ""), new TypeToken<Map<String, ? extends DecisionMakerNetworkApi.EligibilityModel>>() { // from class: X.0NQg
            }.getType());
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mapLJ = C2097608Jq.LJ();
        }
        return new LinkedHashMap(mapLJ);
    }
}
