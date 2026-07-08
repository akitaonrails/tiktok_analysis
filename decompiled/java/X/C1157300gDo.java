package X;

/* JADX INFO: renamed from: X.0gDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157300gDo {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157300gDo)) {
            return false;
        }
        C1157300gDo c1157300gDo = (C1157300gDo) obj;
        return this.LIZ == c1157300gDo.LIZ && this.LIZIZ == c1157300gDo.LIZIZ && this.LIZJ == c1157300gDo.LIZJ && this.LIZLLL == c1157300gDo.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(top=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", left=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157300gDo(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
