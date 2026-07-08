package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341860l1U implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final Comment LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341860l1U)) {
            return false;
        }
        C1341860l1U c1341860l1U = (C1341860l1U) obj;
        return Intrinsics.LJFF(this.LL, c1341860l1U.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1341860l1U.LLILLJJLI) && this.LLILLL == c1341860l1U.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        return ((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxCommentItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", comment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1341860l1U(Comment comment, int i, Aweme aweme) {
        this.LL = aweme;
        this.LLILLJJLI = comment;
        this.LLILLL = i;
    }
}
