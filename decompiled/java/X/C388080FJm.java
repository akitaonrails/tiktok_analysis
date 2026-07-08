package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C388080FJm {
    public final int LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public boolean LJ;
    public final int LJFF;
    public final int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final int LJIIIZ;

    public C388080FJm() {
        this(0, 0, 0, false, 0, 0, 0, 2047);
    }

    public int LIZ() {
        return this.LIZ;
    }

    public C388080FJm(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        i = (i7 & 1) != 0 ? -1 : i;
        i2 = (i7 & 2) != 0 ? 0 : i2;
        if ((i7 & 4) != 0) {
            i8 = R.attr.ee;
        } else {
            i8 = 0;
        }
        i3 = (i7 & 8) != 0 ? 0 : i3;
        z = (i7 & 16) != 0 ? true : z;
        i4 = (i7 & 32) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) : i4;
        i5 = (i7 & 64) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) : i5;
        i6 = (i7 & 1024) != 0 ? 0 : i6;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i8;
        this.LIZLLL = i3;
        this.LJ = z;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = i6;
    }
}
