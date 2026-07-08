package X;

/* JADX INFO: renamed from: X.0n0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418100n0S {
    public final String LIZ;
    public String LIZIZ;
    public EnumC1412640mre LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobParams(sceneName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", contentSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1418100n0S(String str, String str2, EnumC1412640mre enumC1412640mre) {
        this(str, str2, enumC1412640mre, null, null, null);
    }

    public C1418100n0S(String str, String str2, EnumC1412640mre enumC1412640mre, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1412640mre;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
