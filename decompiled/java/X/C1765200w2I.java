package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.TrackParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.ISeaPdpPageService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765200w2I implements InterfaceC1764530w1D, InterfaceC21326118d1 {
    public final C1765230w2L LIZIZ;
    public C1764670w1R LIZJ;
    public InterfaceC1765250w2N LIZLLL;
    public C21326518d5 LJFF;
    public boolean LJI;
    public Map<String, ? extends Object> LJII;
    public C21327518dF LJIIIIZZ;
    public Map<String, ? extends List<EcommerceActionDto>> LJIIJJI;
    public C00XV LJ = C00XV.DEFAULT;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(313));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(314));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1251));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1253));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1252));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1248));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1249));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1250));
    public final C01GW LJIJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(310));
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(308));
    public final C01GW LJIJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(309));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(312));
    public final C01GW LJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(311));
    public final C1765210w2J LJJ = new InterfaceC21327318dD() { // from class: X.0w2J
        @Override // X.InterfaceC21327318dD
        public final void LJFF(String str) {
        }

        @Override // X.InterfaceC21327318dD
        public final void LIZLLL() {
            InterfaceC1765250w2N interfaceC1765250w2N = this.LIZ.LIZLLL;
            if (interfaceC1765250w2N != null) {
                interfaceC1765250w2N.Z3();
            }
            C1765220w2K c1765220w2K = (C1765220w2K) C19719612Di.LJJIIZI(this.LIZ.LJIIIIZZ());
            if (c1765220w2K != null) {
                C1765200w2I c1765200w2I = this.LIZ;
                c1765220w2K.LJFF = Long.valueOf(System.currentTimeMillis());
                c1765200w2I.LJIIJJI(true, c1765220w2K, c1765200w2I.LJIIIIZZ);
            }
        }

        @Override // X.InterfaceC21327318dD
        public final void LJIJJLI() {
            InterfaceC1765250w2N interfaceC1765250w2N = this.LIZ.LIZLLL;
            if (interfaceC1765250w2N != null) {
                interfaceC1765250w2N.LJIJJLI();
            }
            C1765220w2K c1765220w2K = (C1765220w2K) C19719612Di.LJJIIZI(this.LIZ.LJIIIIZZ());
            if (c1765220w2K != null) {
                C1765200w2I c1765200w2I = this.LIZ;
                c1765220w2K.LJ = Long.valueOf(System.currentTimeMillis());
                c1765220w2K.LIZ = 1;
                c1765200w2I.LJIIJJI(true, c1765220w2K, c1765200w2I.LJIIIIZZ);
            }
        }

        @Override // X.InterfaceC21327318dD
        public final void LIZIZ(Map<String, ? extends Object> map) {
            InterfaceC1765250w2N interfaceC1765250w2N = this.LIZ.LIZLLL;
            if (interfaceC1765250w2N != null) {
                interfaceC1765250w2N.b4();
            }
            C1765220w2K c1765220w2K = (C1765220w2K) C19719612Di.LJJIIZI(this.LIZ.LJIIIIZZ());
            if (c1765220w2K != null) {
                C1765200w2I c1765200w2I = this.LIZ;
                c1765220w2K.LJ = Long.valueOf(System.currentTimeMillis());
                c1765220w2K.LIZ();
                c1765220w2K.LIZ = 0;
                c1765200w2I.LJIIJJI(false, c1765220w2K, c1765200w2I.LJIIIIZZ);
            }
        }

        @Override // X.InterfaceC21327318dD
        public final void LIZJ(Map<String, ? extends Object> map) {
            C1765200w2I c1765200w2I = this.LIZ;
            c1765200w2I.LJ = C00XV.SUCCESS;
            InterfaceC1765250w2N interfaceC1765250w2N = c1765200w2I.LIZLLL;
            if (interfaceC1765250w2N != null) {
                interfaceC1765250w2N.LLLLZIL();
            }
            C1765220w2K c1765220w2K = (C1765220w2K) C13LP.LJJJLL(this.LIZ.LJIIIIZZ());
            if (c1765220w2K != null) {
                c1765220w2K.LIZ = 0;
                c1765220w2K.LIZ();
                c1765220w2K.LJ = Long.valueOf(System.currentTimeMillis());
                c1765220w2K.LJIIIIZZ = map;
            }
        }

        @Override // X.InterfaceC21327318dD
        public final void LIZ(int i, String str) {
            C1765200w2I c1765200w2I = this.LIZ;
            c1765200w2I.LJ = C00XV.ERROR;
            InterfaceC1765250w2N interfaceC1765250w2N = c1765200w2I.LIZLLL;
            if (interfaceC1765250w2N != null) {
                interfaceC1765250w2N.O3(Integer.valueOf(i), str);
            }
            C1765220w2K c1765220w2K = (C1765220w2K) C19719612Di.LJJIIZI(this.LIZ.LJIIIIZZ());
            if (c1765220w2K != null) {
                C1765200w2I c1765200w2I2 = this.LIZ;
                c1765220w2K.LIZ = 2;
                c1765220w2K.LJ = Long.valueOf(System.currentTimeMillis());
                c1765220w2K.LIZ();
                c1765220w2K.LJI = Integer.valueOf(i);
                c1765220w2K.LJII = str;
                c1765200w2I2.LJIIJJI(true, c1765220w2K, c1765200w2I2.LJIIIIZZ);
            }
        }

        @Override // X.InterfaceC21327318dD
        public final void LJLIIIL(int i, String str) {
            InterfaceC1765250w2N interfaceC1765250w2N = this.LIZ.LIZLLL;
            if (interfaceC1765250w2N != null) {
                interfaceC1765250w2N.LJLIIIL(i, str);
            }
            C1765220w2K c1765220w2K = (C1765220w2K) C19719612Di.LJJIIZI(this.LIZ.LJIIIIZZ());
            if (c1765220w2K != null) {
                C1765200w2I c1765200w2I = this.LIZ;
                c1765220w2K.LJ = Long.valueOf(System.currentTimeMillis());
                c1765220w2K.LJI = Integer.valueOf(i);
                c1765220w2K.LJII = str;
                c1765220w2K.LIZ = 2;
                c1765200w2I.LJIIJJI(false, c1765220w2K, c1765200w2I.LJIIIIZZ);
            }
        }

        @Override // X.InterfaceC21327318dD
        public final void LJ(C21326518d5 c21326518d5, C21327518dF c21327518dF, String str) {
            this.LIZ.LJIIIIZZ = c21327518dF;
        }
    };

    @Override // X.InterfaceC21326118d1
    public final void release() {
    }

    public final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> LJ() {
        return (ConcurrentHashMap) this.LJIJI.getValue();
    }

    public final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> LJFF() {
        return (ConcurrentHashMap) this.LJIJ.getValue();
    }

    public final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> LJI() {
        return (ConcurrentHashMap) this.LJIJJLI.getValue();
    }

    public final Map<String, List<EcommerceActionDto>> LJII() {
        Map map;
        C21325918cz c21325918cz;
        MynaTemplateProtocol mynaTemplateProtocol;
        Map<String, Object> customInfo;
        Map map2 = this.LJIIJJI;
        if (map2 != null) {
            return map2;
        }
        C21326518d5 c21326518d5 = this.LJFF;
        Object obj = (c21326518d5 == null || (c21325918cz = c21326518d5.LIZ) == null || (mynaTemplateProtocol = c21325918cz.LJII) == null || (customInfo = mynaTemplateProtocol.getCustomInfo()) == null) ? null : customInfo.get("action_chains");
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Map<String, List<EcommerceActionDto>> mapLIZ = C1487880op0.LIZ(map);
        this.LJIIJJI = mapLIZ;
        return mapLIZ;
    }

    public final List<C1765220w2K> LJIIIIZZ() {
        return (List) this.LJIIIZ.getValue();
    }

    public final void LIZLLL() {
        LJFF().clear();
        LJ().clear();
        ((ConcurrentHashMap) this.LJIJJ.getValue()).clear();
        LJI().clear();
        ((ConcurrentHashMap) this.LJIL.getValue()).clear();
        LJIIIIZZ().clear();
        this.LJIIIIZZ = null;
        C21326518d5 c21326518d5 = this.LJFF;
        if (c21326518d5 != null) {
            c21326518d5.LIZJ();
        }
        this.LJFF = null;
        this.LJ = C00XV.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0w2J] */
    public C1765200w2I(C1765230w2L c1765230w2L) {
        this.LIZIZ = c1765230w2L;
    }

    public final Map<String, Object> LJIIL(C1764670w1R c1764670w1R) {
        C1764610w1L c1764610w1L;
        final PageStateContext pageStateContext;
        CommonParamsContext commonParamsContext;
        final ConcurrentHashMap<String, Object> concurrentHashMap;
        TrackParamsContext trackParamsContext;
        final Map<String, Object> map;
        if (c1764670w1R != null && (c1764610w1L = c1764670w1R.LIZIZ) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("item_data", c1764610w1L.LIZ);
            Map<String, Object> map2 = c1764610w1L.LIZIZ;
            if (map2 != null) {
                linkedHashMap.put("temp_state", map2);
            }
            Map<String, Object> map3 = c1764610w1L.LIZJ;
            if (map3 != null) {
                linkedHashMap.put("resident_state", map3);
            }
            Map linkedHashMap2 = c1764610w1L.LIZLLL;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            linkedHashMap2.put("__visible", Integer.valueOf(this.LJI ? 1 : 0));
            linkedHashMap.put("__traceParams", linkedHashMap2);
            if (!linkedHashMap.containsKey("__trackParams") && (trackParamsContext = (TrackParamsContext) this.LJIILIIL.getValue()) != null && (map = trackParamsContext.LL) != null) {
                linkedHashMap.put("__trackParams", new InterfaceC332330D1b() { // from class: X.0w2H
                    @Override // X.InterfaceC332330D1b
                    public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                        Object objLJJJLZIJ;
                        String strLJIIJ;
                        if (list != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) != null && (strLJIIJ = C1337850kv1.LJIIJ(objLJJJLZIJ)) != null) {
                            if (Intrinsics.LJFF(strLJIIJ, "__all__")) {
                                return C2097608Jq.LJIIZILJ(map);
                            }
                            return map.get(strLJIIJ);
                        }
                        return null;
                    }
                });
            }
            if (!linkedHashMap.containsKey("__commonParams") && (commonParamsContext = (CommonParamsContext) this.LJIILL.getValue()) != null && (concurrentHashMap = commonParamsContext.LL) != null) {
                linkedHashMap.put("__commonParams", new InterfaceC332330D1b() { // from class: X.0w2G
                    @Override // X.InterfaceC332330D1b
                    public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                        Object objLJJJLZIJ;
                        String strLJIIJ;
                        if (list != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) != null && (strLJIIJ = C1337850kv1.LJIIJ(objLJJJLZIJ)) != null) {
                            if (Intrinsics.LJFF(strLJIIJ, "__all__")) {
                                return C2097608Jq.LJIIZILJ(concurrentHashMap);
                            }
                            return concurrentHashMap.get(strLJIIJ);
                        }
                        return null;
                    }
                });
            }
            if (!linkedHashMap.containsKey("__stateContext") && (pageStateContext = (PageStateContext) this.LJIILJJIL.getValue()) != null) {
                linkedHashMap.put("__stateContext", new InterfaceC332330D1b() { // from class: X.0w2F
                    @Override // X.InterfaceC332330D1b
                    public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                        Object objLJJJLZIJ;
                        String strLJIIJ;
                        if (list != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) != null && (strLJIIJ = C1337850kv1.LJIIJ(objLJJJLZIJ)) != null) {
                            return PageStateContext.LIZ(pageStateContext, strLJIIJ);
                        }
                        return null;
                    }
                });
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1764530w1D
    public final boolean LIZ(String str, Map<String, ? extends Object> map) {
        return LJIILIIL(str, map, null, null);
    }

    @Override // X.InterfaceC1764530w1D
    public final View LIZIZ(C1764670w1R c1764670w1R, InterfaceC1765250w2N interfaceC1765250w2N) {
        C21326518d5 c21326518d5LIZIZ;
        InterfaceC1765240w2M interfaceC1765240w2MHn1;
        View view = null;
        C1765220w2K c1765220w2K = new C1765220w2K(null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1765220w2K.LIZIZ = Long.valueOf(jCurrentTimeMillis);
        c1765220w2K.LIZLLL = Long.valueOf(jCurrentTimeMillis);
        LJIIIIZZ().add(c1765220w2K);
        this.LIZJ = c1764670w1R;
        this.LIZLLL = interfaceC1765250w2N;
        Map<String, ? extends Object> mapLJIIL = LJIIL(c1764670w1R);
        this.LJII = mapLJIIL;
        C21326518d5 c21326518d5 = this.LJFF;
        if (c21326518d5 == null) {
            ISeaPdpPageService iSeaPdpPageService = (ISeaPdpPageService) this.LJIIL.getValue();
            if (iSeaPdpPageService != null && (interfaceC1765240w2MHn1 = iSeaPdpPageService.Hn1()) != null) {
                c21326518d5LIZIZ = interfaceC1765240w2MHn1.LIZIZ(this.LIZIZ.LIZIZ, mapLJIIL, (String) this.LJIIJ.getValue(), this, this.LIZIZ.LIZJ, this.LJJ);
            } else {
                c21326518d5LIZIZ = null;
            }
            this.LJFF = c21326518d5LIZIZ;
            if (c21326518d5LIZIZ != null) {
                view = c21326518d5LIZIZ.LIZIZ;
            }
        } else {
            for (Map.Entry<String, ConcurrentHashMap<String, String>> entry : LJFF().entrySet()) {
                Iterator<Map.Entry<String, String>> it2 = entry.getValue().entrySet().iterator();
                while (it2.hasNext()) {
                    LJIIJ(entry.getKey(), it2.next().getKey());
                }
            }
            LJFF().clear();
            for (Map.Entry<String, ConcurrentHashMap<String, String>> entry2 : LJ().entrySet()) {
                Iterator<Map.Entry<String, String>> it3 = entry2.getValue().entrySet().iterator();
                while (it3.hasNext()) {
                    LJIIIZ(entry2.getKey(), it3.next().getKey());
                }
            }
            LJ().clear();
            ((ConcurrentHashMap) this.LJIJJ.getValue()).clear();
            for (Map.Entry<String, ConcurrentHashMap<String, String>> entry3 : LJI().entrySet()) {
                Iterator<Map.Entry<String, String>> it4 = entry3.getValue().entrySet().iterator();
                while (it4.hasNext()) {
                    LJIILJJIL(entry3.getKey(), it4.next().getKey());
                }
            }
            LJI().clear();
            ((ConcurrentHashMap) this.LJIL.getValue()).clear();
            c21326518d5.LIZ(mapLJIIL, this, (String) this.LJIIJ.getValue(), this.LJJ);
            view = c21326518d5.LIZIZ;
        }
        c1765220w2K.LIZ();
        return view;
    }

    public final void LJIIIZ(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap = LJ().get(str);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        if (concurrentHashMap.isEmpty()) {
            LJ().remove(str);
            InterfaceC1164530gPT interfaceC1164530gPT = (InterfaceC1164530gPT) ((ConcurrentHashMap) this.LJIJJ.getValue()).remove(str);
            if (interfaceC1164530gPT != null) {
                AnonymousClass0378.LIZ().LIZJ(str, interfaceC1164530gPT);
            }
        }
    }

    public final void LJIIJ(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap = LJFF().get(str);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        if (concurrentHashMap.isEmpty()) {
            LJFF().remove(str);
            ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LJIILLIIL.getValue();
            if (iSeaPdpCommunicationService != null) {
                iSeaPdpCommunicationService.U0(this, str);
            }
        }
    }

    public final void LJIILJJIL(String str, String str2) {
        PageStateContext pageStateContext;
        ConcurrentHashMap<String, String> concurrentHashMap = LJI().get(str);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        if (concurrentHashMap.isEmpty()) {
            LJI().remove(str);
            String str3 = (String) ((ConcurrentHashMap) this.LJIL.getValue()).remove(str);
            if (str3 != null && (pageStateContext = (PageStateContext) this.LJIILJJIL.getValue()) != null) {
                PageStateContext.LJFF(pageStateContext, str, str3);
            }
        }
    }

    @Override // X.InterfaceC21326118d1
    public final void LIZJ(C21326518d5 c21326518d5, InterfaceC1547330qMt interfaceC1547330qMt, View view) {
        Map<String, ? extends Object> mapLIZ;
        C1757320vpa c1757320vpa;
        String type = interfaceC1547330qMt.getType();
        Map<String, Object> params = interfaceC1547330qMt.getParams();
        if (params != null) {
            mapLIZ = C002G.LIZ(params);
        } else {
            mapLIZ = null;
        }
        C1764670w1R c1764670w1R = this.LIZJ;
        if (c1764670w1R != null) {
            c1757320vpa = c1764670w1R.LIZJ;
        } else {
            c1757320vpa = null;
        }
        LJIILIIL(type, mapLIZ, c1757320vpa, null);
    }

    public final void LJIIJJI(boolean z, C1765220w2K c1765220w2K, C21327518dF c21327518dF) {
        String str;
        String str2;
        C21326518d5 c21326518d5;
        C1774720wHe c1774720wHe;
        InterfaceC1765240w2M interfaceC1765240w2MHn1;
        String strLIZLLL;
        if (z) {
            str = "tiktokec_rd_pdp_sea_perf_dynamic_card_render";
        } else {
            str = "tiktokec_rd_pdp_sea_perf_dynamic_card_update";
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, ? extends Object> map = c1765220w2K.LJIIIIZZ;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        C1764670w1R c1764670w1R = this.LIZJ;
        if (c1764670w1R == null || (str2 = c1764670w1R.LIZ) == null) {
            str2 = "";
        }
        jSONObject.put("name", str2);
        Long l = c1765220w2K.LIZIZ;
        if (l != null) {
            jSONObject.put("t_dc_bind_start", l.longValue());
        }
        Long l2 = c1765220w2K.LIZLLL;
        if (l2 != null) {
            jSONObject.put("t_dc_render_start", l2.longValue());
        }
        Long l3 = c1765220w2K.LIZJ;
        if (l3 != null) {
            jSONObject.put("t_dc_bind_end", l3.longValue());
        }
        Long l4 = c1765220w2K.LJ;
        if (l4 != null) {
            jSONObject.put("t_dc_render_end", l4.longValue());
        }
        Long l5 = c1765220w2K.LJFF;
        if (l5 != null) {
            jSONObject.put("t_dc_first_screen_end", l5.longValue());
        }
        Integer num = c1765220w2K.LJI;
        if (num != null) {
            jSONObject.put("error_code", num.intValue());
        }
        String str3 = c1765220w2K.LJII;
        if (str3 != null) {
            jSONObject.put("error_msg", str3);
        }
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c1765220w2K.LIZ);
        if (c21327518dF != null && (c21326518d5 = c21327518dF.LIZ) != null && (c1774720wHe = c21326518d5.LIZ.LIZIZ) != null) {
            jSONObject.put("gecko_url", c1774720wHe.LIZ);
            jSONObject.put("gecko_version", c1774720wHe.LIZIZ());
            ISeaPdpPageService iSeaPdpPageService = (ISeaPdpPageService) this.LJIIZILJ.getValue();
            if (iSeaPdpPageService != null && (interfaceC1765240w2MHn1 = iSeaPdpPageService.Hn1()) != null && (strLIZLLL = interfaceC1765240w2MHn1.LIZLLL(c1774720wHe.LIZ)) != null) {
                jSONObject.put("gecko_channel", strLIZLLL);
            }
            jSONObject.put("container_type", "Myna");
            jSONObject.put("is_offline", !Intrinsics.LJFF(c21327518dF.LIZLLL, "CDN"));
            jSONObject.put("is_predecode", c1774720wHe.LJIIIZ ? 1 : 0);
            jSONObject.put("is_preload", c1774720wHe.LJIIJ ? 1 : 0);
        }
        C1018703yb.LJFF(str, jSONObject);
    }

    public final boolean LJIILIIL(String str, Map<String, ? extends Object> map, C1757320vpa c1757320vpa, C1487890op1 c1487890op1) {
        Map<String, ? extends Object> mapLJIIL;
        String str2;
        C1764670w1R c1764670w1R;
        C1487890op1 c1487890op12 = c1487890op1;
        C1757320vpa c1757320vpa2 = c1757320vpa;
        if (c1757320vpa2 == null && ((c1764670w1R = this.LIZJ) == null || (c1757320vpa2 = c1764670w1R.LIZJ) == null)) {
            c1757320vpa2 = new C1757320vpa(null);
        }
        c1757320vpa2.LIZIZ = new WeakReference<>(this);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LJIILLIIL.getValue();
        if (iSeaPdpCommunicationService != null) {
            Map<String, ? extends Object> map2 = this.LJII;
            if (map2 != null) {
                mapLJIIL = new LinkedHashMap<>(map2);
            } else {
                mapLJIIL = LJIIL(this.LIZJ);
            }
            Map<String, List<EcommerceActionDto>> mapLJII = LJII();
            if (c1487890op12 == null) {
                c1487890op12 = c1757320vpa2.LJ;
            }
            C1764670w1R c1764670w1R2 = this.LIZJ;
            if (c1764670w1R2 == null || (str2 = c1764670w1R2.LIZ) == null) {
                str2 = "";
            }
            if (iSeaPdpCommunicationService.gV1(str, map, mapLJIIL, mapLJII, c1757320vpa2, c1487890op12, new C1757350vpd(str2))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
