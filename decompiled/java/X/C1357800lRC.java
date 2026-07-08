package X;

/* JADX INFO: renamed from: X.0lRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357800lRC {
    public int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C1357800lRC() {
        this(0, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357800lRC)) {
            return false;
        }
        C1357800lRC c1357800lRC = (C1357800lRC) obj;
        return this.LIZ == c1357800lRC.LIZ && this.LIZIZ == c1357800lRC.LIZIZ && this.LIZJ == c1357800lRC.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public C1357800lRC(int i, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
