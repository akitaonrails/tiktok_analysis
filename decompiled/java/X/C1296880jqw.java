package X;

/* JADX INFO: renamed from: X.0jqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296880jqw implements InterfaceC1682270tsX {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1296880jqw) && Float.compare(this.LIZ, ((C1296880jqw) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Vertical(bias=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C1296880jqw(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC1682270tsX
    public final int LIZ(int i, int i2) {
        return Math.round(((i2 - i) / 2.0f) * (1 + this.LIZ));
    }
}
