package X;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.config.SearchMusicHistoryConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.0QPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPJ implements C0QF6, InterfaceC586170Myt {
    public static final Map<String, C0QF6> LLJI = new ArrayMap(4);
    public final int LL;
    public final int LLILLJJLI;
    public final Gson LLILLL;
    public final IAccountService LLILZ;
    public List<Pair<String, List<SearchHistory>>> LLILZIL;
    public List<SearchHistory> LLILZLL;
    public List<SearchHistory> LLIZ;
    public List<SearchHistory> LLIZLLLIL;
    public final String LLJ;

    public static List<String> LJIIZILJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("recent_history_v2");
        arrayList.add("ecommerce_history");
        ECSearchEntranceData.Companion.getClass();
        Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(C0QXR.FLASH_SALE.getValue()), Integer.valueOf(C0QXR.BRAND_BUDGET.getValue()), Integer.valueOf(C0QXR.FASHION.getValue()), Integer.valueOf(C0QXR.SHOP_SEARCH_IN_MALL_VIDEO.getValue()), Integer.valueOf(C0QXR.ORDER_GUESS_VIDEO.getValue()), Integer.valueOf(C0QXR.MALL_FEED_VIDEO.getValue())).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iIntValue);
            sbLIZ.append("_ec_search_history");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return arrayList;
    }

    public static int LJIJJLI() {
        C644560PPy.LIZ.getClass();
        if (Integer.MIN_VALUE == C644560PPy.LJIL()) {
            return 16;
        }
        if (Integer.MIN_VALUE == C644560PPy.LJIJ()) {
            return 17;
        }
        if (Integer.MIN_VALUE == C644560PPy.LJIIZILJ()) {
            return 22;
        }
        if (Integer.MIN_VALUE == C644560PPy.LJIIIZ()) {
            return 18;
        }
        if (Integer.MIN_VALUE == C644560PPy.LJJ()) {
            return 19;
        }
        if (C644560PPy.LJIJJLI() >= 0 && Integer.MIN_VALUE == C644560PPy.LJIJJLI()) {
            return 20;
        }
        if (Integer.MIN_VALUE == C644560PPy.LJIIL()) {
            return 21;
        }
        return Integer.MIN_VALUE == C644560PPy.LJIILJJIL() ? 22 : 0;
    }

    @Override // X.C0QF6
    public final List<SearchHistory> LJI() {
        ArrayList<SearchHistory> arrayList;
        String str;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.LLILZLL;
        if (list != null && ((ArrayList) list).size() != 0) {
            try {
                arrayList = new ArrayList(this.LLILZLL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = new ArrayList();
            }
            C01GW c01gw = C0QPR.LIZIZ;
            boolean z = ((SearchMusicHistoryConfig) c01gw.getValue()).limitMusicHistoryShown == 1;
            int i = ((SearchMusicHistoryConfig) c01gw.getValue()).musicHistoryShownCount;
            SearchHistory searchHistory = null;
            int i2 = 0;
            for (SearchHistory searchHistory2 : arrayList) {
                if (searchHistory2 != null && (str = searchHistory2.musicId) != null && !str.isEmpty()) {
                    boolean z2 = !z || i2 < i;
                    boolean z3 = (C0QPR.LIZ() && searchHistory2.isOriginalMusic) ? false : true;
                    boolean z4 = !searchHistory2.LIZIZ();
                    if (z3 && z2 && searchHistory == null) {
                        if (z4) {
                            searchHistory = searchHistory2;
                        }
                        arrayList2.add(searchHistory2);
                        i2++;
                    }
                }
            }
        }
        return arrayList2;
    }

    public final String LJIILJJIL() {
        AccountUserService accountUserServiceLJIIJ = this.LLILZ.LJIIJ();
        return accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : "FAKE_USER";
    }

    public final List<Pair<String, List<SearchHistory>>> LJIILLIIL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSearchHistoryInSp, currentUserId = ");
            sbLIZ.append(LJIILJJIL());
            sbLIZ.append(", saveKey = ");
            sbLIZ.append(this.LLJ);
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
            String strLIZIZ = C1238740iLA.LIZLLL().LIZIZ(this.LLJ, "");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getSearchHistoryInSp, history json = ");
            sbLIZ2.append(strLIZIZ);
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
            if (!TextUtils.isEmpty(strLIZIZ)) {
                this.LLILZIL = (List) this.LLILLL.LJIIIIZZ(strLIZIZ, new TypeToken<List<Pair<String, List<SearchHistory>>>>() { // from class: X.0QPM
                }.getType());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getSearchHistoryInSp, *** exception = ");
            sbLIZ3.append(e.getMessage());
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new ArrayList();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0QPN c0qpn = new C0QPN();
        c0qpn.LJIIZILJ("key", this.LLJ);
        c0qpn.LJIIZILJ("operation", "get");
        c0qpn.LJIIZILJ("type", "sp");
        c0qpn.LJJIJL(jCurrentTimeMillis2);
        c0qpn.LJIILJJIL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getSearchHistoryInSp, allLocalHistory get from file = ");
        sbLIZ4.append(this.LLILZIL);
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ4));
        return this.LLILZIL;
    }

    public final void LJIL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSearchHistoryInSp, currentUserId = ");
            sbLIZ.append(LJIILJJIL());
            sbLIZ.append(", saveKey = ");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(", allLocalHistory = ");
            sbLIZ.append(this.LLILZIL);
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
            String strLJIILLIIL = this.LLILLL.LJIILLIIL(this.LLILZIL, new TypeToken<List<Pair<String, List<MusicSearchHistory>>>>() { // from class: X.0QPO
            }.getType());
            C1238740iLA.LIZLLL().LJFF(this.LLJ, strLJIILLIIL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateSearchHistoryInSp, history saved to file, repo=");
            sbLIZ2.append(this.LLJ);
            sbLIZ2.append(", new:");
            sbLIZ2.append(strLJIILLIIL);
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateSearchHistoryInSp, *** exception = ");
            sbLIZ3.append(e.getMessage());
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0QPN c0qpn = new C0QPN();
        c0qpn.LJIIZILJ("key", this.LLJ);
        c0qpn.LJIIZILJ("type", "update");
        c0qpn.LJIIZILJ("type", "sp");
        c0qpn.LJJIJL(jCurrentTimeMillis2);
        c0qpn.LJIILJJIL();
    }

    @Override // X.C0QF6
    public final void LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearSearchHistory, currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", original =  ");
        sbLIZ.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LLILZLL).clear();
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLIZLLLIL).clear();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clearSearchHistory, new =  ");
        sbLIZ2.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        LJIL();
    }

    @Override // X.C0QF6
    public final void LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearInvalidMusicHistory, currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", original =  ");
        sbLIZ.append(LJIILL(this.LLIZLLLIL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        try {
            ((ArrayList) this.LLILZLL).removeAll(this.LLIZLLLIL);
            ((ArrayList) this.LLIZLLLIL).clear();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLIZLLLIL = new ArrayList();
        }
        C2344809Gs.LIZLLL(4, "Search_history_manager", "clearInvalidMusicHistory, new =  " + LJIILL(this.LLIZLLLIL));
        LJIL();
    }

    public final void LJIILIIL() {
        String str;
        String strLJIILJJIL = LJIILJJIL();
        Iterator<Pair<String, List<SearchHistory>>> it2 = this.LLILZIL.iterator();
        this.LLILZLL = new ArrayList();
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Pair<String, List<SearchHistory>> next = it2.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, strLJIILJJIL)) {
                ((ArrayList) this.LLILZLL).addAll((Collection) next.second);
                if (((List) next.second).contains(null)) {
                    if (((Number) C0A97.LIZ.getValue()).intValue() == 1) {
                        try {
                            int size = ((ArrayList) this.LLILZLL).size();
                            while (true) {
                                int i2 = i + 1;
                                if (i >= size || !((ArrayList) this.LLILZLL).contains(null)) {
                                    break;
                                }
                                ((ArrayList) this.LLILZLL).remove((Object) null);
                                i = i2;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C664410Q4h.LIZ(C0Q45.COMMON, EnumC664420Q4i.HISTORY_WORDS, e, "SearchHistoryManager");
                        }
                    }
                    C664410Q4h.LIZ(C0Q45.COMMON, EnumC664420Q4i.HISTORY_WORDS, new Throwable("history contains null!"), "SearchHistoryManager");
                }
                for (SearchHistory searchHistory : (List) next.second) {
                    if (searchHistory != null && (str = searchHistory.musicId) != null && !str.isEmpty()) {
                        if (searchHistory.LIZIZ() && ((ArrayList) this.LLIZ).size() <= 40) {
                            ((ArrayList) this.LLIZ).add(searchHistory);
                        } else if (((ArrayList) this.LLIZLLLIL).size() <= this.LL) {
                            ((ArrayList) this.LLIZLLLIL).add(searchHistory);
                        }
                    }
                }
                it2.remove();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureCurrentUserLocalHistory, currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", currentUserLocalHistory = ");
        sbLIZ.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        ListProtector.add(this.LLILZIL, 0, new Pair(strLJIILJJIL, this.LLILZLL));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ensureCurrentUserLocalHistory, allLocalHistory = ");
        sbLIZ2.append(this.LLILZIL);
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLILLJJLI > 0 && this.LLILZIL.size() > this.LLILLJJLI) {
            try {
                List<Pair<String, List<SearchHistory>>> list = this.LLILZIL;
                list.remove(list.size() - 1);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ensureCurrentUserLocalHistory, *** exception = ");
                sbLIZ3.append(e2.getMessage());
                C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
            }
            C2344809Gs.LIZLLL(4, "Search_history_manager", "ensureCurrentUserLocalHistory, allLocalHistory = " + this.LLILZIL);
        }
        LJIL();
    }

    @Override // X.C0QF6
    public final List<SearchHistory> LIZIZ() {
        return this.LLILZLL;
    }

    public C0QPJ(String str) {
        C0QPQ.LIZ.getClass();
        this.LL = C0QPQ.LIZ().invalidMusicCount;
        this.LLILLJJLI = 10;
        this.LLILLL = new Gson();
        this.LLJ = str;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LLILZ = iAccountService;
        iAccountService.LJIILL(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHistoryManager init, currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", saveKey = ");
        sbLIZ.append(str);
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL = LJIILLIIL();
        LJIILIIL();
    }

    public static List LJIILL(List list) {
        if (list != null && list.size() > 0) {
            ArrayList<SearchHistory> arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list.size());
            for (SearchHistory searchHistory : arrayList) {
                if (searchHistory != null) {
                    arrayList2.add(searchHistory.keyword);
                }
            }
            return arrayList2;
        }
        return null;
    }

    public static String LJIJ(ECSearchEntranceData eCSearchEntranceData) {
        boolean z;
        if (eCSearchEntranceData != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0QPT historyIsolateStrategy = eCSearchEntranceData.getHistoryIsolateStrategy();
            if (!historyIsolateStrategy.equals(C0QPT.EC_SINGLE_ISOLATE) && !historyIsolateStrategy.equals(C0QPT.EC_DOUBLE_ISOLATE)) {
                if (historyIsolateStrategy.equals(C0QPT.ENTRANCE_ISOLATE)) {
                    ECSearchEntranceData.Companion.getClass();
                    int iLIZ = C650500PfM.LIZ(eCSearchEntranceData);
                    C0QXR c0qxr = C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER;
                    if (iLIZ != c0qxr.getValue() && iLIZ != C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(iLIZ);
                        sbLIZ.append("_ec_search_history");
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c0qxr.getValue());
                    sbLIZ2.append("_ec_search_history");
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
                C1238740iLA.LIZLLL().LJI("ecommerce_history_strategy_changed", false);
            } else {
                if (!C1238740iLA.LIZLLL().LIZJ("ecommerce_history_strategy_changed", false)) {
                    C1238740iLA.LIZLLL().LJFF("ecommerce_history", C1238740iLA.LIZLLL().LIZIZ("recent_history_v2", ""));
                    C1238740iLA.LIZLLL().LJI("ecommerce_history_strategy_changed", true);
                }
                return "ecommerce_history";
            }
        }
        return "recent_history_v2";
    }

    public static C0QF6 LJIJI(ECSearchEntranceData eCSearchEntranceData) {
        return LJIJJ(LJIJ(eCSearchEntranceData));
    }

    public static C0QF6 LJIJJ(String str) {
        C0QF6 c0qpj;
        Map<String, C0QF6> map = LLJI;
        C0QF6 c0qf6 = (C0QF6) ((ArrayMap) map).get(str);
        if (c0qf6 == null) {
            synchronized (map) {
                try {
                    c0qpj = (C0QF6) ((ArrayMap) map).get(str);
                    if (c0qpj == null) {
                        c0qpj = new C0QPJ(str);
                        ((ArrayMap) map).put(str, c0qpj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c0qpj;
        }
        return c0qf6;
    }

    @Override // X.C0QF6
    public final void LIZJ(String str) {
        try {
            for (SearchHistory searchHistory : (ArrayList) this.LLIZLLLIL) {
                if (Objects.equals(searchHistory.musicId, str)) {
                    try {
                        ((ArrayList) this.LLIZLLLIL).remove(searchHistory);
                        if (((ArrayList) this.LLIZ).size() > 0) {
                            List<SearchHistory> list = this.LLIZ;
                            SearchHistory searchHistory2 = (SearchHistory) ((ArrayList) list).get(((ArrayList) list).size() - 1);
                            if (((ArrayList) this.LLIZ).size() == 40 && searchHistory2.timestamp > searchHistory.timestamp) {
                                return;
                            }
                        }
                        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            SearchHistory searchHistory3 = (SearchHistory) it2.next();
                            if (Objects.equals(searchHistory3.musicId, str)) {
                                searchHistory3.isValidMusic = true;
                                break;
                            }
                        }
                        ((ArrayList) this.LLIZ).remove(searchHistory);
                        ((ArrayList) this.LLIZ).add(0, searchHistory);
                        if (((ArrayList) this.LLIZ).size() > 40) {
                            List<SearchHistory> list2 = this.LLIZ;
                            SearchHistory searchHistory4 = (SearchHistory) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
                            ((ArrayList) this.LLIZ).remove(searchHistory4);
                            ((ArrayList) this.LLILZLL).remove(searchHistory4);
                        }
                        LJIL();
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateSearchHistoryValidity, *** exception = ");
                        sbLIZ.append(e.getMessage());
                        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateSearchHistoryValidity, *** exception = ");
            sbLIZ2.append(e2.getMessage());
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.C0QF6
    public final void LIZLLL(C644340PPc c644340PPc) {
        if (c644340PPc.LIZ(this.LLILZLL)) {
            LJIL();
        }
    }

    @Override // X.C0QF6
    public final boolean LJII(String str) {
        List<SearchHistory> list;
        String str2;
        if (C0QPQ.LIZIZ() && (list = this.LLIZLLLIL) != null) {
            try {
                int i = 0;
                for (SearchHistory searchHistory : (ArrayList) list) {
                    if (searchHistory != null && (str2 = searchHistory.musicId) != null && !str2.isEmpty() && !TextUtils.equals(searchHistory.musicId, str) && (!C0QPR.LIZ() || !searchHistory.isOriginalMusic)) {
                        i++;
                    }
                }
                if (i <= 0) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // X.C0QF6
    public final List<SearchHistory> LJIIJJI(String str) {
        ArrayList<SearchHistory> arrayList;
        String str2;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.LLIZLLLIL;
        if (list != null && ((ArrayList) list).size() != 0) {
            try {
                arrayList = new ArrayList(this.LLIZLLLIL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = new ArrayList();
            }
            C0QPQ.LIZ.getClass();
            int i = C0QPQ.LIZ().invalidMusicShowCount;
            int i2 = 0;
            for (SearchHistory searchHistory : arrayList) {
                if (searchHistory != null && (str2 = searchHistory.musicId) != null && !str2.isEmpty() && !TextUtils.equals(searchHistory.musicId, str) && i2 < i) {
                    if (C0QPR.LIZ() && searchHistory.isOriginalMusic) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(searchHistory);
                        i2++;
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // X.C0QF6
    public final List<SearchHistory> LJIIL(int i) {
        ArrayList<SearchHistory> arrayList;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.LLILZLL;
        if (list != null && ((ArrayList) list).size() > 0) {
            try {
                arrayList = new ArrayList(this.LLILZLL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getSearchHistoryByType, *** exception = ");
                sbLIZ.append(e.getMessage());
                C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
                arrayList = new ArrayList();
            }
            for (SearchHistory searchHistory : arrayList) {
                if (searchHistory != null && searchHistory.type == i) {
                    String str = searchHistory.musicId;
                    if (str != null && !str.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(searchHistory);
                    }
                }
                if (i == 0 && arrayList2.size() == 40) {
                    break;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getSearchHistoryByType, currentUserId = ");
            sbLIZ2.append(LJIILJJIL());
            sbLIZ2.append(", repo:");
            sbLIZ2.append(this.LLJ);
            sbLIZ2.append(", get history result = ");
            sbLIZ2.append(LJIILL(arrayList2));
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
            return arrayList2;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getSearchHistoryByType, currentUserLocalHistory is null or empty, currentUserId = ");
        sbLIZ3.append(LJIILJJIL());
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
        return arrayList2;
    }

    @Override // X.C0QF6
    public final void LIZ(SearchHistory searchHistory, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordSearchHistory, repo:");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(",source:");
        sbLIZ.append(str);
        sbLIZ.append(", currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", add history = ");
        sbLIZ.append(searchHistory.keyword);
        sbLIZ.append(", original =  ");
        sbLIZ.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        if (searchHistory.keyword.length() > 300) {
            searchHistory.keyword = searchHistory.keyword.substring(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cut history if need, after history = ");
        sbLIZ2.append(searchHistory.keyword);
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        ((ArrayList) this.LLILZLL).remove(searchHistory);
        ListProtector.add(this.LLILZLL, 0, searchHistory);
        String str2 = searchHistory.musicId;
        if (str2 != null && !str2.isEmpty()) {
            if (searchHistory.LIZIZ()) {
                ((ArrayList) this.LLIZ).remove(searchHistory);
                ListProtector.add(this.LLIZ, 0, searchHistory);
            } else {
                ((ArrayList) this.LLIZLLLIL).remove(searchHistory);
                ListProtector.add(this.LLIZLLLIL, 0, searchHistory);
            }
        }
        searchHistory.timestamp = System.currentTimeMillis();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("recordSearchHistory,repo=");
        sbLIZ3.append(this.LLJ);
        sbLIZ3.append(",source:");
        sbLIZ3.append(str);
        sbLIZ3.append(", new =  ");
        sbLIZ3.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
        if (((ArrayList) this.LLILZLL).size() - ((ArrayList) this.LLIZ).size() > 40) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("recordSearchHistory, remove last one when exceed maxCacheNumber, original =  ");
            sbLIZ4.append(LJIILL(this.LLILZLL));
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ4));
            try {
                ((ArrayList) this.LLILZLL).remove(((ArrayList) r1).size() - 1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("recordSearchHistory, *** exception = ");
                sbLIZ5.append(e.getMessage());
                C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ5));
            }
            C2344809Gs.LIZLLL(4, "Search_history_manager", "recordSearchHistory, remove last one when exceed maxCacheNumber, new =  " + LJIILL(this.LLILZLL));
        }
        if (((ArrayList) this.LLIZ).size() > 40) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("recordSearchHistory, remove musicHistoryList last one when exceed maxCacheNumber, original =  ");
            sbLIZ6.append(LJIILL(this.LLIZ));
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ6));
            Object obj = ListProtector.get(this.LLIZ, ((ArrayList) r1).size() - 1);
            ((ArrayList) this.LLIZ).remove(obj);
            ((ArrayList) this.LLILZLL).remove(obj);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("recordSearchHistory, remove last one musicHistory when exceed maxCacheNumber, new =  ");
            sbLIZ7.append(LJIILL(this.LLIZ));
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ7));
        }
        if (this.LL > 0 && ((ArrayList) this.LLIZLLLIL).size() > this.LL) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("recordSearchHistory, remove invalidMusicHistoryList last one when exceed maxCacheNumber, original =  ");
            sbLIZ8.append(LJIILL(this.LLIZLLLIL));
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ8));
            Object obj2 = ListProtector.get(this.LLIZLLLIL, ((ArrayList) r1).size() - 1);
            ((ArrayList) this.LLIZLLLIL).remove(obj2);
            ((ArrayList) this.LLILZLL).remove(obj2);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("recordSearchHistory, remove last one invalidMusicHistory when exceed maxCacheNumber, new =  ");
            sbLIZ9.append(LJIILL(this.LLIZLLLIL));
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ9));
        }
        LJIL();
    }

    @Override // X.C0QF6
    public final List<SearchHistory> LJ(int i, boolean z) {
        boolean z2;
        ArrayList<SearchHistory> arrayList;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.LLILZLL;
        if (list != null && ((ArrayList) list).size() != 0) {
            if (z) {
                try {
                    arrayList2.addAll(this.LLILZLL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getSearchHistoryWithMusic, *** exception = ");
                    sbLIZ.append(e.getMessage());
                    C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                if (((SearchMusicHistoryConfig) C0QPR.LIZIZ.getValue()).limitMusicHistoryShown == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    arrayList = new ArrayList(this.LLILZLL);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getSearchHistoryWithMusic, *** exception = ");
                    sbLIZ2.append(e2.getMessage());
                    C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
                    arrayList = new ArrayList();
                }
                int i2 = ((SearchMusicHistoryConfig) C0QPR.LIZIZ.getValue()).musicHistoryShownCount;
                SearchHistory searchHistory = null;
                boolean z6 = false;
                int i3 = 0;
                for (SearchHistory searchHistory2 : arrayList) {
                    if (searchHistory2 != null && searchHistory2.type == i) {
                        if (z2 && i3 >= i2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (C0QPR.LIZ() && searchHistory2.isOriginalMusic) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        boolean z7 = !searchHistory2.LIZIZ();
                        if (searchHistory == null && !z6 && arrayList2.size() <= 20) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        String str = searchHistory2.musicId;
                        if (str != null && !str.isEmpty()) {
                            if (z4 && z3) {
                                if (!z7) {
                                    arrayList2.add(searchHistory2);
                                    i3++;
                                    if (arrayList2.size() <= 21) {
                                        z6 = true;
                                    }
                                } else if (z5) {
                                    arrayList2.add(searchHistory2);
                                    i3++;
                                    searchHistory = searchHistory2;
                                }
                            }
                        } else {
                            arrayList2.add(searchHistory2);
                        }
                    }
                    if (i == 0 && arrayList2.size() == 40) {
                        break;
                    }
                }
                if (z6 && searchHistory != null) {
                    arrayList2.remove(searchHistory);
                }
            }
            C2344809Gs.LIZLLL(4, "Search_history_manager", "getSearchHistoryWithMusic, currentUserId = " + LJIILJJIL() + ", repo:" + this.LLJ + ", get history result = " + LJIILL(arrayList2));
            return arrayList2;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getSearchHistoryByType, currentUserLocalHistory is null or empty, currentUserId = ");
        sbLIZ3.append(LJIILJJIL());
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
        return arrayList2;
    }

    @Override // X.C0QF6
    public final void LJFF(String str, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteSearchHistoryList, currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", repo = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        sbLIZ.append(", delete history size = ");
        sbLIZ.append(list.size());
        sbLIZ.append(", original = ");
        sbLIZ.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LLILZLL).removeAll(list);
        ((ArrayList) this.LLIZ).removeAll(list);
        ((ArrayList) this.LLIZLLLIL).removeAll(list);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("deleteSearchHistoryList complete, repo = ");
        sbLIZ2.append(this.LLJ);
        sbLIZ2.append(", source = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", new = ");
        sbLIZ2.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        LJIL();
    }

    @Override // X.C0QF6
    public final void LJIIJ(SearchHistory searchHistory, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteSearchHistory, repo = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        sbLIZ.append(", currentUserId = ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", delete history = ");
        sbLIZ.append(searchHistory.keyword);
        sbLIZ.append(", original = ");
        sbLIZ.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LLILZLL).remove(searchHistory);
        ((ArrayList) this.LLIZ).remove(searchHistory);
        ((ArrayList) this.LLIZLLLIL).remove(searchHistory);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("deleteSearchHistory complete, ");
        sbLIZ2.append(this.LLJ);
        sbLIZ2.append(", source = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", new = ");
        sbLIZ2.append(LJIILL(this.LLILZLL));
        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
        LJIL();
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 2 || i == 1 || i == 3) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<SearchHistory>>> it2 = this.LLILZIL.iterator();
                while (it2.hasNext()) {
                    Pair<String, List<SearchHistory>> next = it2.next();
                    if (next != null && TextUtils.equals((CharSequence) next.first, "FAKE_USER")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("removeFakeUserHistory, remove history = : ");
                        sbLIZ.append(LJIILL((List) next.second));
                        C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ));
                        it2.remove();
                    }
                }
                LJIL();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAccountResult clear history, currentUserId = ");
            sbLIZ2.append(LJIILJJIL());
            sbLIZ2.append(", original = ");
            sbLIZ2.append(this.LLILZIL);
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZIL.clear();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onAccountResult clear history, new = ");
            sbLIZ3.append(this.LLILZIL);
            C2344809Gs.LIZLLL(4, "Search_history_manager", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILZIL = LJIILLIIL();
            LJIILIIL();
        }
    }
}
