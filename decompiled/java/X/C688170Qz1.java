package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688170Qz1 {
    public static C688190Qz3 LIZ(int i, Aweme aweme) {
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        int size;
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
                    if (words != null) {
                        size = words.size();
                    } else {
                        size = 0;
                    }
                    if (size > i) {
                        List<WordStruct> words2 = suggestWordStruct.getWords();
                        if (words2 != null) {
                            objLJJJLL = ListProtector.get(words2, i);
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
        Object service;
        if (((Number) C218000sk.LIZ.getValue()).intValue() == 1) {
            return false;
        }
        if (aweme != null) {
            if (C1010120cOQ.LJIIIZ(aweme)) {
                return false;
            }
            StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
            if (standardComponentInfo != null && !standardComponentInfo.shouldShowBanner(aweme.getBanners(), "bottom_banner_search_rs")) {
                return false;
            }
        }
        boolean zLJIIIZ = ComplianceServiceProvider.LJIIJJI().LJIIIZ();
        if (!Intrinsics.LJFF(c688190Qz3.LIZJ, "")) {
            if (C1157804fw.LIZ()) {
                service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchBottomBarAssemPartial");
                }
            } else {
                service = ServiceManager.get().getService(ISearchService.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchBottomBarAssemPartial");
                }
            }
            if (((InterfaceC688200Qz4) service).LLJJJJ() && !zLJIIIZ && !ComplianceServiceProvider.LJI().LJJJI()) {
                return true;
            }
        }
        return false;
    }

    public static C688190Qz3 LIZJ(C688170Qz1 c688170Qz1, VideoItemParams videoItemParams) {
        c688170Qz1.getClass();
        return LIZ(0, videoItemParams.getAweme());
    }
}
