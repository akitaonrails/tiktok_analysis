package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698640uIw {
    public final List<C1698960uJS> LIZ = new LinkedList();
    public boolean LIZIZ = true;
    public String LIZJ = "";
    public final HashMap<String, C1698810uJD> LIZLLL;
    public final C1698810uJD LJ;
    public final C1698810uJD LJFF;
    public final C1698810uJD LJI;
    public final C1698810uJD LJII;
    public final C1698810uJD LJIIIIZZ;
    public final C1698810uJD LJIIIZ;
    public final C1698810uJD LJIIJ;
    public final C1698810uJD LJIIJJI;
    public final C1698810uJD LJIIL;
    public final HashMap<String, C1698810uJD> LJIILIIL;

    public C1698640uIw() {
        HashMap<String, C1698810uJD> map = new HashMap<>();
        this.LIZLLL = map;
        this.LJ = new C1698810uJD("anchor_to_anet_delay");
        this.LJFF = new C1698810uJD("anet_delay");
        this.LJI = new C1698810uJD("anet_to_cdn_delay");
        this.LJII = new C1698810uJD("rtc_server_mixer_delay");
        this.LJIIIIZZ = new C1698810uJD("rtc_media_server_to_mixer_m2_delay");
        this.LJIIIZ = new C1698810uJD("rtc_server_mixer_m2_delay");
        this.LJIIJ = new C1698810uJD("rtc_mixer_to_media_server_m2_delay");
        this.LJIIJJI = new C1698810uJD("anchor_to_cdn_delay");
        this.LJIIL = new C1698810uJD("cdn_total_delay");
        HashMap<String, C1698810uJD> map2 = new HashMap<>();
        this.LJIILIIL = map2;
        map.put("capture_camera", new C1698810uJD("e2e_camera_delay"));
        map.put("capture_screen", new C1698810uJD("e2e_screen_delay"));
        map.put("capture_window", new C1698810uJD("e2e_window_delay"));
        map.put("capture_analog", new C1698810uJD("e2e_analog_delay"));
        map.put("capture_game", new C1698810uJD("e2e_game_delay"));
        map.put("capture_fav", new C1698810uJD("e2e_fav_delay"));
        map.put("capture_bytelink", new C1698810uJD("e2e_bytelink_delay"));
        map2.put("pull_edge_ts", new C1698810uJD("cdn_to_audience_delay"));
        map2.put("encode", new C1698810uJD("transmission_total_delay"));
    }

    public static void LIZIZ(JSONObject jSONObject, C1698810uJD c1698810uJD) throws JSONException {
        if (c1698810uJD.LIZIZ != 0) {
            jSONObject.put(c1698810uJD.LIZ, c1698810uJD.LIZ());
        }
    }

    public final void LIZ(JSONObject jSONObject, long j, long j2) {
        boolean z;
        boolean z2;
        if (jSONObject.has("app_data")) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("app_data"));
            if (jSONObject2.has("anchor_link_mic_id")) {
                this.LIZJ = jSONObject2.optString("anchor_link_mic_id");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update anchorLinkMicId, ");
                sbLIZ.append(this.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                if (this.LIZIZ && !TextUtils.isEmpty(this.LIZJ) && !this.LIZ.isEmpty()) {
                    for (C1698960uJS c1698960uJS : this.LIZ) {
                        LIZ(c1698960uJS.LIZJ, c1698960uJS.LIZ, c1698960uJS.LIZIZ);
                    }
                    ((LinkedList) this.LIZ).clear();
                }
            }
        }
        boolean z3 = false;
        if (jSONObject.has("anchor_linkmic_id")) {
            if (this.LIZIZ && TextUtils.isEmpty(this.LIZJ)) {
                C1698940uJQ.LIZJ();
                C1698960uJS c1698960uJS2 = new C1698960uJS();
                c1698960uJS2.LIZ = j;
                c1698960uJS2.LIZIZ = j2;
                c1698960uJS2.LIZJ = jSONObject;
                ((LinkedList) this.LIZ).add(c1698960uJS2);
                return;
            }
            if (!TextUtils.equals(this.LIZJ, jSONObject.optString("anchor_linkmic_id"))) {
                C1698940uJQ.LIZJ();
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("scene_type") && jSONObject.optInt("scene_type") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jSONObject.has("video_e2e_delay")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video_e2e_delay");
            if (jSONObjectOptJSONObject == null) {
                C1698940uJQ.LIZJ();
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("rtc_server_mixer_offset");
            for (String str : this.LIZLLL.keySet()) {
                this.LIZLLL.get(str).LIZJ(j2, jOptLong, str, jSONObjectOptJSONObject);
            }
            if (jSONObjectOptJSONObject.optLong("rtc_media_server_end") == 0) {
                z3 = true;
            }
            String str2 = "rtc_server_mixer_start";
            String str3 = "rtc_server_mixer_end";
            if (!z) {
                if (!z3) {
                    str2 = "rtc_media_server_start";
                    str3 = "rtc_media_server_end";
                }
                this.LJ.LIZLLL(str2, "encode", jSONObjectOptJSONObject);
                this.LJFF.LIZLLL(str3, str2, jSONObjectOptJSONObject);
                this.LJI.LIZLLL("push_edge_ts", str3, jSONObjectOptJSONObject);
            } else if (z2 && !z3) {
                this.LJIIIIZZ.LJ("rtc_server_mixer_start", "rtc_media_server_start", jSONObjectOptJSONObject, jOptLong);
                this.LJIIIZ.LIZLLL("rtc_server_mixer_end", "rtc_server_mixer_start", jSONObjectOptJSONObject);
                this.LJIIJ.LIZLLL("rtc_media_server_end", "rtc_server_mixer_end", jSONObjectOptJSONObject);
            } else {
                this.LJII.LIZLLL("rtc_server_mixer_end", "rtc_server_mixer_start", jSONObjectOptJSONObject);
            }
            this.LJIIJJI.LJ("push_edge_ts", "encode", jSONObjectOptJSONObject, jOptLong);
            this.LJIIL.LIZLLL("pull_edge_ts", "push_edge_ts", jSONObjectOptJSONObject);
            for (String str4 : this.LJIILIIL.keySet()) {
                if (TextUtils.equals(str4, "encode")) {
                    this.LJIILIIL.get(str4).LIZJ(j, jOptLong, str4, jSONObjectOptJSONObject);
                } else {
                    this.LJIILIIL.get(str4).LIZJ(j, 0L, str4, jSONObjectOptJSONObject);
                }
            }
        }
    }
}
