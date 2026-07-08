package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884690YnD {
    public static final /* synthetic */ int LIZJ = 0;
    public final InterfaceC879010Ye3 LIZ;
    public final Map<String, C884700YnE> LIZIZ = new LinkedHashMap();

    public final void LJ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page", this.LIZ);
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            String str = (String) entry.getKey();
            C884700YnE c884700YnE = (C884700YnE) entry.getValue();
            c884700YnE.getClass();
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((LinkedHashMap) c884700YnE.LIZLLL).entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("duration", ((C884910YnZ) entry2.getValue()).LIZ);
                jSONObject3.put("extra", ((C884910YnZ) entry2.getValue()).LIZIZ);
                jSONObject2.put(String.valueOf(((Number) entry2.getKey()).intValue()), jSONObject3);
            }
            jSONObject.put(str, jSONObject2);
        }
        C0I0B.LJFF.LIZIZ().LIZ("chat_list_performance", jSONObject);
        ((LinkedHashMap) this.LIZIZ).clear();
    }

    public C884690YnD(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LIZ = interfaceC879010Ye3;
    }

    public final void LIZ(String str) {
        C884700YnE c884700YnE = (C884700YnE) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c884700YnE != null) {
            c884700YnE.LIZJ = SystemClock.uptimeMillis();
            c884700YnE.LIZ();
        }
    }

    public final void LIZJ(String str) {
        Map<String, C884700YnE> map = this.LIZIZ;
        C884700YnE c884700YnE = new C884700YnE();
        c884700YnE.LIZIZ = SystemClock.uptimeMillis();
        map.put(str, c884700YnE);
    }

    public final void LIZIZ(String str, Map<String, ? extends Object> map) {
        C884700YnE c884700YnE = (C884700YnE) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c884700YnE != null) {
            c884700YnE.LIZJ = SystemClock.uptimeMillis();
            c884700YnE.LIZ();
            c884700YnE.LIZIZ(map);
            c884700YnE.LIZ++;
        }
    }

    public final void LIZLLL(String str, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object c884700YnE = linkedHashMap.get(str);
        if (c884700YnE == null) {
            c884700YnE = new C884700YnE();
            linkedHashMap.put(str, c884700YnE);
        }
        C884700YnE c884700YnE2 = (C884700YnE) c884700YnE;
        c884700YnE2.LIZIZ = SystemClock.uptimeMillis();
        c884700YnE2.LIZIZ(map);
    }
}
