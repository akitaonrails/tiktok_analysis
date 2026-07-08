package X;

/* JADX INFO: renamed from: X.0vK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737770vK3 {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC1736950vIj LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CropIconData(iconPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cropIconPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", categoryIconType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", assetId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1737770vK3() {
        this(EnumC1736950vIj.EFFECT_ICON_FEMALE, "", "", "");
    }

    public C1737770vK3(EnumC1736950vIj enumC1736950vIj, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1736950vIj;
        this.LIZLLL = str3;
    }
}
