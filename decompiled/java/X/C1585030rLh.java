package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585030rLh {
    public static Entrance LIZ;
    public static Entrance LIZIZ;
    public static SlidePage LIZJ;
    public static Boolean LIZLLL;
    public static Boolean LJ;
    public static Boolean LJFF;
    public static final TabConfig LJI = new TabConfig(Boolean.TRUE, null, null, null, null, null, null, null);
    public static final C01GW LJII = C452501pT.LIZIZ(new C0CTV());
    public static int LJIIIIZZ;

    public static SlidePage LJIIIZ() {
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            return null;
        }
        if (LIZJ == null) {
            SlidePage slidePage = (SlidePage) C1585040rLi.LIZIZ.getValue();
            if (slidePage != null) {
                SlidePageItem slidePageItemLJI = slidePage.left;
                SlidePageItem slidePageItemLJI2 = slidePage.right;
                if (slidePageItemLJI != null) {
                    slidePageItemLJI = LJI(slidePageItemLJI);
                }
                if (slidePageItemLJI2 != null) {
                    slidePageItemLJI2 = LJI(slidePageItemLJI2);
                }
                slidePage = new SlidePage(slidePageItemLJI, slidePageItemLJI2);
            }
            LIZJ = slidePage;
        }
        return LIZJ;
    }

    public static TabConfig LJIIJJI() {
        return (TabConfig) LJII.getValue();
    }

    public static boolean LJIIL() {
        TabConfig tabConfigLJIIJJI;
        Integer num;
        C0CXL.LIZ.getClass();
        return C0CXL.LIZIZ() && (tabConfigLJIIJJI = LJIIJJI()) != null && (num = tabConfigLJIIJJI.expectedBottomSize) != null && num.intValue() == 6;
    }

    public static boolean LJIILJJIL() {
        C0CXL.LIZ.getClass();
        if (C0CXL.LIZIZ()) {
            return false;
        }
        C0CXE.LIZ.getClass();
        if (C0CXE.LIZ()) {
            return false;
        }
        C0CXC.LIZ.getClass();
        return !C0CXC.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILL() {
        /*
            X.0CXE r0 = X.C0CXE.LIZ
            r0.getClass()
            boolean r0 = X.C0CXE.LIZ()
            java.lang.String r3 = "USER"
            r4 = 1
            r2 = -1
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.experiment.Entrance r0 = LJ()
            if (r0 == 0) goto L32
            java.util.List<com.ss.android.ugc.aweme.experiment.Candidate> r0 = r0.candidates
            if (r0 == 0) goto L32
            java.util.Iterator r1 = r0.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.experiment.Candidate r0 = (com.ss.android.ugc.aweme.experiment.Candidate) r0
            java.lang.String r0 = r0.entranceKey
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L1d
        L31:
            return r4
        L32:
            com.ss.android.ugc.aweme.experiment.Entrance r0 = LJII()
            if (r0 == 0) goto L55
            java.util.List<com.ss.android.ugc.aweme.experiment.Candidate> r0 = r0.candidates
            if (r0 == 0) goto L55
            java.util.Iterator r1 = r0.iterator()
        L40:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.experiment.Candidate r0 = (com.ss.android.ugc.aweme.experiment.Candidate) r0
            java.lang.String r0 = r0.entranceKey
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L40
            return r4
        L55:
            int r0 = LJIIJ(r3)
            if (r0 != r2) goto L31
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1585030rLh.LJIILL():boolean");
    }

    public static boolean LJIILLIIL() {
        List<Candidate> list;
        List<Candidate> list2;
        C0CXC.LIZ.getClass();
        if (!C0CXC.LIZIZ()) {
            return false;
        }
        Entrance entranceLJ = LJ();
        if (entranceLJ != null && (list2 = entranceLJ.candidates) != null) {
            Iterator<Candidate> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(it2.next().entranceKey, "USER")) {
                    return true;
                }
            }
        }
        Entrance entranceLJII = LJII();
        if (entranceLJII == null || (list = entranceLJII.candidates) == null) {
            return false;
        }
        Iterator<Candidate> it3 = list.iterator();
        while (it3.hasNext()) {
            if (TextUtils.equals(it3.next().entranceKey, "USER")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJJ() {
        SlidePage slidePage = (SlidePage) C1585040rLi.LIZIZ.getValue();
        if (slidePage == null) {
            return false;
        }
        SlidePageItem slidePageItem = slidePage.left;
        if (slidePageItem != null && slidePageItem.landingPage == null) {
            return true;
        }
        SlidePageItem slidePageItem2 = slidePage.right;
        return slidePageItem2 != null && slidePageItem2.landingPage == null;
    }

    public static boolean LJIL() {
        C0CXC.LIZ.getClass();
        return C0CXC.LIZIZ() && LJIILLIIL();
    }

    public static boolean LJJ() {
        SlidePage slidePageLJIIIZ;
        C0CXE.LIZ.getClass();
        return C0CXE.LIZ() && C0CXE.LIZ() && (slidePageLJIIIZ = LJIIIZ()) != null && slidePageLJIIIZ.left != null;
    }

    public static boolean LJJI() {
        SlidePage slidePageLJIIIZ;
        C0CXE.LIZ.getClass();
        return C0CXE.LIZ() && C0CXE.LIZ() && (slidePageLJIIIZ = LJIIIZ()) != null && slidePageLJIIIZ.right != null;
    }

    public static boolean LIZIZ() {
        Entrance entrance;
        List<Candidate> list;
        if (LJIILJJIL()) {
            return false;
        }
        Boolean bool = LJFF;
        if (bool != null) {
            return bool.booleanValue();
        }
        TabConfig tabConfigLJIIJJI = LJIIJJI();
        if (tabConfigLJIIJJI != null && (entrance = tabConfigLJIIJJI.leftEntrance) != null && (list = entrance.candidates) != null) {
            Iterator<Candidate> it2 = list.iterator();
            while (it2.hasNext()) {
                Candidate next = it2.next();
                if (Intrinsics.LJFF(next != null ? next.entranceKey : null, EnumC1584350rKb.SEARCH.getTag())) {
                    LJFF = Boolean.TRUE;
                    return true;
                }
            }
        }
        LJFF = Boolean.FALSE;
        return false;
    }

    public static boolean LIZJ() {
        List<BottomTab> list;
        if (LJIILJJIL()) {
            return false;
        }
        Boolean bool = LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        Map mapLIZLLL = LIZLLL();
        int i = 0;
        do {
            if (mapLIZLLL != null && (list = (List) mapLIZLLL.get(String.valueOf(i))) != null) {
                for (BottomTab bottomTab : list) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("feedTabPlateFormHasTab:  ");
                    sbLIZ.append(bottomTab != null ? bottomTab.bottomTabKey : null);
                    sbLIZ.append(' ');
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (Intrinsics.LJFF(bottomTab != null ? bottomTab.bottomTabKey : null, EnumC1584360rKc.MALL.getKey())) {
                        LIZLLL = Boolean.TRUE;
                        return true;
                    }
                }
            }
            i++;
        } while (i < 6);
        LIZLLL = Boolean.FALSE;
        return false;
    }

    public static Map LIZLLL() {
        TabConfig tabConfigLJIIJJI;
        if (LJIILJJIL() || (tabConfigLJIIJJI = LJIIJJI()) == null) {
            return null;
        }
        return tabConfigLJIIJJI.bottomTab;
    }

    public static Entrance LJ() {
        Entrance entrance;
        if (LJIILJJIL()) {
            return null;
        }
        if (LIZ == null) {
            TabConfig tabConfigLJIIJJI = LJIIJJI();
            if (tabConfigLJIIJJI == null || (entrance = tabConfigLJIIJJI.leftEntrance) == null) {
                return null;
            }
            LIZ = LJFF(entrance);
        }
        return LIZ;
    }

    public static Entrance LJII() {
        Entrance entrance;
        if (LJIILJJIL()) {
            return null;
        }
        if (LIZIZ == null) {
            TabConfig tabConfigLJIIJJI = LJIIJJI();
            if (tabConfigLJIIJJI == null || (entrance = tabConfigLJIIJJI.rightEntrance) == null) {
                return null;
            }
            LIZIZ = LJFF(entrance);
        }
        return LIZIZ;
    }

    public static int LJIIIIZZ() {
        if (!LJIIL()) {
            return 2;
        }
        int i = LJIIIIZZ;
        if (i != 0) {
            return i;
        }
        Map mapLIZLLL = LIZLLL();
        if (mapLIZLLL != null) {
            int size = mapLIZLLL.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<BottomTab> list = (List) mapLIZLLL.get(String.valueOf(i2));
                if (list != null) {
                    for (BottomTab bottomTab : list) {
                        if (Intrinsics.LJFF(bottomTab != null ? bottomTab.bottomTabKey : null, EnumC1584360rKc.SHOOT.getKey())) {
                            LJIIIIZZ = i2;
                            return i2;
                        }
                    }
                }
            }
        }
        return 2;
    }

    public static boolean LJIILIIL() {
        Map<String, ArrayList<BottomTab>> map;
        TabConfig tabConfigLJIIJJI = LJIIJJI();
        if (tabConfigLJIIJJI == null || (map = tabConfigLJIIJJI.bottomTab) == null || map.size() < 5) {
            return true;
        }
        int i = 0;
        do {
            ArrayList<BottomTab> arrayList = map.get(String.valueOf(i));
            if (arrayList != null) {
                Iterator<BottomTab> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (it2.next().bottomTabKey == null) {
                        return true;
                    }
                }
            }
            i++;
        } while (i < 5);
        return false;
    }

    public static boolean LJIIZILJ() {
        Entrance entrance;
        TabConfig tabConfigLJIIJJI;
        Entrance entrance2;
        List<Candidate> list;
        Candidate candidate;
        String str;
        List<Candidate> list2;
        Candidate candidate2;
        String str2;
        TabConfig tabConfigLJIIJJI2 = LJIIJJI();
        return tabConfigLJIIJJI2 == null || (entrance = tabConfigLJIIJJI2.leftEntrance) == null || (tabConfigLJIIJJI = LJIIJJI()) == null || (entrance2 = tabConfigLJIIJJI.rightEntrance) == null || (list = entrance.candidates) == null || (candidate = (Candidate) C13LP.LJJJJZI(list)) == null || (str = candidate.entranceKey) == null || str.length() == 0 || (list2 = entrance2.candidates) == null || (candidate2 = (Candidate) C13LP.LJJJJZI(list2)) == null || (str2 = candidate2.entranceKey) == null || str2.length() == 0;
    }

    public static boolean LJIJJLI() {
        TopTab topTab;
        ArrayList<TopTabItem> arrayList;
        TabConfig tabConfigLJIIJJI = LJIIJJI();
        if (tabConfigLJIIJJI == null || (topTab = tabConfigLJIIJJI.topTab) == null || (arrayList = topTab.topTabList) == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<TopTabItem> it2 = topTab.topTabList.iterator();
        while (it2.hasNext()) {
            String str = it2.next().topTabKey;
            if (str == null || a0.LJJJIL(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (X.C0CXC.LIZIZ() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(boolean r9) {
        /*
            X.0CXE r0 = X.C0CXE.LIZ
            r0.getClass()
            boolean r0 = X.C0CXE.LIZ()
            r8 = 0
            if (r0 != 0) goto L25
            if (r9 != 0) goto L24
            X.0CXL r0 = X.C0CXL.LIZ
            r0.getClass()
            boolean r0 = X.C0CXL.LIZIZ()
            if (r0 != 0) goto L25
            X.0CXC r0 = X.C0CXC.LIZ
            r0.getClass()
            boolean r0 = X.C0CXC.LIZIZ()
            if (r0 != 0) goto L25
        L24:
            return r8
        L25:
            java.lang.Boolean r0 = X.C1585030rLh.LJ
            if (r0 == 0) goto L2e
            boolean r0 = r0.booleanValue()
            return r0
        L2e:
            java.util.Map r7 = LIZLLL()
            if (r7 == 0) goto L8f
            int r6 = r7.size()
            r5 = 0
        L39:
            if (r5 >= r6) goto L8b
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r7.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L88
            java.util.Iterator r4 = r0.iterator()
        L4b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.experiment.BottomTab r3 = (com.ss.android.ugc.aweme.experiment.BottomTab) r3
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "feedTabPlatformHasFriendsTab:  "
            r2.append(r0)
            r1 = 0
            if (r3 == 0) goto L86
            java.lang.String r0 = r3.bottomTabKey
        L65:
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
            if (r3 == 0) goto L74
            java.lang.String r1 = r3.bottomTabKey
        L74:
            X.0rKc r0 = X.EnumC1584360rKc.FRIENDS
            java.lang.String r0 = r0.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C1585030rLh.LJ = r0
            r0 = 1
            return r0
        L86:
            r0 = r1
            goto L65
        L88:
            int r5 = r5 + 1
            goto L39
        L8b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C1585030rLh.LJ = r0
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1585030rLh.LIZ(boolean):boolean");
    }

    public static Entrance LJFF(Entrance entrance) {
        List listLLIIII;
        List<Candidate> list = entrance.candidates;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Candidate candidateLIZ : list) {
                if (Intrinsics.LJFF(candidateLIZ.entranceKey, EnumC1584360rKc.PROFILE.getKey())) {
                    candidateLIZ = Candidate.LIZ(candidateLIZ, EnumC1584350rKb.MY_PROFILE.getTag());
                } else if (Intrinsics.LJFF(candidateLIZ.entranceKey, EnumC1584360rKc.INBOX.getKey())) {
                    candidateLIZ = Candidate.LIZ(candidateLIZ, "NOTIFICATION");
                }
                arrayList.add(candidateLIZ);
            }
            listLLIIII = C13LP.LLIIII(arrayList);
        } else {
            listLLIIII = null;
        }
        return new Entrance(entrance.showLimit, listLLIIII);
    }

    public static SlidePageItem LJI(SlidePageItem slidePageItem) {
        String tag = slidePageItem.landingPage;
        if (Intrinsics.LJFF(tag, EnumC1584360rKc.PROFILE.getKey())) {
            tag = EnumC1584350rKb.MY_PROFILE.getTag();
        } else if (Intrinsics.LJFF(tag, EnumC1584360rKc.INBOX.getKey())) {
            tag = "NOTIFICATION";
        }
        return new SlidePageItem(tag, slidePageItem.scope, slidePageItem.firstSlidePopup);
    }

    public static int LJIIJ(String str) {
        String str2;
        SlidePageItem slidePageItem;
        SlidePageItem slidePageItem2;
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            return -1;
        }
        SlidePage slidePageLJIIIZ = LJIIIZ();
        String str3 = null;
        if (slidePageLJIIIZ != null && (slidePageItem2 = slidePageLJIIIZ.right) != null) {
            str2 = slidePageItem2.landingPage;
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str, str2)) {
            return 1;
        }
        SlidePage slidePageLJIIIZ2 = LJIIIZ();
        if (slidePageLJIIIZ2 != null && (slidePageItem = slidePageLJIIIZ2.left) != null) {
            str3 = slidePageItem.landingPage;
        }
        if (!TextUtils.equals(str, str3)) {
            return -1;
        }
        return 0;
    }

    public static boolean LJIJ(String str) {
        if (LJIIJ(str) == -1) {
            return true;
        }
        return false;
    }

    public static boolean LJIJI(String str) {
        int iLJIIJ = LJIIJ(str);
        if (iLJIIJ == 0 || iLJIIJ == 1) {
            return true;
        }
        return false;
    }
}
