package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1393470mMj {
    public String LIZ;
    public long LIZIZ;

    public final int hashCode() {
        return super.hashCode();
    }

    public static C1393470mMj LIZ(JSONObject jSONObject) {
        C1393470mMj c1393470mMj = new C1393470mMj();
        c1393470mMj.LIZ = jSONObject.optString("aid", "");
        c1393470mMj.LIZIZ = jSONObject.optLong("time", 0L);
        return c1393470mMj;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1393470mMj) && C2093608Ic.LIZJ(((C1393470mMj) obj).LIZ, this.LIZ)) {
            return true;
        }
        return false;
    }
}
