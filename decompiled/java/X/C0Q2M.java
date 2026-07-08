package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2M {
    public static boolean LJII;
    public static final C0Q2M LIZ = new C0Q2M();
    public static final Map<String, C0Q2N> LIZIZ = new LinkedHashMap();
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final List<List<String>> LIZLLL = Collections.synchronizedList(new ArrayList());
    public static final List<List<String>> LJ = Collections.synchronizedList(new ArrayList());
    public static final List<String> LJFF = Collections.synchronizedList(new ArrayList());
    public static String LJI = "";
    public static final Map<String, List<C0PJQ>> LJIIIIZZ = new LinkedHashMap();
    public static final Map<String, Set<Integer>> LJIIIZ = new LinkedHashMap();

    public static void LJ() {
        LIZLLL.clear();
        LJ.clear();
        LJFF.clear();
        LJII = false;
    }

    public static String LJIIL() {
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null) {
            return LJIIJ(c650960Pg6LIZJ.searchVideoModel.groupId, c650960Pg6LIZJ.searchCommonModel.enterFrom);
        }
        return null;
    }

    public static boolean LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIZILJ());
        sbLIZ.append(((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, List<C0PJQ>> map = LJIIIIZZ;
        List list = (List) ((LinkedHashMap) map).get(strLIZIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (jCurrentTimeMillis - ((C0PJQ) obj).LIZ <= 18000000) {
                    arrayList.add(obj);
                }
            }
        }
        if (!C19719512Dh.LJI(arrayList) || arrayList == null) {
            arrayList = new ArrayList();
        }
        map.put(strLIZIZ, arrayList);
        List list2 = (List) ((LinkedHashMap) LJIIIIZZ).get(strLIZIZ);
        return list2 != null && (list2.isEmpty() ^ true);
    }

    public static List LJIILIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIZILJ());
        sbLIZ.append(((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
        List list = (List) ((LinkedHashMap) LJIIIIZZ).get(C2188811AlT.LIZIZ(sbLIZ));
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0PJQ) it2.next()).LIZIZ);
        }
        return arrayList;
    }

    public static String LJIIZILJ() {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        return accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : "FAKE_USER";
    }

    public static Map LJIIIZ() {
        return LIZIZ;
    }

    public static Map LJIIJJI() {
        return LIZJ;
    }

    public static List LJIILJJIL() {
        return LJFF;
    }

    public static List LJIILL() {
        return LJ;
    }

    public static List LJIILLIIL() {
        return LIZLLL;
    }

    public static boolean LJIJI() {
        return LJII;
    }

    public static void LIZIZ(String str) {
        C0Q2N c0q2n;
        List<String> list;
        long j;
        Collection collection;
        if (str != null) {
            Map<String, C0Q2N> map = LIZIZ;
            if (map.containsKey(str)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                C0Q2N c0q2n2 = (C0Q2N) linkedHashMap.get(str);
                if (c0q2n2 != null) {
                    C0Q2N c0q2n3 = (C0Q2N) linkedHashMap.get(str);
                    if (c0q2n3 == null || (collection = c0q2n3.LJIIJ) == null) {
                        collection = C13BV.INSTANCE;
                    }
                    c0q2n2.LJIILIIL = new ArrayList(collection);
                }
                C0Q2N c0q2n4 = (C0Q2N) linkedHashMap.get(str);
                long j2 = 0;
                if (c0q2n4 != null) {
                    C0Q2N c0q2n5 = (C0Q2N) linkedHashMap.get(str);
                    if (c0q2n5 != null) {
                        j = c0q2n5.LJIJJLI;
                    } else {
                        j = 0;
                    }
                    c0q2n4.LJIL = j;
                }
                if (C1210604oS.LIZ() && !C1210504oR.LIZ() && (c0q2n = (C0Q2N) linkedHashMap.get(str)) != null && (list = c0q2n.LJIILIIL) != null && !list.isEmpty()) {
                    C0Q2M c0q2m = LIZ;
                    String str2 = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ;
                    C0Q2N c0q2n6 = (C0Q2N) linkedHashMap.get(str);
                    if (c0q2n6 != null) {
                        j2 = c0q2n6.LJIL;
                    }
                    c0q2m.getClass();
                    if (str2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(LJIIZILJ());
                        sbLIZ.append(str2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        List<C0PJQ> list2 = (List) ((LinkedHashMap) LJIIIIZZ).get(strLIZIZ);
                        ArrayList<C0PJQ> arrayList = new ArrayList();
                        if (list2 != null) {
                            for (C0PJQ c0pjq : list2) {
                                if (c0pjq.LIZ < j2) {
                                    arrayList.add(c0pjq);
                                }
                            }
                        }
                        Set set = (Set) ((LinkedHashMap) LJIIIZ).get(strLIZIZ);
                        for (C0PJQ c0pjq2 : arrayList) {
                            if (list2 != null) {
                                list2.remove(c0pjq2);
                            }
                            if (set != null) {
                                set.remove(Integer.valueOf(c0pjq2.LIZJ));
                            }
                        }
                    }
                }
                C0Q2N c0q2n7 = (C0Q2N) ((LinkedHashMap) LIZIZ).get(str);
                if (c0q2n7 != null) {
                    c0q2n7.LIZJ = CardStruct.IStatusCode.DEFAULT;
                }
            }
        }
    }

    public static void LIZJ(String str) {
        Set<String> set;
        List<String> list;
        Set<String> set2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        C0Q2N c0q2n = (C0Q2N) linkedHashMap.get(str);
        if (c0q2n != null && (set2 = c0q2n.LJIIIIZZ) != null) {
            set2.clear();
        }
        C0Q2N c0q2n2 = (C0Q2N) linkedHashMap.get(str);
        if (c0q2n2 != null && (list = c0q2n2.LJIIIZ) != null) {
            list.clear();
        }
        C0Q2N c0q2n3 = (C0Q2N) linkedHashMap.get(str);
        if (c0q2n3 != null && (set = c0q2n3.LJ) != null) {
            set.clear();
        }
    }

    public static final void LIZLLL(String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            LIZ.getClass();
            sbLIZ.append(LJIIZILJ());
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LJIIIIZZ.remove(strLIZIZ);
            LJIIIZ.remove(strLIZIZ);
        }
    }

    public static List LJFF(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Pair) it2.next()).getFirst());
            }
        }
        return arrayList;
    }

    public static List LJI(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static List LJII(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List list2 = (List) it2.next();
                ArrayList arrayList2 = new ArrayList();
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(Integer.valueOf(i));
                }
                arrayList.add(C13LP.LLIIII(arrayList2));
            }
        }
        return arrayList;
    }

    public static boolean LJIJ(String str) {
        C0Q2N c0q2n;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map<String, C0Q2N> map = LIZIZ;
        if (!map.containsKey(str)) {
            return false;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(str) == null || (c0q2n = (C0Q2N) linkedHashMap.get(str)) == null) {
            return false;
        }
        return c0q2n.LIZIZ;
    }

    public static String LJIJJ(List list) {
        if (list != null && !list.isEmpty()) {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Pair) it2.next()).getSecond());
            }
            return GsonProtectorUtils.toJson(gsonLIZLLL, arrayList);
        }
        return "[]";
    }

    public static void LJIJJLI(String str) {
        C0Q2N c0q2n;
        String strLJIIZILJ = LJIIZILJ();
        String strLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIZILJ);
        sbLIZ.append(strLJIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && !TextUtils.isEmpty(strLIZIZ) && (c0q2n = (C0Q2N) ((LinkedHashMap) LIZIZ).get(strLIZIZ)) != null) {
            List arrayList = (List) ((LinkedHashMap) c0q2n.LJIIJJI.LJIIIIZZ()).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C645810PUt) it2.next()).LIZIZ);
            }
            if (!arrayList2.isEmpty()) {
                c0q2n.LJIIL.clear();
                c0q2n.LJIIL.addAll(arrayList2);
            }
        }
    }

    public static String LJJ(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), collection);
        }
        return "[]";
    }

    public static void LJIIIIZZ(String str, boolean z) {
        C0Q2N c0q2n;
        if (str == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIZILJ());
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, C0Q2N> map = LIZIZ;
        if (!map.containsKey(strLIZIZ)) {
            map.put(strLIZIZ, new C0Q2N(null));
        }
        if (z && (c0q2n = (C0Q2N) ((LinkedHashMap) map).get(strLIZIZ)) != null) {
            c0q2n.LIZIZ = true;
        }
    }

    public static String LJIIJ(String str, String str2) {
        if (Intrinsics.LJFF("homepage_friends", str2) || Intrinsics.LJFF("discovery", str2)) {
            return LJI;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0253, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIL(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q2M.LJIL(java.lang.String, java.lang.String):boolean");
    }
}
