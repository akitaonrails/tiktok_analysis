package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898640ZNe implements C0ZNK {
    public final C0IB0 LL;
    public final InterfaceC898720ZNm LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898640ZNe)) {
            return false;
        }
        C898640ZNe c898640ZNe = (C898640ZNe) obj;
        return Intrinsics.LJFF(this.LL, c898640ZNe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c898640ZNe.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnavailableCardSkeletonLayoutDataReceive(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
    }

    @Override // X.C0ZNK
    public final InterfaceC898720ZNm getReason() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C898630ZNd.LIZ(this, interfaceC1891350zJl);
    }

    public C898640ZNe(C0IB0 c0ib0, InterfaceC898720ZNm interfaceC898720ZNm) {
        this.LL = c0ib0;
        this.LLILLJJLI = interfaceC898720ZNm;
    }
}
