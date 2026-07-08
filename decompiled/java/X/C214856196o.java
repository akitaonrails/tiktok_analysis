package X;

/* JADX INFO: renamed from: X.196o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214856196o {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C214856196o)) {
            return false;
        }
        C214856196o c214856196o = (C214856196o) obj;
        return this.LIZ == c214856196o.LIZ && this.LIZIZ == c214856196o.LIZIZ && this.LIZJ == c214856196o.LIZJ && this.LIZLLL == c214856196o.LIZLLL && this.LJ == c214856196o.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginSnapshot(imageTextLayoutHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stableContentHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", descMinHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", expandStateOnEnter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", keyboardShownOnEnter=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C214856196o(int i, int i2, int i3, int i4, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = z;
    }
}
