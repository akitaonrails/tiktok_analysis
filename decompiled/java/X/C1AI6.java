package X;

/* JADX INFO: renamed from: X.1AI6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AI6 {
    public final boolean LIZ;
    public final EnumC785670Urt LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public final String toString() {
        return "ViewerWishesSettingsEnterFrom(isInLive=" + this.LIZ + ", method=" + this.LIZIZ + ", isFromGuidePage=" + this.LIZJ + ", scene=" + this.LIZLLL + ", fromNewUser=" + this.LJ + ", settingName=" + this.LJFF + ", campaignGiftList=" + this.LJI + ", campaignName=" + this.LJII + ", campaignActivityId=" + this.LJIIIIZZ + ", saveType=" + this.LJIIIZ + ", templateId=" + this.LJIIJ + ')';
    }

    public C1AI6(boolean z, EnumC785670Urt enumC785670Urt, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        enumC785670Urt = (i & 2) != 0 ? EnumC785670Urt.OTHER : enumC785670Urt;
        str = (i & 8) != 0 ? "" : str;
        if ((i & 32) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        str2 = (i & 64) != 0 ? "" : str2;
        str3 = (i & 128) != 0 ? "" : str3;
        str4 = (i & 256) != 0 ? "" : str4;
        str5 = (i & 512) != 0 ? "" : str5;
        str6 = (i & 1024) != 0 ? "" : str6;
        this.LIZ = z;
        this.LIZIZ = enumC785670Urt;
        this.LIZJ = false;
        this.LIZLLL = str;
        this.LJ = false;
        this.LJFF = str7;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
    }
}
