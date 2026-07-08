package X;

/* JADX INFO: renamed from: X.0c1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995860c1Q extends AbstractC1003980cEW {
    public final int LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995860c1Q)) {
            return false;
        }
        C995860c1Q c995860c1Q = (C995860c1Q) obj;
        return this.LIZ == c995860c1Q.LIZ && Float.compare(this.LIZIZ, c995860c1Q.LIZIZ) == 0;
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

    public C995860c1Q(int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
    }
}
