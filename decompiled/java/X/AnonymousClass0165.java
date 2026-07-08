package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0165, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0165 implements InterfaceC2753014t {
    public final C1349800lEI LL = null;
    public final int LLILLJJLI = 0;
    public final Aweme LLILLL = null;
    public final int LLILZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0165)) {
            return false;
        }
        AnonymousClass0165 anonymousClass0165 = (AnonymousClass0165) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0165.LL) && this.LLILLJJLI == anonymousClass0165.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, anonymousClass0165.LLILLL) && this.LLILZ == anonymousClass0165.LLILZ;
    }

    public final int hashCode() {
        C1349800lEI c1349800lEI = this.LL;
        int iHashCode = (((c1349800lEI == null ? 0 : c1349800lEI.hashCode()) * 31) + this.LLILLJJLI) * 31;
        Aweme aweme = this.LLILLL;
        return ((iHashCode + (aweme != null ? aweme.hashCode() : 0)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPageSource(videoCommentPageParam=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", securityGuide=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", commentBgHeight=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
