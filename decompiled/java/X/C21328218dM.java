package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS427S0200000_26;

/* JADX INFO: renamed from: X.18dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21328218dM extends AbstractC1163040gN4 {
    public Long LIZ;
    public Long LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public int LJJ;
    public int LJJI;
    public Integer LJJII;
    public String LJJIII;
    public long LIZJ = -1;
    public long LJIJ = -1;
    public long LJIJI = -1;
    public boolean LJJIFFI = true;

    @Override // X.AbstractC1163040gN4
    public String LIZ() {
        return "myna_bind_data";
    }

    public Map<String, Object> LIZLLL() {
        if (!this.LJJIFFI) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.LIZ;
        Long l2 = this.LIZIZ;
        if (l == null || l2 == null || l.longValue() <= 0 || l2.longValue() <= 0) {
            C1325860kbg.LIZIZ(null, new AwS427S0200000_26(l, l2, 67), C2097608Jq.LJ());
            return C2097608Jq.LJ();
        }
        linkedHashMap.put("t_bind_data_start", l);
        linkedHashMap.put("t_bind_data_end", l2);
        float f = 1000000L;
        float f2 = (this.LJFF * 1.0f) / f;
        float f3 = (this.LJI * 1.0f) / f;
        linkedHashMap.put("expr_count", Integer.valueOf(this.LJII));
        linkedHashMap.put("parse_expr_cache_count", Integer.valueOf(this.LJIIIIZZ));
        linkedHashMap.put("parse_expr_hit_cache_ratio", this.LJII == 0 ? 0 : Float.valueOf(Math.round((this.LJIIIIZZ / r9) * 100) / 100.0f));
        linkedHashMap.put("parse_expr_duration", Float.valueOf(f2));
        linkedHashMap.put("evaluate_expr_duration", Float.valueOf(f3));
        linkedHashMap.put("expr_duration", Float.valueOf(f2 + f3));
        linkedHashMap.put("bind_props_duration", Long.valueOf(this.LJIIIZ));
        linkedHashMap.put("diff_duration", Long.valueOf(this.LJIIJ));
        linkedHashMap.put("text_bind_duration", Long.valueOf(this.LJIILLIIL));
        linkedHashMap.put("init_elements_duration", Long.valueOf(this.LJIIJJI));
        linkedHashMap.put("create_view_count", Integer.valueOf(this.LJIIL));
        linkedHashMap.put("create_view_cache_count", Integer.valueOf(this.LJIILIIL));
        linkedHashMap.put("create_view_hit_cache_ratio", this.LJIIL == 0 ? 0 : Float.valueOf(Math.round((this.LJIILIIL / r4) * 100) / 100.0f));
        linkedHashMap.put("create_flatten_count", Integer.valueOf(this.LJIILJJIL));
        linkedHashMap.put("create_flatten_cache_count", Integer.valueOf(this.LJIILL));
        linkedHashMap.put("update_view_tree_time", Long.valueOf(this.LJIIZILJ));
        int i = this.LJJ;
        if (i > 0) {
            float f4 = (this.LJIJJ * 1.0f) / f;
            float f5 = (this.LJIJJLI * 1.0f) / f;
            float f6 = (this.LJIL * 1.0f) / f;
            linkedHashMap.put("image_count", Integer.valueOf(i));
            linkedHashMap.put("inline_image_count", Integer.valueOf(this.LJJI));
            linkedHashMap.put("process_image_url_duration", Float.valueOf(f4));
            linkedHashMap.put("ecom_image_plugin_duration", Float.valueOf(f5));
            linkedHashMap.put("fresco_image_request_duration", Float.valueOf(f6));
            linkedHashMap.put("image_request_total_duration", Float.valueOf(f4 + f5 + f6));
        }
        long j = this.LJIJ;
        if (j >= 0 && this.LJIJI >= 0) {
            linkedHashMap.put("measure_duration", Long.valueOf(j));
            linkedHashMap.put("layout_duration", Long.valueOf(this.LJIJI));
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC1163040gN4
    public Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("success", Integer.valueOf(this.LJJIFFI ? 1 : 0));
        Integer num = this.LJJII;
        if (num != null) {
            map2.put("error_code", Integer.valueOf(num.intValue()));
        }
        String str = this.LJJIII;
        if (str != null) {
            map2.put("error_msg", str);
        }
        map2.putAll(LIZLLL());
        map2.put("is_first_bind", Integer.valueOf(this.LIZLLL ? 1 : 0));
        map2.put("hit_preload", Integer.valueOf(this.LJ ? 1 : 0));
        map2.put("success", Integer.valueOf(this.LJJIFFI ? 1 : 0));
        return map2;
    }
}
