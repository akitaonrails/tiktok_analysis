package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340940l00 extends C1340920kzy {
    public final Comment LLILLL;
    public final C1340950l01 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340940l00)) {
            return false;
        }
        C1340940l00 c1340940l00 = (C1340940l00) obj;
        return Intrinsics.LJFF(this.LLILLL, c1340940l00.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1340940l00.LLILZ);
    }

    public final int hashCode() {
        return (this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode();
    }

    @Override // X.C1340920kzy
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentItem(comment=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", commentUIState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1340920kzy
    public final Comment LIZ() {
        return this.LLILLL;
    }

    @Override // X.C1340920kzy
    public final C1340950l01 LIZIZ() {
        return this.LLILZ;
    }

    public C1340940l00(Comment comment, C1340950l01 c1340950l01) {
        super(comment, c1340950l01);
        this.LLILLL = comment;
        this.LLILZ = c1340950l01;
    }
}
