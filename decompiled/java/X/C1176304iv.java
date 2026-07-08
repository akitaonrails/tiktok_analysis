package X;

/* JADX INFO: renamed from: X.04iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1176304iv {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176304iv)) {
            return false;
        }
        C1176304iv c1176304iv = (C1176304iv) obj;
        return this.LIZ == c1176304iv.LIZ && this.LIZIZ == c1176304iv.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NominalHeroSizes(lottiePx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1176304iv(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
