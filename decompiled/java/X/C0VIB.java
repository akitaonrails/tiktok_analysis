package X;

/* JADX INFO: renamed from: X.0VIB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIB {
    public final String LIZ;
    public final Long LIZIZ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VIB)) {
            return false;
        }
        C0VIB c0vib = (C0VIB) obj;
        if (!this.LIZ.equals(c0vib.LIZ)) {
            return false;
        }
        Long l = this.LIZIZ;
        Long l2 = c0vib.LIZIZ;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public C0VIB(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = Long.valueOf(j);
    }
}
