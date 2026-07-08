package X;

/* JADX INFO: renamed from: X.0ZA4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZA4 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZA4)) {
            return false;
        }
        C0ZA4 c0za4 = (C0ZA4) obj;
        return this.LIZ == c0za4.LIZ && this.LIZIZ == c0za4.LIZIZ && this.LIZJ == c0za4.LIZJ && this.LIZLLL == c0za4.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageUnread(num=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", numCell=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dotCell=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZA4(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
