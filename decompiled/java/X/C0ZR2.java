package X;

/* JADX INFO: renamed from: X.0ZR2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZR2 {
    public final boolean LIZ;
    public final EnumC899620ZQy LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZR2)) {
            return false;
        }
        C0ZR2 c0zr2 = (C0ZR2) obj;
        return this.LIZ == c0zr2.LIZ && this.LIZIZ == c0zr2.LIZIZ && this.LIZJ == c0zr2.LIZJ && this.LIZLLL == c0zr2.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedbackSlotData(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", feedbackType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasLike=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasDislike=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZR2(boolean z, EnumC899620ZQy enumC899620ZQy, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = enumC899620ZQy;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
