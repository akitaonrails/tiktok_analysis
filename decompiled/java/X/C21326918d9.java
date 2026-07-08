package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21326918d9 extends AbstractC1163040gN4 {
    public Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Integer LJIIL;
    public String LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LIZ = true;
    public boolean LJIIJJI = true;

    @Override // X.AbstractC1163040gN4
    public final String LIZ() {
        return "myna_create_view";
    }

    public final Map<String, Object> LIZLLL() {
        if (!this.LJIIJJI) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.LIZIZ;
        Long l2 = this.LIZJ;
        if (l != null) {
            linkedHashMap.put("t_create_view_start", l);
        }
        if (l2 != null) {
            linkedHashMap.put("t_create_view_end", l2);
        }
        if (l != null && l2 != null && l2.longValue() >= l.longValue()) {
            linkedHashMap.put("create_view_duration", Long.valueOf(l2.longValue() - l.longValue()));
        }
        Long l3 = this.LIZLLL;
        Long l4 = this.LJ;
        if (l3 != null) {
            linkedHashMap.put("t_create_container_start", l3);
        }
        if (l4 != null) {
            linkedHashMap.put("t_create_container_end", l4);
        }
        if (l3 != null && l4 != null && l4.longValue() >= l3.longValue()) {
            linkedHashMap.put("create_container_duration", Long.valueOf(l4.longValue() - l3.longValue()));
        }
        Long l5 = this.LJFF;
        Long l6 = this.LJI;
        if (l5 != null) {
            linkedHashMap.put("t_fetch_template_start", l5);
        }
        if (l6 != null) {
            linkedHashMap.put("t_fetch_template_end", l6);
        }
        if (l5 != null && l6 != null && l6.longValue() >= l5.longValue()) {
            linkedHashMap.put("fetch_template_duration", Long.valueOf(l6.longValue() - l5.longValue()));
        }
        Long l7 = this.LJII;
        Long l8 = this.LJIIIIZZ;
        if (l7 != null) {
            linkedHashMap.put("t_parse_element_start", l7);
        }
        if (l8 != null) {
            linkedHashMap.put("t_parse_element_end", l8);
        }
        if (l7 != null && l8 != null && l8.longValue() >= l7.longValue()) {
            linkedHashMap.put("parse_element_duration", Long.valueOf(l8.longValue() - l7.longValue()));
        }
        Long l9 = this.LJIIIZ;
        Long l10 = this.LJIIJ;
        if (l9 != null) {
            linkedHashMap.put("t_create_root_view_start", l9);
        }
        if (l10 != null) {
            linkedHashMap.put("t_create_root_view_end", l10);
        }
        if (l9 != null && l10 != null && l10.longValue() >= l9.longValue()) {
            linkedHashMap.put("create_root_view_duration", Long.valueOf(l10.longValue() - l9.longValue()));
        }
        return linkedHashMap;
    }

    public final void LJ() {
        this.LIZJ = Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.AbstractC1163040gN4
    public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("success", Integer.valueOf(this.LJIIJJI ? 1 : 0));
        Integer num = this.LJIIL;
        if (num != null) {
            map2.put("error_code", Integer.valueOf(num.intValue()));
        }
        String str = this.LJIILIIL;
        if (str != null) {
            map2.put("error_msg", str);
        }
        map2.put("is_ui_thread", Integer.valueOf(this.LIZ ? 1 : 0));
        map2.put("hit_preload", Integer.valueOf(this.LJIILL ? 1 : 0));
        map2.put("hit_pre_decode", Integer.valueOf(this.LJIILLIIL ? 1 : 0));
        map2.put("gecko_error_code", Integer.valueOf(this.LJIILJJIL));
        map2.putAll(LIZLLL());
        return map2;
    }
}
