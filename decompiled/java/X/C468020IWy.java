package X;

/* JADX INFO: renamed from: X.0IWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468020IWy {
    public final C467990IWv LIZ;
    public final C0IX9 LIZIZ;
    public final C0IX6 LIZJ;
    public final C468010IWx LIZLLL;
    public final C0IX7 LJ;
    public final C0IX2 LJFF;

    public C468020IWy() {
        this(null, 63);
    }

    public C468020IWy(C467990IWv c467990IWv, int i) {
        C0IX9 c0ix9;
        C0IX6 c0ix6;
        C468010IWx c468010IWx;
        C0IX7 c0ix7;
        C467990IWv c467990IWv2 = (i & 1) != 0 ? new C467990IWv(0L, null, null, null, null, null, 0L, 0L, 0, null, 2097151) : c467990IWv;
        if ((i & 2) != 0) {
            c0ix9 = new C0IX9();
        } else {
            c0ix9 = null;
        }
        if ((i & 4) != 0) {
            c0ix6 = new C0IX6();
        } else {
            c0ix6 = null;
        }
        if ((i & 8) != 0) {
            c468010IWx = new C468010IWx(0);
        } else {
            c468010IWx = null;
        }
        if ((i & 16) != 0) {
            c0ix7 = new C0IX7(0);
        } else {
            c0ix7 = null;
        }
        C0IX2 c0ix2 = (i & 32) != 0 ? new C0IX2() : null;
        this.LIZ = c467990IWv2;
        this.LIZIZ = c0ix9;
        this.LIZJ = c0ix6;
        this.LIZLLL = c468010IWx;
        this.LJ = c0ix7;
        this.LJFF = c0ix2;
    }
}
