package X;

import Y.ACallableS151S0000000_16;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.IFeedItemList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064210dnf {
    public static volatile C1064210dnf LJFF;
    public IFeedItemList LIZIZ;
    public List<Aweme> LIZJ;
    public static final String LJ = C1064210dnf.class.getSimpleName();
    public static final C19468911Ex LJI = new C0J6I<ShowAdDataBase>() { // from class: X.11Ex
        /* JADX WARN: Type inference failed for: r0v4, types: [X.0VMm, com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase] */
        @Override // X.C0J6I
        public final ShowAdDataBase LIZ() {
            C844470XAv.LIZ.getClass();
            C796500VMi c796500VMiLIZ = C0OGG.LIZ(C844470XAv.LIZ(), ShowAdDataBase.class, "showAd.db");
            c796500VMiLIZ.LJII = true;
            c796500VMiLIZ.LIZJ();
            c796500VMiLIZ.LIZ(ShowAdDataBase.LL);
            return c796500VMiLIZ.LIZIZ();
        }
    };
    public final Map<String, String> LIZLLL = new HashMap();
    public final C1064230dnh LIZ = new AbstractC1610280s0Q() { // from class: X.0dnh
        @Override // X.AbstractC1610280s0Q
        public final C2230608oa<Long> LIZIZ() {
            return SharePrefCache.inst().getLastFilterTime();
        }
    };

    public static C1064210dnf LJ() {
        if (LJFF == null) {
            synchronized (C1064210dnf.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1064210dnf();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public static boolean LIZ(String str) {
        try {
            ShowAdDataBase showAdDataBaseLIZIZ = LJI.LIZIZ();
            if (showAdDataBaseLIZIZ != null) {
                List<C0VL6> listLIZLLL = showAdDataBaseLIZIZ.LIZ().LIZLLL(str);
                if (C086I.LIZIZ(listLIZLLL)) {
                    return false;
                }
                return listLIZLLL.contains(new C0VL6(str, null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public final void LIZIZ(IFeedItemList iFeedItemList) {
        int i;
        Object obj;
        if (C086I.LIZIZ(iFeedItemList.getItems())) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (LIZ(jCurrentTimeMillis)) {
                ((HashMap) this.LIZLLL).clear();
                C15O7.LIZ(new ACallableS151S0000000_16(1));
            }
            LIZIZ().LJ(Long.valueOf(jCurrentTimeMillis));
            Iterator<Aweme> it2 = iFeedItemList.getItems().iterator();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            while (it2.hasNext()) {
                Aweme next = it2.next();
                if (next != null && next.isAd()) {
                    ICoinCloseCommerceSettings iCoinCloseCommerceSettings = (ICoinCloseCommerceSettings) C1057370dcd.LIZ.getValue();
                    if (iCoinCloseCommerceSettings != null) {
                        iCoinCloseCommerceSettings.LIZLLL();
                    }
                    String aid = next.getAid();
                    String str = "1";
                    if (LJFF(next)) {
                        it2.remove();
                        if (C1017070cZd.LLL(next)) {
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                            c1022820ciuLIZLLL.LIZIZ("12", "ad_show_fail_type");
                            c1022820ciuLIZLLL.LIZIZ(LIZLLL(aid), "repeat_cid");
                            if (!C1030680cva.LJ) {
                                str = "2";
                            }
                            c1022820ciuLIZLLL.LIZIZ(str, "awemelaunch");
                            c1022820ciuLIZLLL.LJII();
                        }
                        if (next.isAd()) {
                            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                            c1022820ciuLIZLLL2.LIZIZ(1, "filter_reason");
                            c1022820ciuLIZLLL2.LIZIZ(LIZLLL(aid), "repeat_cid");
                            c1022820ciuLIZLLL2.LIZIZ(2, "repeat_type");
                            c1022820ciuLIZLLL2.LJII();
                        }
                    } else if (this.LIZIZ != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                        for (Aweme aweme : this.LIZIZ.getItems()) {
                            if (aweme != null && TextUtils.equals(aid, aweme.getAid())) {
                                it2.remove();
                                if (C1017070cZd.LLL(next)) {
                                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                                    c1022820ciuLIZLLL3.LIZIZ("8", "ad_show_fail_type");
                                    if (C1030680cva.LJ) {
                                        obj = "1";
                                    } else {
                                        obj = "2";
                                    }
                                    c1022820ciuLIZLLL3.LIZIZ(obj, "awemelaunch");
                                    c1022820ciuLIZLLL3.LIZIZ(LIZLLL(aid), "repeat_cid");
                                    c1022820ciuLIZLLL3.LJII();
                                }
                                C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                                if (aweme.isAd()) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                c1022820ciuLIZLLL4.LIZIZ(Integer.valueOf(i), "filter_reason");
                                c1022820ciuLIZLLL4.LIZIZ(LIZLLL(aid), "repeat_cid");
                                c1022820ciuLIZLLL4.LIZIZ(2, "repeat_type");
                                c1022820ciuLIZLLL4.LJII();
                            }
                        }
                    }
                }
            }
            this.LIZIZ = iFeedItemList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(List<Aweme> list) {
        int i;
        Object obj;
        if (list != null && !C086I.LIZIZ(list)) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (LIZ(jCurrentTimeMillis)) {
                    ((HashMap) this.LIZLLL).clear();
                    C15O7.LIZ(new ACallableS151S0000000_16(1));
                }
                LIZIZ().LJ(Long.valueOf(jCurrentTimeMillis));
                Iterator<Aweme> it2 = list.iterator();
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                while (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (next != null && next.isAd()) {
                        ICoinCloseCommerceSettings iCoinCloseCommerceSettings = (ICoinCloseCommerceSettings) C1057370dcd.LIZ.getValue();
                        if (iCoinCloseCommerceSettings != null) {
                            iCoinCloseCommerceSettings.LIZLLL();
                        }
                        String aid = next.getAid();
                        String str = "1";
                        if (LJFF(next)) {
                            it2.remove();
                            if (C1017070cZd.LLL(next)) {
                                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                                c1022820ciuLIZLLL.LIZIZ("12", "ad_show_fail_type");
                                c1022820ciuLIZLLL.LIZIZ(LIZLLL(aid), "repeat_cid");
                                if (!C1030680cva.LJ) {
                                    str = "2";
                                }
                                c1022820ciuLIZLLL.LIZIZ(str, "awemelaunch");
                                c1022820ciuLIZLLL.LJII();
                            }
                            if (next.isAd()) {
                                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                                c1022820ciuLIZLLL2.LIZIZ(1, "filter_reason");
                                c1022820ciuLIZLLL2.LIZIZ(LIZLLL(aid), "repeat_cid");
                                c1022820ciuLIZLLL2.LIZIZ(2, "repeat_type");
                                c1022820ciuLIZLLL2.LJII();
                            }
                        } else if (this.LIZJ != null && next.getAwemeRawAd() != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                            for (Aweme aweme : this.LIZJ) {
                                if (aweme != null && TextUtils.equals(aid, aweme.getAid())) {
                                    it2.remove();
                                    if (C1017070cZd.LLL(next)) {
                                        C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                                        c1022820ciuLIZLLL3.LIZIZ("8", "ad_show_fail_type");
                                        if (C1030680cva.LJ) {
                                            obj = "1";
                                        } else {
                                            obj = "2";
                                        }
                                        c1022820ciuLIZLLL3.LIZIZ(obj, "awemelaunch");
                                        c1022820ciuLIZLLL3.LIZIZ(LIZLLL(aid), "repeat_cid");
                                        c1022820ciuLIZLLL3.LJII();
                                    }
                                    C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                                    if (aweme.isAd()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    c1022820ciuLIZLLL4.LIZIZ(Integer.valueOf(i), "filter_reason");
                                    c1022820ciuLIZLLL4.LIZIZ(LIZLLL(aid), "repeat_cid");
                                    c1022820ciuLIZLLL4.LIZIZ(2, "repeat_type");
                                    c1022820ciuLIZLLL4.LJII();
                                }
                            }
                        }
                    }
                }
                this.LIZJ = list;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final String LIZLLL(String str) {
        C0VL6 c0vl6LIZJ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((HashMap) this.LIZLLL).containsKey(str)) {
            return (String) ((HashMap) this.LIZLLL).get(str);
        }
        if (LIZ(str)) {
            try {
                ShowAdDataBase showAdDataBaseLIZIZ = LJI.LIZIZ();
                if (showAdDataBaseLIZIZ == null || (c0vl6LIZJ = showAdDataBaseLIZIZ.LIZ().LIZJ(str)) == null) {
                    return null;
                }
                return c0vl6LIZJ.LIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final boolean LJFF(Aweme aweme) {
        if (!aweme.isAd()) {
            return false;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return false;
        }
        C0S0L.LIZ.getClass();
        if (C0S0L.LJ(aweme)) {
            String str = LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[shouldFilterHasShowedAdAweme] gallery, aweme.aid=");
            sbLIZ.append(aweme.getAid());
            C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (aweme.getAwemeRawAd().isDiableAdShowFilter()) {
            return false;
        }
        if (((HashMap) this.LIZLLL).containsKey(aid)) {
            return true;
        }
        return LIZ(aid);
    }
}
