package X;

import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.spi.IFcpAppDiffProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585240rM2 extends AbstractC1585310rM9 {
    public List<String> LIZJ;
    public List<String> LIZLLL;
    public Map<String, List<String>> LJII;
    public Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> LJIIJ;
    public C0S4F LJIIJJI;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1585450rMN());
    public final C01GW LJ = C452501pT.LIZIZ(new C1585470rMP(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C1584680rL8(this));
    public final C01GW LJI = C452501pT.LIZIZ(new C1585480rMQ(this));
    public int LJIIIIZZ = 1;
    public int LJIIIZ = 1;

    public static List LJ() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<String>>> it2 = C1584300rKW.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (key == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(key);
        }
        return arrayList;
    }

    public static List LJFF() {
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC1584360rKc> it2 = C1584300rKW.LIZIZ.iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (key == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(key);
        }
        return arrayList;
    }

    @Override // X.AbstractC1585310rM9
    public final Pair<Boolean, EnumC1585290rM7> LIZ() {
        TopTab topTabLIZ;
        Entrance entrance;
        Entrance entrance2;
        boolean z;
        ArrayList<TopTabItem> arrayList;
        int i;
        List<Candidate> list;
        IFcpAppDiffProtocol.LIZ.getClass();
        C1585540rMW.LIZIZ.getValue().LIZIZ();
        if (C343780Ddo.LIZIZ()) {
            C0CXN.LIZ.getClass();
            topTabLIZ = C0CXN.LIZJ().topTab;
        } else {
            topTabLIZ = C343730Ddj.LIZ();
        }
        if (topTabLIZ != null && (arrayList = topTabLIZ.topTabList) != null) {
            for (TopTabItem topTabItem : arrayList) {
                if (Intrinsics.LJFF(topTabItem.topTabKey, EnumC1584360rKc.MALL.getKey())) {
                    Entrance entrance3 = topTabItem.rightEntrance;
                    if (entrance3 == null || (i = entrance3.showLimit) < 0 || i > 2 || ((list = entrance3.candidates) != null && list.isEmpty())) {
                        return new Pair<>(Boolean.FALSE, EnumC1585290rM7.MISS_SHOP_CART_FOR_MALL);
                    }
                    List<Candidate> list2 = entrance3.candidates;
                    if (list2 != null) {
                        Iterator<Candidate> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Intrinsics.LJFF(it2.next().entranceKey, EnumC1584360rKc.SHOP_CART.getKey());
                        }
                    }
                }
            }
        }
        if (C343780Ddo.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getLeftEntrance isIllegal = ");
            TabConfig tabConfigLIZIZ = C343730Ddj.LIZIZ();
            sbLIZ.append(tabConfigLIZIZ != null ? tabConfigLIZIZ.isJsonIllegal : null);
            sbLIZ.append(", ");
            TabConfig tabConfigLIZIZ2 = C343730Ddj.LIZIZ();
            sbLIZ.append(tabConfigLIZIZ2 != null ? tabConfigLIZIZ2.leftEntrance : null);
            C2188811AlT.LIZIZ(sbLIZ);
            TabConfig tabConfigLIZIZ3 = C343730Ddj.LIZIZ();
            entrance = tabConfigLIZIZ3 != null ? tabConfigLIZIZ3.leftEntrance : null;
        } else {
            C0CXN.LIZ.getClass();
            entrance = C0CXN.LIZJ().leftEntrance;
        }
        if (C343780Ddo.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getRightEntrance isIllegal = ");
            TabConfig tabConfigLIZIZ4 = C343730Ddj.LIZIZ();
            sbLIZ2.append(tabConfigLIZIZ4 != null ? tabConfigLIZIZ4.isJsonIllegal : null);
            sbLIZ2.append(", ");
            TabConfig tabConfigLIZIZ5 = C343730Ddj.LIZIZ();
            sbLIZ2.append(tabConfigLIZIZ5 != null ? tabConfigLIZIZ5.rightEntrance : null);
            C2188811AlT.LIZIZ(sbLIZ2);
            TabConfig tabConfigLIZIZ6 = C343730Ddj.LIZIZ();
            entrance2 = tabConfigLIZIZ6 != null ? tabConfigLIZIZ6.rightEntrance : null;
        } else {
            C0CXN.LIZ.getClass();
            entrance2 = C0CXN.LIZJ().rightEntrance;
        }
        if (entrance == null) {
            return entrance2 == null ? new Pair<>(Boolean.FALSE, EnumC1585290rM7.CORNER_CONFIG_EMPTY) : new Pair<>(Boolean.FALSE, EnumC1585290rM7.LEFT_CORNER_CONFIG_INVALID);
        }
        this.LJIIIIZZ = entrance.showLimit;
        if (entrance2 == null) {
            return new Pair<>(Boolean.FALSE, EnumC1585290rM7.RIGHT_CORNER_CONFIG_INVALID);
        }
        this.LJIIIZ = entrance2.showLimit;
        if (LJII(entrance) || LJII(entrance2)) {
            return new Pair<>(Boolean.FALSE, EnumC1585290rM7.CORNER_CONFIG_INVALID);
        }
        List<Candidate> list3 = entrance.candidates;
        List<Candidate> list4 = entrance2.candidates;
        List<Candidate> listLJLJJLL = list4 != null ? C13LP.LJLJJLL(list4) : null;
        if (list3 == null || list3.isEmpty() || listLJLJJLL == null || listLJLJJLL.isEmpty()) {
            return new Pair<>(Boolean.FALSE, EnumC1585290rM7.CORNER_CONFIG_INVALID);
        }
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        if (C343780Ddo.LIZIZ()) {
            this.LJII = new LinkedHashMap();
        }
        if (list3 != null) {
            z = false;
            for (Candidate candidate : list3) {
                String str = candidate.itemKey;
                if (((str == null || str.length() == 0) && (str = candidate.entranceKey) == null) || str.length() == 0) {
                    return new Pair<>(Boolean.FALSE, EnumC1585290rM7.LEFT_CORNER_CONFIG_INVALID);
                }
                if (C343780Ddo.LIZIZ()) {
                    ArrayList arrayList2 = new ArrayList();
                    Map<String, Boolean> map = candidate.filterRules;
                    if (map != null) {
                        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                            if (entry.getValue().booleanValue()) {
                                arrayList2.add(entry.getKey());
                            }
                        }
                    }
                    Map<String, List<String>> map2 = this.LJII;
                    if (map2 != null) {
                        map2.put(str, arrayList2);
                    }
                }
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 0 ? Intrinsics.LJFF(str, EnumC1584360rKc.SEARCH.getKey()) || Intrinsics.LJFF(str, EnumC1584360rKc.SEARCH_BAR.getKey()) : Intrinsics.LJFF(str, EnumC1584360rKc.SEARCH.getKey())) {
                    z = true;
                }
                List<String> list5 = this.LIZJ;
                if (list5 != null) {
                    ((ArrayList) list5).add(str);
                }
            }
        } else {
            z = false;
        }
        if (listLJLJJLL != null) {
            for (Candidate candidate2 : listLJLJJLL) {
                String str2 = candidate2.itemKey;
                if (((str2 == null || str2.length() == 0) && (str2 = candidate2.entranceKey) == null) || str2.length() == 0) {
                    return new Pair<>(Boolean.FALSE, EnumC1585290rM7.RIGHT_CORNER_CONFIG_INVALID);
                }
                if (C343780Ddo.LIZIZ()) {
                    ArrayList arrayList3 = new ArrayList();
                    Map<String, Boolean> map3 = candidate2.filterRules;
                    if (map3 != null) {
                        for (Map.Entry<String, Boolean> entry2 : map3.entrySet()) {
                            if (entry2.getValue().booleanValue()) {
                                arrayList3.add(entry2.getKey());
                            }
                        }
                    }
                    Map<String, List<String>> map4 = this.LJII;
                    if (map4 != null) {
                        map4.put(str2, arrayList3);
                    }
                }
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 0 ? Intrinsics.LJFF(str2, EnumC1584360rKc.SEARCH.getKey()) || Intrinsics.LJFF(str2, EnumC1584360rKc.SEARCH_BAR.getKey()) : Intrinsics.LJFF(str2, EnumC1584360rKc.SEARCH.getKey())) {
                    z = true;
                }
                List<String> list6 = this.LIZLLL;
                if (list6 != null) {
                    ((ArrayList) list6).add(str2);
                }
            }
        }
        return !z ? new Pair<>(Boolean.FALSE, EnumC1585290rM7.FCP_HAS_NO_SEARCH_ICON) : new Pair<>(Boolean.TRUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04db A[EDGE_INSN: B:180:0x04db->B:144:0x04db BREAK  A[LOOP:7: B:129:0x0480->B:138:0x04a3], EDGE_INSN: B:181:0x04db->B:144:0x04db BREAK  A[LOOP:7: B:129:0x0480->B:138:0x04a3]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.util.List<java.lang.String>, kotlin.Pair<java.util.List<X.InterfaceC1570900qyu>, java.util.List<X.InterfaceC1570900qyu>>> LJI() {
        /*
            Method dump skipped, instruction units count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1585240rM2.LJI():kotlin.Pair");
    }

    @Override // X.AbstractC1585310rM9
    public final EnumC1585100rLo LIZLLL() {
        return EnumC1585100rLo.TOP_ICON;
    }

    public static boolean LJII(Entrance entrance) {
        boolean z;
        boolean z2;
        int i = entrance.showLimit;
        if (i < 0) {
            return true;
        }
        if (i <= 2) {
            return false;
        }
        List<Candidate> list = entrance.candidates;
        if (list != null && !list.isEmpty()) {
            Iterator<Candidate> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().entranceKey, EnumC1584350rKb.STORY_CAMERA.getTag())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        List<Candidate> list2 = entrance.candidates;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<Candidate> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next().entranceKey, EnumC1584350rKb.STORY.getTag())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return true;
        }
        if (C1596000rdO.LIZ()) {
            if (entrance.showLimit - 1 > 2) {
                return true;
            }
            return false;
        }
        return !C1600640rks.LIZ();
    }

    @Override // X.AbstractC1585310rM9
    public final List<String> LIZIZ(boolean z) {
        Pair<List<String>, Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> pairLJI = LJI();
        List<String> first = pairLJI.getFirst();
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> second = pairLJI.getSecond();
        if (z) {
            this.LJIIJ = second;
        }
        return first;
    }
}
