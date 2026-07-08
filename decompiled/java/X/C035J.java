package X;

/* JADX INFO: renamed from: X.035J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035J implements InterfaceC729102sz {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C035J() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C035J)) {
            return false;
        }
        C035J c035j = (C035J) obj;
        return this.LIZ == c035j.LIZ && this.LIZIZ == c035j.LIZIZ && this.LIZJ == c035j.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationGlobalState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C035J(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
