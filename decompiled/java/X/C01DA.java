package X;

/* JADX INFO: renamed from: X.01DA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DA {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01DA)) {
            return false;
        }
        C01DA c01da = (C01DA) obj;
        return this.LIZ == c01da.LIZ && this.LIZIZ == c01da.LIZIZ;
    }

    public C01DA(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
