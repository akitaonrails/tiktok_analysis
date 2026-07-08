package X;

/* JADX INFO: renamed from: X.0RAU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAU extends C0RAO {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.C0RAO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RAU)) {
            return false;
        }
        C0RAU c0rau = (C0RAU) obj;
        return this.LIZ == c0rau.LIZ && this.LIZIZ == c0rau.LIZIZ;
    }

    @Override // X.C0RAO
    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0RAU.class.getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RAU(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
