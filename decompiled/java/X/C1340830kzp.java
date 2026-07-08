package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340830kzp {
    public int LIZ;
    public long LJ;
    public long LJFF;
    public Comment LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public final List<Comment> LIZIZ = new ArrayList();
    public final List<Comment> LIZJ = new ArrayList();
    public int LIZLLL = 3;
    public List<String> LJII = new ArrayList();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentReplyButtonExtraData(defaultServerExpandCommentCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cachedExpandedComment=");
        sbLIZ.append(((ArrayList) this.LIZJ).size());
        sbLIZ.append(", expandSizeWhenClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", comment=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", newTopIds=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(",  hasMore=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", allExpanded=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
