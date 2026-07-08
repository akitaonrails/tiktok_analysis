package X;

/* JADX INFO: renamed from: X.0V8M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8M {
    public String LIZ;
    public C0V8M LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public final /* synthetic */ C0V8I LJII;

    public C0V8M(C0V8I c0v8i) {
        this.LJII = c0v8i;
    }

    public final void LIZ(long j, C823150WQv<C0V8K> c823150WQv, C823150WQv<C0V8K> c823150WQv2) {
        int i;
        long j2 = this.LIZJ + j;
        this.LIZJ = j2;
        int i2 = this.LJ + 1;
        this.LJ = i2;
        C0V8M c0v8m = this.LIZIZ;
        if (c0v8m != null && i2 == (i = this.LIZLLL)) {
            if (this.LJI) {
                c0v8m.LJI = true;
            }
            C0V8I c0v8i = this.LJII;
            if (j2 >= c0v8i.LJIIIZ.LIZJ && !this.LJI) {
                if (j2 >= 0 && j2 <= 17179869184L) {
                    c823150WQv2.LIZ(new C0V8K(c0v8i, this.LIZ, j2, i));
                }
                this.LIZIZ.LJI = true;
            }
            this.LIZIZ.LIZ(this.LIZJ, c823150WQv, c823150WQv2);
            if (this.LJFF) {
                C0V8I c0v8i2 = this.LJII;
                long j3 = this.LIZJ;
                c0v8i2.getClass();
                if (j3 >= 104857600 && j3 <= 17179869184L) {
                    C0V8I c0v8i3 = this.LJII;
                    String str = this.LIZ;
                    long j4 = this.LIZJ;
                    int i3 = this.LIZLLL;
                    c823150WQv.LIZ(new C0V8L(c0v8i3, str, j4, i3, i3));
                }
            }
        }
    }
}
