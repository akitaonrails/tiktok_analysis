package X;

import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: X.0kzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340860kzs {
    public int LIZ;
    public int LIZIZ = 3;
    public long LIZJ;
    public Comment LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentReplyButtonExtraData(defaultServerExpandCommentCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",  expandSizeWhenClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",  comment=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(false);
        sbLIZ.append(", allExpanded=");
        sbLIZ.append(false);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
