package X;

import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: X.0lIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352270lIH {
    public final Comment LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C1352270lIH() {
        this(null, null, 7);
    }

    public C1352270lIH(Comment comment, String str, int i) {
        boolean z;
        comment = (i & 1) != 0 ? null : comment;
        str = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = comment;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
