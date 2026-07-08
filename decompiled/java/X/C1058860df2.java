package X;

import Y.ACallableS246S0200000_16;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0df2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058860df2 extends C20114313n3 implements InterfaceC1058720deo {
    public static final Map<String, Integer> LJFF = C2097608Jq.LJIIIIZZ(new Pair("web", 0), new Pair("rn", 2), new Pair("lynx", 3), new Pair("unknown", -1));
    public final InterfaceC1058800dew LIZJ;
    public final C1058780deu LIZLLL;
    public final C1058880df4 LJ = new InterfaceC1520860pgC() { // from class: X.0df4
        @Override // X.InterfaceC1520860pgC
        public final void LIZ(int i, JSONObject jSONObject) {
            this.LIZ.LIZJ.LIZ(i, jSONObject);
        }
    };

    @Override // X.InterfaceC1058720deo
    public final void LIZJ(C1058870df3 c1058870df3) {
        C15O7.LIZJ(new ACallableS246S0200000_16(c1058870df3, this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0df4] */
    public C1058860df2(InterfaceC1058800dew interfaceC1058800dew, C1058780deu c1058780deu) {
        this.LIZJ = interfaceC1058800dew;
        this.LIZLLL = c1058780deu;
    }

    public final JSONObject LJ(JSONObject jSONObject, Object obj) throws JSONException {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("_bid", this.LIZ);
        C1058780deu c1058780deu = this.LIZLLL;
        if (c1058780deu == null) {
            str = null;
        } else {
            str = c1058780deu.LIZJ;
        }
        jSONObject.put("_container", str);
        jSONObject.put("_bullet_sdk_version", "1.5.16-rc.9-oversea");
        jSONObject.put("hybrid_platform", obj);
        jSONObject.put("_full_url", (Object) null);
        C1058780deu c1058780deu2 = this.LIZLLL;
        if (c1058780deu2 != null && (jSONObject2 = c1058780deu2.LIZLLL) != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    public static JSONObject LJFF(JSONObject jSONObject, JSONObject jSONObject2, Object obj) throws JSONException {
        JSONObject jSONObject3;
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        if (jSONObject2 == null) {
            jSONObject3 = new JSONObject();
        } else {
            jSONObject3 = jSONObject2;
        }
        if (jSONObject != null && (itKeys2 = jSONObject.keys()) != null) {
            while (itKeys2.hasNext()) {
                String next = itKeys2.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null) {
            while (itKeys.hasNext()) {
                String next2 = itKeys.next();
                jSONObject3.put(next2, jSONObject2.opt(next2));
            }
        }
        if (obj != null) {
            jSONObject3.put("platform", LJFF.get(obj));
        }
        return jSONObject3;
    }
}
