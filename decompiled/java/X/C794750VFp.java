package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794750VFp {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final InterfaceC794760VFq LIZLLL;
    public final JSONObject LJ;
    public final int LJFF;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceparent", this.LIZ);
        jSONObject.put("type", this.LIZIZ);
        jSONObject.put("category", this.LIZJ);
        jSONObject.put("data", this.LIZLLL.LIZ());
        jSONObject.put("extra", this.LJ);
        jSONObject.put("ref_log", this.LJFF);
        return jSONObject;
    }

    public C794750VFp(InterfaceC794710VFl interfaceC794710VFl, int i, int i2, InterfaceC794760VFq interfaceC794760VFq, JSONObject jSONObject, int i3) {
        this.LIZ = interfaceC794710VFl.LIZIZ();
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = interfaceC794760VFq;
        this.LJ = jSONObject;
        this.LJFF = i3;
    }
}
