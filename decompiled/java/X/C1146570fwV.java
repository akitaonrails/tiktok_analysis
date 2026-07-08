package X;

/* JADX INFO: renamed from: X.0fwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146570fwV {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146570fwV)) {
            return false;
        }
        C1146570fwV c1146570fwV = (C1146570fwV) obj;
        return this.LIZ == c1146570fwV.LIZ && this.LIZIZ == c1146570fwV.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollAnchor(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", offsetPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1146570fwV(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
