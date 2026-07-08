package X;

/* JADX INFO: renamed from: X.0gIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160040gIE implements InterfaceC21640319mb {
    public final float LIZ = 0.0f;
    public final float LIZIZ = 1.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160040gIE)) {
            return false;
        }
        C1160040gIE c1160040gIE = (C1160040gIE) obj;
        return Float.compare(this.LIZ, c1160040gIE.LIZ) == 0 && Float.compare(this.LIZIZ, c1160040gIE.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationZ(startZ=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetZ=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }
}
