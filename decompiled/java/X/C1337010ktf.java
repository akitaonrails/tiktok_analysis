package X;

/* JADX INFO: renamed from: X.0ktf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337010ktf {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return this.LIZ << (this.LIZIZ + 16);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1337010ktf)) {
            return false;
        }
        C1337010ktf c1337010ktf = (C1337010ktf) obj;
        if (c1337010ktf.LIZ != this.LIZ || c1337010ktf.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C1337010ktf(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
