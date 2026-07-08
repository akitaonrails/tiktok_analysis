package X;

/* JADX INFO: renamed from: X.0EPF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPF {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public C0EPF() {
        this(0, 15);
    }

    public C0EPF(int i, int i2) {
        int i3;
        boolean z;
        if ((i2 & 2) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        i = (i2 & 8) != 0 ? 60 : i;
        this.LIZ = false;
        this.LIZIZ = i3;
        this.LIZJ = z;
        this.LIZLLL = i;
    }
}
