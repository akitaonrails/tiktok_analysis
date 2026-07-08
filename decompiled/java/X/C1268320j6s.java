package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268320j6s extends AbstractC1268360j6w {
    public boolean LIZJ;

    @Override // X.AbstractC1268360j6w
    public final void LIZ() {
        InterfaceC1268370j6x interfaceC1268370j6x = this.LIZIZ;
        if (interfaceC1268370j6x != null) {
            interfaceC1268370j6x.LIZ(this.LIZ.name);
        }
    }

    @Override // X.AbstractC1268360j6w
    public final C1268290j6p LIZJ(Map<String, Object> map) {
        int i;
        List<String> list;
        C1268290j6p c1268290j6p = new C1268290j6p();
        StrategyNodeConfig strategyNodeConfig = this.LIZ;
        if (strategyNodeConfig != null && strategyNodeConfig.name != null && map != null && !map.isEmpty()) {
            InterfaceC1268370j6x interfaceC1268370j6x = this.LIZIZ;
            if (interfaceC1268370j6x != null && this.LIZJ) {
                StrategyNodeConfig strategyNodeConfig2 = this.LIZ;
                C1268350j6v c1268350j6vLJII = interfaceC1268370j6x.LJII(strategyNodeConfig2.name, strategyNodeConfig2.paths, map);
                boolean z = c1268350j6vLJII.LIZ;
                if (z) {
                    i = 0;
                } else {
                    i = -5;
                }
                c1268290j6p.LIZ = i;
                if (z) {
                    list = this.LIZ.paths;
                } else {
                    list = null;
                }
                c1268290j6p.LIZJ = list;
                c1268290j6p.LIZIZ = c1268350j6vLJII.LIZIZ;
                if (z) {
                    HashMap map2 = new HashMap();
                    map2.put("rule_name", this.LIZ.name);
                    c1268290j6p.LIZLLL = map2;
                }
                return c1268290j6p;
            }
            c1268290j6p.LIZ = -4;
            return c1268290j6p;
        }
        c1268290j6p.LIZ = -2;
        return c1268290j6p;
    }

    public C1268320j6s(StrategyNodeConfig strategyNodeConfig, InterfaceC1268370j6x interfaceC1268370j6x) {
        super(strategyNodeConfig);
        this.LIZIZ = interfaceC1268370j6x;
        if (!this.LIZJ) {
            if (interfaceC1268370j6x != null && !TextUtils.isEmpty(strategyNodeConfig.b_data)) {
                this.LIZJ = interfaceC1268370j6x.LIZIZ(strategyNodeConfig.name, strategyNodeConfig.b_data);
            }
            if (!this.LIZJ) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("api", "CepRegister");
                    jSONObject.put("wrong_rule_name", strategyNodeConfig.name);
                    jSONObject.put("b_data", strategyNodeConfig.b_data);
                    C1267490j5X.LIZ(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
