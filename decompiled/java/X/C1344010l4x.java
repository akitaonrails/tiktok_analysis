package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2;
import com.ss.android.ugc.aweme.commentv2.commentlist.ICommentApiV2;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344010l4x {
    public static final List<Comment> LIZ = new ArrayList();
    public static final List<Comment> LIZIZ = new ArrayList();

    public static String LIZ() {
        StringBuilder sb = new StringBuilder();
        for (Comment comment : (ArrayList) LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(comment.getCid());
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (Comment comment2 : (ArrayList) LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(comment2.getCid());
            sbLIZ2.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return C13LN.LJLJLLL(sb).toString();
    }

    public static void LIZLLL(List list) {
        ArrayList arrayList = (ArrayList) LIZ;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            List<CommentImageStruct> imageList = ((Comment) obj).getImageList();
            if (imageList != null && !imageList.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C11NZ LIZIZ(CommentContextSource commentContextSource, Object obj, Function1 function1) {
        int i;
        Long lValueOf;
        String str;
        String str2;
        ICommentApiV2 iCommentApiV2;
        if (commentContextSource == null) {
            return C11IR.LL;
        }
        Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme == null) {
            return C11IR.LL;
        }
        String strEventType = CommentContextSourceKt.eventType(commentContextSource);
        int value = C1343890l4l.LIZ(aweme.getAuthor(), strEventType).getValue();
        CommentCommonModel commonModel = commentContextSource.getCommonModel();
        if (commonModel != null && commonModel.isNoPermissionVideoFromCommentHistory()) {
            i = 5;
        } else {
            i = 0;
        }
        boolean zLIZ = C1346420l8q.LIZ((Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue());
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        long jLJFF = C1346420l8q.LJFF(lValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C827070WcT.LIZ.getClass();
        sbLIZ.append(C827070WcT.LIZJ());
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (commentContextSource.getCurrSortType() == EnumC1342450l2R.TIME_SORT) {
            str = "tiktok_video_comment_option_time_photo_inner_flow";
        } else {
            str = "tiktok_video_comment_photo_inner_flow";
        }
        if (function1 != null && (iCommentApiV2 = (ICommentApiV2) function1.invoke(ICommentApiV2.class)) != null) {
            str2 = strEventType;
            C11NZ<CommentItemList> c11nzFetchCommentPhotoListV2 = iCommentApiV2.fetchCommentPhotoListV2(aweme.getAid(), 10, value, i, zLIZ, jLJFF, strEventType, str, strLIZIZ, LIZ(), AwemeExtKt.getAuthorUid(aweme), C04RD.LIZ(), obj);
            if (c11nzFetchCommentPhotoListV2 != null) {
                return c11nzFetchCommentPhotoListV2;
            }
        } else {
            str2 = strEventType;
        }
        return CommentApiV2.LIZIZ.fetchCommentPhotoListV2(aweme.getAid(), 10, value, i, zLIZ, jLJFF, str2, str, strLIZIZ, LIZ(), AwemeExtKt.getAuthorUid(aweme), C04RD.LIZ(), obj);
    }

    public static C11NZ LIZJ(String str, CommentContextSource commentContextSource, Object obj, Function1 function1) {
        String str2;
        ICommentApiV2 iCommentApiV2;
        boolean z = false;
        if (str != null && str.length() != 0 && commentContextSource != null) {
            Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
            if (aweme == null) {
                return C11IR.LL;
            }
            String strEventType = CommentContextSourceKt.eventType(commentContextSource);
            int value = C1343890l4l.LIZ(aweme.getAuthor(), strEventType).getValue();
            CommentCommonModel commonModel = commentContextSource.getCommonModel();
            if (commonModel != null && commonModel.isNoPermissionVideoFromCommentHistory()) {
                z = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C827070WcT.LIZ.getClass();
            sbLIZ.append(C827070WcT.LIZJ());
            sbLIZ.append(System.currentTimeMillis());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (function1 != null && (iCommentApiV2 = (ICommentApiV2) function1.invoke(ICommentApiV2.class)) != null) {
                str2 = strEventType;
                C11NZ<CommentItemList> c11nzFetchSecondaryPhotoComment = iCommentApiV2.fetchSecondaryPhotoComment(str, aweme.getAid(), 10, value, str2, z, strLIZIZ, "tiktok_video_reply_photo_inner_flow", LIZ(), AwemeExtKt.getAuthorUid(aweme), obj);
                if (c11nzFetchSecondaryPhotoComment != null) {
                    return c11nzFetchSecondaryPhotoComment;
                }
            } else {
                str2 = strEventType;
            }
            return CommentApiV2.LIZIZ.fetchSecondaryPhotoComment(str, aweme.getAid(), 10, value, str2, z, strLIZIZ, "tiktok_video_reply_photo_inner_flow", LIZ(), AwemeExtKt.getAuthorUid(aweme), obj);
        }
        return C11IR.LL;
    }
}
