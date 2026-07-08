package X;

import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.ttm.TTMOutput;
import java.util.Map;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092780eXk<T> implements InterfaceC485200J1a {
    public final InterfaceC1936307iD<T> LIZ;
    public final C01GW LIZIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 653));

    public C1092780eXk(InterfaceC1936307iD<T> interfaceC1936307iD) {
        this.LIZ = interfaceC1936307iD;
    }

    @Override // X.InterfaceC485200J1a
    public final C1092890eXv LIZ(C1092890eXv c1092890eXv) {
        Object obj;
        String strOptString;
        Object data = null;
        try {
            C0J0M c0j0m = c1092890eXv.LIZIZ;
            if (c0j0m != null && (obj = c0j0m.LIZ) != null) {
                if (obj instanceof InterfaceC805220ViK) {
                    data = ((InterfaceC805220ViK) obj).LIZJ();
                } else if (obj instanceof C1089610eSd) {
                    Map<String, String> map = ((C1089610eSd) obj).LIZIZ;
                    data = map.isEmpty() ? ((C1089860eT2) this.LIZIZ.getValue()).LIZ(((C1089610eSd) obj).LIZ, c1092890eXv.LIZ) : map;
                } else if (obj instanceof TTMStrategyResult) {
                    data = Boolean.valueOf(((TTMStrategyResult) obj).isSuccess());
                } else if (obj instanceof C1093210eYR) {
                    JSONObject jSONObject = ((C1093210eYR) obj).LIZIZ;
                    data = (jSONObject == null || (strOptString = jSONObject.optString("decision_value", "")) == null || a0.LJJJIL(strOptString)) ? ((C1093210eYR) obj).LIZIZ : this.LIZ.parse(strOptString);
                } else if (obj instanceof PTYCepResult) {
                    data = Boolean.valueOf(((PTYCepResult) obj).getSuccess());
                } else if (obj instanceof TTMOutput) {
                    data = ((TTMOutput) obj).getData();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("ResultParseProcessor", "parse result error", e);
        }
        C0J0M c0j0m2 = c1092890eXv.LIZIZ;
        if (c0j0m2 != null) {
            c0j0m2.LIZIZ = data;
        }
        return c1092890eXv;
    }
}
