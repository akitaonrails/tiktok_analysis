package X;

/* JADX INFO: renamed from: X.0SKU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKU {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SKU)) {
            return false;
        }
        C0SKU c0sku = (C0SKU) obj;
        return this.LIZ == c0sku.LIZ && this.LIZIZ == c0sku.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrimaryColors(topColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SKU(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
