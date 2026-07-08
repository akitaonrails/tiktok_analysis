package X;

/* JADX INFO: renamed from: X.0I5B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5B implements C0I5A {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I5B)) {
            return false;
        }
        C0I5B c0i5b = (C0I5B) obj;
        return this.LIZ == c0i5b.LIZ && this.LIZIZ == c0i5b.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Custom(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I5B(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
