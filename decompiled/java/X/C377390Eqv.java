package X;

/* JADX INFO: renamed from: X.0Eqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377390Eqv {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C377390Eqv() {
        this(false, false, false, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377390Eqv)) {
            return false;
        }
        C377390Eqv c377390Eqv = (C377390Eqv) obj;
        return this.LIZ == c377390Eqv.LIZ && this.LIZIZ == c377390Eqv.LIZIZ && this.LIZJ == c377390Eqv.LIZJ && this.LIZLLL == c377390Eqv.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteAction(isDeleteFromAsync=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isDeleteFromResultPanel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDeleteFromBottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromOtherEdit=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C377390Eqv(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
