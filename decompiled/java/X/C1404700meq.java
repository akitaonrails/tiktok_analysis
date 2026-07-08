package X;

/* JADX INFO: renamed from: X.0meq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404700meq {
    public final int LIZ;
    public final int LIZIZ;

    public C1404700meq() {
        this(0, 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404700meq)) {
            return false;
        }
        C1404700meq c1404700meq = (C1404700meq) obj;
        return this.LIZ == c1404700meq.LIZ && this.LIZIZ == c1404700meq.LIZIZ;
    }

    public C1404700meq(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
