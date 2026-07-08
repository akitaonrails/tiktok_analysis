package X;

/* JADX INFO: renamed from: X.07sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1998507sF {
    public final float LIZ;
    public final EnumC1998407sE LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1998507sF)) {
            return false;
        }
        C1998507sF c1998507sF = (C1998507sF) obj;
        return Float.compare(this.LIZ, c1998507sF.LIZ) == 0 && this.LIZIZ == c1998507sF.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftDialogSizeChangedData(height=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public /* synthetic */ C1998507sF(float f) {
        this(f, EnumC1998407sE.NORMAL);
    }

    public C1998507sF(float f, EnumC1998407sE enumC1998407sE) {
        this.LIZ = f;
        this.LIZIZ = enumC1998407sE;
    }
}
