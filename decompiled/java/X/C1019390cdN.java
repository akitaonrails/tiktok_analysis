package X;

import java.util.List;

/* JADX INFO: renamed from: X.0cdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019390cdN {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final List<Integer> LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1019390cdN() {
        int i = 0;
        this(null, i, i, i, i, i, i, 1023);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1019390cdN(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i6;
        int i11 = i5;
        int i12 = i3;
        int i13 = i2;
        int i14 = i;
        int i15 = i4;
        String str2 = (i7 & 1) != 0 ? "" : str;
        i14 = (i7 & 2) != 0 ? -1 : i14;
        i13 = (i7 & 4) != 0 ? -1 : i13;
        i12 = (i7 & 8) != 0 ? -1 : i12;
        i15 = (i7 & 16) != 0 ? -1 : i15;
        i11 = (i7 & 32) != 0 ? -1 : i11;
        i10 = (i7 & 128) != 0 ? -1 : i10;
        if ((i7 & 256) != 0) {
            i8 = -1;
        } else {
            i8 = 0;
        }
        if ((i7 & 512) != 0) {
            i9 = -1;
        } else {
            i9 = 0;
        }
        this(str2, i14, i13, i12, i15, i11, null, i10, i8, i9);
    }

    public C1019390cdN(String str, int i, int i2, int i3, int i4, int i5, List<Integer> list, int i6, int i7, int i8) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = list;
        this.LJII = i6;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = i8;
    }
}
