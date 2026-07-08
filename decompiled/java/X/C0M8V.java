package X;

/* JADX INFO: renamed from: X.0M8V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8V extends C0M8P {
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M8V)) {
            return false;
        }
        C0M8V c0m8v = (C0M8V) obj;
        return Float.compare(this.LIZIZ, c0m8v.LIZIZ) == 0 && Float.compare(this.LIZJ, c0m8v.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemSizeDetermined(widthPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", heightPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C0M8V(float f, float f2) {
        super(true);
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
