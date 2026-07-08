package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VBR extends AbstractC793690VBn {
    @Override // X.C0VBU
    public String LIZ() {
        return "/monitor/collect/batch/";
    }

    @Override // X.C0VBU
    public String getName() {
        return "log";
    }

    @Override // X.C0VBU
    public List<String> getUrls() {
        C0V7Z c0v7z = C792520V7a.LIZ;
        C792880V8k c792880V8k = c0v7z.LJFF;
        return (c792880V8k == null || C08GN.LIZIZ(c792880V8k.LIZJ)) ? c0v7z.LIZ : c0v7z.LJFF.LIZJ;
    }

    @Override // X.C0VBU
    public final C793730VBr LIZIZ(HashMap<Long, JSONArray> map) {
        C793620VBg c793620VBgLIZ;
        try {
            JSONArray jSONArray = new JSONArray();
            for (Long l : map.keySet()) {
                C793620VBg c793620VBgLIZ2 = C793600VBe.LIZIZ().LIZ(String.valueOf(l));
                if (c793620VBgLIZ2 == null) {
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("HeaderInfo null for key ");
                        sbLIZ.append(l);
                        C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC792920V8o interfaceC792920V8o = C792910V8n.LIZ;
                        if (interfaceC792920V8o != null) {
                            interfaceC792920V8o.w();
                        }
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", map.get(l));
                    jSONObject.put("header", C793610VBf.LIZIZ(c793620VBgLIZ2));
                    jSONArray.put(jSONObject);
                }
            }
            JSONArray jSONArrayLIZIZ = C793500VAu.LIZ.LIZIZ();
            if (jSONArrayLIZIZ.length() > 0 && (c793620VBgLIZ = C793600VBe.LIZIZ().LIZ(String.valueOf(C793610VBf.LIZ()))) != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", jSONArrayLIZIZ);
                jSONObject2.put("header", C793610VBf.LIZIZ(c793620VBgLIZ));
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("request:");
                sbLIZ2.append(jSONObject3);
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
            }
            InterfaceC793570VBb interfaceC793570VBb = (InterfaceC793570VBb) C792590V7h.LIZ(InterfaceC793570VBb.class);
            if (interfaceC793570VBb != null) {
                jSONObject3 = interfaceC793570VBb.LIZ();
            }
            return LIZJ(jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
