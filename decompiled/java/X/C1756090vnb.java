package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756090vnb {
    public static final /* synthetic */ int LJI = 0;
    public HashMap<String, Object> LJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(4));
    public final EnumC1154410g99[] LIZIZ = {EnumC1154410g99.MEANINGFUL_RENDER, EnumC1154410g99.FULL_PAGE_TTI};
    public final CopyOnWriteArrayList<EnumC1154410g99> LIZJ = new CopyOnWriteArrayList<>();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public EnumC1756020vnU LJFF = EnumC1756020vnU.UNDEFINE;

    public final ConcurrentHashMap<String, Object> LIZ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    public final void LIZLLL() {
        Object obj;
        if (this.LIZLLL.getAndSet(true)) {
            return;
        }
        HashMap<String, Object> map = this.LJ;
        Object obj2 = map != null ? map.get("previous_page") : null;
        HashMap<String, Object> map2 = this.LJ;
        if (map2 != null) {
            map2.get("entrance_form");
        }
        HashMap<String, Object> map3 = this.LJ;
        if (map3 != null) {
            map3.get("enter_from_info");
        }
        HashMap<String, Object> map4 = this.LJ;
        if (map4 == null || (obj = map4.get("biz_type")) == null) {
            obj = "";
        }
        HashMap<String, Object> map5 = this.LJ;
        Object obj3 = map5 != null ? map5.get("source_page_type") : null;
        HashMap<String, Object> map6 = this.LJ;
        Object obj4 = map6 != null ? map6.get("sku_num") : null;
        HashMap<String, Object> map7 = this.LJ;
        if (map7 != null) {
            map7.get("checkout_type");
        }
        HashMap<String, Object> map8 = this.LJ;
        Object obj5 = map8 != null ? map8.get("click_from") : null;
        HashMap<String, Object> map9 = this.LJ;
        Object obj6 = map9 != null ? map9.get("node_count") : null;
        HashMap<String, Object> map10 = this.LJ;
        Object obj7 = map10 != null ? map10.get("node_list") : null;
        ConcurrentHashMap<String, Object> concurrentHashMapLIZ = LIZ();
        LIZIZ("total_router_cost", "t_router_end", "t_router_start", concurrentHashMapLIZ);
        LIZIZ("router_param_config_cost", "t_config_router_params_end", "t_config_router_params_start", concurrentHashMapLIZ);
        LIZIZ("router_preparation_cost", "t_routing_prepare_end", "t_routing_prepare_start", concurrentHashMapLIZ);
        LIZIZ("page_creation_cost", "t_create_page_end", "t_create_page_start", concurrentHashMapLIZ);
        LIZIZ("init_stage_cost", "t_meaningful_init_stage_end", "t_meaningful_init_stage_start", concurrentHashMapLIZ);
        LIZIZ("fragment_initial_setup_cost", "t_fragment_init_argument_end", "t_fragment_init_argument_start", concurrentHashMapLIZ);
        LIZIZ("fragment_on_create_cost", "t_fragment_on_create_end", "t_fragment_on_create_start", concurrentHashMapLIZ);
        LIZIZ("init_data_cost", "t_prepare_init_data_end", "t_prepare_init_data_start", concurrentHashMapLIZ);
        LIZIZ("fragment_create_view_cost", "t_fragment_view_create_end", "t_fragment_view_create_start", concurrentHashMapLIZ);
        LIZIZ("fragment_view_created_cost", "t_fragment_view_created_end", "t_fragment_view_created_start", concurrentHashMapLIZ);
        LIZIZ("container_view_load_cost", "t_container_view_did_load_end", "t_container_view_did_load_start", concurrentHashMapLIZ);
        LIZIZ("fragment_lifecycle_handler_cost", "t_fragment_lifecycle_handler_end", "t_fragment_lifecycle_handler_start", concurrentHashMapLIZ);
        LIZIZ("handle_cache_data_cost", "t_handle_cache_data_end", "t_handle_cache_data_start", concurrentHashMapLIZ);
        LIZIZ("handle_cache_update_product_cost", "t_cache_update_product_end", "t_cache_update_product_start", concurrentHashMapLIZ);
        LIZIZ("cache_render_cost", "t_cache_render_end", "t_cache_render_start", concurrentHashMapLIZ);
        LIZIZ("lifecycle_end_to_data_mount_cost", "t_meaningful_data_mount_stage_end", "t_fragment_lifecycle_handler_end", concurrentHashMapLIZ);
        LIZIZ("data_mount_stage_cost", "t_meaningful_data_mount_stage_end", "t_meaningful_data_mount_stage_start", concurrentHashMapLIZ);
        LIZIZ("cache_list_render_cost", "t_cache_list_render_end", "t_cache_list_render_start", concurrentHashMapLIZ);
        LIZIZ("post_cache_list_meaningful_render_cost", "t_meaningful_rendered_end", "t_cache_list_render_end", concurrentHashMapLIZ);
        LIZIZ("render_stage_cost", "t_meaningful_rendered_end", "t_meaningful_rendered_trigger", concurrentHashMapLIZ);
        LIZIZ("fp_cost", "t_meaningful_rendered_end", "t_tti_start", concurrentHashMapLIZ);
        concurrentHashMapLIZ.put("biz_type", obj);
        EnumC1756020vnU enumC1756020vnU = this.LJFF;
        if (enumC1756020vnU != null) {
            concurrentHashMapLIZ.put("data_mount_cache_type", Integer.valueOf(enumC1756020vnU.getType()));
        }
        if (obj2 != null) {
            concurrentHashMapLIZ.put("previous_page", obj2);
        }
        if (obj3 != null) {
            concurrentHashMapLIZ.put("source_page_type", obj3);
        }
        if (obj4 != null) {
            concurrentHashMapLIZ.put("sku_num", obj4);
        }
        if (obj5 != null) {
            concurrentHashMapLIZ.put("click_from", obj5);
        }
        if (obj6 != null) {
            concurrentHashMapLIZ.put("node_count", obj6);
        }
        if (obj7 != null) {
            concurrentHashMapLIZ.put("node_list", obj7);
        }
        C1018703yb.LJ("rd_tiktokec_us_pdp_perf_page_render", new HashMap(LIZ()));
    }

    public final void LJI(Long l) {
        if (this.LIZLLL.get()) {
            return;
        }
        LJII("t_tti_start", false);
        LJII("t_meaningful_init_stage_start", false);
        LJ(l, "t_start_click_time", false);
    }

    public final void LJIIIZ(EnumC1154410g99 enumC1154410g99) {
        if (this.LIZJ.contains(enumC1154410g99)) {
            return;
        }
        this.LIZJ.add(enumC1154410g99);
        EnumC1154410g99[] enumC1154410g99Arr = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (EnumC1154410g99 enumC1154410g992 : enumC1154410g99Arr) {
            if (this.LIZJ.contains(enumC1154410g992)) {
                arrayList.add(enumC1154410g992);
            }
        }
        if (arrayList.size() == this.LIZIZ.length) {
            LIZLLL();
        }
    }

    public final void LJII(String str, boolean z) {
        LJ(Long.valueOf(System.currentTimeMillis()), str, z);
    }

    public final void LIZJ(String str, String str2, List list) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        int size = ((ArrayList) list).size();
        if (this.LIZLLL.get()) {
            return;
        }
        LIZ().putIfAbsent(str, strLJJLIIIJ);
        LIZ().putIfAbsent(str2, Integer.valueOf(size));
    }

    public final void LJ(Object obj, String str, boolean z) {
        if (obj == null || this.LIZLLL.get()) {
            return;
        }
        if (z) {
            LIZ().putIfAbsent(str, obj);
        } else {
            LIZ().put(str, obj);
        }
    }

    public static void LIZIZ(String str, String str2, String str3, Map map) {
        Long l;
        Object obj = map.get(str2);
        Long l2 = null;
        if (obj instanceof Long) {
            l = (Long) obj;
        } else {
            l = null;
        }
        Object obj2 = map.get(str3);
        if (obj2 instanceof Long) {
            l2 = (Long) obj2;
        }
        if (l == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip metric:");
            sbLIZ.append(str);
            sbLIZ.append(" reason:missing ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (l2 == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("skip metric:");
            sbLIZ2.append(str);
            sbLIZ2.append(" reason:missing ");
            sbLIZ2.append(str3);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (l.longValue() < l2.longValue()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("skip metric:");
            sbLIZ3.append(str);
            sbLIZ3.append(" reason:");
            sbLIZ3.append(str2);
            sbLIZ3.append('(');
            sbLIZ3.append(l);
            sbLIZ3.append(") < ");
            sbLIZ3.append(str3);
            sbLIZ3.append('(');
            sbLIZ3.append(l2);
            sbLIZ3.append(')');
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        long jLongValue = l.longValue() - l2.longValue();
        map.put(str, Long.valueOf(jLongValue));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("metric:");
        sbLIZ4.append(str);
        sbLIZ4.append(" value:");
        sbLIZ4.append(jLongValue);
        sbLIZ4.append(" from ");
        sbLIZ4.append(str2);
        sbLIZ4.append('(');
        sbLIZ4.append(l);
        sbLIZ4.append(") - ");
        sbLIZ4.append(str3);
        sbLIZ4.append('(');
        sbLIZ4.append(l2);
        sbLIZ4.append(')');
        C2188811AlT.LIZIZ(sbLIZ4);
    }
}
