package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0508, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0508 implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final long LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0508)) {
            return false;
        }
        AnonymousClass0508 anonymousClass0508 = (AnonymousClass0508) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0508.LL) && this.LLILLJJLI == anonymousClass0508.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeCommentCountHeaderItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", commentCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long lValueOf;
        if (!(interfaceC1891350zJl instanceof AnonymousClass0508)) {
            return false;
        }
        AwemeStatistics statistics = this.LL.getStatistics();
        Long lValueOf2 = null;
        if (statistics != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        AnonymousClass0508 anonymousClass0508 = (AnonymousClass0508) interfaceC1891350zJl;
        AwemeStatistics statistics2 = anonymousClass0508.LL.getStatistics();
        if (statistics2 != null) {
            lValueOf2 = Long.valueOf(statistics2.getCommentCount());
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || anonymousClass0508.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getAid(), anonymousClass0508.LL.getAid());
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AnonymousClass0508)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getAid(), ((AnonymousClass0508) interfaceC1891350zJl).LL.getAid());
    }

    public AnonymousClass0508(Aweme aweme, long j) {
        this.LL = aweme;
        this.LLILLJJLI = j;
    }
}
