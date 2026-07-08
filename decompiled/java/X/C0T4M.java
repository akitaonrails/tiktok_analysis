package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T4M, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4M {
    public final Aweme LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final CommentContextSource LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T4M)) {
            return false;
        }
        C0T4M c0t4m = (C0T4M) obj;
        return Intrinsics.LJFF(this.LIZ, c0t4m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0t4m.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0t4m.LIZJ) && this.LIZLLL == c0t4m.LIZLLL;
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int iHashCode = (((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        CommentContextSource commentContextSource = this.LIZJ;
        return ((iHashCode + (commentContextSource != null ? commentContextSource.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonContext(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", vScope=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contextSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isLandScapeMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T4M(Aweme aweme, InterfaceC665370Q7z interfaceC665370Q7z, CommentContextSource commentContextSource, boolean z) {
        this.LIZ = aweme;
        this.LIZIZ = interfaceC665370Q7z;
        this.LIZJ = commentContextSource;
        this.LIZLLL = z;
    }
}
