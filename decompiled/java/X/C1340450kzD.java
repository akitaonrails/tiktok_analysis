package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340450kzD extends C1340400kz8 {
    public final Comment LLILZIL;
    public final C1340410kz9 LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340450kzD)) {
            return false;
        }
        C1340450kzD c1340450kzD = (C1340450kzD) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1340450kzD.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1340450kzD.LLILZLL);
    }

    public final int hashCode() {
        return (this.LLILZIL.hashCode() * 31) + this.LLILZLL.hashCode();
    }

    @Override // X.C1340400kz8
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoPermissionVideoCommentHistoryItem(comment=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", commentUIState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1340400kz8, X.AbstractC1049450dPr
    public final Comment LIZ() {
        return this.LLILZIL;
    }

    @Override // X.C1340400kz8
    public final C1340410kz9 LIZIZ() {
        return this.LLILZLL;
    }

    public C1340450kzD(Comment comment, C1340410kz9 c1340410kz9) {
        super(comment, c1340410kz9);
        this.LLILZIL = comment;
        this.LLILZLL = c1340410kz9;
    }

    public static C1340450kzD LIZLLL(C1340450kzD c1340450kzD, C1340410kz9 c1340410kz9) {
        Comment comment = c1340450kzD.LLILZIL;
        c1340450kzD.getClass();
        return new C1340450kzD(comment, c1340410kz9);
    }
}
