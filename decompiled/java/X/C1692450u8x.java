package X;

/* JADX INFO: renamed from: X.0u8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692450u8x {
    public final C1692580u9A LIZ;
    public final C1692580u9A LIZIZ;
    public final boolean LIZJ;

    public C1692450u8x(C1692580u9A c1692580u9A, C1692580u9A c1692580u9A2, boolean z) {
        this.LIZ = c1692580u9A;
        this.LIZIZ = c1692580u9A2;
        this.LIZJ = z;
    }

    public static C1692450u8x LIZ(C1692450u8x c1692450u8x, C1692580u9A c1692580u9A, C1692580u9A c1692580u9A2, boolean z, int i) {
        if ((i & 1) != 0) {
            c1692580u9A = c1692450u8x.LIZ;
        }
        if ((i & 2) != 0) {
            c1692580u9A2 = c1692450u8x.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c1692450u8x.LIZJ;
        }
        c1692450u8x.getClass();
        return new C1692450u8x(c1692580u9A, c1692580u9A2, z);
    }
}
