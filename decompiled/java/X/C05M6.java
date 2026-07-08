package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05M6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05M6 {
    public final String LIZ;
    public final CommentItemList LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05M6)) {
            return false;
        }
        C05M6 c05m6 = (C05M6) obj;
        return Intrinsics.LJFF(this.LIZ, c05m6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c05m6.LIZIZ) && this.LIZJ == c05m6.LIZJ && this.LIZLLL == c05m6.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflineCommentSnapshot(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", commentItemList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cachedTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", insertTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05M6(String str, CommentItemList commentItemList, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = commentItemList;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
