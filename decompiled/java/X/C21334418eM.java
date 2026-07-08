package X;

/* JADX INFO: renamed from: X.18eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21334418eM {
    public final float LIZ;
    public final EnumC21334518eN LIZIZ;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ) + this.LIZIZ.intValue();
    }

    public final String toString() {
        int i = C21334318eL.LIZ[this.LIZIZ.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.LIZ);
        }
        if (i != 3) {
            if (i == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("%");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21334418eM)) {
            return false;
        }
        C21334418eM c21334418eM = (C21334418eM) obj;
        EnumC21334518eN enumC21334518eN = this.LIZIZ;
        if (enumC21334518eN != c21334418eM.LIZIZ) {
            return false;
        }
        if (enumC21334518eN != EnumC21334518eN.UNDEFINED && enumC21334518eN != EnumC21334518eN.AUTO && Float.compare(this.LIZ, c21334418eM.LIZ) != 0) {
            return false;
        }
        return true;
    }

    public C21334418eM(float f, EnumC21334518eN enumC21334518eN) {
        this.LIZ = f;
        this.LIZIZ = enumC21334518eN;
    }
}
