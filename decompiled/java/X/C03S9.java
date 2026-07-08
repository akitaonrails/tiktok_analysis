package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03S9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03S9 {
    public final String LIZ;
    public String LIZIZ;
    public final List<C03SA> LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public Boolean LJI;
    public final HashMap<String, String> LJII = new HashMap<>();

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method_id", this.LIZ);
            jSONObject.put("payment_method_token", this.LIZIZ);
            JSONArray jSONArray = new JSONArray();
            List<C03SA> list = this.LIZJ;
            if (list != null) {
                Iterator<C03SA> it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().LIZ());
                }
                jSONObject.put("payment_elements", jSONArray);
            }
            String str = this.LIZLLL;
            if (str != null) {
                try {
                    jSONObject.put("tenure", CastIntegerProtector.parseInt(str));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String str2 = this.LJ;
            if (str2 != null) {
                jSONObject.put("installment_plan_id", str2);
            }
            String str3 = this.LJFF;
            if (str3 != null) {
                jSONObject.put("pipo_bank_code", str3);
            }
            Boolean bool = this.LJI;
            if (bool != null) {
                jSONObject.put("is_cci", bool);
            }
            HashMap<String, String> map = this.LJII;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("extra_info", new JSONObject(this.LJII));
                return jSONObject;
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return jSONObject;
    }

    public C03S9(String str, List<C03SA> list) {
        this.LIZ = str;
        this.LIZJ = list;
    }
}
