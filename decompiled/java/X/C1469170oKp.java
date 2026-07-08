package X;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469170oKp {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL = 1;
    public String LJ;

    public final String LIZ() {
        HashMap map = new HashMap();
        map.put("scene_id", this.LIZ);
        map.put("brief_scene_id", this.LIZIZ);
        map.put("auto_play", Integer.valueOf(this.LIZJ));
        map.put("mute", 0);
        map.put("card_cnt", Integer.valueOf(this.LIZLLL));
        map.put("json", this.LJ);
        return C786410Ut5.J3(new JSONObject(map));
    }

    public C1469170oKp(String str) {
        this.LIZ = str;
    }
}
