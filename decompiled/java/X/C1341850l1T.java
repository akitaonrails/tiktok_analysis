package X;

import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: X.0l1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341850l1T {
    public final Comment LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C1341850l1T() {
        this(0, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertIdsResult(comment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1341850l1T(int i, int i2) {
        this((i2 & 2) != 0 ? -1 : i, null, (i2 & 4) == 0 ? 0 : -1);
    }

    public C1341850l1T(int i, Comment comment, int i2) {
        this.LIZ = comment;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
