package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.BackConfig;
import com.ss.android.ugc.aweme.experiment.BackupBottomTabConfig;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585230rM1 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJII;
    public final List<String> LIZ = new ArrayList();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1585350rMD(this));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1585520rMU());
    public final C1585650rMh LIZLLL = new C1585650rMh(new C1585430rML(this));
    public Boolean LJ;
    public Boolean LJFF;
    public ExecutorService LJI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1585230rM1.class, "fcpDataLegal", "getFcpDataLegal()Z", 0);
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final void LJFF() {
        if (this.LJFF == null) {
            this.LJFF = Boolean.valueOf(LJ(false) || LIZ() || LJIIL());
        }
    }

    public final void LJI() {
        if (this.LJFF == null) {
            C1582020rGq.LIZJ("scene_final_show_duplicate_for_preload");
            synchronized (this) {
                try {
                    if (this.LJFF == null) {
                        boolean z = true;
                        if (!LJ(true) && !LIZ() && !LJIIL()) {
                            z = false;
                        }
                        this.LJFF = Boolean.valueOf(z);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1582020rGq.LIZ("scene_final_show_duplicate_for_preload");
        }
    }

    public final C1585370rMF LJIIIIZZ() {
        return (C1585370rMF) this.LIZIZ.getValue();
    }

    public final C1585200rLy LJIIIZ() {
        return (C1585200rLy) this.LIZJ.getValue();
    }

    public final boolean LJIIJ() {
        if (!((Boolean) this.LIZLLL.getValue(this, LJII[0])).booleanValue()) {
            return false;
        }
        Boolean bool = this.LJFF;
        return bool == null || !bool.booleanValue();
    }

    public final boolean LIZ() {
        C1585250rM3 c1585250rM3LIZ = LJIIIIZZ().LIZ();
        List<String> list = LJIIIIZZ().LIZIZ().get(LJIIIIZZ().LIZ().toString());
        int size = list != null ? list.size() : 0;
        c1585250rM3LIZ.getClass();
        boolean z = !(size == 5);
        if (z) {
            HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
            C1585280rM6.LIZ(EnumC1585320rMA.FINAL_CHECK, null, EnumC1585100rLo.BOTTOM_TAB, EnumC1585290rM7.BOTTOM_TAB_SIZE_ERROR);
        }
        return z;
    }

    public final boolean LJIIJJI() {
        TabConfig tabConfigLIZIZ;
        BackupBottomTabConfig backupBottomTabConfig;
        if (C343780Ddo.LIZIZ()) {
            C0CXN.LIZ.getClass();
            tabConfigLIZIZ = C0CXN.LIZJ();
        } else {
            tabConfigLIZIZ = C343730Ddj.LIZIZ();
        }
        if (tabConfigLIZIZ != null ? Intrinsics.LJFF(tabConfigLIZIZ.isJsonIllegal, Boolean.TRUE) : false) {
            HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
            C1585280rM6.LIZ(EnumC1585320rMA.PRE_CHECK, null, null, EnumC1585290rM7.JSON_PARSE_ERROR);
            return false;
        }
        for (AbstractC1585310rM9 abstractC1585310rM9 : (Set) LJIIIIZZ().LJ.getValue()) {
            Pair<Boolean, EnumC1585290rM7> pairLIZ = abstractC1585310rM9.LIZ();
            boolean zBooleanValue = pairLIZ.getFirst().booleanValue();
            EnumC1585290rM7 second = pairLIZ.getSecond();
            if (!zBooleanValue) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TabProcessManager toCheck>>> operator:");
                sbLIZ.append(abstractC1585310rM9);
                sbLIZ.append(",reason:");
                sbLIZ.append(second);
                System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                if (second != null) {
                    HomePageTabCompatService homePageTabCompatService2 = C1585280rM6.LIZ;
                    C1585280rM6.LIZ(EnumC1585320rMA.PRE_CHECK, null, abstractC1585310rM9.LIZLLL(), second);
                }
                return false;
            }
        }
        if (C1564470qoX.LIZ()) {
            C1585380rMG c1585380rMG = (C1585380rMG) LJIIIIZZ().LIZLLL.getValue();
            Boolean bool = c1585380rMG.LIZIZ;
            if (bool == null) {
                C0CXN.LIZ.getClass();
                BackConfig backConfig = C0CXN.LIZJ().backupConfig;
                if (backConfig == null || (backupBottomTabConfig = backConfig.bottom2Tab) == null) {
                    bool = Boolean.FALSE;
                    c1585380rMG.LIZIZ = bool;
                } else {
                    String str = backupBottomTabConfig.topTab;
                    String str2 = backupBottomTabConfig.expectedToCover;
                    if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                        bool = Boolean.FALSE;
                        c1585380rMG.LIZIZ = bool;
                    } else {
                        c1585380rMG.LIZJ = str;
                        c1585380rMG.LIZLLL = str2;
                        bool = Boolean.TRUE;
                        c1585380rMG.LIZIZ = bool;
                    }
                }
            }
            this.LJ = bool;
        }
        return true;
    }

    public final boolean LJIIL() {
        List<String> list = LJIIIIZZ().LIZIZ().get(((AbstractC1585310rM9) LJIIIIZZ().LIZ.getValue()).toString());
        boolean z = !(list != null && list.contains(EnumC1584360rKc.HOT.getKey()));
        if (z) {
            HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
            C1585280rM6.LIZ(EnumC1585320rMA.FINAL_CHECK, null, EnumC1585100rLo.TOP_TAB, EnumC1585290rM7.MISS_FYP);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> LIZJ(int i) {
        boolean z;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> second;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && LJII((AbstractC1585310rM9) LJIIIIZZ().LIZJ.getValue())) {
                    HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
                    C1585280rM6.LIZ(null, EnumC1585880rN4.UPDATE, EnumC1585100rLo.TOP_ICON, EnumC1585290rM7.TAB_DUPLICATE);
                    return null;
                }
            } else {
                LJFF();
            }
        } else {
            LJI();
        }
        C1585240rM2 c1585240rM2 = (C1585240rM2) LJIIIIZZ().LIZJ.getValue();
        if (i != 3) {
            z = true;
        } else {
            z = false;
        }
        c1585240rM2.getClass();
        if (c1585240rM2.LJIIJ != null && !c1585240rM2.LIZJ().LJIIJ()) {
            c1585240rM2.LJIIJ = null;
        }
        if (((Number) C259220ADw.LIZ.getValue()).intValue() == 0) {
            if (z) {
                Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair = c1585240rM2.LJIIJ;
                second = pair;
                if (pair == null) {
                    second = c1585240rM2.LJI().getSecond();
                }
            } else {
                second = c1585240rM2.LJI().getSecond();
            }
        } else {
            Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair2 = c1585240rM2.LJIIJ;
            second = pair2;
            if (pair2 == null) {
                second = c1585240rM2.LJI().getSecond();
            }
        }
        c1585240rM2.LJIIJ = null;
        return second;
    }

    public final boolean LJ(boolean z) {
        String str;
        C1585230rM1 c1585230rM1;
        C1585200rLy c1585200rLyLJIIIZ;
        boolean z2 = true;
        if (!LJIIJ()) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = 0;
        List<String> list = null;
        List<String> list2 = null;
        for (AbstractC1585310rM9 abstractC1585310rM9 : (Set) LJIIIIZZ().LJ.getValue()) {
            List<String> listLIZIZ = abstractC1585310rM9.LIZIZ(z);
            LJIIIIZZ().LIZIZ().put(abstractC1585310rM9.toString(), listLIZIZ);
            if (abstractC1585310rM9 instanceof C1585260rM4) {
                list = listLIZIZ;
            } else if (abstractC1585310rM9 instanceof C1585250rM3) {
                list2 = listLIZIZ;
            }
            HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finalShowDuplicateCheck: ");
            sbLIZ.append(listLIZIZ);
            C1585280rM6.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("finalShowDuplicateCheck>>>finalShowSet:");
            sbLIZ2.append(listLIZIZ);
            sbLIZ2.append(",T:");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C1585280rM6.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            size += listLIZIZ.size();
            linkedHashSet.addAll(listLIZIZ);
        }
        if (size != linkedHashSet.size()) {
            HomePageTabCompatService homePageTabCompatService2 = C1585280rM6.LIZ;
            C1585280rM6.LIZ(EnumC1585320rMA.FINAL_CHECK, null, null, EnumC1585290rM7.TAB_DUPLICATE);
            System.out.println((Object) "TabProcessManager finalShowDuplicateCheck>>> hasDup=true ");
            return true;
        }
        Boolean bool = this.LJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && C1564470qoX.LIZ()) {
            C1585380rMG c1585380rMG = (C1585380rMG) LJIIIIZZ().LIZLLL.getValue();
            c1585380rMG.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str2 = c1585380rMG.LIZJ;
            C1585230rM1 c1585230rM12 = c1585380rMG.LIZ;
            if (Intrinsics.LJFF(c1585380rMG.LIZIZ, bool2) && str2 != null && str2.length() != 0 && (str = c1585380rMG.LIZLLL) != null && str.length() != 0 && c1585230rM12 != null && list != null && list2 != null && C13LP.LJJJJ(c1585380rMG.LIZJ, list) && list2.size() >= 2 && Intrinsics.LJFF(ListProtector.get(list2, 1), c1585380rMG.LIZLLL) && (c1585230rM1 = c1585380rMG.LIZ) != null && (c1585200rLyLJIIIZ = c1585230rM1.LJIIIZ()) != null && c1585200rLyLJIIIZ.LIZ(c1585380rMG.LIZJ) != null) {
                int size2 = list.size() - list.indexOf(str2);
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                String str3 = c1585380rMG.LIZLLL;
                c1584320rKY.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Replace ");
                sbLIZ3.append(str3);
                sbLIZ3.append(" with ");
                sbLIZ3.append(str2);
                sbLIZ3.append(" from top_");
                sbLIZ3.append(size2);
                sbLIZ3.append("tab to bottom_2tab");
                C1584320rKY.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ3);
                list.remove(str2);
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    TopTabProtocol topTabProtocolLIZLLL = c1585230rM12.LJIIIZ().LIZLLL(it2.next());
                    if (topTabProtocolLIZLLL != null) {
                        arrayList.add(topTabProtocolLIZLLL);
                    }
                }
                ListProtector.set(list2, 1, str2);
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    BottomTabProtocol bottomTabProtocolLIZ = c1585230rM12.LJIIIZ().LIZ(it3.next());
                    if (bottomTabProtocolLIZ != null) {
                        arrayList2.add(bottomTabProtocolLIZ);
                    }
                }
                c1585380rMG.LJFF = arrayList2;
                c1585380rMG.LJ = arrayList;
                C1585070rLl.LIZ.getClass();
                CopyOnWriteArrayList<String> copyOnWriteArrayList = C1585070rLl.LJ;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(list);
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = C1585070rLl.LJFF;
                copyOnWriteArrayList2.clear();
                copyOnWriteArrayList2.addAll(list2);
            } else {
                z2 = false;
                C1584320rKY.LIZ.getClass();
                C1584320rKY.LJIIIZ = null;
            }
            C1585070rLl.LIZ.getClass();
            C1585070rLl.LJI = Boolean.valueOf(z2);
            if (z2) {
                Iterator it4 = ((ArrayList) C1563800qnS.LIZ).iterator();
                while (it4.hasNext()) {
                    ((C1563810qnT) it4.next()).LIZ.invoke();
                }
                ((ArrayList) C1563800qnS.LIZ).clear();
            } else {
                ((ArrayList) C1563800qnS.LIZ).clear();
                return false;
            }
        }
        return false;
    }

    public final boolean LJII(AbstractC1585310rM9 abstractC1585310rM9) {
        List<String> list;
        List<String> list2;
        List<String> value;
        if (!LJIIJ()) {
            return false;
        }
        List<String> listLIZIZ = abstractC1585310rM9.LIZIZ(false);
        if (LJIIIIZZ().LIZIZ().keySet().size() == ((Set) LJIIIIZZ().LJ.getValue()).size()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = 0;
            for (Map.Entry<String, List<String>> entry : LJIIIIZZ().LIZIZ().entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), abstractC1585310rM9.toString())) {
                    value = listLIZIZ;
                } else {
                    value = entry.getValue();
                }
                size += value.size();
                linkedHashSet.addAll(value);
                HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("finalShowDuplicateForUpdate: ");
                sbLIZ.append(value);
                C1585280rM6.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("finalShowDuplicateForUpdate>>>list:");
                sbLIZ2.append(value);
                sbLIZ2.append(",T:");
                sbLIZ2.append(C786410Ut5.u3().getName());
                C1585280rM6.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C1585070rLl.LIZ.getClass();
            if (Intrinsics.LJFF(C1585070rLl.LJI, Boolean.TRUE)) {
                EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
                if (listLIZIZ.contains(enumC1584360rKc.getKey()) && (list2 = LJIIIIZZ().LIZIZ().get("BottomTabOperator")) != null && list2.contains(enumC1584360rKc.getKey())) {
                    listLIZIZ.remove(enumC1584360rKc.getKey());
                    size--;
                }
            }
            List<String> list3 = null;
            if (size != linkedHashSet.size()) {
                HomePageTabCompatService homePageTabCompatService2 = C1585280rM6.LIZ;
                C1585280rM6.LIZ(EnumC1585320rMA.FINAL_CHECK, null, null, EnumC1585290rM7.TAB_DUPLICATE);
                System.out.println((Object) "TabProcessManager finalShowDuplicateForUpdate>>> hasDup=true ");
                return true;
            }
            LJIIIIZZ().LIZIZ().put(abstractC1585310rM9.toString(), listLIZIZ);
            List<String> list4 = LJIIIIZZ().LIZIZ().get(((AbstractC1585310rM9) LJIIIIZZ().LIZ.getValue()).toString());
            if (C19719512Dh.LJI(list4)) {
                list = list4;
            } else {
                list = null;
            }
            List<String> list5 = LJIIIIZZ().LIZIZ().get(LJIIIIZZ().LIZ().toString());
            if (C19719512Dh.LJI(list5)) {
                list3 = list5;
            }
            if (list != null && !list.isEmpty() && list3 != null && !list3.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = C1585070rLl.LJ;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(list);
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = C1585070rLl.LJFF;
                copyOnWriteArrayList2.clear();
                copyOnWriteArrayList2.addAll(list3);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        r2 = new com.ss.android.ugc.aweme.hometab.base.TopTabNode(r10, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LIZLLL(X.C19EG r10, int r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1585230rM1.LIZLLL(X.19EG, int):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[LOOP:0: B:43:0x00cd->B:45:0x00d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.util.List<X.InterfaceC1583870rJp>, java.util.List<com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol>> LIZIZ(X.C19EG r15, X.InterfaceC665370Q7z r16, int r17) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1585230rM1.LIZIZ(X.19EG, X.0Q7z, int):kotlin.Pair");
    }
}
