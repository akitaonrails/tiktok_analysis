package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346480l8w {
    public final Comment LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1346480l8w() {
        this(null, 0 == true ? 1 : 0, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1346480l8w)) {
            return false;
        }
        C1346480l8w c1346480l8w = (C1346480l8w) obj;
        return Intrinsics.LJFF(this.LIZ, c1346480l8w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1346480l8w.LIZIZ) && this.LIZJ == c1346480l8w.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyCommentState(replyComment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isReplying=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1346480l8w(Comment comment, String str, boolean z) {
        this.LIZ = comment;
        this.LIZIZ = str;
        this.LIZJ = z;
    }

    public /* synthetic */ C1346480l8w(Comment comment, String str, boolean z, int i) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z);
    }
}
