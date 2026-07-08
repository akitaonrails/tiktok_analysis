package X;

import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CUI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CUI {
    public static final C0CUI LIZ = new C0CUI();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0CTX());
    public static boolean LIZJ;

    public static void LIZIZ(C19EG c19eg) {
        Object c098200Yq;
        Iterator<String> itKeys;
        String str = "";
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "enable_track_show_homepage_tab_after_launch", false, false)) {
            Object obj = null;
            try {
                ITabStrip iTabStrip = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ITabStrip.class, null);
                if (iTabStrip == null) {
                    LIZJ = true;
                    return;
                }
                Pair<List<String>, List<String>> pairTg1 = iTabStrip.Tg1();
                List<String> first = pairTg1.getFirst();
                List<String> second = pairTg1.getSecond();
                JSONObject jSONObject = new JSONObject();
                LIZ(jSONObject, c19eg, first, second);
                C01GW c01gw = LIZIZ;
                String string = ((Keva) c01gw.getValue()).getString("key_tab_pre_nuj_mob_info", "");
                if (string != null) {
                    str = string;
                }
                ((Keva) c01gw.getValue()).storeString("key_tab_pre_nuj_mob_info", C786410Ut5.J3(jSONObject));
                try {
                    c098200Yq = new JSONObject(str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pre_");
                        sbLIZ.append(next);
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject2.opt(next));
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1606660rua.LIZIZ.LJIIJ("show_homepage_tab_after_launch", linkedHashMap);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                C0CUA c0cua = C0CUA.LIZ;
                JSONObject jSONObjectLIZIZ = C0CUA.LIZIZ();
                Iterator<String> itKeys2 = jSONObjectLIZIZ.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    jSONObject.put(next2, jSONObjectLIZIZ.opt(next2));
                }
                C1586120rNS.LIZ(C1586120rNS.LIZ, "show_homepage_tab_after_launch", C786410Ut5.J3(jSONObject));
                C20684815ws.LJIJ("show_homepage_tab_after_launch", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    public static void LIZ(JSONObject jSONObject, C19EG c19eg, List list, List list2) throws JSONException {
        HomeViewPagerAbility homeViewPagerAbilityLIZ;
        List<InterfaceC1583870rJp> listTz;
        String strLIZIZ;
        int i;
        IMFToolBarAbility iMFToolBarAbilityLIZ;
        C0CUJ c0cujRo2;
        HomeTabAbility homeTabAbilityLIZ = null;
        jSONObject.put("tab_name", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        jSONObject.put("full_tab_name", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
        jSONObject.put("tab_cnt", list.size());
        jSONObject.put("full_tab_cnt", list2.size());
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ != null) {
            homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ);
        }
        MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ2 != null) {
            homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZJ2);
        } else {
            homeViewPagerAbilityLIZ = null;
        }
        MainActivityScope mainActivityScopeLIZJ3 = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ3 != null && (iMFToolBarAbilityLIZ = C0CUL.LIZ(mainActivityScopeLIZJ3)) != null && (c0cujRo2 = iMFToolBarAbilityLIZ.ro2()) != null) {
            jSONObject.put("top_left_icon", C13LP.LJJLIIIJ(c0cujRo2.LIZ, ",", null, null, 0, null, null, 62));
            jSONObject.put("top_right_icon", C13LP.LJJLIIIJ(c0cujRo2.LIZIZ, ",", null, null, 0, null, null, 62));
        }
        int size = list2.size();
        int iP81 = homeViewPagerAbilityLIZ != null ? homeViewPagerAbilityLIZ.P81() : list2.size() - 1;
        int size2 = list2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            int i4 = iP81 - i3;
            if (i4 >= 0 && (i = i4 + 1) >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("top_");
                sbLIZ.append(i);
                sbLIZ.append("tab_name");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "top_neg1tab_name";
            }
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            String str = (String) C13LP.LJJJLZIJ((size - 1) - i3, list2);
            c1584320rKY.getClass();
            jSONObject.put(strLIZIZ, C1584320rKY.LJI(str));
        }
        if (homeTabAbilityLIZ == null || (listTz = homeTabAbilityLIZ.Tz()) == null) {
            listTz = C13BV.INSTANCE;
        }
        for (InterfaceC1583870rJp interfaceC1583870rJp : listTz) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bottom_");
                sbLIZ2.append(i5);
                sbLIZ2.append("tab_name");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                String strTag = interfaceC1583870rJp.tag();
                c1584320rKY2.getClass();
                jSONObject.put(strLIZIZ2, C1584320rKY.LJI(strTag));
                i2 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
