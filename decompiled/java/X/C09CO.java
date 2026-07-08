package X;

/* JADX INFO: renamed from: X.09CO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09CO {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09CO)) {
            return false;
        }
        C09CO c09co = (C09CO) obj;
        return this.LIZ == c09co.LIZ && this.LIZIZ == c09co.LIZIZ && this.LIZJ == c09co.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverHit(fieldStart=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bodyOpenIdx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bodyCloseIdx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09CO(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
