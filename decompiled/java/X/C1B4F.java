package X;

/* JADX INFO: renamed from: X.1B4F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B4F {
    public static final C1B4F LJFF;
    public static final C1B4F LJI;
    public static final C1B4F LJII;
    public static final C1B4F LJIIIIZZ;
    public static final C1B4F LJIIIZ;
    public static final C1B4F LJIIJ;
    public static final C1B4F LJIIL;
    public static final C1B4F LJIILIIL;
    public static final C1B4F LJIILJJIL;
    public static final C1B4F LJIILLIIL;
    public static final C1B4F LJIIZILJ;
    public static final C1B4F LJJIII;
    public static final C1B4F LJJIIJ;
    public static final C1B4F LJJIIJZLJL;
    public static final C1B4F LJJIIZ;
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public static final C1B4F LJ = new C1B4F(0, 20000, "Share succeeded.");
    public static final C1B4F LJIIJJI = new C1B4F(-12, 20006, "TikTok Network error");
    public static final C1B4F LJIILL = new C1B4F(-2, 20013, "Sharing cancelled");
    public static final C1B4F LJIJ = new C1B4F(-20, 20020, "Share action not recognized");
    public static final C1B4F LJIJI = new C1B4F(-21, 20021, "Shared media type error");
    public static final C1B4F LJIJJ = new C1B4F(-22, 20022, "Shared background media is not image");
    public static final C1B4F LJIJJLI = new C1B4F(-23, 20023, "No copyright of the music");
    public static final C1B4F LJIL = new C1B4F(-24, 20024, "Current version does not support this function");
    public static final C1B4F LJJ = new C1B4F(-25, 20025, "Media uri is null");
    public static final C1B4F LJJI = new C1B4F(-26, 20026, "Share direct to story is not supported");
    public static final C1B4F LJJIFFI = new C1B4F(-27, 20027, "ve plugin not ready");
    public static final C1B4F LJJII = new C1B4F(-6, 40000, "Max duration limit reached");
    public static final C1B4F LJJIIZI = new C1B4F(-9, C538540LAe.LLJJJIL, "U16");
    public static final C1B4F LJJIJ = new C1B4F(-10, 70000, "child mode");
    public static final C1B4F LJJIJIIJI = new C1B4F(-11, 80000, "others");

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorStatus(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subErrorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", detailErrorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        int i = -1;
        LJFF = new C1B4F(i, i, "Unknown error");
        int i2 = -3;
        LJI = new C1B4F(i2, 10011, "App certificate does not match configurations");
        int i3 = -4;
        LJII = new C1B4F(i3, 10004, "Illegal authorization scope");
        LJIIIIZZ = new C1B4F(i2, 20002, "Params parsing error");
        LJIIIZ = new C1B4F(i2, 20004, "User is not logged in");
        LJIIJ = new C1B4F(i3, 20005, "TikTok has no album permissions");
        int i4 = -5;
        LJIIL = new C1B4F(i4, 20008, "Photo doesn't meet requirements");
        LJIILIIL = new C1B4F(i4, 20010, "Processing photo resources failed");
        LJIILJJIL = new C1B4F(i4, 20012, "Video format is not supported");
        LJIILLIIL = new C1B4F(i3, 20015, "Video saved as draft.");
        LJIIZILJ = new C1B4F(i, i, "Share Denied");
        int i5 = -7;
        LJJIII = new C1B4F(i5, 30000, "Max shared media items limit reached for Post");
        LJJIIJ = new C1B4F(i5, 30010, "Max shared media items limit reached for DM");
        int i6 = -8;
        LJJIIJZLJL = new C1B4F(i6, 50000, "NO DM");
        LJJIIZ = new C1B4F(i6, 50010, "DM feature blocked");
    }

    public /* synthetic */ C1B4F(int i, int i2, String str) {
        this(i, i2, str, "");
    }

    public C1B4F(int i, int i2, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }

    public static C1B4F LIZ(C1B4F c1b4f, int i, String str, String str2, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i = c1b4f.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1b4f.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            str = c1b4f.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str2 = c1b4f.LIZLLL;
        }
        return new C1B4F(i, i3, str, str2);
    }
}
