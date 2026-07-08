package X;

/* JADX INFO: renamed from: X.082N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C082N implements InterfaceC21640319mb {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C082N)) {
            return false;
        }
        C082N c082n = (C082N) obj;
        return Float.compare(this.LIZ, c082n.LIZ) == 0 && Float.compare(this.LIZIZ, c082n.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationX(startX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C082N(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
