package X;

/* JADX INFO: renamed from: X.0M20, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M20 extends C0M22 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C0M20() {
        this(100, 10, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M20)) {
            return false;
        }
        C0M20 c0m20 = (C0M20) obj;
        return this.LIZ == c0m20.LIZ && this.LIZIZ == c0m20.LIZIZ && this.LIZJ == c0m20.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByCount(totalThreshold=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldThreshold=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldMonths=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0M22
    public final int LIZ() {
        return this.LIZJ;
    }

    public C0M20(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
