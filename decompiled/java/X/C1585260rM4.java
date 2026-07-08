package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import com.ss.android.ugc.aweme.spi.IFcpAppDiffProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585260rM4 extends AbstractC1585310rM9 {
    public ArrayList<String> LIZLLL;
    public List<TopTabProtocol> LJI;
    public Map<String, List<String>> LJII;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C315240CXi());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1585460rMO());
    public final C01GW LJ = C452501pT.LIZIZ(new C1585420rMK(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C0CXT(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C0CXS(this));

    public static ArrayList LJ() {
        ArrayList arrayList = new ArrayList();
        Iterator<TopTabItem> it2 = C1584280rKU.LIZIZ.iterator();
        while (it2.hasNext()) {
            String str = it2.next().topTabKey;
            if (str == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public final Pair<List<String>, List<TopTabProtocol>> LJFF() {
        ArrayList<String> arrayListLJ;
        Map linkedHashMap;
        boolean z;
        if (LIZJ().LJIIJ()) {
            arrayListLJ = this.LIZLLL;
            if (arrayListLJ == null) {
                HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
                C1585280rM6.LIZ(EnumC1585320rMA.FINAL_CHECK, null, null, EnumC1585290rM7.UNKNOWN_REASON);
                arrayListLJ = C343780Ddo.LIZIZ() ? (ArrayList) this.LJ.getValue() : (ArrayList) this.LJFF.getValue();
            }
        } else {
            C1585280rM6.LJ = false;
            ((AbstractC1604130rqV) this.LIZJ.getValue()).LJFF("TopTabOperator", "Illegal data");
            arrayListLJ = C343780Ddo.LIZIZ() ? (ArrayList) this.LJ.getValue() : (ArrayList) this.LJFF.getValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!C343780Ddo.LIZIZ()) {
            for (String str : arrayListLJ) {
                TopTabProtocol topTabProtocolLIZLLL = LIZJ().LJIIIZ().LIZLLL(str);
                if (topTabProtocolLIZLLL != null && topTabProtocolLIZLLL.enable()) {
                    if (Intrinsics.LJFF(topTabProtocolLIZLLL.getTag(), "FRIENDS_FEED")) {
                        C0C8J.LIZ.getClass();
                        ((Boolean) C0C8J.LJI.getValue()).booleanValue();
                        ((Number) C0C8J.LJII.getValue()).intValue();
                        C0C8J.LJ.getValue();
                        ((Number) C0C8J.LJFF.getValue()).intValue();
                    }
                    if (topTabProtocolLIZLLL.LJIILL()) {
                        arrayList2.add(topTabProtocolLIZLLL);
                        arrayList.add(str);
                    }
                }
            }
        }
        if (C343780Ddo.LIZ()) {
            return new Pair<>(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (LIZJ().LJIIJ()) {
            linkedHashMap = this.LJII;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
        } else {
            linkedHashMap = (Map) this.LJIIIIZZ.getValue();
        }
        if (!C343780Ddo.LIZIZ()) {
            arrayListLJ = LJ();
        }
        HashMap map = new HashMap();
        int size = arrayListLJ.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(arrayListLJ, i);
            TopTabProtocol topTabProtocolLIZLLL2 = LIZJ().LJIIIZ().LIZLLL(str2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Filter_Top_");
            sbLIZ.append(str2);
            sbLIZ.append("] ");
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            if (!linkedHashMap.isEmpty()) {
                List<String> list = (List) linkedHashMap.get(str2);
                if (list != null) {
                    z = true;
                    for (String str3 : list) {
                        C1565380qq0.LIZ.getClass();
                        EnumC1585940rNA enumC1585940rNA = (EnumC1585940rNA) ((Map) C1565380qq0.LIZJ.getValue()).get(str3);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(" rule:");
                        sbLIZ2.append(str3);
                        stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ2));
                        if (enumC1585940rNA != null) {
                            if (enumC1585940rNA.operatorInvoke()) {
                                linkedHashMap2.put(str3, Boolean.TRUE);
                                stringBuffer.append(",result:true");
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append('[');
                                sbLIZ3.append(str2);
                                sbLIZ3.append("] filterRules - ");
                                sbLIZ3.append(str3);
                                sbLIZ3.append(": ");
                                sbLIZ3.append(enumC1585940rNA);
                                sbLIZ3.append(" true");
                                C2188811AlT.LIZIZ(sbLIZ3);
                            } else {
                                linkedHashMap2.put(str3, Boolean.FALSE);
                                stringBuffer.append(",result:false");
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append('[');
                                sbLIZ4.append(str2);
                                sbLIZ4.append("] filterRules - ");
                                sbLIZ4.append(str3);
                                sbLIZ4.append(": ");
                                sbLIZ4.append(enumC1585940rNA);
                                sbLIZ4.append(" false ");
                                C2188811AlT.LIZIZ(sbLIZ4);
                                z = false;
                            }
                        }
                    }
                } else {
                    z = true;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(",final result:");
                sbLIZ5.append(z);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ5));
                if (z) {
                    if (topTabProtocolLIZLLL2 != null) {
                        arrayList4.add(topTabProtocolLIZLLL2);
                        arrayList3.add(str2);
                        topTabProtocolLIZLLL2.LJIIIIZZ();
                    }
                } else if (topTabProtocolLIZLLL2 != null) {
                    topTabProtocolLIZLLL2.LJIIIIZZ();
                }
            } else {
                stringBuffer.append(",final result:true,no filter");
                if (topTabProtocolLIZLLL2 != null) {
                    arrayList4.add(topTabProtocolLIZLLL2);
                    arrayList3.add(str2);
                    topTabProtocolLIZLLL2.LJIIIIZZ();
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                map.put(str2, linkedHashMap2);
            }
            HomePageTabCompatService homePageTabCompatService2 = C1585280rM6.LIZ;
            C1585280rM6.LIZLLL(stringBuffer.toString());
        }
        C1585280rM6.LJIIIIZZ.putAll(map);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("FilterResult[topTab]:");
        sbLIZ6.append(arrayList3);
        C1585280rM6.LIZJ(C2188811AlT.LIZIZ(sbLIZ6));
        if (C343780Ddo.LIZIZ()) {
            arrayList = arrayList3;
            arrayList2 = arrayList4;
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @Override // X.AbstractC1585310rM9
    public final Pair<Boolean, EnumC1585290rM7> LIZ() {
        TopTab topTabLIZ;
        if (C343780Ddo.LIZIZ()) {
            C0CXN.LIZ.getClass();
            topTabLIZ = C0CXN.LIZJ().topTab;
        } else {
            topTabLIZ = C343730Ddj.LIZ();
        }
        this.LIZLLL = null;
        this.LJII = C343780Ddo.LIZ() ? null : new LinkedHashMap();
        ArrayList<String> arrayList = new ArrayList<>();
        if (topTabLIZ != null) {
            ArrayList<TopTabItem> arrayList2 = topTabLIZ.topTabList;
            boolean z = false;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList<TopTabItem> arrayList3 = topTabLIZ.topTabList;
                if (arrayList3 != null) {
                    z = false;
                    for (TopTabItem topTabItem : arrayList3) {
                        String str = topTabItem.topTabKey;
                        if (str == null || str.length() == 0) {
                            return new Pair<>(Boolean.FALSE, EnumC1585290rM7.TOP_TAB_CONFIG_INVALID);
                        }
                        if (C343780Ddo.LIZIZ()) {
                            ArrayList arrayList4 = new ArrayList();
                            Map<String, Boolean> map = topTabItem.filterRules;
                            if (map != null) {
                                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                                    String key = entry.getKey();
                                    if (entry.getValue().booleanValue()) {
                                        arrayList4.add(key);
                                    }
                                }
                            }
                            Map<String, List<String>> map2 = this.LJII;
                            if (map2 != null) {
                                map2.put(topTabItem.topTabKey, arrayList4);
                            }
                        }
                        if (Intrinsics.LJFF(topTabItem.topTabKey, EnumC1584360rKc.HOT.getKey())) {
                            z = true;
                        }
                        arrayList.add(topTabItem.topTabKey);
                    }
                }
                IFcpAppDiffProtocol.LIZ.getClass();
                C1585540rMW.LIZIZ.getValue().LIZJ();
                if (!z) {
                    return new Pair<>(Boolean.FALSE, EnumC1585290rM7.MISS_FYP);
                }
                this.LIZLLL = arrayList;
                return new Pair<>(Boolean.TRUE, null);
            }
        }
        return new Pair<>(Boolean.FALSE, EnumC1585290rM7.TOP_TAB_CONFIG_INVALID);
    }

    @Override // X.AbstractC1585310rM9
    public final EnumC1585100rLo LIZLLL() {
        return EnumC1585100rLo.TOP_TAB;
    }

    @Override // X.AbstractC1585310rM9
    public final List<String> LIZIZ(boolean z) {
        Pair<List<String>, List<TopTabProtocol>> pairLJFF = LJFF();
        List<String> first = pairLJFF.getFirst();
        List<TopTabProtocol> second = pairLJFF.getSecond();
        if (z) {
            this.LJI = second;
        }
        return first;
    }
}
