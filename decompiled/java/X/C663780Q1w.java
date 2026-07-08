package X;

import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663780Q1w implements InterfaceC1891350zJl {
    public final Product LL;
    public final InterfaceC663800Q1y LLILLJJLI;
    public final InterfaceC663810Q1z LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C663780Q1w)) {
            return false;
        }
        C663780Q1w c663780Q1w = (C663780Q1w) obj;
        return Intrinsics.LJFF(this.LL, c663780Q1w.LL) && Intrinsics.LJFF(this.LLILLJJLI, c663780Q1w.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c663780Q1w.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC663800Q1y interfaceC663800Q1y = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (interfaceC663800Q1y == null ? 0 : interfaceC663800Q1y.hashCode())) * 31;
        InterfaceC663810Q1z interfaceC663810Q1z = this.LLILLL;
        return iHashCode2 + (interfaceC663810Q1z != null ? interfaceC663810Q1z.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductItem(product=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", clickListener=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showListener=");
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

    public C663780Q1w(Product product, InterfaceC663800Q1y interfaceC663800Q1y, InterfaceC663810Q1z interfaceC663810Q1z) {
        this.LL = product;
        this.LLILLJJLI = interfaceC663800Q1y;
        this.LLILLL = interfaceC663810Q1z;
    }
}
