package X;

/* JADX INFO: renamed from: X.00Fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C049300Fv extends AbstractC049400Fw {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C049300Fv)) {
            return false;
        }
        C049300Fv c049300Fv = (C049300Fv) obj;
        return this.LIZ == c049300Fv.LIZ && this.LIZIZ == c049300Fv.LIZIZ && this.LIZJ == c049300Fv.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SinglePhotoSelectConfig(reqCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customBannerLayoutRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC049400Fw
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC049400Fw
    public final int LIZIZ() {
        return this.LIZIZ;
    }

    public C049300Fv(int i) {
        super(3);
        this.LIZ = 4097;
        this.LIZIZ = 3;
        this.LIZJ = i;
    }
}
