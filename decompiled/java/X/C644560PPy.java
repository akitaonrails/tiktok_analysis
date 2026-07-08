package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.appdiff.ISearchTabAppDiff;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.TabOrder;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchReorderAndChooseTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabCommonConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644560PPy {
    public static final C644560PPy LIZ = new C644560PPy();
    public static final List<SearchTabInfo> LIZIZ;
    public static final List<SearchTabInfo> LIZJ;
    public static final List<SearchTabInfo> LIZLLL;

    static {
        SearchTabConfig searchTabConfig;
        SearchTabCommonConfig searchTabCommonConfig;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        List<SearchTabInfo> list = C641930PFv.LIZLLL().tabList;
        ArrayList arrayList = new ArrayList();
        for (SearchTabInfo searchTabInfo : list) {
            SearchTabInfo searchTabInfo2 = searchTabInfo;
            if (!searchTabInfo2.buildByDynamicConfig || searchTabInfo2.canBuildByNative) {
                if (searchTabInfo2.tabName.length() > 0) {
                    arrayList.add(searchTabInfo);
                }
            } else if (C0QD9.LIZ().containsKey(searchTabInfo2.tabName) && (searchTabConfig = (SearchTabConfig) C0QD9.LIZ().get(searchTabInfo2.tabName)) != null && (searchTabCommonConfig = searchTabConfig.tabCommonConfig) != null && Intrinsics.LJFF(searchTabCommonConfig.isVisible(), Boolean.TRUE)) {
                arrayList.add(searchTabInfo);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listLIZ = arrayList;
        if (zIsEmpty) {
            listLIZ = C641930PFv.LIZ();
        }
        copyOnWriteArrayList.addAll(listLIZ);
        LIZIZ = copyOnWriteArrayList;
        LIZ.getClass();
        LIZJ = LIZ(null);
        LIZLLL = LIZ(null);
    }

    public static int LJIIIZ() {
        return LJIJI(EnumC669620QOi.HASHTAG);
    }

    public static int LJIIL() {
        return LJIJI(EnumC669620QOi.LIVE);
    }

    public static int LJIILJJIL() {
        return LJIJI(EnumC669620QOi.PHOTO);
    }

    public static final int LJIILL() {
        C644560PPy c644560PPy = LIZ;
        EnumC669620QOi enumC669620QOi = EnumC669620QOi.PLACE;
        c644560PPy.getClass();
        return LJIJI(enumC669620QOi);
    }

    public static int LJIIZILJ() {
        return LJIJI(EnumC669620QOi.SHOP);
    }

    public static int LJIJ() {
        return LJIJI(EnumC669620QOi.SOUND);
    }

    public static final int LJIJJLI() {
        C644560PPy c644560PPy = LIZ;
        EnumC669620QOi enumC669620QOi = EnumC669620QOi.TOP;
        c644560PPy.getClass();
        return LJIJI(enumC669620QOi);
    }

    public static int LJIL() {
        return LJIJI(EnumC669620QOi.USER);
    }

    public static int LJJ() {
        return LJIJI(EnumC669620QOi.VIDEO);
    }

    public static final int LIZLLL() {
        return C0BRI.LIZ() ? LIZLLL.size() : LIZJ.size();
    }

    public static final Map<Integer, String> LJ() {
        List<String> listLJI = LJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (String str : listLJI) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            linkedHashMap.put(Integer.valueOf(i), str);
            i = i2;
        }
        return linkedHashMap;
    }

    public static final Map<String, Integer> LJFF() {
        List<String> listLJI = LJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (String str : listLJI) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            linkedHashMap.put(str, Integer.valueOf(i));
            i = i2;
        }
        return linkedHashMap;
    }

    public static final List<String> LJI() {
        return C0BRI.LIZ() ? C309710CCb.LIZ(LIZLLL) : C309710CCb.LIZ(LIZJ);
    }

    public static List LIZ(SearchResultParam searchResultParam) {
        List listLJJII = LJJII(LIZIZ, searchResultParam);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJII) {
            LIZ.getClass();
            if (LJJIIJZLJL((SearchTabInfo) obj, searchResultParam)) {
                arrayList.add(obj);
            }
        }
        List listLJJIIJ = LJJIIJ(arrayList, searchResultParam);
        if (listLJJIIJ.isEmpty()) {
            ISearchTabAppDiff.LIZ.getClass();
            C0PQ0.LIZIZ.getValue().LIZ();
            SearchTabInfo searchTabInfo = new SearchTabInfo("general", -1, false, false);
            if (C284360BCo.LIZ()) {
                return Collections.synchronizedList(C1697810uHb.LJIILJJIL(searchTabInfo));
            }
            return C1697810uHb.LJIILJJIL(searchTabInfo);
        }
        if (C284360BCo.LIZ()) {
            return Collections.synchronizedList(new ArrayList(listLJJIIJ));
        }
        return new ArrayList(listLJJIIJ);
    }

    public static int LIZIZ(int i) {
        List<SearchTabInfo> list;
        if (C0BRI.LIZ()) {
            list = LIZLLL;
        } else {
            list = LIZJ;
        }
        if (i >= list.size()) {
            return -1;
        }
        return i;
    }

    public static String LIZJ(int i) {
        List<SearchTabInfo> list;
        String str;
        if (C0BRI.LIZ()) {
            list = LIZLLL;
        } else {
            list = LIZJ;
        }
        SearchTabInfo searchTabInfo = (SearchTabInfo) C13LP.LJJJLZIJ(i, list);
        if (searchTabInfo == null || (str = searchTabInfo.tabName) == null) {
            return EnumC669620QOi.TOP.getTabName();
        }
        return str;
    }

    public static final int LJIIJ(String str) {
        if (C0BRI.LIZ()) {
            return C309710CCb.LIZIZ(str, LIZLLL);
        }
        return C309710CCb.LIZIZ(str, LIZJ);
    }

    public static final int LJIIJJI(String str) {
        if (Intrinsics.LJFF(str, "challenge")) {
            str = EnumC669620QOi.HASHTAG.getTabName();
        }
        if (C0BRI.LIZ()) {
            return C309710CCb.LIZIZ(str, LIZLLL);
        }
        return C309710CCb.LIZIZ(str, LIZJ);
    }

    public static final String LJIILIIL(int i) {
        SearchTabInfo searchTabInfo;
        String str;
        SearchTabInfo searchTabInfo2;
        String str2;
        if (C0BRI.LIZ()) {
            if (i >= 0) {
                List<SearchTabInfo> list = LIZLLL;
                if (i < list.size() && (searchTabInfo2 = (SearchTabInfo) C13LP.LJJJLZIJ(i, list)) != null && (str2 = searchTabInfo2.tabName) != null) {
                    return str2;
                }
            }
            return "";
        }
        if (i >= 0) {
            List<SearchTabInfo> list2 = LIZJ;
            if (i < list2.size() && (searchTabInfo = (SearchTabInfo) C13LP.LJJJLZIJ(i, list2)) != null && (str = searchTabInfo.tabName) != null) {
                return str;
            }
        }
        return "";
    }

    public static final String LJIILLIIL(int i) {
        if (i < 0) {
            return EnumC669620QOi.TOP.getTabName();
        }
        if (i == LJIJJLI()) {
            return EnumC669620QOi.TOP.getTabName();
        }
        LIZ.getClass();
        if (i == LJIL()) {
            return EnumC669620QOi.USER.getTabName();
        }
        if (i == LJJ()) {
            return EnumC669620QOi.VIDEO.getTabName();
        }
        if (i == LJIJ()) {
            return EnumC669620QOi.SOUND.getTabName();
        }
        if (i == LJIIL()) {
            return EnumC669620QOi.LIVE.getTabName();
        }
        if (i == LJIIZILJ()) {
            return EnumC669620QOi.SHOP.getTabName();
        }
        EnumC669620QOi enumC669620QOi = EnumC669620QOi.STORE;
        if (i == LJIJI(enumC669620QOi)) {
            return enumC669620QOi.getTabName();
        }
        if (i == LJIILL()) {
            return EnumC669620QOi.PLACE.getTabName();
        }
        if (i == LJIIIZ()) {
            return "challenge";
        }
        if (i == LJIILJJIL()) {
            return EnumC669620QOi.PHOTO.getTabName();
        }
        if (i == LIZIZ(i)) {
            return LIZJ(i);
        }
        return EnumC669620QOi.TOP.getTabName();
    }

    public static int LJIJI(EnumC669620QOi enumC669620QOi) {
        if (C0BRI.LIZ()) {
            return C309710CCb.LIZIZ(enumC669620QOi.getTabName(), LIZLLL);
        }
        return C309710CCb.LIZIZ(enumC669620QOi.getTabName(), LIZJ);
    }

    public static int LJIJJ(String str) {
        if (C0BRI.LIZ()) {
            return C309710CCb.LIZIZ(str, LIZLLL);
        }
        return C309710CCb.LIZIZ(str, LIZJ);
    }

    public static void LJJIFFI(List list) {
        C309710CCb.LIZJ(LIZLLL, list);
    }

    public static final String LJII(View view, C19EG c19eg) {
        if (c19eg == null) {
            return "";
        }
        Integer value = ((SearchStartViewModel) C679340Qkm.LIZ(view, c19eg).get(SearchStartViewModel.class)).yQ2().getValue();
        int iLJIJJLI = LJIJJLI();
        if (value != null && value.intValue() == iLJIJJLI) {
            return "general_search";
        }
        int iLJIILL = LJIILL();
        if (value != null && value.intValue() == iLJIILL) {
            return "search_places";
        }
        return "search_result";
    }

    public static final String LJIIIIZZ(Fragment fragment, C19EG c19eg) {
        if (c19eg == null) {
            return "";
        }
        Integer value = ((SearchStartViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStartViewModel.class)).yQ2().getValue();
        int iLJIJJLI = LJIJJLI();
        if (value != null && value.intValue() == iLJIJJLI) {
            return "general_search";
        }
        int iLJIILL = LJIILL();
        if (value != null && value.intValue() == iLJIILL) {
            return "search_places";
        }
        return "search_result";
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0202, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJJII(java.util.List r9, com.ss.android.ugc.aweme.search.model.SearchResultParam r10) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C644560PPy.LJJII(java.util.List, com.ss.android.ugc.aweme.search.model.SearchResultParam):java.util.List");
    }

    public static final void LJJIII(int i, String str) {
        List<SearchTabInfo> list;
        LIZ.getClass();
        int iLJIJJ = LJIJJ(str);
        if (iLJIJJ != i && iLJIJJ >= 0 && i >= 0) {
            if (C0BRI.LIZ()) {
                list = LIZLLL;
            } else {
                list = LIZJ;
            }
            if (iLJIJJ < list.size()) {
                ListProtector.remove(list, iLJIJJ);
            }
            Object searchTabInfo = C641930PFv.LIZJ().get(str);
            if (searchTabInfo == null) {
                searchTabInfo = new SearchTabInfo(str, -1, false, false);
            }
            ListProtector.add(list, Math.min(i, list.size()), searchTabInfo);
        }
    }

    public static List LJJIIJ(List list, SearchResultParam searchResultParam) {
        C0QER searchEnterParam;
        List<TabOrder> tabOrderList;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (tabOrderList = searchEnterParam.getTabOrderList()) != null && (!tabOrderList.isEmpty()) && ((Boolean) C284330BCl.LIZ.getValue()).booleanValue()) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(tabOrderList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (TabOrder tabOrder : tabOrderList) {
                linkedHashMap.put(tabOrder.tabName, tabOrder);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ArrayList<Pair> arrayList = new ArrayList();
            for (SearchTabInfo searchTabInfo : (ArrayList) list) {
                TabOrder tabOrder2 = (TabOrder) linkedHashMap.get(searchTabInfo.tabName);
                if (tabOrder2 != null) {
                    LIZ.getClass();
                    if (tabOrder2.tabName.length() > 0 && tabOrder2.preferIndex >= 0) {
                        arrayList.add(new Pair(tabOrder2, searchTabInfo));
                    }
                }
                copyOnWriteArrayList.add(searchTabInfo);
            }
            C08XD.LJJ(arrayList, new Comparator() { // from class: X.0PLf
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i;
                    TabOrder tabOrder3;
                    TabOrder tabOrder4;
                    Pair pair = (Pair) obj;
                    Pair pair2 = (Pair) obj2;
                    int i2 = 0;
                    if (pair != null && (tabOrder4 = (TabOrder) pair.getFirst()) != null) {
                        i = tabOrder4.preferIndex;
                    } else {
                        i = 0;
                    }
                    if (pair2 != null && (tabOrder3 = (TabOrder) pair2.getFirst()) != null) {
                        i2 = tabOrder3.preferIndex;
                    }
                    return i - i2;
                }
            });
            for (Pair pair : arrayList) {
                C644560PPy c644560PPy = LIZ;
                TabOrder tabOrder3 = (TabOrder) pair.getFirst();
                c644560PPy.getClass();
                if (tabOrder3.tabName.length() > 0 && tabOrder3.preferIndex >= 0) {
                    int i = ((TabOrder) pair.getFirst()).preferIndex;
                    int size = copyOnWriteArrayList.size();
                    if (i > size) {
                        i = size;
                    }
                    copyOnWriteArrayList.add(i, pair.getSecond());
                }
            }
            return copyOnWriteArrayList;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIIJZLJL(com.ss.android.ugc.aweme.search.SearchTabInfo r9, com.ss.android.ugc.aweme.search.model.SearchResultParam r10) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C644560PPy.LJJIIJZLJL(com.ss.android.ugc.aweme.search.SearchTabInfo, com.ss.android.ugc.aweme.search.model.SearchResultParam):boolean");
    }

    public static void LJJI(SearchResultParam searchResultParam, SearchDynamicTabViewModel searchDynamicTabViewModel, C19EG c19eg, Fragment fragment) {
        List<SearchTabInfo> value;
        if (c19eg != null) {
            List<String> list = ((SearchReorderAndChooseTabViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchReorderAndChooseTabViewModel.class)).LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : (ArrayList) list) {
                Object searchTabInfo = C641930PFv.LIZJ().get(str);
                if (searchTabInfo == null) {
                    searchTabInfo = new SearchTabInfo(str, -1, false, false);
                }
                arrayList.add(searchTabInfo);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                LIZ.getClass();
                if (LJJIIJZLJL((SearchTabInfo) obj, searchResultParam)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                C309710CCb.LIZJ(LIZJ, arrayList2);
                if (C0BRI.LIZ()) {
                    LIZ.getClass();
                    LJJIFFI(arrayList2);
                    return;
                }
                return;
            }
        }
        List<SearchTabInfo> list2 = LIZJ;
        C309710CCb.LIZJ(list2, LIZ(searchResultParam));
        if (C0BRI.LIZ()) {
            if (searchDynamicTabViewModel != null && (value = searchDynamicTabViewModel.LLIZLLLIL.getValue()) != null) {
                list2 = value;
            }
            LJJIFFI(list2);
        }
    }
}
