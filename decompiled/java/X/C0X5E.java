package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X5E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5E {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final int LIZ = 20;
    public volatile C0X5E LIZIZ;
    public volatile String LIZJ;
    public volatile JSONObject LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;

    public final JSONObject LIZ() throws JSONException {
        int i = 0;
        C0X5E c0x5e = this;
        while (c0x5e.LIZIZ != null && i <= this.LIZ) {
            i++;
            c0x5e = c0x5e.LIZIZ;
        }
        if (Intrinsics.LJFF(c0x5e, this)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start", c0x5e.LJ);
        C0X5E c0x5e2 = this.LIZIZ;
        jSONObject.put("end", c0x5e2 != null ? c0x5e2.LJFF : this.LJ);
        jSONObject.put("count", i);
        return jSONObject;
    }
}
