package X;

import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844090y5X implements InterfaceC1891350zJl {
    public final Review LL;
    public final EnumC1779110wOj LLILLJJLI;
    public final AbstractC1052910dVR LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1844090y5X)) {
            return false;
        }
        C1844090y5X c1844090y5X = (C1844090y5X) obj;
        return Intrinsics.LJFF(this.LL, c1844090y5X.LL) && this.LLILLJJLI == c1844090y5X.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1844090y5X.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewItem(review=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", translateStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1844090y5X)) {
            return false;
        }
        C1844090y5X c1844090y5X = (C1844090y5X) interfaceC1891350zJl;
        if (c1844090y5X.LLILLJJLI != this.LLILLJJLI || !Intrinsics.LJFF(c1844090y5X.LLILLL, this.LLILLL)) {
            return false;
        }
        Review review = c1844090y5X.LL;
        boolean z = review.userDiggStatus;
        Review review2 = this.LL;
        if (z != review2.userDiggStatus || review.diggCount != review2.diggCount) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1844090y5X)) {
            return false;
        }
        return Intrinsics.LJFF(((C1844090y5X) interfaceC1891350zJl).LL.identityID, this.LL.identityID);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1844090y5X(Review review, EnumC1779110wOj enumC1779110wOj, int i) {
        C1052930dVT c1052930dVT;
        enumC1779110wOj = (i & 2) != 0 ? EnumC1779110wOj.IDLE : enumC1779110wOj;
        if ((i & 4) != 0) {
            c1052930dVT = C1052930dVT.LIZ;
        } else {
            c1052930dVT = null;
        }
        this(review, enumC1779110wOj, c1052930dVT);
    }

    public C1844090y5X(Review review, EnumC1779110wOj enumC1779110wOj, AbstractC1052910dVR abstractC1052910dVR) {
        this.LL = review;
        this.LLILLJJLI = enumC1779110wOj;
        this.LLILLL = abstractC1052910dVR;
    }
}
