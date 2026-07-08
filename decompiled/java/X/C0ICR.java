package X;

/* JADX INFO: renamed from: X.0ICR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICR implements InterfaceC462610ICd {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ICR) && this.LIZ == ((C0ICR) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SolidAttr(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ICR(int i) {
        this.LIZ = i;
    }
}
