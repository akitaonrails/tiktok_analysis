package X;

/* JADX INFO: renamed from: X.0HNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440040HNi implements InterfaceC440050HNj {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440040HNi)) {
            return false;
        }
        C440040HNi c440040HNi = (C440040HNi) obj;
        return this.LIZ == c440040HNi.LIZ && this.LIZIZ == c440040HNi.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProduceRandomElement(idType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", elementType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440040HNi(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
