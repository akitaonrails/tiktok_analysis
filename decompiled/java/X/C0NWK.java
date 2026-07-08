package X;

/* JADX INFO: renamed from: X.0NWK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWK implements C0NWJ {
    public final float LIZ = Float.NaN;
    public final float LIZIZ = Float.NaN;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NWK)) {
            return false;
        }
        C0NWK c0nwk = (C0NWK) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c0nwk.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c0nwk.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoSize(minHeight=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", maxHeight=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }
}
