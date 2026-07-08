package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0Pv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660240Pv4 {
    public static Comment LIZ(SearchMixFeed searchMixFeed) {
        Comment comment;
        Aweme aweme;
        List<Comment> commentList = searchMixFeed.getCommentList();
        if (commentList == null || (comment = (Comment) C13LP.LJJJLL(commentList)) == null || (aweme = searchMixFeed.getAweme()) == null || ((Number) C07GL.LIZ.getValue()).intValue() == 0 || aweme.isAd() || C1010120cOQ.LJJIJ(aweme) || AwemeExtKt.isPhotoMode(aweme)) {
            return null;
        }
        C10IT.LIZ.getClass();
        if (C10IT.LJIIL(aweme)) {
            return null;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE() && anchorCommonStruct.getShowInSearchResult()) {
                    return null;
                }
            }
        }
        return comment;
    }
}
