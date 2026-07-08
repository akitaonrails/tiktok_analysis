package X;

/* JADX INFO: renamed from: X.0ZOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898860ZOa {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C898860ZOa() {
        this(true, true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898860ZOa)) {
            return false;
        }
        C898860ZOa c898860ZOa = (C898860ZOa) obj;
        return this.LIZ == c898860ZOa.LIZ && this.LIZIZ == c898860ZOa.LIZIZ && this.LIZJ == c898860ZOa.LIZJ && this.LIZLLL == c898860ZOa.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GestureConfig(canSwipe=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canLongPress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canDoubleTap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C898860ZOa(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }

    public static C898860ZOa LIZ(C898860ZOa c898860ZOa, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4 = false;
        if ((i & 1) != 0) {
            z3 = c898860ZOa.LIZ;
        } else {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z4 = c898860ZOa.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c898860ZOa.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c898860ZOa.LIZLLL;
        }
        c898860ZOa.getClass();
        return new C898860ZOa(z3, z4, z, z2);
    }
}
