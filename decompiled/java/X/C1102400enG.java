package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0enG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1102400enG {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final Map<Long, Long> LJI = new LinkedHashMap();
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI;

    public JSONObject LIZ(long j) throws JSONException {
        String str;
        String str2;
        long jLongValue;
        String str3;
        JSONObject jSONObject = new JSONObject();
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        int i = this.LIZ;
        c1102250en1.getClass();
        Map<String, String> map = C1102250en1.LJIIJ().component;
        String str4 = null;
        if (map != null) {
            str4 = map.get(String.valueOf(i));
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("component", C1102250en1.LJIIIZ(i, str4));
        int i2 = this.LIZIZ;
        Map<String, String> map2 = C1102250en1.LJIIJ().biz;
        if (map2 == null || (str = map2.get(String.valueOf(i2))) == null) {
            str = "";
        }
        jSONObject.put("biz", C1102250en1.LJIIIZ(i2, str));
        int i3 = this.LIZJ;
        Map<String, String> map3 = C1102250en1.LJIIJ().scene;
        if (map3 != null && (str3 = map3.get(String.valueOf(i3))) != null) {
            str5 = str3;
        }
        jSONObject.put(Scene.SCENE_SERVICE, C1102250en1.LJIIIZ(i3, str5));
        int i4 = this.LJFF;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        str2 = "unknown";
                    } else {
                        str2 = "sync";
                    }
                } else {
                    str2 = "room";
                }
            } else {
                str2 = "config";
            }
        } else {
            str2 = "none";
        }
        jSONObject.put("update_level", str2);
        Long l = (Long) ((LinkedHashMap) this.LJI).get(Long.valueOf(j));
        if (l == null && (l = (Long) ((LinkedHashMap) this.LJI).get(0L)) == null) {
            jLongValue = -1;
        } else {
            jLongValue = l.longValue();
        }
        jSONObject.put("quota", jLongValue);
        jSONObject.put("early_duration", this.LIZLLL);
        jSONObject.put("early_quota", this.LJII);
        jSONObject.put("early_quota_count", this.LJIIIIZZ);
        jSONObject.put("gap", this.LJ);
        jSONObject.put("gap_quota", this.LJIIIZ);
        jSONObject.put("gap_count", this.LJIIJ);
        jSONObject.put("last_slot_first_notify_ts", this.LJIIJJI);
        return jSONObject;
    }

    public C1102400enG(int i, int i2, int i3, int i4, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = i4;
    }
}
