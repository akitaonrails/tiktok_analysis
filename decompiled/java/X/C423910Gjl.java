package X;

/* JADX INFO: renamed from: X.0Gjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423910Gjl {
    public final EnumC429130GsB LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423910Gjl)) {
            return false;
        }
        C423910Gjl c423910Gjl = (C423910Gjl) obj;
        return this.LIZ == c423910Gjl.LIZ && Float.compare(this.LIZIZ, c423910Gjl.LIZIZ) == 0 && Float.compare(this.LIZJ, c423910Gjl.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorPlacementResult(placement=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", left=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C423910Gjl(EnumC429130GsB enumC429130GsB, float f, float f2) {
        this.LIZ = enumC429130GsB;
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
