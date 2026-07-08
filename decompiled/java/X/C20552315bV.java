package X;

import Y.ACallableS10S1101000_31;
import Y.ACallableS24S2100000_31;
import Y.ACallableS75S1100000_31;
import Y.ACallableS7S1100100_31;
import com.ss.android.ugc.aweme.feed.ab.FeedLynxCardFallbackExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.15bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20552315bV {
    public static long LIZ;
    public static boolean LIZIZ;

    public static String LJIIIIZZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "other" : "client" : "fyp" : "fcp";
    }

    public static final void LIZ(FeedItemList feedItemList) {
        List<Aweme> awemeList;
        if (!C300550BqH.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (feedItemList != null && (awemeList = feedItemList.getAwemeList()) != null) {
            arrayList.addAll(awemeList);
        }
        C0T5M c0t5m = C0T5M.LIZ;
        ACallableS75S1100000_31 aCallableS75S1100000_31 = new ACallableS75S1100000_31(arrayList, 1);
        c0t5m.getClass();
        C0T5M.LIZIZ(aCallableS75S1100000_31);
    }

    public static void LIZIZ(Aweme aweme) {
        if (!C300550BqH.LIZ()) {
            return;
        }
        C0T5M c0t5m = C0T5M.LIZ;
        ACallableS75S1100000_31 aCallableS75S1100000_31 = new ACallableS75S1100000_31(aweme, 2);
        c0t5m.getClass();
        C0T5M.LIZIZ(aCallableS75S1100000_31);
    }

    public static String LJII(Aweme aweme) {
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo == null) {
            return "";
        }
        int cardSource = cardInsertInfo.getCardSource();
        if (cardSource != 1) {
            if (cardSource != 2) {
                if (cardSource != 3) {
                    return "";
                }
                return cardInsertInfo.getDiffType();
            }
            return "fyp_server";
        }
        return String.valueOf(cardInsertInfo.getCardType());
    }

    public static String LJIIIZ(Aweme aweme) {
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo == null) {
            return "";
        }
        int cardSource = cardInsertInfo.getCardSource();
        if (cardSource != 1) {
            if (cardSource != 2) {
                if (cardSource != 3) {
                    return "";
                }
                if (!u.LJIIZILJ(cardInsertInfo.getDiffType(), "_card", false)) {
                    return "video";
                }
            } else {
                return "video";
            }
        } else if (104 != aweme.getAwemeType()) {
            if (105 == aweme.getAwemeType()) {
                FeedLynxCardFallbackExperiment feedLynxCardFallbackExperiment = FeedLynxCardFallbackExperiment.LIZ;
                Integer numValueOf = Integer.valueOf(cardInsertInfo.getCardType());
                feedLynxCardFallbackExperiment.getClass();
                if (FeedLynxCardFallbackExperiment.LIZ(numValueOf)) {
                    if (((ArrayList) C1554560qYY.LIZ).contains(aweme.getAid())) {
                        return "lynx_fallback";
                    }
                    return "lynx";
                }
                return "lynx";
            }
            return "video";
        }
        return "card";
    }

    public static boolean LJIIJ(Aweme aweme) {
        if (!Intrinsics.LJFF("card", LJIIIZ(aweme)) && !Intrinsics.LJFF("lynx", LJIIIZ(aweme)) && !Intrinsics.LJFF("lynx_fallback", LJIIIZ(aweme))) {
            return false;
        }
        return true;
    }

    public static int LJIIJJI(Aweme aweme) {
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo == null) {
            return 0;
        }
        int cardSource = cardInsertInfo.getCardSource();
        if (cardSource != 1) {
            if (cardSource != 2) {
                if (cardSource == 3 && !u.LJIIZILJ(cardInsertInfo.getDiffType(), "_card", false)) {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            if (104 == aweme.getAwemeType() || 105 == aweme.getAwemeType()) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public static void LIZLLL(Aweme aweme, String str) {
        if (!C300550BqH.LIZ() || aweme == null) {
            return;
        }
        LIZIZ = true;
        C0T5M c0t5m = C0T5M.LIZ;
        ACallableS24S2100000_31 aCallableS24S2100000_31 = new ACallableS24S2100000_31(str, aweme, 1);
        c0t5m.getClass();
        C0T5M.LIZIZ(aCallableS24S2100000_31);
    }

    public static void LJ(long j, Aweme aweme) {
        if (!C300550BqH.LIZ() || aweme == null) {
            return;
        }
        if (j < 0 || j > 86400000) {
            j = -1;
        }
        LIZIZ = false;
        C0T5M c0t5m = C0T5M.LIZ;
        ACallableS7S1100100_31 aCallableS7S1100100_31 = new ACallableS7S1100100_31(j, aweme, 1);
        c0t5m.getClass();
        C0T5M.LIZIZ(aCallableS7S1100100_31);
    }

    public static String LJI(Integer num, String str) {
        Map<Integer, CardShowInfo> map;
        CardShowInfo cardShowInfo;
        String str2;
        if (str == null) {
            return "";
        }
        if (num != null && num.intValue() == 1 && C1867050ygZ.LIZ()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                Integer numValueOf = Integer.valueOf(numLJIIJJI.intValue());
                FeedCardInsertConfig feedCardInsertConfigLIZ = C20551415bM.LIZ();
                if (feedCardInsertConfigLIZ != null && (map = feedCardInsertConfigLIZ.cardInfo) != null && (cardShowInfo = map.get(numValueOf)) != null && (str2 = cardShowInfo.businessType) != null && str2.length() != 0) {
                    return str2;
                }
            }
            Map<String, String> map2 = C20681215wI.LIZJ;
            if (map2.containsKey(str)) {
                return (String) ((LinkedHashMap) map2).get(str);
            }
        } else {
            Map<String, String> map3 = C20681215wI.LIZJ;
            if (map3.containsKey(str)) {
                return (String) ((LinkedHashMap) map3).get(str);
            }
        }
        return "";
    }

    public static void LJIIL(Aweme aweme, String str) {
        CardInsertInfo cardInsertInfo;
        if (aweme == null || (cardInsertInfo = aweme.getCardInsertInfo()) == null || cardInsertInfo.getCardSource() != 1 || cardInsertInfo.isRealTime() != 1) {
            return;
        }
        if (Intrinsics.LJFF(str, "show")) {
            C20551815bQ.LIZ.getClass();
            CardInsertInfo cardInsertInfo2 = aweme.getCardInsertInfo();
            if (cardInsertInfo2 != null) {
                String showTiming = cardInsertInfo2.getShowTiming();
                String strValueOf = String.valueOf(cardInsertInfo2.getCardType());
                C080A.LIZ(C080C.REALTIME_SPECIAL_CARD, "card_show", showTiming, strValueOf);
                C080A.LIZIZ("outreach_show", showTiming, EnumC20654715s1.SPECIAL_CARD.getTypeName(), strValueOf, null);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "click")) {
            C20551815bQ.LIZ.getClass();
            CardInsertInfo cardInsertInfo3 = aweme.getCardInsertInfo();
            if (cardInsertInfo3 != null) {
                String showTiming2 = cardInsertInfo3.getShowTiming();
                String strValueOf2 = String.valueOf(cardInsertInfo3.getCardType());
                C080A.LIZ(C080C.REALTIME_SPECIAL_CARD, "card_click", showTiming2, strValueOf2);
                C080A.LIZIZ("outreach_click", showTiming2, EnumC20654715s1.SPECIAL_CARD.getTypeName(), strValueOf2, null);
            }
        }
    }

    public static void LIZJ(Aweme aweme, String str, boolean z) {
        int i;
        if (!C300550BqH.LIZ() || aweme == null || !LJIIJ(aweme)) {
            return;
        }
        if (!Intrinsics.LJFF("homepage_hot", str) && !Intrinsics.LJFF("homepage_nearby", str) && !Intrinsics.LJFF("homepage_follow", str) && !Intrinsics.LJFF("homepage_friends", str)) {
            return;
        }
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        LJIIL(aweme, "click");
        C0T5M c0t5m = C0T5M.LIZ;
        ACallableS10S1101000_31 aCallableS10S1101000_31 = new ACallableS10S1101000_31(i, aweme, str, 1);
        c0t5m.getClass();
        C0T5M.LIZIZ(aCallableS10S1101000_31);
    }

    public static void LJFF(final int i, final int i2, Integer num) {
        if (num != null) {
            final int iIntValue = num.intValue();
            final float fLIZLLL = C13LZ.LIZLLL((float) ((Number) C0B45.LIZ.getValue()).doubleValue(), 0.0f, 1.0f);
            if (C732340So4.LIZ(fLIZLLL)) {
                C0T5M c0t5m = C0T5M.LIZ;
                Callable callable = new Callable() { // from class: X.129o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("MutantCardMobHelper@6495.freqCheckMob$1$1");
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(iIntValue, "card_type");
                        c2344009Gk.LIZJ(i2, "request_count");
                        c2344009Gk.LIZJ(i, "error_type");
                        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(1, String.valueOf(iIntValue)));
                        c2344009Gk.LIZIZ(fLIZLLL, "sample_rate");
                        C20684815ws.LJIILLIIL("special_shaped_card_insert_error", c2344009Gk.LIZ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MutantCardMobHelper@6495.freqCheckMob$1$1");
                        return unit;
                    }
                };
                c0t5m.getClass();
                C0T5M.LIZIZ(callable);
            }
        }
    }
}
