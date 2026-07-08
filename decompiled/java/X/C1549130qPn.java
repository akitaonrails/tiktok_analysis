package X;

/* JADX INFO: renamed from: X.0qPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549130qPn {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1549130qPn() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1549130qPn)) {
            return false;
        }
        C1549130qPn c1549130qPn = (C1549130qPn) obj;
        return this.LIZ == c1549130qPn.LIZ && this.LIZIZ == c1549130qPn.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public C1549130qPn(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
