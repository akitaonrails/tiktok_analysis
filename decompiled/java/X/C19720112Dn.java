package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19720112Dn {
    public static final C19720112Dn LIZ = new C19720112Dn();
    public static final Map<String, Set<String>> LIZIZ = new LinkedHashMap();

    public static Map LIZ(String str, String str2, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.12Do] */
    public static void LIZJ(final C19720512Dr c19720512Dr, EnumC19720912Dv enumC19720912Dv, String str) {
        n nVar;
        String strLJIL;
        String strLJIL2;
        String str2;
        String str3;
        q qVarLJJIJIIJI;
        String strLJIL3;
        q qVarLJJIJIIJI2;
        q qVarLJJIJIIJI3;
        Object c098200Yq;
        boolean z = false;
        BannerDisplayInfo bannerDisplayInfo = new BannerDisplayInfo(c19720512Dr.LIZ, c19720512Dr.LIZIZ, c19720512Dr.LIZJ, null, c19720512Dr.LJI, 0, null, null, c19720512Dr.LJIIJ, c19720512Dr.LJFF, c19720512Dr.LJIIIIZZ, c19720512Dr.LJ, c19720512Dr.LJIILLIIL);
        Map mapLIZ = LIZ("search_extra", c19720512Dr.LJIILLIIL, LIZ("primary_scene", c19720512Dr.LJIIZILJ, LIZ("post_chain", c19720512Dr.LJIILL, C2097608Jq.LJIIIIZZ(new Pair("inspiration_result_id", c19720512Dr.LJ), new Pair("inspiration_keyword", c19720512Dr.LIZ), new Pair("inspiration_reco_id", c19720512Dr.LJIIIIZZ)))));
        String str4 = c19720512Dr.LJIJJ;
        String str5 = null;
        if (str4 != null && (!a0.LJJJIL(str4))) {
            try {
                new p();
                c098200Yq = p.LIZJ(str4).LJIILIIL();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            nVar = (n) c098200Yq;
        } else {
            nVar = null;
        }
        if (nVar == null || (qVarLJJIJIIJI3 = nVar.LJJIJIIJI("prop_id")) == null || (strLJIL = qVarLJJIJIIJI3.LJIL()) == null || !(!a0.LJJJIL(strLJIL))) {
            strLJIL = null;
        }
        if (nVar == null || (qVarLJJIJIIJI2 = nVar.LJJIJIIJI("prop_resource_id")) == null || (strLJIL2 = qVarLJJIJIIJI2.LJIL()) == null || !(!a0.LJJJIL(strLJIL2))) {
            strLJIL2 = null;
        }
        if (nVar != null && (qVarLJJIJIIJI = nVar.LJJIJIIJI("prop_category")) != null && (strLJIL3 = qVarLJJIJIIJI.LJIL()) != null && (!a0.LJJJIL(strLJIL3))) {
            str5 = strLJIL3;
        }
        Map mapLIZ2 = LIZ("prop_category", str5, LIZ("prop_resource_id", strLJIL2, LIZ("prop_id", strLJIL, mapLIZ)));
        List<String> list = c19720512Dr.LJIIIZ;
        if (list != null && list.contains("profile_scene_csi")) {
            z = true;
        }
        int i = C19720812Du.LIZ[enumC19720912Dv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        final ?? r0 = new Object() { // from class: X.12Do
                        };
                        new AbstractC19720312Dp<C19720412Dq>(c19720512Dr, r0) { // from class: X.12Dq
                            {
                                super("search_inspiration_loading_status", c19720512Dr);
                                LJ("is_outside", String.valueOf(2));
                                LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(c19720512Dr.LJIILIIL));
                                LJ("duration", String.valueOf(c19720512Dr.LJIILJJIL));
                                LJ("category", "picture");
                                String str6 = c19720512Dr.LJIJJLI;
                                LJ("load_from", str6 == null ? "unknown" : str6);
                            }
                        }.LJIILJJIL();
                        return;
                    }
                    throw new C1954807lC();
                }
                if (z) {
                    final C0R0B c0r0b = C0R0B.CLICK_CLOSE;
                    new AbstractC19720312Dp<C0R0C>(c19720512Dr, c0r0b) { // from class: X.0R0C
                        {
                            LJ("button_type", c0r0b.getValue());
                        }
                    }.LJIILJJIL();
                }
                LIZIZ("educate_creators_iii_banner_close", bannerDisplayInfo, bannerDisplayInfo.sessionId, mapLIZ2, "banner", "click_close");
                return;
            }
            if (z) {
                final C0R0B c0r0b2 = C0R0B.CLICK_SHOOT;
                new AbstractC19720312Dp<C0R0C>(c19720512Dr, c0r0b2) { // from class: X.0R0C
                    {
                        LJ("button_type", c0r0b2.getValue());
                    }
                }.LJIILJJIL();
            }
            boolean zLJFF = Intrinsics.LJFF(str, "button");
            String str6 = bannerDisplayInfo.sessionId;
            if (zLJFF) {
                str2 = "create";
                str3 = "click_create";
            } else {
                str2 = "banner";
                str3 = "click_banner";
            }
            LIZIZ("educate_creators_iii_banner_click", bannerDisplayInfo, str6, mapLIZ2, str2, str3);
            return;
        }
        String str7 = c19720512Dr.LJ;
        if (str7 == null) {
            str7 = "";
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "unknown";
        }
        long j = 86400000;
        long jCurrentTimeMillis = System.currentTimeMillis() / j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(jCurrentTimeMillis);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Set<String>> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object linkedHashSet = linkedHashMap.get(strLIZIZ);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(strLIZIZ, linkedHashSet);
        }
        Set set = (Set) linkedHashSet;
        if (set.contains(str7)) {
            return;
        }
        set.add(str7);
        if (map.size() > 7) {
            C19719612Di.LJJIII(((LinkedHashMap) map).keySet(), new C5178020a(System.currentTimeMillis() / j, 5), true);
        }
        if (z) {
            new AbstractC19720312Dp<C0R0D>(c19720512Dr) { // from class: X.0R0D
            }.LJIILJJIL();
        }
        LIZIZ("educate_creators_iii_banner_show", bannerDisplayInfo, bannerDisplayInfo.sessionId, mapLIZ2, "banner", null);
    }

    public static void LIZIZ(String str, BannerDisplayInfo bannerDisplayInfo, String str2, Map map, String str3, String str4) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        String str6 = "";
        if (str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        c2344009Gk.LJIIIIZZ("inspiration_session_id", str5);
        c2344009Gk.LJIIIIZZ("token_type", str3);
        String str7 = bannerDisplayInfo.title;
        if (str7 != null) {
            str6 = str7;
        }
        c2344009Gk.LJIIIIZZ("title", str6);
        c2344009Gk.LJIIIIZZ("topic_id", bannerDisplayInfo.trendId);
        c2344009Gk.LJ(bannerDisplayInfo.category, "category_name");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("session_id", str2);
        c2344009Gk.LIZJ(bannerDisplayInfo.getTopicTypeActual(), "topic_type");
        c2344009Gk.LJIIIIZZ("search_extra", bannerDisplayInfo.searchExtra);
        c2344009Gk.LJIIIIZZ("debuginfo", bannerDisplayInfo.debugInfo);
        c2344009Gk.LJIIIIZZ("search_topic_id", bannerDisplayInfo.searchTopicId);
        if (str4 != null) {
            c2344009Gk.LJFF("button_type", str4);
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                map2.put(key, value);
            }
        }
        c2344009Gk.LJI(map2);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
