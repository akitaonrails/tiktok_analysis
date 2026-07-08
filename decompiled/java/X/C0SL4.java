package X;

/* JADX INFO: renamed from: X.0SL4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SL4 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C0SL4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SL4)) {
            return false;
        }
        C0SL4 c0sl4 = (C0SL4) obj;
        return this.LIZ == c0sl4.LIZ && this.LIZIZ == c0sl4.LIZIZ && this.LIZJ == c0sl4.LIZJ && this.LIZLLL == c0sl4.LIZLLL && this.LJ == c0sl4.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostLayoutSwitch(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTextFirst=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableScale=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableBgFixColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableBgExtractColor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SL4(int i) {
        this(false, false, false, false, false);
    }

    public C0SL4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
    }
}
