package X;

/* JADX INFO: renamed from: X.0EAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360160EAc {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C360160EAc() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C360160EAc)) {
            return false;
        }
        C360160EAc c360160EAc = (C360160EAc) obj;
        return this.LIZ == c360160EAc.LIZ && this.LIZIZ == c360160EAc.LIZIZ && this.LIZJ == c360160EAc.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoRetouchIconStatus(isShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isOn=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C360160EAc(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }

    public static C360160EAc LIZ(C360160EAc c360160EAc, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = c360160EAc.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c360160EAc.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c360160EAc.LIZJ;
        }
        c360160EAc.getClass();
        return new C360160EAc(z, z2, z3);
    }
}
