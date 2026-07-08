package X;

/* JADX INFO: renamed from: X.0bdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980910bdJ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C980910bdJ() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C980910bdJ)) {
            return false;
        }
        C980910bdJ c980910bdJ = (C980910bdJ) obj;
        return this.LIZ == c980910bdJ.LIZ && this.LIZIZ == c980910bdJ.LIZIZ && this.LIZJ == c980910bdJ.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentaryState(isAiOn=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTalking=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canPresent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C980910bdJ(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }

    public static C980910bdJ LIZ(C980910bdJ c980910bdJ, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = c980910bdJ.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c980910bdJ.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c980910bdJ.LIZJ;
        }
        c980910bdJ.getClass();
        return new C980910bdJ(z, z2, z3);
    }
}
