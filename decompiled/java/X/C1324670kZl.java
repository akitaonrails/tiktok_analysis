package X;

/* JADX INFO: renamed from: X.0kZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324670kZl {
    public static final C1324670kZl LIZJ = new C1324670kZl(-1, false);
    public static final C1324670kZl LIZLLL = new C1324670kZl(-2, false);
    public static final C1324670kZl LJ = new C1324670kZl(-1, true);
    public final int LIZ;
    public final boolean LIZIZ;

    public final String toString() {
        return C786410Ut5.k4(null, "%d defer:%b", new Object[]{Integer.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ)});
    }

    public final int LIZ() {
        int i = this.LIZ;
        if (i == -1) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return i;
    }

    public final int hashCode() {
        return C908880Zl8.LIZ(Integer.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1324670kZl)) {
            return false;
        }
        C1324670kZl c1324670kZl = (C1324670kZl) obj;
        if (this.LIZ == c1324670kZl.LIZ && this.LIZIZ == c1324670kZl.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1324670kZl(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
