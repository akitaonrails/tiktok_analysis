package X;

import com.bytedance.retrofit2.mime.TypedInput;

/* JADX INFO: renamed from: X.0XS7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XS7<T> {
    public final C0X52<T> LIZ;
    public final C0XLO LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final C0XLG LJ;
    public final TypedInput LJFF;
    public final Object LJI;
    public T LJII;
    public final TypedInput LJIIIIZZ;

    public final C0X52<T> LIZ() {
        C2175508fh c2175508fh = new C2175508fh(this.LIZIZ.LIZIZ(), this.LIZJ, this.LIZLLL, this.LJ.LIZIZ(), this.LJFF);
        c2175508fh.LJFF = this.LJI;
        return this.LIZ.LIZJ() ? C0X52.LIZLLL(this.LJII, c2175508fh) : C0X52.LIZIZ(this.LJIIIIZZ, c2175508fh);
    }

    public final boolean LIZIZ() {
        int i = this.LIZJ;
        return i >= 200 && i < 300;
    }

    public C0XS7(C0X52<T> c0x52) {
        this.LIZ = c0x52;
        C2175508fh c2175508fh = c0x52.LIZ;
        this.LIZIZ = C0XLO.LIZJ(c2175508fh.LIZ);
        this.LIZJ = c2175508fh.LIZIZ;
        this.LIZLLL = c2175508fh.LIZJ;
        this.LJ = new C0XLG(c2175508fh.LIZLLL);
        this.LJFF = c2175508fh.LJ;
        this.LJI = c2175508fh.LJFF;
        this.LJII = c0x52.LIZIZ;
        this.LJIIIIZZ = c0x52.LIZJ;
    }
}
