package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail.SearchInflowProductShopCardService;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEntranceEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010090cON implements InterfaceC688220Qz6 {
    public static final C1010090cON LIZ = new C1010090cON();
    public static long LIZIZ;

    @Override // X.InterfaceC688220Qz6
    public final void LIZIZ(AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("button", "refer");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final void LIZLLL(Aweme aweme) {
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJJI);
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJFF(AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "click", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("like", "refer");
        c1022820ciuLIZLLL.LJII();
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad", "otherclick", awemeRawAd);
        c1022820ciuLIZLLL2.LIZJ("like", "refer");
        c1022820ciuLIZLLL2.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final C09AE LJIIIIZZ(Aweme aweme) {
        long jLongValue;
        C09AE c09aeLIZLLL;
        AwemeSearchAdModel searchAdInfo;
        Long l;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (l = searchAdInfo.searchAdLiveClickDelayTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = C1010130cOR.LIZ;
        }
        if (jLongValue > 0) {
            c09aeLIZLLL = C0R12.LIZIZ.LIZLLL(aweme);
        } else {
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJIIZILJ, new AwS31S0000100_16(jLongValue, 19));
            c09aeLIZLLL = null;
        }
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJIJ);
        int i = C2510609se.LIZ;
        C1019100ccu.LJFF();
        return c09aeLIZLLL;
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIIL(AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "click", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("title", "refer");
        c1022820ciuLIZLLL.LJII();
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad", "otherclick", awemeRawAd);
        c1022820ciuLIZLLL2.LIZJ("title", "refer");
        c1022820ciuLIZLLL2.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIILL(AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "click_source", awemeRawAd);
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad", "otherclick", awemeRawAd);
        if (C1022030chd.LJIJJLI() && awemeRawAd != null && C1010120cOQ.LJJIJIL(awemeRawAd)) {
            c1022820ciuLIZLLL.LIZIZ(1, "have_profile_page");
            c1022820ciuLIZLLL2.LIZIZ(1, "have_profile_page");
        }
        c1022820ciuLIZLLL.LIZJ("source", "refer");
        c1022820ciuLIZLLL.LJII();
        c1022820ciuLIZLLL2.LIZJ("source", "refer");
        c1022820ciuLIZLLL2.LJII();
    }

    public static void LJIIZILJ(C1022820ciu c1022820ciu, String str) {
        if (str != null) {
            c1022820ciu.LIZIZ(str, "room_id");
        }
    }

    public static void LJIJ(C1022820ciu c1022820ciu, AwemeRawAd awemeRawAd) {
        Map<String, Object> mapLIZIZ;
        ISamsungPageService iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null);
        if (iSamsungPageService != null && (mapLIZIZ = iSamsungPageService.LIZIZ(awemeRawAd)) != null) {
            Iterator<T> it2 = mapLIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object value = entry.getValue();
                if (value != null) {
                    c1022820ciu.LIZIZ(value, (String) entry.getKey());
                }
            }
        }
    }

    @Override // X.InterfaceC688220Qz6
    public final void LIZ(AwemeRawAd awemeRawAd, String str) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "comment", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("comment_sign", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "comment_status");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJI(AwemeRawAd awemeRawAd, String str) {
        if (!C1010120cOQ.LJJJI(awemeRawAd)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad_bg", "otherclick", awemeRawAd);
            LIZ.getClass();
            LJIIZILJ(c1022820ciuLIZLLL, str);
            c1022820ciuLIZLLL.LIZJ("bg_download_button", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad_bg", "click", awemeRawAd);
        LIZ.getClass();
        LJIIZILJ(c1022820ciuLIZLLL2, str);
        LJIJ(c1022820ciuLIZLLL2, awemeRawAd);
        c1022820ciuLIZLLL2.LIZJ("bg_download_button", "refer");
        c1022820ciuLIZLLL2.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJII(AwemeRawAd awemeRawAd, String str) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentRelationModel> map;
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.componentRelations) != null && map.containsKey("search_open_loop_anchor")) {
            return;
        }
        if (!C1010120cOQ.LJJJI(awemeRawAd)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "otherclick", awemeRawAd);
            LIZ.getClass();
            LJIIZILJ(c1022820ciuLIZLLL, str);
            c1022820ciuLIZLLL.LIZJ("button", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad", "click", awemeRawAd);
        LIZ.getClass();
        LJIIZILJ(c1022820ciuLIZLLL2, str);
        LJIJ(c1022820ciuLIZLLL2, awemeRawAd);
        c1022820ciuLIZLLL2.LIZJ("button", "refer");
        c1022820ciuLIZLLL2.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIIJJI(AwemeRawAd awemeRawAd, boolean z) {
        AwemeSearchAdModel searchAdInfo;
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && Intrinsics.LJFF(searchAdInfo.isPreciseAd(), Boolean.TRUE)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        if (j == 0 || jCurrentTimeMillis - j >= 500) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "othershow", awemeRawAd);
            c1022820ciuLIZLLL.LIZJ("sound_button", "refer");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(!z ? 1 : 0), "is_unmute");
            c1022820ciuLIZLLL.LJII();
            LIZIZ = jCurrentTimeMillis;
        }
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIILIIL(AwemeRawAd awemeRawAd, String str) {
        if (!C1010120cOQ.LJJJI(awemeRawAd)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad_bg", "otherclick", awemeRawAd);
            LIZ.getClass();
            LJIIZILJ(c1022820ciuLIZLLL, str);
            if (awemeRawAd != null && C1010120cOQ.LJJIII(awemeRawAd)) {
                c1022820ciuLIZLLL.LIZJ("bg_button", "refer");
            } else {
                c1022820ciuLIZLLL.LIZJ("bg_more_button", "refer");
            }
            c1022820ciuLIZLLL.LJII();
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad_bg", "click", awemeRawAd);
        LIZ.getClass();
        LJIIZILJ(c1022820ciuLIZLLL2, str);
        if (awemeRawAd != null && C1010120cOQ.LJJIII(awemeRawAd)) {
            c1022820ciuLIZLLL2.LIZJ("bg_button", "refer");
        } else {
            c1022820ciuLIZLLL2.LIZJ("bg_more_button", "refer");
        }
        c1022820ciuLIZLLL2.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIILLIIL(AwemeRawAd awemeRawAd, boolean z) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "otherclick", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("sound_button", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(!z ? 1 : 0), "is_unmute");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.InterfaceC688220Qz6
    public final C09AE LIZJ(Aweme aweme, Aweme aweme2, Aweme aweme3) {
        long jLongValue;
        C09AE c09aeLIZLLL;
        AwemeSearchAdModel searchAdInfo;
        Long l;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
        LIZ.getClass();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (l = searchAdInfo.searchAdLiveClickDelayTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = C1010130cOR.LIZ;
        }
        if (jLongValue > 0) {
            c09aeLIZLLL = C0R12.LIZIZ.LIZLLL(aweme);
        } else {
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJIIZILJ, new AwS31S0000100_16(jLongValue, 20));
            c09aeLIZLLL = null;
        }
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJIJI, new AwS225S0300000_16(aweme, aweme2, aweme3, 17));
        int i = C2510609se.LIZ;
        C1019100ccu.LJFF();
        return c09aeLIZLLL;
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJ(Aweme aweme, String str, C0QQU c0qqu) {
        C1023960ckk c1023960ckk;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        List<WordStruct> words;
        WordStruct wordStruct;
        String word = null;
        if (aweme != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF(scene, str)) {
                    if (suggestWordStruct != null && (words = suggestWordStruct.getWords()) != null && (wordStruct = (WordStruct) C13LP.LJJJJZI(words)) != null) {
                        word = wordStruct.getWord();
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (Intrinsics.LJFF(str, "feed_bar")) {
            int i = C0QQV.LIZ[c0qqu.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C1010100cOO.LIZ.getClass();
                    c1023960ckk = C1010100cOO.LIZIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1010100cOO.LIZ.getClass();
                c1023960ckk = C1010100cOO.LIZJ;
            }
        } else {
            if (!Intrinsics.LJFF(str, "comment_top")) {
                return;
            }
            int i2 = C0QQV.LIZ[c0qqu.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C1010100cOO.LIZ.getClass();
                    c1023960ckk = C1010100cOO.LIZLLL;
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1010100cOO.LIZ.getClass();
                c1023960ckk = C1010100cOO.LJ;
            }
        }
        if (c1023960ckk != null) {
            new SearchAdEntranceEventLogger(new Object[]{aweme, C1010120cOQ.LJIIIIZZ(aweme)}).logAd(c1023960ckk, new AwS67S1000000_16(word, 28));
        }
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIIIZ(AwemeRawAd awemeRawAd, String str, String str2) {
        String str3;
        UrlModel trackUrlList;
        Long creativeId;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "show", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str, "enter_from");
        if (C1010120cOQ.LJIILLIIL(awemeRawAd)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c1022820ciuLIZLLL.LIZIZ(str3, "has_anchor");
        LIZ.getClass();
        LJIIZILJ(c1022820ciuLIZLLL, str2);
        c1022820ciuLIZLLL.LJII();
        String logExtra = null;
        if (awemeRawAd != null) {
            trackUrlList = awemeRawAd.getTrackUrlList();
            creativeId = awemeRawAd.getCreativeId();
            logExtra = awemeRawAd.getLogExtra();
        } else {
            trackUrlList = null;
            creativeId = null;
        }
        new AwS630S0100000_16(awemeRawAd, 81);
        C2201691BEx.LIZ("show", trackUrlList, creativeId, logExtra);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // X.InterfaceC688220Qz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            if (r5 == 0) goto L61
            java.lang.String r1 = "draw_ad"
        L4:
            java.lang.String r0 = "othershow"
            X.0ciu r2 = X.C2184171Adz.LIZLLL(r1, r0, r4)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "video"
            r2.LIZJ(r0, r1)
            if (r5 == 0) goto L58
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            if (r0 == 0) goto L5e
            r0.booleanValue()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            java.lang.String r1 = "1"
        L24:
            java.lang.String r0 = "is_first"
            r2.LIZIZ(r1, r0)
            boolean r0 = X.C1022030chd.LJFF()
            if (r0 == 0) goto L58
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_inner"
            r2.LIZIZ(r1, r0)
            if (r4 == 0) goto L5c
            java.util.Map r1 = r4.getSearchAdExtraParams()
            if (r1 == 0) goto L5c
            java.lang.String r0 = "inner_ad_position"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5c
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L53:
            java.lang.String r0 = "inner_g_pos"
            r2.LIZIZ(r1, r0)
        L58:
            r2.LJII()
            return
        L5c:
            r1 = 0
            goto L53
        L5e:
            java.lang.String r1 = "0"
            goto L24
        L61:
            java.lang.String r1 = "result_ad"
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010090cON.LJIIJ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, boolean, boolean):void");
    }

    @Override // X.InterfaceC688220Qz6
    public final void LJIILJJIL(AwemeRawAd awemeRawAd, boolean z, boolean z2, Integer num) {
        Long creativeId;
        AwemeSearchAdModel searchAdInfo;
        Integer numValueOf;
        Map<String, String> searchAdExtraParams;
        String str;
        AwemeRawAd awemeRawAd2;
        Integer numValueOf2;
        AwemeRawAd awemeRawAd3;
        Map<String, String> searchAdExtraParams2;
        String str2;
        Integer num2 = null;
        if (z && C1017180cZo.LJIJJ(awemeRawAd)) {
            List<Aweme> listLJ = SearchInflowProductShopCardService.LJII().LJ();
            if (listLJ != null) {
                for (Aweme aweme : listLJ) {
                    if (aweme != null) {
                        awemeRawAd2 = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "receive", awemeRawAd2);
                    if (C1022030chd.LJFF()) {
                        c1022820ciuLIZLLL.LIZJ("search_iac", "refer");
                        c1022820ciuLIZLLL.LIZIZ(1, "is_inner");
                        if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (searchAdExtraParams2 = awemeRawAd3.getSearchAdExtraParams()) != null && (str2 = searchAdExtraParams2.get("inner_ad_position")) != null) {
                            numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                        } else {
                            numValueOf2 = null;
                        }
                        c1022820ciuLIZLLL.LIZIZ(numValueOf2, "inner_g_pos");
                    }
                    if (z2) {
                        C1009990cOD.LIZ.getClass();
                        c1022820ciuLIZLLL.LIZIZ(1, C1009990cOD.LJII.LIZ);
                    }
                    c1022820ciuLIZLLL.LJII();
                }
                return;
            }
            return;
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("result_ad", "receive", awemeRawAd);
        if (z && C1022030chd.LJFF()) {
            c1022820ciuLIZLLL2.LIZIZ(1, "is_inner");
            if (awemeRawAd != null && (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) != null && (str = searchAdExtraParams.get("inner_ad_position")) != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                numValueOf = null;
            }
            c1022820ciuLIZLLL2.LIZIZ(numValueOf, "inner_g_pos");
        }
        if (z2) {
            C1009990cOD.LIZ.getClass();
            c1022820ciuLIZLLL2.LIZIZ(1, C1009990cOD.LJII.LIZ);
        }
        if (num != null) {
            c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(num.intValue()), "rank");
        }
        c1022820ciuLIZLLL2.LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RECEIVE]: cid = ");
        if (awemeRawAd != null) {
            creativeId = awemeRawAd.getCreativeId();
        } else {
            creativeId = null;
        }
        sbLIZ.append(creativeId);
        sbLIZ.append(", rank = ");
        sbLIZ.append(num);
        sbLIZ.append("， search_format_type = ");
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            num2 = searchAdInfo.searchFormatType;
        }
        sbLIZ.append(num2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C288610BSx.LIZ()) {
            C1022030chd c1022030chd = C1022030chd.LIZ;
            Aweme aweme2 = new Aweme();
            aweme2.setAd(true);
            aweme2.setAwemeRawAd(awemeRawAd);
            c1022030chd.getClass();
            C1022030chd.LJJIIZ(aweme2);
        }
    }
}
