package X;

/* JADX INFO: renamed from: X.035i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7864035i extends AbstractC756202xM {
    public final int LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7864035i) && this.LLILZLL == ((C7864035i) obj).LLILZLL;
    }

    public final int hashCode() {
        return this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuSkeletonVO(type=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7864035i(int i) {
        this.LLILZLL = i;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C7864035i) && ((C7864035i) interfaceC1891350zJl).LLILZLL == this.LLILZLL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C7864035i) && ((C7864035i) interfaceC1891350zJl).LLILZLL == this.LLILZLL) {
            return true;
        }
        return false;
    }
}
