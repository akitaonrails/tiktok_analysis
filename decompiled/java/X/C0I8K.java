package X;

/* JADX INFO: renamed from: X.0I8K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8K implements C0I8S {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I8K)) {
            return false;
        }
        C0I8K c0i8k = (C0I8K) obj;
        return this.LIZ == c0i8k.LIZ && this.LIZIZ == c0i8k.LIZIZ;
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

    public C0I8K(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
