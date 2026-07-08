package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268310j6r extends AbstractC1268360j6w {
    public byte[] LIZJ;
    public Map<String, Object> LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.AbstractC1268360j6w
    public final void LIZ() {
        this.LIZJ = null;
    }

    public final boolean LIZLLL() {
        InterfaceC1268370j6x interfaceC1268370j6x;
        return (TextUtils.isEmpty(this.LIZ.strategyKey) || (interfaceC1268370j6x = this.LIZIZ) == null || !interfaceC1268370j6x.LJFF()) ? false : true;
    }

    public static final void LJ(StrategyNodeConfig strategyNodeConfig) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", "ExpRegister");
            jSONObject.put("wrong_rule_name", strategyNodeConfig.name);
            jSONObject.put("b_data", strategyNodeConfig.b_data);
            C1267490j5X.LIZ(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // X.AbstractC1268360j6w
    public final C1268290j6p LIZJ(Map<String, Object> map) {
        C1283410jVD c1283410jVDLIZLLL;
        Map<String, Object> map2;
        ArrayList arrayList;
        C1268290j6p c1268290j6p = new C1268290j6p();
        StrategyNodeConfig strategyNodeConfig = this.LIZ;
        if (strategyNodeConfig != null && strategyNodeConfig.name != null && map != null && !map.isEmpty()) {
            InterfaceC1268370j6x interfaceC1268370j6x = this.LIZIZ;
            if (interfaceC1268370j6x == null || (this.LIZJ == null && !LIZLLL())) {
                c1268290j6p.LIZ = -4;
                return c1268290j6p;
            }
            Map<String, Object> map3 = this.LIZLLL;
            if (map3 != null && !map3.isEmpty()) {
                map.put("strategy_cache_params", this.LIZLLL);
            }
            if (LIZLLL()) {
                c1283410jVDLIZLLL = interfaceC1268370j6x.LJI(this.LIZ.strategyKey, map);
            } else {
                c1283410jVDLIZLLL = interfaceC1268370j6x.LIZLLL(this.LIZJ, map);
            }
            ?? map4 = 0;
            map4 = 0;
            map4 = 0;
            map4 = 0;
            if (c1283410jVDLIZLLL != null && (map2 = c1283410jVDLIZLLL.LIZJ) != null) {
                c1268290j6p.LIZ = 0;
                if (LIZLLL()) {
                    c1268290j6p.LIZLLL = c1283410jVDLIZLLL.LIZ;
                    c1268290j6p.LJ = true;
                } else {
                    c1268290j6p.LIZLLL = map2;
                }
                try {
                    arrayList = null;
                    for (String str : (ArrayList) map2.get("paths")) {
                        try {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(str);
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = null;
                }
                c1268290j6p.LIZJ = arrayList;
                if (map2.get("strategy_cache_params") != null) {
                    Object obj = map2.get("strategy_cache_params");
                    try {
                        if (obj instanceof Map) {
                            map4 = (Map) obj;
                        } else if (obj instanceof List) {
                            for (Object obj2 : (List) obj) {
                                if (obj2 instanceof Map) {
                                    if (map4 == 0) {
                                        map4 = new HashMap();
                                    }
                                    map4.putAll((Map) obj2);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                this.LIZLLL = map4;
                return c1268290j6p;
            }
            c1268290j6p.LIZ = -6;
            return c1268290j6p;
        }
        c1268290j6p.LIZ = -2;
        return c1268290j6p;
    }

    public C1268310j6r(StrategyNodeConfig strategyNodeConfig, InterfaceC1268370j6x interfaceC1268370j6x) {
        boolean z;
        super(strategyNodeConfig);
        this.LJFF = true;
        this.LIZIZ = interfaceC1268370j6x;
        if (strategyNodeConfig.enableSkippedIfNil == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        if (LIZLLL()) {
            boolean zLJ = interfaceC1268370j6x.LJ(strategyNodeConfig.strategyKey);
            this.LJ = zLJ;
            if (!zLJ) {
                LJ(strategyNodeConfig);
                return;
            }
            return;
        }
        if (this.LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerRule, has row b_data, name: ");
            sbLIZ.append(strategyNodeConfig.name);
            sbLIZ.append(", is_suc: ");
            sbLIZ.append(this.LIZJ != null);
            sbLIZ.append(", paths: ");
            sbLIZ.append(strategyNodeConfig.paths);
            sbLIZ.append(", b_data: ");
            sbLIZ.append(strategyNodeConfig.b_data);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (interfaceC1268370j6x != null && !TextUtils.isEmpty(strategyNodeConfig.b_data)) {
            this.LIZJ = interfaceC1268370j6x.LIZJ(strategyNodeConfig.b_data);
        }
        if (this.LIZJ == null) {
            LJ(strategyNodeConfig);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerRule, name: ");
        sbLIZ2.append(strategyNodeConfig.name);
        sbLIZ2.append(", is_suc: ");
        sbLIZ2.append(this.LIZJ != null);
        sbLIZ2.append(", paths: ");
        sbLIZ2.append(strategyNodeConfig.paths);
        sbLIZ2.append(", b_data: ");
        sbLIZ2.append(strategyNodeConfig.b_data);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
