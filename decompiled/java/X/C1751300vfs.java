package X;

/* JADX INFO: renamed from: X.0vfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751300vfs {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C1751300vfs() {
        this(15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1751300vfs(int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(i2, i3, (i & 4) == 0 ? 0 : -1, false);
    }

    public C1751300vfs(int i, int i2, int i3, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
    }

    public static C1751300vfs LIZ(C1751300vfs c1751300vfs, int i, int i2, int i3, boolean z, int i4) {
        if ((i4 & 1) != 0) {
            i = c1751300vfs.LIZ;
        }
        if ((i4 & 2) != 0) {
            i2 = c1751300vfs.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i3 = c1751300vfs.LIZJ;
        }
        if ((i4 & 8) != 0) {
            z = c1751300vfs.LIZLLL;
        }
        return new C1751300vfs(i, i2, i3, z);
    }
}
