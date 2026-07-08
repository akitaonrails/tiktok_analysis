package X;

/* JADX INFO: renamed from: X.0gA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155030gA9 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155030gA9)) {
            return false;
        }
        C1155030gA9 c1155030gA9 = (C1155030gA9) obj;
        return this.LIZ == c1155030gA9.LIZ && this.LIZIZ == c1155030gA9.LIZIZ && this.LIZJ == c1155030gA9.LIZJ && this.LIZLLL == c1155030gA9.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImeSample(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imeBottom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", navIgnore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", navLive=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155030gA9(boolean z, int i, int i2, int i3) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
