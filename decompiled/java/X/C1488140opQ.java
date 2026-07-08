package X;

import java.util.List;

/* JADX INFO: renamed from: X.0opQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488140opQ {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public C1488140opQ() {
        this(false, null, 0, null, 0, 0, false, 127);
    }

    public C1488140opQ(boolean z, List list, int i, String str, int i2, int i3, boolean z2, int i4) {
        str = (i4 & 1) != 0 ? "" : str;
        list = (i4 & 2) != 0 ? C13BV.INSTANCE : list;
        z = (i4 & 4) != 0 ? false : z;
        i = (i4 & 8) != 0 ? 0 : i;
        i2 = (i4 & 16) != 0 ? 0 : i2;
        i3 = (i4 & 32) != 0 ? 0 : i3;
        z2 = (i4 & 64) != 0 ? false : z2;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = z2;
    }
}
