package X;

/* JADX INFO: renamed from: X.0vKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737880vKE {
    public final String LIZ;
    public final EnumC1736950vIj LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadIconTokenData(token=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categoryIconType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", assetId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1737880vKE() {
        this(EnumC1736950vIj.EFFECT_ICON_FEMALE, "", "", "");
    }

    public C1737880vKE(EnumC1736950vIj enumC1736950vIj, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = enumC1736950vIj;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
