package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdSuggestWordModel;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AdFeedSearchBottomBarAssemTrigger;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688180Qz2 {
    public static long LIZ(Aweme aweme) {
        float fFloatValue;
        AwemeRawAd awemeRawAd;
        SearchAdSuggestWordModel searchAdSuggestWordModel;
        Float showTime;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdSuggestWordModel = awemeRawAd.getSearchAdSuggestWordModel()) != null && (showTime = searchAdSuggestWordModel.getShowTime()) != null) {
            fFloatValue = showTime.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        return (long) (fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (LIZ(aweme) == 0) {
            return true;
        }
        return false;
    }

    public static C688190Qz3 LJ(VideoItemParams videoItemParams) {
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        Object objLJJJLL;
        WordStruct wordStruct;
        List<WordStruct> listLJJJJLI;
        String word;
        PromotionInfo promoteInfo;
        String penetrateInfo;
        String wordsType;
        String wordsLang;
        String textnetId;
        Word wordRecord;
        Word wordRecord2;
        Word wordRecord3;
        String wordId;
        int i = AdFeedSearchBottomBarAssemTrigger.LLJLIL;
        Aweme aweme = videoItemParams.getAweme();
        C688190Qz3 c688190Qz3 = new C688190Qz3();
        if (aweme != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                Boolean boolIsPersonalized = null;
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF("feed_bar", scene)) {
                    List<WordStruct> words = suggestWordStruct.getWords();
                    if (words != null && words.size() > 0) {
                        List<WordStruct> words2 = suggestWordStruct.getWords();
                        if (words2 != null) {
                            objLJJJLL = ListProtector.get(words2, 0);
                            wordStruct = (WordStruct) objLJJJLL;
                        }
                        wordStruct = null;
                    } else {
                        List<WordStruct> words3 = suggestWordStruct.getWords();
                        if (words3 != null) {
                            objLJJJLL = C13LP.LJJJLL(words3);
                            wordStruct = (WordStruct) objLJJJLL;
                        }
                        wordStruct = null;
                    }
                    List<WordStruct> words4 = suggestWordStruct.getWords();
                    if (words4 != null) {
                        listLJJJJLI = C13LP.LJJJJLI(words4);
                    } else {
                        listLJJJJLI = C13BV.INSTANCE;
                    }
                    c688190Qz3.LIZ = listLJJJJLI;
                    c688190Qz3.LIZIZ = wordStruct;
                    String str = "";
                    if (wordStruct == null || (word = wordStruct.getWord()) == null) {
                        word = "";
                    }
                    c688190Qz3.LIZJ = word;
                    if (wordStruct != null && (wordId = wordStruct.getWordId()) != null) {
                        str = wordId;
                    }
                    c688190Qz3.LIZLLL = str;
                    if (wordStruct != null) {
                        promoteInfo = wordStruct.getPromoteInfo();
                    } else {
                        promoteInfo = null;
                    }
                    c688190Qz3.LJFF = promoteInfo;
                    c688190Qz3.LJI = suggestWordStruct.getQrecVirtualEnable();
                    if (wordStruct != null) {
                        penetrateInfo = wordStruct.getPenetrateInfo();
                    } else {
                        penetrateInfo = null;
                    }
                    c688190Qz3.LJII = penetrateInfo;
                    if (wordStruct != null) {
                        wordsType = wordStruct.getWordsType();
                    } else {
                        wordsType = null;
                    }
                    c688190Qz3.LJ = wordsType;
                    if (wordStruct != null && (wordRecord3 = wordStruct.getWordRecord()) != null) {
                        wordsLang = wordRecord3.getWordsLang();
                    } else {
                        wordsLang = null;
                    }
                    c688190Qz3.LJIIIIZZ = wordsLang;
                    if (wordStruct != null && (wordRecord2 = wordStruct.getWordRecord()) != null) {
                        textnetId = wordRecord2.getTextnetId();
                    } else {
                        textnetId = null;
                    }
                    c688190Qz3.LJIIIZ = textnetId;
                    c688190Qz3.LJIIJ = suggestWordStruct.getHintText();
                    if (wordStruct != null && (wordRecord = wordStruct.getWordRecord()) != null) {
                        boolIsPersonalized = wordRecord.isPersonalized();
                    }
                    c688190Qz3.LJIIJJI = boolIsPersonalized;
                }
            }
        }
        return c688190Qz3;
    }

    public static boolean LIZIZ(C688190Qz3 c688190Qz3, Aweme aweme) {
        boolean z;
        boolean z2;
        if (aweme != null && C1010120cOQ.LJIIIZ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (c688190Qz3.LIZJ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    public static void LIZJ(VideoItemParams videoItemParams, C688190Qz3 c688190Qz3) {
        String str;
        String tabName;
        String groupId;
        Integer numValueOf;
        boolean zIsEnableAdStarHub;
        String wordsLabel;
        String qrecJsonInfo;
        InterfaceC688220Qz6 interfaceC688220Qz6LJJI;
        Word wordRecord;
        Word wordRecord2;
        C2189821An6 c2189821An6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[searchMobShow] keyword: ");
        if (c688190Qz3 != null) {
            str = c688190Qz3.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c688190Qz3 != null && videoItemParams != null && videoItemParams.getAweme() != null) {
            String str2 = c688190Qz3.LIZJ;
            if (str2 != null && str2.length() == 0) {
                return;
            }
            String str3 = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL;
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Aweme aweme = videoItemParams.getAweme();
            String str4 = videoItemParams.mEventType;
            String str5 = c688190Qz3.LIZLLL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = c688190Qz3.LIZJ;
            if (str6 == null) {
                str6 = "";
            }
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                tabName = "";
            }
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 == null || (groupId = aweme2.getGroupId()) == null) {
                groupId = "";
            }
            PromotionInfo promotionInfo = c688190Qz3.LJFF;
            String str7 = c688190Qz3.LJII;
            String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688190Qz3.LIZJ()));
            if (strLIZLLL == null) {
                strLIZLLL = CardStruct.IStatusCode.DEFAULT;
            }
            String str8 = c688190Qz3.LJIIIIZZ;
            String str9 = c688190Qz3.LJ;
            String str10 = c688190Qz3.LJIIIZ;
            Integer numValueOf2 = Integer.valueOf(videoItemParams.mPageType);
            List<WordStruct> list = c688190Qz3.LIZ;
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            AwemeCommerceStruct commerceVideoAuthInfo = videoItemParams.getAweme().getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                zIsEnableAdStarHub = commerceVideoAuthInfo.isEnableAdStarHub();
            } else {
                zIsEnableAdStarHub = false;
            }
            Boolean boolValueOf = Boolean.valueOf(zIsEnableAdStarHub);
            WordStruct wordStruct = c688190Qz3.LIZIZ;
            if (wordStruct != null && (wordRecord2 = wordStruct.getWordRecord()) != null) {
                wordsLabel = wordRecord2.getWordsLabel();
            } else {
                wordsLabel = null;
            }
            WordStruct wordStruct2 = c688190Qz3.LIZIZ;
            if (wordStruct2 != null && (wordRecord = wordStruct2.getWordRecord()) != null) {
                qrecJsonInfo = wordRecord.getQrecJsonInfo();
            } else {
                qrecJsonInfo = null;
            }
            c1er1.LLLLLLZ(aweme, str4, str5, str6, tabName, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, groupId, str3, promotionInfo, str7, strLIZLLL, str8, str9, str10, numValueOf2, strValueOf, null, null, boolValueOf, null, null, wordsLabel, null, null, null, null, null, qrecJsonInfo, "ad_related_search_anchor_v2");
            C0R12 c0r12 = C0R12.LIZIZ;
            if (c0r12 != null && (interfaceC688220Qz6LJJI = c0r12.LJJI()) != null) {
                interfaceC688220Qz6LJJI.LJ(videoItemParams.getAweme(), "feed_bar", C0QQU.SHOW);
            }
        }
    }
}
