package X;

import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626770OiB implements InterfaceC1891350zJl {
    public final TopicReview LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626770OiB)) {
            return false;
        }
        C626770OiB c626770OiB = (C626770OiB) obj;
        return Intrinsics.LJFF(this.LL, c626770OiB.LL) && this.LLILLJJLI == c626770OiB.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicReviewItem(review=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C626770OiB) {
            return Intrinsics.LJFF(this.LL.reviewId, ((C626770OiB) interfaceC1891350zJl).LL.reviewId);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        if (!(interfaceC1891350zJl instanceof C626770OiB)) {
            return null;
        }
        if (this.LLILLJJLI != ((C626770OiB) interfaceC1891350zJl).LLILLJJLI) {
            i = 1;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public C626770OiB(TopicReview topicReview, boolean z) {
        this.LL = topicReview;
        this.LLILLJJLI = z;
    }
}
