package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191991Aqb {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public C2191991Aqb(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("max_event_size");
        this.LIZ = jOptLong <= 0 ? 1048576L : jOptLong;
        long jOptLong2 = jSONObject.optLong("max_request_body_size");
        this.LIZIZ = jOptLong2 <= 0 ? 3145728L : jOptLong2;
        int iOptInt = jSONObject.optInt("max_request_event_count");
        this.LIZJ = iOptInt <= 0 ? 2000 : iOptInt;
        long jOptLong3 = jSONObject.optLong("event_ttl");
        this.LIZLLL = jOptLong3 <= 0 ? 604800L : jOptLong3;
    }
}
