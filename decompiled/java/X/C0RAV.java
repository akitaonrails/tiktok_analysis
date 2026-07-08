package X;

/* JADX INFO: renamed from: X.0RAV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAV extends C0RAO {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.C0RAO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RAV)) {
            return false;
        }
        C0RAV c0rav = (C0RAV) obj;
        return this.LIZ == c0rav.LIZ && this.LIZIZ == c0rav.LIZIZ;
    }

    @Override // X.C0RAO
    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0RAV.class.getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RAV(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
