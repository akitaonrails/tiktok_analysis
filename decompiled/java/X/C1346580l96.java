package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.comment.experiment.ReplyCommentUIOptConfig;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l96, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346580l96 {
    public static final C1346580l96 LIZ = new C1346580l96();

    public static String LIZ(Context context, CommentContextSource commentContextSource, Comment comment, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        CommentCommonModel commonModel;
        Aweme aweme;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && (aweme = commonModel.aweme) != null) {
            boolean zLJFF = Intrinsics.LJFF(CommentContextSourceKt.fromPage(commentContextSource), "graphic_detail");
            String str = commentContextSource.getCommonModel().eventType;
            if (str == null) {
                str = "";
            }
            return LIZIZ(context, aweme, comment, z, z2, z3, z4, str, zLJFF, commentContextSource.getCommonModel().isInPhotoCommentDetailPage(), z5);
        }
        return context.getResources().getString(2131829129);
    }

    public static String LIZIZ(Context context, Aweme aweme, Comment comment, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7) {
        Story story;
        String strLJ;
        int iLJIILLIIL = C1348730lCZ.LJIILLIIL(aweme);
        if (iLJIILLIIL != 0) {
            if (iLJIILLIIL != 1) {
                if (iLJIILLIIL != 2) {
                    if (iLJIILLIIL != 4) {
                        if (iLJIILLIIL != 5) {
                            if (comment != null) {
                                if (((ReplyCommentUIOptConfig) C1347620lAm.LIZIZ.getValue()).replyInfoStyle == 1 && (!z6 || !z7)) {
                                    return context.getResources().getString(2131829129);
                                }
                                Resources resources = context.getResources();
                                Object[] objArr = new Object[1];
                                User user = comment.getUser();
                                if (user != null) {
                                    strLJ = C1342220l24.LJ(user, str, true, true);
                                } else {
                                    strLJ = null;
                                }
                                objArr[0] = strLJ;
                                return resources.getString(2131835456, objArr);
                            }
                            if (z2) {
                                C1350650lFf.LIZ.getClass();
                                if (C1350650lFf.LIZIZ() && z) {
                                    return context.getResources().getString(2131826734);
                                }
                                if (CommentWithStickerExp.LIZIZ() && z3) {
                                    return context.getResources().getString(2131826735);
                                }
                                if (CommentWithStickerExp.LIZIZ() && z4) {
                                    return context.getResources().getString(2131826733);
                                }
                            }
                            return C1349280lDS.LJIIIIZZ(aweme, context.getResources().getString(2131829129));
                        }
                        String string = context.getResources().getString(2131829042);
                        C20684815ws.LJIILLIIL("viewer_filter_all_placeholder_show", C2097608Jq.LJIIIIZZ(new Pair("group_id", aweme.getAid()), new Pair("author_id", AwemeExtKt.getAuthorUid(aweme))));
                        return string;
                    }
                    return context.getResources().getString(2131829129);
                }
                return context.getResources().getString(2131829170);
            }
            Resources resources2 = context.getResources();
            if (z5) {
                return resources2.getString(2131829129);
            }
            if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                return resources2.getString(2131829191);
            }
            if (C729510SjV.LJJIJIL(aweme) && (story = aweme.getStory()) != null && StoryKt.isStoryV2(story)) {
                return resources2.getString(2131830722);
            }
            return resources2.getString(2131829236);
        }
        return context.getResources().getString(2131846843);
    }
}
