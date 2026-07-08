package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532160pyQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1532710pzJ LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C08AB LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Pair<String, Long> LLJI;
    public final /* synthetic */ Map<String, String> LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ Class<?> LLJILJILJ;
    public final /* synthetic */ List<String> LLJILLL;
    public final /* synthetic */ InterfaceC1532190pyT LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ LinkedHashMap<String, Function0<JSONObject>> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532160pyQ(C1532710pzJ c1532710pzJ, InterfaceC1532190pyT interfaceC1532190pyT, C08AB c08ab, Class cls, Integer num, Integer num2, String str, String str2, String str3, LinkedHashMap linkedHashMap, List list, Map map, Pair pair, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.LL = c1532710pzJ;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = c08ab;
        this.LLILZIL = str2;
        this.LLILZLL = num2;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = pair;
        this.LLJIJIL = map;
        this.LLJILJIL = z4;
        this.LLJILJILJ = cls;
        this.LLJILLL = list;
        this.LLJJ = interfaceC1532190pyT;
        this.LLJJI = str3;
        this.LLJJIII = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        C1540860qCS c1540860qCSLJIIJ;
        C1540860qCS c1540860qCSLJIIJ2;
        Iterator<String> itKeys;
        String str;
        String str2;
        String filepath;
        C1540930qCZ c1540930qCZ;
        Long version;
        Integer num;
        Integer num2;
        boolean zContains = C1522590piz.LIZJ.contains(this.LL.LJIJ);
        C1532710pzJ c1532710pzJ = this.LL;
        String str3 = c1532710pzJ.LJJI ? "bd_hybrid_monitor_res_loader_perf_preload" : zContains ? "bd_hybrid_monitor_res_loader_perf_template" : c1532710pzJ.LJIJ == EnumC1533980q1M.LYNX_IMAGE ? "bd_hybrid_monitor_res_loader_perf_image" : "bd_hybrid_monitor_res_loader_perf";
        C1522590piz c1522590piz = C1522590piz.LIZ;
        Integer num3 = this.LLILLJJLI;
        String str4 = this.LLILLL;
        C08AB c08ab = this.LLILZ;
        String str5 = this.LLILZIL;
        Integer num4 = this.LLILZLL;
        boolean z = this.LLIZ;
        boolean z2 = this.LLIZLLLIL;
        boolean z3 = this.LLJ;
        Pair<String, Long> pair = this.LLJI;
        Map<String, String> map = this.LLJIJIL;
        boolean z4 = this.LLJILJIL;
        Class<?> cls = this.LLJILJILJ;
        List<String> list = this.LLJILLL;
        InterfaceC1532190pyT interfaceC1532190pyT = this.LLJJ;
        String str6 = this.LLJJI;
        LinkedHashMap<String, Function0<JSONObject>> linkedHashMap = this.LLJJIII;
        c1522590piz.getClass();
        C1532480pyw c1532480pyw = c1532710pzJ.LJJIJIIJI;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : C1522590piz.LIZIZ.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("res_src", c1532710pzJ.LJJIII.LIZ);
        jSONObject.put("consume_type", c1532710pzJ.LIZLLL.getSimpleName());
        if (z4) {
            jSONObject.put("res_state", "success");
            jSONObject.put("final_type", cls != null ? cls.getSimpleName() : null);
        } else {
            jSONObject.put("res_state", "failed");
        }
        if (pair != null) {
            jSONObject.put("blocked_status", pair.getFirst());
            jSONObject.put("blocked_duration", pair.getSecond().longValue());
        }
        jSONObject.put("fetcher_list", c1532710pzJ.LJJIIZ);
        jSONObject.put("chain_end_reason", str6);
        jSONObject.put("forest_name", c1532710pzJ.LJJIFFI.LIZIZ);
        if (str5 != null) {
            jSONObject.put("res_type", str5);
        }
        jSONObject.put("res_from", str4);
        jSONObject.put("res_size", num3);
        C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
        jSONObject.put("is_preloaded", (c1541080qCo == null || (num2 = c1541080qCo.LJIILIIL) == null || num2.intValue() != 1) ? false : true);
        C1541080qCo<C1532310pyf> c1541080qCo2 = c1532710pzJ.LJJIIZI;
        jSONObject.put("is_request_reused", (c1541080qCo2 == null || (num = c1541080qCo2.LJIILIIL) == null || num.intValue() != 0) ? false : true);
        if (interfaceC1532190pyT != null && (version = interfaceC1532190pyT.getVersion()) != null) {
            jSONObject.put("res_version", version.longValue());
        }
        if (z) {
            jSONObject.put("gecko_decompress_status", z3 ? 2 : 1);
        }
        jSONObject.put("allow_redirect_internally", c1532710pzJ.LIZ);
        jSONObject.put("cdn_cache", c1532710pzJ.LJII);
        jSONObject.put("session_id", c1532710pzJ.LJIJJ);
        jSONObject.put("redirect_regions", c1532710pzJ.LJIIZILJ);
        jSONObject.put("gecko_expired", z2 ? 2 : 1);
        String str7 = c1532710pzJ.LJIIL;
        if (str7 != null) {
            jSONObject.put("res_trace_id", str7);
        }
        C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
        if (c1529350ptt != null) {
            jSONObject.put("gecko_access_key", c1529350ptt.LIZ);
            jSONObject.put("gecko_bundle", c1529350ptt.LIZJ);
            jSONObject.put("gecko_channel", c1529350ptt.LIZIZ);
            jSONObject.put("gecko_config_from", c1529350ptt.LIZLLL);
        }
        jSONObject.put("res_scene", c1532710pzJ.LJIJ.toString().toLowerCase(Locale.ROOT));
        C1541080qCo<C1532310pyf> c1541080qCo3 = c1532710pzJ.LJJIIZI;
        jSONObject.put("enable_memory_cache", (c1541080qCo3 == null || (c1540930qCZ = c1541080qCo3.LIZ) == null || c1540930qCZ.LIZJ == null) ? false : true);
        jSONObject.put("gecko_sync_update", c1532710pzJ.LJIJJLI);
        if (interfaceC1532190pyT != null && (filepath = interfaceC1532190pyT.getFilepath()) != null) {
            jSONObject.put("file", filepath);
        }
        C1541080qCo<C1532310pyf> c1541080qCo4 = c1532710pzJ.LJJIIZI;
        if (c1541080qCo4 != null && (str2 = c1541080qCo4.LIZ.LIZIZ) != null) {
            jSONObject.put("optimized_source", str2);
        }
        C1541080qCo<C1532310pyf> c1541080qCo5 = c1532710pzJ.LJJIIZI;
        if (c1541080qCo5 != null && (str = c1541080qCo5.LIZ.LJI) != null) {
            jSONObject.put("preload_optimize_source", str);
        }
        jSONObject.put("processed_processors", list != null ? C13LP.LJJLIIIJ(list, ", ", null, null, 0, null, null, 62) : null);
        jSONObject.put("is_preload", c1532710pzJ.LJJI);
        C1531940py4 c1531940py4 = c1532710pzJ.LJJIJ;
        if (c1531940py4 != null) {
            C1532720pzK c1532720pzKLIZ = c1531940py4.LIZ();
            if (map != null) {
                String str8 = map.get("x-tt-logid");
                if (str8 != null) {
                    jSONObject.put("cdn_response_header_logid", str8);
                }
                String str9 = map.get("x-tt-trace-host");
                if (str9 != null) {
                    jSONObject.put("cdn_response_header_trace_host", str9);
                }
                String str10 = map.get("x-tt-trace-id");
                if (str10 != null) {
                    jSONObject.put("cdn_response_header_trace_id", str10);
                }
            }
            jSONObject.put("final_cdn_url", c1532720pzKLIZ.LIZ);
            jSONObject.put("area_redirected", c1531940py4.LJFF);
            jSONObject.put("region_redirected", c1531940py4.LJ);
            ArrayList<C1531900py0> arrayList = (ArrayList) c1531940py4.LIZJ;
            if ((!arrayList.isEmpty()) && ((C1531900py0) C13LP.LJJLIIIJJI(arrayList)).LIZIZ != c1532720pzKLIZ) {
                JSONObject jSONObject2 = new JSONObject();
                for (C1531900py0 c1531900py0 : arrayList) {
                    jSONObject2.put(c1531900py0.LIZIZ.LIZ, c1531900py0.LIZ.toString());
                }
                jSONObject.put("fallback_urls", jSONObject2);
            }
            String str11 = c1531940py4.LJII;
            if (str11 != null) {
                jSONObject.put("redirect_url", str11);
            }
        }
        if (c08ab != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) C08AA.LIZ(c08ab, C1522590piz.LIZLLL)).entrySet()) {
                jSONObject.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
            }
        }
        if (linkedHashMap != null) {
            for (Map.Entry<String, Function0<JSONObject>> entry3 : linkedHashMap.entrySet()) {
                String key = entry3.getKey();
                JSONObject jSONObjectInvoke = entry3.getValue().invoke();
                if (jSONObjectInvoke != null && (itKeys = jSONObjectInvoke.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(key);
                        sbLIZ.append('_');
                        sbLIZ.append(next);
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObjectInvoke.get(next));
                    }
                }
            }
        }
        jSONObject.put("http_status_code", num4);
        jSONObject.put("res_loader_error_code", c1532480pyw.LIZ());
        jSONObject.put("res_error_msg", c1532480pyw.LIZIZ());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        try {
            for (Map.Entry<String, C1532470pyv> entry4 : c1532480pyw.LIZIZ.entrySet()) {
                StringBuilder sb = entry4.getValue().LIZJ;
                if (sb != null && !a0.LJJJIL(sb)) {
                    linkedHashMap2.put(entry4.getKey(), String.valueOf(entry4.getValue().LIZJ));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        jSONObject.put("fetch_message", linkedHashMap2);
        if (!this.LLJILJIL) {
            C1532710pzJ c1532710pzJ2 = this.LL;
            String str12 = c1532710pzJ2.LJJI ? "bd_hybrid_monitor_res_loader_error_preload" : zContains ? "bd_hybrid_monitor_res_loader_error_template" : c1532710pzJ2.LJIJ == EnumC1533980q1M.LYNX_IMAGE ? "bd_hybrid_monitor_res_loader_error_image" : "bd_hybrid_monitor_res_loader_error";
            try {
                for (Function1<C443120HZe<String, String, ? extends JSONObject>, Unit> function1 : C1522590piz.LJ) {
                    try {
                        String str13 = c1532710pzJ2.LJIIL;
                        if (str13 == null) {
                            C1541080qCo<C1532310pyf> c1541080qCo6 = c1532710pzJ2.LJJIIZI;
                            str13 = (c1541080qCo6 == null || (c1540860qCSLJIIJ2 = c1541080qCo6.LJIIJ()) == null) ? null : c1540860qCSLJIIJ2.LIZJ;
                        }
                        function1.invoke(new C443120HZe<>(str12, str13, jSONObject));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
        }
        C1522590piz c1522590piz2 = C1522590piz.LIZ;
        C1532710pzJ c1532710pzJ3 = this.LL;
        try {
            for (Function1<C443120HZe<String, String, ? extends JSONObject>, Unit> function12 : C1522590piz.LJ) {
                try {
                    String str14 = c1532710pzJ3.LJIIL;
                    if (str14 == null) {
                        C1541080qCo<C1532310pyf> c1541080qCo7 = c1532710pzJ3.LJJIIZI;
                        str14 = (c1541080qCo7 == null || (c1540860qCSLJIIJ = c1541080qCo7.LJIIJ()) == null) ? null : c1540860qCSLJIIJ.LIZJ;
                    }
                    try {
                        function12.invoke(new C443120HZe<>(str3, str14, jSONObject));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th4) {
                        th = th4;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            C189200o6.m2constructorimpl(new C098200Yq(th6));
        }
        return Unit.LIZ;
    }
}
