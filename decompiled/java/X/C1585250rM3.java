package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.hometab.base.BottomTabNode;
import com.ss.android.ugc.aweme.hometab.base.BottomTabNodeGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585250rM3 extends AbstractC1585310rM9 {
    public Map<Integer, List<String>> LIZLLL;
    public Map<String, List<String>> LJI;
    public List<? extends BottomTabProtocol> LJII;
    public final ConcurrentHashMap<String, WeakReference<InterfaceC1583870rJp>> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1585440rMM());
    public final C01GW LJ = C452501pT.LIZIZ(new C1585390rMH(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C0CXU(this));

    public static Map LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, Map<String, List<String>>> entry : C1584270rKT.LIZIZ.entrySet()) {
            Integer key = entry.getKey();
            Map<String, List<String>> value = entry.getValue();
            ArrayList arrayList = new ArrayList(value.size());
            Iterator<Map.Entry<String, List<String>>> it2 = value.entrySet().iterator();
            while (it2.hasNext()) {
                String key2 = it2.next().getKey();
                if (key2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(key2);
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }

    public static Map LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<Integer, Map<String, List<String>>>> it2 = C1584270rKT.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            for (Map.Entry<String, List<String>> entry : it2.next().getValue().entrySet()) {
                ArrayList arrayList = new ArrayList();
                for (String str : entry.getValue()) {
                    if (C123100dR.LIZ(str)) {
                        arrayList.add(str);
                    }
                }
                linkedHashMap.put(entry.getKey(), arrayList);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[LOOP:0: B:13:0x004d->B:24:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c1 A[EDGE_INSN: B:86:0x00c1->B:33:0x00c1 BREAK  A[LOOP:0: B:13:0x004d->B:24:0x0087], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.util.List<java.lang.String>, java.util.List<com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol>> LJI() {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1585250rM3.LJI():kotlin.Pair");
    }

    @Override // X.AbstractC1585310rM9
    public final Pair<Boolean, EnumC1585290rM7> LIZ() {
        Map<String, ArrayList<BottomTab>> map;
        String key;
        List list;
        Map<String, List<String>> map2;
        EnumC1585290rM7 enumC1585290rM7 = null;
        if (C343780Ddo.LIZIZ()) {
            C0CXN.LIZ.getClass();
            map = C0CXN.LIZJ().bottomTab;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getBottomTab value = ");
            TabConfig tabConfigLIZIZ = C343730Ddj.LIZIZ();
            sbLIZ.append(tabConfigLIZIZ != null ? tabConfigLIZIZ.isJsonIllegal : null);
            sbLIZ.append(", ");
            TabConfig tabConfigLIZIZ2 = C343730Ddj.LIZIZ();
            sbLIZ.append(tabConfigLIZIZ2 != null ? tabConfigLIZIZ2.bottomTab : null);
            C2188811AlT.LIZIZ(sbLIZ);
            TabConfig tabConfigLIZIZ3 = C343730Ddj.LIZIZ();
            map = tabConfigLIZIZ3 != null ? tabConfigLIZIZ3.bottomTab : null;
        }
        this.LIZLLL = null;
        this.LJI = C343780Ddo.LIZ() ? null : new LinkedHashMap();
        if (map != null) {
            boolean z = true;
            if (map.keySet().size() == 5) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    for (Map.Entry<String, ArrayList<BottomTab>> entry : map.entrySet()) {
                        if (entry.getValue().isEmpty()) {
                            throw new IllegalStateException();
                        }
                        Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(entry.getKey()));
                        ArrayList<BottomTab> value = entry.getValue();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                        Iterator<T> it2 = value.iterator();
                        while (it2.hasNext()) {
                            String str = ((BottomTab) it2.next()).bottomTabKey;
                            if (str == null || str.length() == 0) {
                                throw new IllegalStateException();
                            }
                            arrayList.add(str);
                        }
                        linkedHashMap.put(numValueOf, arrayList);
                        if (C343780Ddo.LIZIZ()) {
                            for (BottomTab bottomTab : entry.getValue()) {
                                ArrayList arrayList2 = new ArrayList();
                                Map<String, Boolean> map3 = bottomTab.filterRules;
                                if (map3 != null) {
                                    for (Map.Entry<String, Boolean> entry2 : map3.entrySet()) {
                                        if (entry2.getValue().booleanValue()) {
                                            arrayList2.add(entry2.getKey());
                                        }
                                    }
                                }
                                String str2 = bottomTab.bottomTabKey;
                                if (str2 != null && (map2 = this.LJI) != null) {
                                    map2.put(str2, arrayList2);
                                }
                            }
                        }
                    }
                    key = EnumC1584360rKc.HOME.getKey();
                    list = (List) linkedHashMap.get(0);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    enumC1585290rM7 = e instanceof IllegalStateException ? EnumC1585290rM7.BOTTOM_TAB_CONFIG_INVALID : EnumC1585290rM7.JSON_PARSE_ERROR;
                }
                if (Intrinsics.LJFF(key, list != null ? (String) list.get(0) : null)) {
                    List list2 = (List) linkedHashMap.get(2);
                    if (list2 != null && !list2.isEmpty()) {
                        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.SHOOT;
                        if (!Intrinsics.LJFF(enumC1584360rKc.getKey(), list2 != null ? (String) ListProtector.get(list2, 0) : null)) {
                            if (list2.size() >= 2 && Intrinsics.LJFF(enumC1584360rKc.getKey(), (String) ListProtector.get(list2, 1))) {
                            }
                        }
                        this.LIZLLL = linkedHashMap;
                        return new Pair<>(Boolean.valueOf(z), enumC1585290rM7);
                    }
                    enumC1585290rM7 = EnumC1585290rM7.WRONG_THIRD_BOTTOM_TAB;
                } else {
                    enumC1585290rM7 = EnumC1585290rM7.WRONG_FIRST_BOTTOM_TAB;
                }
                if (enumC1585290rM7 != null) {
                    z = false;
                } else {
                    this.LIZLLL = linkedHashMap;
                }
                return new Pair<>(Boolean.valueOf(z), enumC1585290rM7);
            }
        }
        return new Pair<>(Boolean.FALSE, EnumC1585290rM7.BOTTOM_TAB_SIZE_ERROR);
    }

    @Override // X.AbstractC1585310rM9
    public final EnumC1585100rLo LIZLLL() {
        return EnumC1585100rLo.BOTTOM_TAB;
    }

    @Override // X.AbstractC1585310rM9
    public final List<String> LIZIZ(boolean z) {
        Pair<List<String>, List<BottomTabProtocol>> pairLJI = LJI();
        List<String> first = pairLJI.getFirst();
        List<BottomTabProtocol> second = pairLJI.getSecond();
        if (z) {
            this.LJII = second;
        }
        return first;
    }

    public final InterfaceC1583870rJp LJII(Context context, BottomTabProtocol bottomTabProtocol) {
        InterfaceC1583870rJp bottomTabNodeGroup;
        WeakReference<InterfaceC1583870rJp> weakReference = this.LIZIZ.get(bottomTabProtocol.getTag());
        if (weakReference == null || (bottomTabNodeGroup = weakReference.get()) == null) {
            if (bottomTabProtocol.LJFF() == null) {
                bottomTabNodeGroup = new BottomTabNode(context, bottomTabProtocol);
            } else {
                bottomTabNodeGroup = new BottomTabNodeGroup(context, bottomTabProtocol, LIZJ().LJI);
            }
            this.LIZIZ.put(bottomTabProtocol.getTag(), new WeakReference<>(bottomTabNodeGroup));
        }
        return bottomTabNodeGroup;
    }
}
