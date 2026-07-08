package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341570l11 {
    public static final C1341570l11 LIZ = new C1341570l11();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.comment.model.Comment r3, com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341570l11.LIZIZ(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static boolean LIZJ(Context context, CommentContextSource commentContextSource) {
        CommentEventModel eventModel;
        String str;
        Boolean boolValueOf;
        if (commentContextSource == null || (eventModel = commentContextSource.getEventModel()) == null || (str = eventModel.enterMethod) == null) {
            return false;
        }
        String str2 = commentContextSource.getEventModel().commentEnterMethod;
        if (!Intrinsics.LJFF(str, "click_view_comment_post") && !Intrinsics.LJFF(str, "click_view_text_image_comment_post") && !Intrinsics.LJFF(str2, "click_view_comment_post") && !Intrinsics.LJFF(str2, "click_view_text_image_comment_post")) {
            return false;
        }
        if (!Intrinsics.LJFF(commentContextSource.getCommonModel().fromPage, "graphic_detail")) {
            DetailNavArgModel navArgModel = C0SUC.LIZ(context).getNavArgModel();
            if (navArgModel != null) {
                boolValueOf = navArgModel.isFromViewPostEntry();
            } else {
                boolValueOf = null;
            }
        } else {
            boolValueOf = Boolean.valueOf(commentContextSource.getCommonModel().fromViewPostEntry);
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    public static boolean LIZ(Comment comment, Aweme aweme, String str) {
        String cid;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        boolean zLJFF = Intrinsics.LJFF(cid, str);
        if (C1340700kzc.LIZ()) {
            if (!zLJFF) {
                return false;
            }
        } else if (C1341590l13.LIZ() <= 1) {
            return false;
        }
        if (comment == null || !C1346390l8n.LIZJ(comment) || aweme == null || !C1346390l8n.LIZLLL(aweme)) {
            return false;
        }
        return true;
    }
}
