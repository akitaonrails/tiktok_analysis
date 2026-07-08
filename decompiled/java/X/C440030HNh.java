package X;

/* JADX INFO: renamed from: X.0HNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440030HNh implements InterfaceC440050HNj {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440030HNh)) {
            return false;
        }
        C440030HNh c440030HNh = (C440030HNh) obj;
        return this.LIZ == c440030HNh.LIZ && this.LIZIZ == c440030HNh.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmptyElement(idType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", elementType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440030HNh(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
