package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208301Bbo {
    public final String LIZ;
    public final String LIZIZ = "photo";
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public long LJ = 0;
    public long LJFF = 0;
    public int LJI = 0;
    public int LJII = 0;
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public Boolean LJIIJ = null;
    public int LJIIJJI = 0;
    public String LJIIL = "";
    public String LJIILIIL = "";
    public int LJIILJJIL = 0;
    public int LJIILL = -1;
    public boolean LJIILLIIL = false;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", this.LJIIJJI);
        jSONObject.put("type", this.LIZ);
        jSONObject.put("duration", this.LIZLLL - this.LIZJ);
        jSONObject.put("width", this.LJI);
        jSONObject.put("height", this.LJII);
        jSONObject.put("media_type", this.LIZIZ);
        jSONObject.put("is_live_photo", this.LJIIIIZZ ? 1 : 0);
        jSONObject.put("live_photo_video_load_success", Intrinsics.LJFF(this.LJIIJ, Boolean.TRUE) ? 1 : 0);
        jSONObject.put("error_code", this.LJIIL);
        jSONObject.put("error_msg", this.LJIILIIL);
        jSONObject.put("has_blur", this.LJIILJJIL);
        jSONObject.put("image_from", this.LJIILL);
        return jSONObject;
    }

    public C2208301Bbo(String str) {
        this.LIZ = str;
    }
}
