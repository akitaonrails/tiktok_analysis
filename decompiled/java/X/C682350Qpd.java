package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682350Qpd implements InterfaceC1448230nn3 {
    public static String LIZJ;
    public static boolean LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static boolean LJIIJ;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static final C682350Qpd LIZ = new C682350Qpd();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("effect", "video");
    public static final Map<String, C682380Qpg> LJI = new LinkedHashMap();
    public static final Map<String, C682380Qpg> LJII = new LinkedHashMap();
    public static final ArrayList<String> LJIIIIZZ = new ArrayList<>();
    public static final Map<String, String> LJIIIZ = new LinkedHashMap();
    public static final HashMap<String, String> LJIIJJI = new HashMap<>();
    public static final HashMap<String, String> LJIIL = new HashMap<>();
    public static String LJIILIIL = "";
    public static String LJIILJJIL = "";

    @Override // X.InterfaceC1448230nn3
    public final void LJI() {
        LIZLLL = true;
    }

    @Override // X.InterfaceC1448230nn3
    public final void clear() {
        LIZJ = null;
        LIZLLL = false;
        LJ = null;
        LJFF = null;
        ((LinkedHashMap) LJI).clear();
        ((LinkedHashMap) LJII).clear();
        LJIIIIZZ.clear();
        LJIIJJI.clear();
    }

    @Override // X.InterfaceC1448230nn3
    public final boolean LIZ() {
        return LJIILL;
    }

    @Override // X.InterfaceC1448230nn3
    public final String LJIIIIZZ() {
        return LJIILJJIL;
    }

    @Override // X.InterfaceC1448230nn3
    public final String LJIILIIL() {
        return LJIILIIL;
    }

    @Override // X.InterfaceC1448230nn3
    public final boolean LJIILLIIL() {
        return LJIIZILJ;
    }

    @Override // X.InterfaceC1448230nn3
    public final boolean LJIIZILJ() {
        return LJIILLIIL;
    }

    @Override // X.InterfaceC1448230nn3
    public final String LJIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC1448230nn3
    public final String getLatestSearchId() {
        return LJ;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LIZJ(String str) {
        LJIILJJIL = str;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LIZLLL(C682370Qpf c682370Qpf) {
        String str;
        String str2 = LIZJ;
        if (str2 != null && str2.length() != 0 && (str = c682370Qpf.LIZ) != null && str.length() != 0) {
            C682320Qpa c682320Qpa = new C682320Qpa();
            LJJIFFI(c682320Qpa, c682370Qpf);
            c682320Qpa.LJIILJJIL();
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final Map<String, String> LJ(String str) {
        int i;
        Map<String, String> map;
        Pair pair;
        String str2;
        Object obj;
        if (str == null) {
            return null;
        }
        HashMap<String, String> map2 = LJIIJJI;
        String str3 = "search_result";
        if (LJJII(str, map2)) {
            Pair[] pairArr = new Pair[4];
            String str4 = map2.get("search_id");
            if (str4 == null) {
                str4 = "";
            }
            pairArr[0] = new Pair("prop_search_id", str4);
            String str5 = map2.get("search_result_id");
            if (str5 == null) {
                str5 = "";
            }
            pairArr[1] = new Pair("prop_search_result_id", str5);
            String str6 = map2.get("list_item_id");
            if (str6 == null) {
                str6 = "";
            }
            pairArr[2] = new Pair("prop_search_list_item_id", str6);
            if (C13LP.LJJJJ(map2.get("search_type"), LIZIZ)) {
                obj = "search_result";
            } else {
                obj = "general_search";
            }
            Pair pair2 = new Pair("prop_search_method", obj);
            i = 3;
            pairArr[3] = pair2;
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            map = mapLJIIIIZZ;
            if (mapLJIIIIZZ == null) {
            }
            return map;
        }
        i = 3;
        C651970Phj.LLILLL.getClass();
        Map mapLIZJ = C651980Phk.LIZJ();
        if (LJJII(str, mapLIZJ)) {
            Pair[] pairArr2 = new Pair[i];
            Object obj2 = mapLIZJ.get("search_id");
            if (obj2 == null) {
                obj2 = "";
            }
            pairArr2[0] = new Pair("prop_search_id", obj2);
            Object obj3 = mapLIZJ.get("search_result_id");
            if (obj3 == null) {
                obj3 = "";
            }
            pairArr2[1] = new Pair("prop_search_result_id", obj3);
            if (!C13LP.LJJJJ(mapLIZJ.get("search_type"), LIZIZ)) {
                str3 = "general_search";
            }
            pairArr2[2] = new Pair("prop_search_method", str3);
            HashMap map3 = new HashMap(C2097608Jq.LJIIIIZZ(pairArr2));
            map = map3;
            if (Intrinsics.LJFF(mapLIZJ.get("search_enter_position"), "hot_user_video")) {
                Object obj4 = mapLIZJ.get("group_id");
                if (obj4 == null) {
                    obj4 = "";
                }
                map3.put("prop_search_list_item_id", obj4);
                map = map3;
            }
            return map;
        }
        Map<String, C682380Qpg> map4 = LJI;
        C682380Qpg c682380Qpg = (C682380Qpg) ((LinkedHashMap) map4).get(str);
        if (c682380Qpg != null) {
            pair = new Pair(c682380Qpg.LIZ, c682380Qpg.LIZIZ);
        } else {
            C682380Qpg c682380Qpg2 = (C682380Qpg) ((LinkedHashMap) LJII).get(str);
            if (c682380Qpg2 != null) {
                pair = new Pair(c682380Qpg2.LIZ, c682380Qpg2.LIZIZ);
            } else {
                pair = new Pair(LJ, ((LinkedHashMap) LJIIIZ).get(str));
                if (!LJIIJ || !LJIIIIZZ.contains(str)) {
                    return null;
                }
            }
        }
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        Pair[] pairArr3 = new Pair[5];
        String str7 = LIZJ;
        if (str7 == null) {
            str7 = "";
        }
        pairArr3[0] = new Pair("prop_search_session_id", str7);
        if (first == null) {
            first = "";
        }
        pairArr3[1] = new Pair("prop_search_id", first);
        pairArr3[2] = new Pair("prop_id", str);
        if (second == null) {
            second = "";
        }
        pairArr3[3] = new Pair("prop_search_result_id", second);
        if (map4.containsKey(str)) {
            str2 = "search";
        } else {
            str2 = "recommend";
        }
        pairArr3[4] = new Pair("prop_search_method", str2);
        return C2097608Jq.LJIIIIZZ(pairArr3);
    }

    @Override // X.InterfaceC1448230nn3
    public final String LJFF(String str) {
        if (str != null) {
            return (String) ((ConcurrentHashMap) C682390Qph.LIZ.getValue()).get(str);
        }
        return null;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIIIZ(SearchEffectModel searchEffectModel) {
        String search_id;
        if (searchEffectModel != null && (search_id = searchEffectModel.getSearch_id()) != null && search_id.length() != 0) {
            LJ = search_id;
            LJIIJ = searchEffectModel.getEffectList().isEmpty();
            for (Effect effect : searchEffectModel.getEffectList()) {
                LJI.put(effect.getEffectId(), new C682380Qpg(search_id, effect.getDoc_id()));
            }
            if (LIZLLL) {
                LIZLLL = false;
                LIZJ = search_id;
                C686520QwM.LIZ.getClass();
                C0Q3E.LJI().yY1().LIZ(new C682420Qpk(search_id));
            } else if (LIZJ == null) {
                LIZJ = search_id;
                C686520QwM.LIZ.getClass();
                C0Q3E.LJI().yY1().LIZ(new C682420Qpk(search_id));
            }
            C686520QwM c686520QwM = C686520QwM.LIZ;
            LastSearch lastSearch = new LastSearch(LJFF, search_id, null, null, Long.valueOf(System.currentTimeMillis()), 0L);
            c686520QwM.getClass();
            C0Q3E.LJI().yY1().LIZ(new C682400Qpi(lastSearch));
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIIJ(List<? extends Effect> list) {
        String str = LJ;
        if (str == null) {
            return;
        }
        ((LinkedHashMap) LJII).clear();
        for (Effect effect : list) {
            LJII.put(effect.getEffectId(), new C682380Qpg(str, effect.getDoc_id()));
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIIJJI(String str) {
        LJIILIIL = str;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIIL(boolean z) {
        LJIILL = z;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIILJJIL(List<? extends Effect> list) {
        LJIIIIZZ.clear();
        ((LinkedHashMap) LJIIIZ).clear();
        for (Effect effect : list) {
            LJIIIIZZ.add(effect.getEffectId());
            LJIIIZ.put(effect.getEffectId(), effect.getDoc_id());
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIILL(boolean z) {
        LJIILLIIL = z;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIJI(String str) {
        if (str == null) {
            return;
        }
        C651980Phk c651980Phk = C651970Phj.LLILLL;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("prop_id", str));
        c651980Phk.getClass();
        C651980Phk.LJFF(mapLIZJ, true);
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIJJ(C682370Qpf c682370Qpf) {
        String str;
        String str2 = LIZJ;
        if (str2 != null && str2.length() != 0 && (str = c682370Qpf.LIZ) != null && str.length() != 0) {
            C682330Qpb c682330Qpb = new C682330Qpb();
            LJJIFFI(c682330Qpb, c682370Qpf);
            c682330Qpb.LJIILJJIL();
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJJ(boolean z) {
        LJIIZILJ = z;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJJI(String str) {
        LJFF = str;
        if (str == null || str.length() == 0) {
            LIZJ = null;
        }
    }

    public static void LJJIFFI(C650460PfI c650460PfI, C682370Qpf c682370Qpf) {
        c650460PfI.LJIIZILJ("effect_session_id", LIZJ);
        String str = c682370Qpf.LIZ;
        if (str == null || !(!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT))) {
            str = LJ;
        }
        c650460PfI.LJIIZILJ("search_id", str);
        c650460PfI.LJIJJ("prop_panel_search");
        c650460PfI.LJIIZILJ("search_keyword", LJFF);
        c650460PfI.LJIJI("search_result_id", c682370Qpf.LIZJ);
        c650460PfI.LJIIZILJ("prop_id", c682370Qpf.LIZIZ);
        c650460PfI.LJIIZILJ("token_type", "prop_card");
        c650460PfI.LJJIII(0);
        c650460PfI.LJJIIZ(Integer.valueOf(c682370Qpf.LIZLLL));
        c650460PfI.LJIIZILJ("creation_id", c682370Qpf.LJ);
        c650460PfI.LJIIZILJ("search_method", c682370Qpf.LJFF);
    }

    public static boolean LJJII(String str, Map map) {
        if (str == null) {
            return false;
        }
        Object obj = map.get("prop_id");
        if (!Intrinsics.LJFF(obj, str) && !Intrinsics.LJFF(obj, LJIIL.get(str))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJII(String str, String str2) {
        if (str != null && str2 != null) {
            LJIIL.put(str, str2);
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final void LJIJ(String str, Map<String, String> map) {
        String str2;
        if (str != null && map != null && (str2 = map.get("search_extra")) != null) {
            ((ConcurrentHashMap) C682390Qph.LIZ.getValue()).put(str, str2);
        }
    }

    @Override // X.InterfaceC1448230nn3
    public final void LIZIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", "search");
        c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("shoot_tab_name", str3);
        C20684815ws.LJIILLIIL("click_prop_search_frame", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1448230nn3
    public final Map<String, String> LJIJJLI(String str, String str2, String str3) throws JSONException {
        Map mapLJ;
        String str4;
        List listLJJLIIIJILLIZJL;
        List<String> listLJJJJI;
        C682360Qpe c682360Qpe;
        String str5;
        Object obj;
        if (str == null || (obj = ((ConcurrentHashMap) C682390Qph.LIZ.getValue()).get(str)) == null || (mapLJ = C2097908Jt.LIZJ(new Pair("search_extra", obj))) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (str2 == null) {
            return C2097608Jq.LJIIL(mapLJ, C2097608Jq.LJ());
        }
        JSONObject jSONObject = new JSONObject();
        Object obj2 = "";
        if (str3 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) != null && (listLJJJJI = C13LP.LJJJJI(listLJJLIIIJILLIZJL)) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str6 : listLJJJJI) {
                C682350Qpd c682350Qpd = LIZ;
                HashMap<String, String> map = LJIIJJI;
                c682350Qpd.getClass();
                if (LJJII(str6, map)) {
                    c682360Qpe = new C682360Qpe(map.get("search_id"), map.get("search_result_id"), map.get("list_item_id"));
                } else {
                    C651970Phj.LLILLL.getClass();
                    HashMap map2 = new HashMap(C651980Phk.LIZJ());
                    if (LJJII(str6, map2)) {
                        String str7 = (String) map2.get("search_id");
                        String str8 = (String) map2.get("search_result_id");
                        if (Intrinsics.LJFF(map2.get("search_enter_position"), "hot_user_video")) {
                            str5 = (String) map2.get("group_id");
                        } else {
                            str5 = null;
                        }
                        c682360Qpe = new C682360Qpe(str7, str8, str5);
                    } else {
                        C682380Qpg c682380Qpg = (C682380Qpg) ((LinkedHashMap) LJI).get(str6);
                        if (c682380Qpg != null) {
                            String str9 = c682380Qpg.LIZ;
                            String str10 = c682380Qpg.LIZIZ;
                            if (str10 == null) {
                                str10 = "";
                            }
                            c682360Qpe = new C682360Qpe(str9, str10, null);
                        }
                    }
                }
                arrayList.add(c682360Qpe);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                C682360Qpe c682360Qpe2 = (C682360Qpe) obj3;
                if (C703302op.LIZ(c682360Qpe2.LIZ) && C703302op.LIZ(c682360Qpe2.LIZIZ)) {
                    arrayList2.add(obj3);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj4 : arrayList2) {
                String str11 = ((C682360Qpe) obj4).LIZ;
                Object arrayList3 = linkedHashMap.get(str11);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(str11, arrayList3);
                }
                ((List) arrayList3).add(obj4);
            }
            Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
            if (setEntrySet != null) {
                for (Map.Entry entry : setEntrySet) {
                    String str12 = (String) entry.getKey();
                    if (str12 != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (C682360Qpe c682360Qpe3 : (Iterable) entry.getValue()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("prop_search_result_id", c682360Qpe3.LIZIZ);
                            if (C123100dR.LIZ(c682360Qpe3.LIZJ)) {
                                jSONObject2.put("prop_list_item_id", c682360Qpe3.LIZJ);
                            }
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put(str12, jSONArray);
                    }
                }
            }
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        Pair[] pairArr = new Pair[2];
        if (jSONObject.length() == 0) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = "1";
        }
        pairArr[0] = new Pair("has_search", str4);
        pairArr[1] = new Pair("creation_id", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (jSONObject.length() != 0) {
            mapLJIIJ.put("prop_search_info", strJ3);
        }
        C651970Phj.LLILLL.getClass();
        Object obj5 = C651980Phk.LIZJ().get("is_inner");
        if (obj5 == null) {
            obj5 = "";
        }
        mapLJIIJ.put("is_inner", obj5);
        Object obj6 = C651980Phk.LIZJ().get("inner_search_id");
        if (obj6 != null) {
            obj2 = obj6;
        }
        mapLJIIJ.put("inner_search_id", obj2);
        return C2097608Jq.LJIIL(mapLJIIJ, mapLJ);
    }
}
