package X;

/* JADX INFO: renamed from: X.0swH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646150swH {
    public final EnumC1646200swM LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC2008807tu LJFF;

    public C1646150swH() {
        this(EnumC1646200swM.INIT, -1, -1, null, null, EnumC2008807tu.TAB_CHANGED);
    }

    public static C1646150swH LIZ(C1646150swH c1646150swH, EnumC1646200swM enumC1646200swM, int i, int i2) {
        int i3;
        String str;
        String str2;
        int i4 = i;
        EnumC1646200swM enumC1646200swM2 = enumC1646200swM;
        if ((i2 & 1) != 0) {
            enumC1646200swM2 = c1646150swH.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1646150swH.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i4 = c1646150swH.LIZJ;
        }
        EnumC2008807tu enumC2008807tu = null;
        if ((i2 & 8) != 0) {
            str = c1646150swH.LIZLLL;
        } else {
            str = null;
        }
        if ((i2 & 16) != 0) {
            str2 = c1646150swH.LJ;
        } else {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            enumC2008807tu = c1646150swH.LJFF;
        }
        c1646150swH.getClass();
        return new C1646150swH(enumC1646200swM2, i3, i4, str, str2, enumC2008807tu);
    }

    public C1646150swH(EnumC1646200swM enumC1646200swM, int i, int i2, String str, String str2, EnumC2008807tu enumC2008807tu) {
        this.LIZ = enumC1646200swM;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = enumC2008807tu;
    }
}
