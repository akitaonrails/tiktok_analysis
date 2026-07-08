package X;

/* JADX INFO: renamed from: X.0aTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936640aTu {
    public final EnumC936670aTx LIZ;
    public final String LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayToolPage(playToolPageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entranceFromPlaybookId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trafficSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C936640aTu(EnumC936670aTx enumC936670aTx, String str) {
        this(enumC936670aTx, "play_panel", str, "");
    }

    public C936640aTu(EnumC936670aTx enumC936670aTx, String str, String str2, String str3) {
        this.LIZ = enumC936670aTx;
        this.LIZIZ = str;
        this.LIZJ = null;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
