package X;

/* JADX INFO: renamed from: X.0u6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690820u6K implements InterfaceC1690880u6Q {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1690820u6K)) {
            return false;
        }
        C1690820u6K c1690820u6K = (C1690820u6K) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c1690820u6K.LIZ) && Float.compare(this.LIZIZ, c1690820u6K.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeepSameHeight(minHeight=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", maxHeightRatio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C1690820u6K(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
