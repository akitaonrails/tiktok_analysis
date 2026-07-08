package X;

/* JADX INFO: renamed from: X.0NWI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWI implements C0NWJ {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0NWI) && C1668650tWZ.LIZJ(this.LIZ, ((C0NWI) obj).LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreedomHeight(height=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C0NWI(float f) {
        this.LIZ = f;
    }
}
