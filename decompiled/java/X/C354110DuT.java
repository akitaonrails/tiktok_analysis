package X;

/* JADX INFO: renamed from: X.0DuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354110DuT {
    public EnumC356080Dxe LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public String LJ;

    public C354110DuT() {
        this(null, 31);
    }

    public C354110DuT(String str, int i) {
        EnumC356080Dxe enumC356080Dxe;
        int i2;
        long jCurrentTimeMillis;
        if ((i & 1) != 0) {
            enumC356080Dxe = EnumC356080Dxe.IDLE;
        } else {
            enumC356080Dxe = null;
        }
        if ((i & 2) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        str = (i & 16) != 0 ? null : str;
        this.LIZ = enumC356080Dxe;
        this.LIZIZ = i2;
        this.LIZJ = jCurrentTimeMillis;
        this.LIZLLL = 0L;
        this.LJ = str;
    }
}
