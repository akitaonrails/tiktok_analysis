package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DML, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DML {
    public static HashMap LIZ(C19EG c19eg) {
        List<InterfaceC1583870rJp> listL32;
        List<InterfaceC1583870rJp> listTz;
        HomeViewPagerAbility homeViewPagerAbility;
        int iLJIIJ;
        String strLJI;
        String strLJI2;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI;
        String strLIZIZ;
        int i;
        Object ability;
        HashMap map = new HashMap();
        Object obj = null;
        InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
        HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(interfaceC665370Q7zLJI);
        if (homeTabAbilityLIZIZ == null || (listL32 = homeTabAbilityLIZIZ.l32()) == null) {
            listL32 = C13BV.INSTANCE;
        }
        if (homeTabAbilityLIZIZ == null || (listTz = homeTabAbilityLIZIZ.Tz()) == null) {
            listTz = C13BV.INSTANCE;
        }
        if (C297720Bli.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJI, MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeViewPagerAbility) {
                obj = ability;
            }
            homeViewPagerAbility = (HomeViewPagerAbility) obj;
        } else {
            homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJI, HomeViewPagerAbility.class, null);
        }
        if (homeViewPagerAbility != null) {
            iLJIIJ = homeViewPagerAbility.P81();
        } else {
            iLJIIJ = C1697810uHb.LJIIJ(listL32);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listL32, 10));
        for (InterfaceC1583870rJp interfaceC1583870rJp : listL32) {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            String strTag = interfaceC1583870rJp.tag();
            c1584320rKY.getClass();
            arrayList.add(C1584320rKY.LJI(strTag));
        }
        map.put("tab_name", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        map.put("tab_cnt", Integer.valueOf(listL32.size()));
        HashMap map2 = new HashMap();
        int size = listL32.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iLJIIJ - i2;
            if (i3 >= 0 && (i = i3 + 1) >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("top_");
                sbLIZ.append(i);
                sbLIZ.append("tab_name");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "top_neg1tab_name";
            }
            C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
            String strTag2 = ((InterfaceC1583870rJp) ListProtector.get(listL32, i2)).tag();
            c1584320rKY2.getClass();
            map2.put(strLIZIZ, C1584320rKY.LJI(strTag2));
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        HashMap map3 = new HashMap();
        int size2 = listTz.size();
        String strLJI3 = "be_null";
        if (size2 < 2) {
            strLJI = "be_null";
        } else {
            C1584320rKY c1584320rKY3 = C1584320rKY.LIZ;
            String strTag3 = ((InterfaceC1583870rJp) ListProtector.get(listTz, 1)).tag();
            c1584320rKY3.getClass();
            strLJI = C1584320rKY.LJI(strTag3);
        }
        map3.put("bottom_2tab_name", strLJI);
        if (size2 < 4) {
            strLJI2 = "be_null";
        } else {
            C1584320rKY c1584320rKY4 = C1584320rKY.LIZ;
            String strTag4 = ((InterfaceC1583870rJp) ListProtector.get(listTz, 3)).tag();
            c1584320rKY4.getClass();
            strLJI2 = C1584320rKY.LJI(strTag4);
        }
        map3.put("bottom_4tab_name", strLJI2);
        if (size2 >= 5) {
            C1584320rKY c1584320rKY5 = C1584320rKY.LIZ;
            String strTag5 = ((InterfaceC1583870rJp) ListProtector.get(listTz, 4)).tag();
            c1584320rKY5.getClass();
            strLJI3 = C1584320rKY.LJI(strTag5);
        }
        map3.put("bottom_5tab_name", strLJI3);
        for (Map.Entry entry2 : map3.entrySet()) {
            map.put(entry2.getKey(), entry2.getValue());
        }
        if (homeTabAbilityLIZIZ != null && (pairPI = homeTabAbilityLIZIZ.pI()) != null) {
            for (Map.Entry entry3 : ((HashMap) LIZIZ(pairPI)).entrySet()) {
                map.put(entry3.getKey(), entry3.getValue());
            }
        }
        return map;
    }

    public static Map LIZIZ(Pair pair) {
        HashMap map = new HashMap();
        Iterable iterable = (Iterable) pair.getFirst();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1570900qyu interfaceC1570900qyu = (InterfaceC1570900qyu) it2.next();
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            String tag = interfaceC1570900qyu.getTag();
            if (tag != null) {
                str = tag;
            }
            c1584320rKY.getClass();
            arrayList.add(C1584320rKY.LJI(str));
        }
        map.put("top_left_icon", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        Iterable<InterfaceC1570900qyu> iterable2 = (Iterable) pair.getSecond();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable2, 10));
        for (InterfaceC1570900qyu interfaceC1570900qyu2 : iterable2) {
            C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
            String tag2 = interfaceC1570900qyu2.getTag();
            if (tag2 == null) {
                tag2 = "";
            }
            c1584320rKY2.getClass();
            arrayList2.add(C1584320rKY.LJI(tag2));
        }
        map.put("top_right_icon", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        return map;
    }
}
