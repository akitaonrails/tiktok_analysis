package X;

/* JADX INFO: renamed from: X.0RsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709590RsT extends AbstractC1007980cKy {
    public final int LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C709590RsT)) {
            return false;
        }
        C709590RsT c709590RsT = (C709590RsT) obj;
        return this.LIZ == c709590RsT.LIZ && Float.compare(this.LIZIZ, c709590RsT.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiContentUpdateProgressBar(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C709590RsT(int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
    }
}
