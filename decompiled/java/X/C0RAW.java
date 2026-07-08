package X;

/* JADX INFO: renamed from: X.0RAW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAW extends C0RAO {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.C0RAO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RAW)) {
            return false;
        }
        C0RAW c0raw = (C0RAW) obj;
        return this.LIZ == c0raw.LIZ && this.LIZIZ == c0raw.LIZIZ;
    }

    @Override // X.C0RAO
    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0RAW.class.getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RAW(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
