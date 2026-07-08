package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EDU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDU {
    public final boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;

    public C0EDU(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        String str;
        z = (i6 & 1) != 0 ? true : z;
        i = (i6 & 2) != 0 ? 49 : i;
        i2 = (i6 & 4) != 0 ? 49 : i2;
        i3 = (i6 & 8) != 0 ? R.drawable.bpl : i3;
        i4 = (i6 & 16) != 0 ? 0 : i4;
        if ((i6 & 64) != 0) {
            str = "";
        } else {
            str = null;
        }
        i5 = (i6 & 128) != 0 ? 0 : i5;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = str;
        this.LJI = i5;
    }
}
