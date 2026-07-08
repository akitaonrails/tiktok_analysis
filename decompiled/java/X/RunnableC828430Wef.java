package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC828430Wef implements Runnable {
    public final /* synthetic */ Object LL;

    public RunnableC828430Wef(Object obj) {
        this.LL = obj;
    }

    public final void LIZ() throws JSONException {
        C1520360pfO c1520360pfO = new C1520360pfO("SafeConcurrentHashMapNPE");
        c1520360pfO.LIZIZ = "sparkTrace";
        c1520360pfO.LIZ = "";
        c1520360pfO.LJIIJJI = EnumC993170bx5.Slardar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", this.LL);
        c1520360pfO.LIZLLL = jSONObject;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        C1520380pfQ.LIZ.getClass();
        C1520380pfQ.LIZ(c1520350pfNLIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SafeConcurrentHashMap@fbb7.reportError$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SafeConcurrentHashMap@fbb7.reportError$1");
    }
}
