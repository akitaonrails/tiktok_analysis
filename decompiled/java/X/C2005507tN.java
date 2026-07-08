package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07tN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2005507tN implements InterfaceC0148002o {
    public final Comment LL;

    public C2005507tN() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2005507tN) && Intrinsics.LJFF(this.LL, ((C2005507tN) obj).LL);
    }

    public final int hashCode() {
        Comment comment = this.LL;
        if (comment == null) {
            return 0;
        }
        return comment.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoCommentState(comment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2005507tN(Comment comment) {
        this.LL = comment;
    }
}
