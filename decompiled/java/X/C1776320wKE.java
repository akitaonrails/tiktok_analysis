package X;

/* JADX INFO: renamed from: X.0wKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776320wKE {
    public final int LIZ = 3;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776320wKE)) {
            return false;
        }
        C1776320wKE c1776320wKE = (C1776320wKE) obj;
        return this.LIZ == c1776320wKE.LIZ && this.LIZIZ == c1776320wKE.LIZIZ && this.LIZJ == c1776320wKE.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaGridConfig(spanCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", horizontalSpaceInDP=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", verticalSpaceInDP=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776320wKE(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
