package X;

/* JADX INFO: renamed from: X.0GoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426780GoO implements InterfaceC426790GoP {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C426780GoO)) {
            return false;
        }
        C426780GoO c426780GoO = (C426780GoO) obj;
        return this.LIZ == c426780GoO.LIZ && this.LIZIZ == c426780GoO.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Number(maxCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C426780GoO(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
