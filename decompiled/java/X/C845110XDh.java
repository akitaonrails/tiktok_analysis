package X;

/* JADX INFO: renamed from: X.0XDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845110XDh {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C845110XDh)) {
            return false;
        }
        C845110XDh c845110XDh = (C845110XDh) obj;
        return this.LIZ == c845110XDh.LIZ && this.LIZIZ == c845110XDh.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public C845110XDh(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
