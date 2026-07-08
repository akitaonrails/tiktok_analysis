package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0i36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227540i36 implements InterfaceC1224480hyA {
    public static final C1227540i36 LIZIZ = new C1227540i36();
    public static C1227740i3Q LIZJ = new C1227740i3Q(null, null, null, 31);
    public static boolean LIZLLL = true;
    public static final Map<EnumC1227660i3I, Long> LJ = new LinkedHashMap();
    public static String LJFF = "";
    public final /* synthetic */ C0Z6S LIZ = new C0Z6S();

    @Override // X.InterfaceC1224480hyA
    public final void LJIIIIZZ() {
    }

    public static final void LJIIJ() {
        LIZJ.LJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1224480hyA
    public final void LIZJ() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.READY_TO_LOAD_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJ() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.READY_TO_RENDER_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJFF() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.FINISH_RENDER_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJI() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.FINISH_CREATE_PANEL);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJII() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.FINISH_LOAD_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C1227640i3G.LIZ(this));
        if (LJFF.length() > 0) {
            linkedHashMap.put("tab_list", LJFF);
        }
        LJIIJJI("add_group_member_panel_show", linkedHashMap);
    }

    @Override // X.InterfaceC1224480hyA
    public final Map<EnumC1227660i3I, Long> LIZIZ() {
        return LJ;
    }

    public static final void LJIIL(C1227650i3H c1227650i3H) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("member_num", String.valueOf(c1227650i3H.LIZ)), new Pair("network_duration", String.valueOf(c1227650i3H.LIZIZ)), new Pair("process_duration", String.valueOf(c1227650i3H.LIZJ)), new Pair("result_status", String.valueOf(c1227650i3H.LJ.getValue())), new Pair("is_first", C1529305yl.LIZ(Boolean.valueOf(LIZLLL))));
        if (c1227650i3H.LJI.length() > 0) {
            mapLJIIJ.put("member_type", c1227650i3H.LJI);
        }
        C0ZBV c0zbv = c1227650i3H.LJ;
        C0ZBV c0zbv2 = C0ZBV.SUCCESS;
        if (c0zbv == c0zbv2) {
            mapLJIIJ.put("success_member_num", String.valueOf(c1227650i3H.LIZLLL));
        }
        if (LIZJ.LJ > 0) {
            mapLJIIJ.put("total_duration", String.valueOf(System.currentTimeMillis() - LIZJ.LJ));
        }
        Integer num = c1227650i3H.LJFF;
        if (num != null && num.intValue() != 0) {
            mapLJIIJ.put("error_code", String.valueOf(c1227650i3H.LJFF));
        }
        Long l = (Long) ((LinkedHashMap) LJ).get(EnumC1227660i3I.READY_TO_CREATE_PANEL);
        if (c1227650i3H.LJ == c0zbv2 && l != null) {
            mapLJIIJ.put("stay_duration", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        LJIIJJI("add_group_member_result", mapLJIIJ);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LIZLLL(InterfaceC1224270hxp interfaceC1224270hxp) {
        C1227740i3Q c1227740i3Q;
        String strLJJLIIIJ;
        ((LinkedHashMap) LIZIZ()).clear();
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.READY_TO_CREATE_PANEL);
        if (interfaceC1224270hxp instanceof C1227020i2G) {
            C1227020i2G c1227020i2G = (C1227020i2G) interfaceC1224270hxp;
            c1227740i3Q = new C1227740i3Q(C1229100i5c.LIZ.LIZJ(c1227020i2G.LLJIJIL.LLIZ), C1229100i5c.LJFF(c1227020i2G.LLJIJIL.LLIZ), c1227020i2G.LLJIJIL.LLILZ, 24);
        } else if (interfaceC1224270hxp instanceof C1227010i2F) {
            C1227010i2F c1227010i2F = (C1227010i2F) interfaceC1224270hxp;
            c1227740i3Q = new C1227740i3Q(C1229100i5c.LIZ.LIZJ(c1227010i2F.LLJIJIL.LLILZLL), C1229100i5c.LJFF(c1227010i2F.LLJIJIL.LLILZLL), c1227010i2F.LLJIJIL.LLILZ, 24);
        } else {
            return;
        }
        LIZJ = c1227740i3Q;
        LIZLLL = true;
        try {
            strLJJLIIIJ = C13LP.LJJLIIIJ(interfaceC1224270hxp.LJIILLIIL().LIZ(), ",", null, null, 0, null, AFwS257S0000000_19.get$arr$(746), 30);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJJLIIIJ = "";
        }
        LJFF = strLJJLIIIJ;
        LJIIJJI("add_group_member_start", C2097608Jq.LJ());
    }

    public static final void LJIIIZ(String str, String str2) {
        LIZJ = new C1227740i3Q(C1229100i5c.LIZ.LIZJ(str), C1229100i5c.LJFF(str), str2, 24);
        LIZLLL = true;
        ((LinkedHashMap) LJ).clear();
    }

    public static void LJIIJJI(String str, Map map) {
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("chat_type", LIZJ.LIZ), new Pair("group_type", LIZJ.LIZIZ), new Pair("from_source", LIZJ.LIZJ)));
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    public final void LJIILIIL(String str, C742250T9r c742250T9r, Integer num) {
        if (str == null || c742250T9r == null) {
            return;
        }
        Map<String, String> mapLIZ = c742250T9r.LIZ();
        int iLIZ = C1527905yX.LIZ(num);
        this.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0Z6S.LIZ(iLIZ, str, mapLIZ));
        if (num != null && num.intValue() == 0) {
            linkedHashMap.put("is_success", CardStruct.IStatusCode.DEFAULT);
        }
        this.LIZ.getClass();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("imsdk_group_chat_add_member", linkedHashMap);
    }
}
