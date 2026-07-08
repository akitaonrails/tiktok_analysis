package X;

/* JADX INFO: renamed from: X.18Xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21300518Xj {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C21300518Xj(int i, int i2, int i3) {
        int iLIZIZ;
        i = (i3 & 1) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) : i;
        i2 = (i3 & 2) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) : i2;
        if ((i3 & 4) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            iLIZIZ = 0;
        }
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = iLIZIZ;
    }
}
