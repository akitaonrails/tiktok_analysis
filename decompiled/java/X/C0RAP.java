package X;

/* JADX INFO: renamed from: X.0RAP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAP extends C0RAO {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.C0RAO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RAP)) {
            return false;
        }
        C0RAP c0rap = (C0RAP) obj;
        return this.LIZ == c0rap.LIZ && this.LIZIZ == c0rap.LIZIZ;
    }

    @Override // X.C0RAO
    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0RAP.class.getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RAP(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
