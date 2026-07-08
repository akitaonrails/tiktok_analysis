package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0509, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0509 implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0509)) {
            return false;
        }
        AnonymousClass0509 anonymousClass0509 = (AnonymousClass0509) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0509.LL) && this.LLILLJJLI == anonymousClass0509.LLILLJJLI && this.LLILLL == anonymousClass0509.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeCommentCountHeaderItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", commentCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fromNoPermissionCommentHistory=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long lValueOf;
        if (!(interfaceC1891350zJl instanceof AnonymousClass0509)) {
            return false;
        }
        AwemeStatistics statistics = this.LL.getStatistics();
        Long lValueOf2 = null;
        if (statistics != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        AnonymousClass0509 anonymousClass0509 = (AnonymousClass0509) interfaceC1891350zJl;
        AwemeStatistics statistics2 = anonymousClass0509.LL.getStatistics();
        if (statistics2 != null) {
            lValueOf2 = Long.valueOf(statistics2.getCommentCount());
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || anonymousClass0509.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getAid(), anonymousClass0509.LL.getAid());
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AnonymousClass0509)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getAid(), ((AnonymousClass0509) interfaceC1891350zJl).LL.getAid());
    }

    public AnonymousClass0509(long j, Aweme aweme, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = j;
        this.LLILLL = z;
    }
}
