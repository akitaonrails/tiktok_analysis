package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745460TMa extends AbstractC751690TeB {
    public final Comment LL;

    @Override // X.AbstractC751690TeB
    public final String LIZ() {
        return "Base Info";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C745460TMa) && Intrinsics.LJFF(this.LL, ((C745460TMa) obj).LL);
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
        sbLIZ.append("CommentBaseInfoData(comment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C745460TMa(Comment comment) {
        this.LL = comment;
    }
}
