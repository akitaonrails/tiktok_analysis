package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673950Qc5 {
    public Boolean LIZ;
    public Boolean LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public String LJI;
    public Integer LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public boolean LJIILIIL;
    public Long LJIILJJIL;
    public Integer LJIILL;
    public Long LJIILLIIL;
    public Boolean LJIIZILJ;
    public Long LJIJ;
    public Long LJIJI;
    public Long LJIJJ;
    public Map<String, String> LJIJJLI;
    public Long LJIL;
    public Long LJJ;
    public Boolean LJJI;

    public final Map<String, Object> LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Long l = this.LIZJ;
        if (l != null) {
            jSONObject.put("route_start_time", l.longValue());
        }
        Long l2 = this.LIZLLL;
        if (l2 != null) {
            jSONObject.put("intercept_start_time", l2.longValue());
        }
        Long l3 = this.LJFF;
        if (l3 != null) {
            jSONObject.put("start_time", l3.longValue());
        }
        Long l4 = this.LJ;
        if (l4 != null) {
            jSONObject.put("intercept_end_time", l4.longValue());
        }
        Long l5 = this.LJIIIIZZ;
        if (l5 != null) {
            jSONObject.put("activity_create_time", l5.longValue());
        }
        Long l6 = this.LJIIIZ;
        if (l6 != null) {
            jSONObject.put("root_fragment_create_time", l6.longValue());
        }
        Long l7 = this.LJIIJ;
        if (l7 != null) {
            jSONObject.put("blank_init_time", l7.longValue());
        }
        Long l8 = this.LJIIJJI;
        if (l8 != null) {
            jSONObject.put("assemble_time", l8.longValue());
        }
        Long l9 = this.LJIIL;
        if (l9 != null) {
            jSONObject.put("assem_show_time", l9.longValue());
        }
        Long l10 = this.LJIILJJIL;
        if (l10 != null) {
            jSONObject.put("fetch_history_cache_time", l10.longValue());
        }
        Long l11 = this.LJIILLIIL;
        if (l11 != null) {
            jSONObject.put("fetch_guess_cache_time", l11.longValue());
        }
        Long l12 = this.LJIJ;
        if (l12 != null) {
            jSONObject.put("lynx_init_time", l12.longValue());
        }
        Long l13 = this.LJIJI;
        if (l13 != null) {
            jSONObject.put("first_screen_time", l13.longValue());
        }
        Long l14 = this.LJIJJ;
        if (l14 != null) {
            jSONObject.put("lynx_first_screen_time", l14.longValue());
        }
        Long l15 = this.LJIL;
        if (l15 != null) {
            jSONObject.put("guess_request_time", l15.longValue());
        }
        Long l16 = this.LJJ;
        if (l16 != null) {
            jSONObject.put("guess_response_time", l16.longValue());
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("timing", strJ3);
        Boolean bool = this.LIZ;
        if (bool != null) {
            linkedHashMap.put("from_mall", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        Boolean bool2 = this.LIZIZ;
        if (bool2 != null) {
            linkedHashMap.put("simple_tab", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        String str = this.LJI;
        if (str != null) {
            linkedHashMap.put("landing_page", str);
        }
        Integer num = this.LJII;
        if (num != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(num.intValue()));
        }
        linkedHashMap.put("is_reuse_lynx", Integer.valueOf(this.LJIILIIL ? 1 : 0));
        Integer num2 = this.LJIILL;
        if (num2 != null) {
            linkedHashMap.put("count", Integer.valueOf(num2.intValue()));
        }
        Boolean bool3 = this.LJIIZILJ;
        if (bool3 != null) {
            linkedHashMap.put("hit_guess_cache", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        Map<String, String> map = this.LJIJJLI;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Boolean bool4 = this.LJJI;
        if (bool4 != null) {
            linkedHashMap.put("guess_success", Integer.valueOf(bool4.booleanValue() ? 1 : 0));
        }
        return linkedHashMap;
    }
}
