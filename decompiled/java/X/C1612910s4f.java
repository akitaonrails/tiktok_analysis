package X;

import com.ss.android.ugc.aweme.model.PaidCollectionOverView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612910s4f implements InterfaceC1891350zJl {
    public final PaidCollectionOverView LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612910s4f)) {
            return false;
        }
        C1612910s4f c1612910s4f = (C1612910s4f) obj;
        return Intrinsics.LJFF(this.LL, c1612910s4f.LL) && this.LLILLJJLI == c1612910s4f.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PaidCollectionOverView paidCollectionOverView = this.LL;
        return ((paidCollectionOverView == null ? 0 : paidCollectionOverView.hashCode()) * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentRecommendItem(recommend=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return areItemTheSame(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long lValueOf;
        if (interfaceC1891350zJl instanceof C1612910s4f) {
            PaidCollectionOverView paidCollectionOverView = ((C1612910s4f) interfaceC1891350zJl).LL;
            Long lValueOf2 = null;
            if (paidCollectionOverView != null) {
                lValueOf = Long.valueOf(paidCollectionOverView.collectionId);
            } else {
                lValueOf = null;
            }
            PaidCollectionOverView paidCollectionOverView2 = this.LL;
            if (paidCollectionOverView2 != null) {
                lValueOf2 = Long.valueOf(paidCollectionOverView2.collectionId);
            }
            return Intrinsics.LJFF(lValueOf, lValueOf2);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1612910s4f(PaidCollectionOverView paidCollectionOverView, int i) {
        this.LL = paidCollectionOverView;
        this.LLILLJJLI = i;
    }
}
