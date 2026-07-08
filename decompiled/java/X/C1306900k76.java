package X;

import Y.AObjectS363S0100000_20;
import com.bytedance.android.starship.strategy.DecisionConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306900k76 {
    public static final C1306900k76 LIZIZ = new C1306900k76();
    public final InterfaceC1306890k75 LIZ = C1306940k7A.LIZ.LIZ(EnumC1306750k6r.MULTI_MEDIA);

    public final Map<String, DecisionConfig> LIZ(String str) {
        InterfaceC1306890k75 interfaceC1306890k75 = this.LIZ;
        if (interfaceC1306890k75 != null) {
            if (str == null) {
                return interfaceC1306890k75.LJII();
            }
            return interfaceC1306890k75.LIZLLL(str);
        }
        throw new Exception("Container is null");
    }

    public final void LIZIZ(JSONObject jSONObject, List<String> list, InterfaceC1307040k7K interfaceC1307040k7K) {
        this.LIZ.LJIIIIZZ(jSONObject, list, new AObjectS363S0100000_20(interfaceC1307040k7K, 0));
    }
}
