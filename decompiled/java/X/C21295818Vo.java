package X;

/* JADX INFO: renamed from: X.18Vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21295818Vo {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final EnumC1778830wOH LJII;

    public static C21295818Vo LIZ(C21295818Vo c21295818Vo, String str, int i, int i2, int i3) {
        String str2;
        long j;
        boolean z;
        boolean z2;
        int i4 = i2;
        int i5 = i;
        String str3 = str;
        if ((i3 & 1) != 0) {
            str3 = c21295818Vo.LIZ;
        }
        EnumC1778830wOH enumC1778830wOH = null;
        if ((i3 & 2) != 0) {
            str2 = c21295818Vo.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            i5 = c21295818Vo.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c21295818Vo.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            j = c21295818Vo.LJ;
        } else {
            j = 0;
        }
        if ((i3 & 32) != 0) {
            z = c21295818Vo.LJFF;
        } else {
            z = false;
        }
        if ((i3 & 64) != 0) {
            z2 = c21295818Vo.LJI;
        } else {
            z2 = false;
        }
        if ((i3 & 128) != 0) {
            enumC1778830wOH = c21295818Vo.LJII;
        }
        c21295818Vo.getClass();
        return new C21295818Vo(str3, str2, i5, i4, j, z, z2, enumC1778830wOH);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21295818Vo(String str, String str2, int i, int i2, long j, boolean z, EnumC1778830wOH enumC1778830wOH, int i3) {
        boolean z2;
        EnumC1778830wOH enumC1778830wOH2 = enumC1778830wOH;
        boolean z3 = z;
        long j2 = j;
        int i4 = i2;
        int i5 = (i3 & 4) != 0 ? -1 : i;
        i4 = (i3 & 8) != 0 ? -1 : i4;
        j2 = (i3 & 16) != 0 ? -1L : j2;
        if ((i3 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(str, str2, i5, i4, j2, z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? EnumC1778830wOH.ALBUM : enumC1778830wOH2);
    }

    public C21295818Vo(String str, String str2, int i, int i2, long j, boolean z, boolean z2, EnumC1778830wOH enumC1778830wOH) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = j;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = enumC1778830wOH;
    }
}
