package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688460QzU {
    public static boolean LIZ(VideoItemParams videoItemParams, C688480QzW c688480QzW) {
        StandardComponentInfo standardComponentInfo;
        List<BannerCommonStruct> banners;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null) {
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 != null) {
                banners = aweme2.getBanners();
            } else {
                banners = null;
            }
            if (!standardComponentInfo.shouldShowBanner(banners, "bottom_banner_search_rs")) {
                return false;
            }
        }
        boolean zLJIIIZ = ComplianceServiceProvider.LJIIJJI().LJIIIZ();
        if (!Intrinsics.LJFF(c688480QzW.LIZ, "") && C1ER1.LIZIZ.LLJJJJ() && !zLJIIIZ && !ComplianceServiceProvider.LJI().LJJJI()) {
            return true;
        }
        return false;
    }

    public static C688480QzW LIZIZ(int i, VideoItemParams videoItemParams) {
        List<SuggestWordStruct> suggestWords;
        String scene;
        int size;
        Object objLJJJLL;
        WordStruct wordStruct;
        String word;
        PromotionInfo promoteInfo;
        String penetrateInfo;
        String wordId;
        C688480QzW c688480QzW = new C688480QzW();
        CommentSuggestWordList commentSuggestWordList = videoItemParams.getAweme().getCommentSuggestWordList();
        if (commentSuggestWordList != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                String wordsType = null;
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
                    String str = "";
                    if (wordStruct == null || (word = wordStruct.getWord()) == null) {
                        word = "";
                    }
                    c688480QzW.LIZ = word;
                    if (wordStruct != null && (wordId = wordStruct.getWordId()) != null) {
                        str = wordId;
                    }
                    c688480QzW.LIZIZ = str;
                    if (wordStruct != null) {
                        promoteInfo = wordStruct.getPromoteInfo();
                    } else {
                        promoteInfo = null;
                    }
                    c688480QzW.LIZLLL = promoteInfo;
                    c688480QzW.LJ = suggestWordStruct.getQrecVirtualEnable();
                    if (wordStruct != null) {
                        penetrateInfo = wordStruct.getPenetrateInfo();
                    } else {
                        penetrateInfo = null;
                    }
                    c688480QzW.LJFF = penetrateInfo;
                    if (wordStruct != null) {
                        wordsType = wordStruct.getWordsType();
                    }
                    c688480QzW.LIZJ = wordsType;
                }
            }
        }
        return c688480QzW;
    }
}
