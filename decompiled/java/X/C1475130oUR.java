package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475130oUR extends C1475280oUg {
    public final InterfaceC1467050oHP LIZLLL;
    public final InterfaceC1475610oVD LJFF;
    public Map<String, String> LJI;
    public int LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIL;
    public long LJIILIIL;
    public List<C1471830oP7> LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public String LJJI;
    public String LJJIFFI;
    public int LJJII;
    public Map<EnumC1475210oUZ, C790660Uzw> LJJIII;
    public final EnumC2281151EQn LJ = EnumC2281151EQn.Undefine;
    public int LJIIJJI = -1;
    public String LJIJ = "";
    public String LJIJI = "";
    public String LJIJJ = "";

    @Override // X.C1475280oUg
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.LIZLLL);
    }

    public final boolean LIZ() {
        return (this.LJI == null && this.LJIIJJI == -1 && this.LJIIJ == null && this.LJIJ.length() <= 0 && this.LJIJI.length() <= 0) ? false : true;
    }

    public final JSONObject LIZLLL() {
        JSONObject jSONObjectLJII = this.LIZLLL.LJII();
        try {
            jSONObjectLJII.put("sc_priority", this.LJII);
            jSONObjectLJII.put("sc_category", this.LJIILLIIL);
            jSONObjectLJII.put("biz_had_cache", this.LJIIZILJ);
            jSONObjectLJII.put("is_live", this.LJJ);
            jSONObjectLJII.put("live_json_string_data", this.LJJI);
            jSONObjectLJII.put("sc_author_live_room_id", this.LJJIFFI);
            jSONObjectLJII.put("sc_avator_live", this.LJJII);
            if (this.LJJI != null) {
                jSONObjectLJII.put("live_stream_info", new JSONObject(this.LJJI));
            }
            if (this.LJI != null) {
                jSONObjectLJII.put("sc_extra", new JSONObject(this.LJI));
            }
            String str = this.LJIIIIZZ;
            if (str != null) {
                jSONObjectLJII.put("sc_custom_path", str);
            }
            String str2 = this.LJIIIZ;
            if (str2 != null) {
                jSONObjectLJII.put("sc_context", str2);
            }
            long j = this.LIZ;
            if (j > 0) {
                jSONObjectLJII.put("sc_preload_size", j);
            }
            String str3 = this.LJIIJ;
            if (str3 != null) {
                jSONObjectLJII.put("sc_frt_sub_vid", str3);
            }
            int i = this.LJIIJJI;
            if (i != -1) {
                jSONObjectLJII.put("sc_sub_list_index", i);
            }
            if (this.LJIIL) {
                jSONObjectLJII.put("sc_first_sub_media", 1);
            }
            long j2 = this.LJIILIIL;
            if (j2 != 0) {
                jSONObjectLJII.put("sc_business_url_expired_time", j2);
            }
            if (this.LJIJ.length() > 0) {
                jSONObjectLJII.put("sc_tag", this.LJIJ);
            }
            if (this.LJIJI.length() > 0) {
                jSONObjectLJII.put("sc_sub_tag", this.LJIJI);
            }
            if (this.LJIJJ.length() > 0) {
                jSONObjectLJII.put("sc_gid", this.LJIJJ);
            }
            if (this.LJIJJLI) {
                jSONObjectLJII.put("is_ecommerce", 1);
            }
            if (this.LJIILJJIL != null && this.LJIILL) {
                JSONArray jSONArrayOptJSONArray = jSONObjectLJII.optJSONArray("infos");
                if (jSONArrayOptJSONArray != null) {
                    Iterator<C1471830oP7> it2 = this.LJIILJJIL.iterator();
                    while (it2.hasNext()) {
                        JSONObject jSONObjectLIZJ = it2.next().LIZJ();
                        if (jSONObjectLIZJ != null) {
                            jSONArrayOptJSONArray.put(jSONObjectLIZJ);
                        }
                    }
                }
                jSONObjectLJII.put("enable_dubbed", true);
                jSONObjectLJII.put("dubbed_language", "");
            }
            if (this.LJJIII != null) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((HashMap) this.LJJIII).entrySet()) {
                    jSONObject.put(((EnumC1475210oUZ) entry.getKey()).getValue(), ((C790660Uzw) entry.getValue()).LIZ());
                }
                jSONObjectLJII.put("sc_external_res", jSONObject);
                return jSONObjectLJII;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
        }
        return jSONObjectLJII;
    }

    public final String LIZJ() {
        return C786410Ut5.J3(LIZLLL());
    }

    @Override // X.C1475280oUg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1475130oUR) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.LIZLLL, ((C1475130oUR) obj).LIZLLL);
    }

    public C1475130oUR(InterfaceC1467050oHP interfaceC1467050oHP, C1475170oUV c1475170oUV) {
        this.LIZLLL = interfaceC1467050oHP;
        this.LJFF = c1475170oUV;
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        ((HashMap) this.LJI).put(str, str2);
    }
}
