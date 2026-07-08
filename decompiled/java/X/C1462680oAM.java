package X;

/* JADX INFO: renamed from: X.0oAM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462680oAM {
    public final String LIZ;
    public final EnumC1462670oAL LIZIZ;
    public final EnumC1462670oAL LIZJ;
    public final EnumC1462670oAL LIZLLL;
    public final int LJ;
    public final String LJFF;

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tag: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" \nOrigin File Exit: ");
        sbLIZ.append(this.LIZIZ.getStatus());
        sbLIZ.append(" \nRecord File Exit: ");
        sbLIZ.append(this.LIZJ.getStatus());
        sbLIZ.append(" \nOutput File Exit: ");
        sbLIZ.append(this.LIZLLL.getStatus());
        sbLIZ.append(" \nExtra: ");
        sbLIZ.append(this.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1462680oAM(String str, EnumC1462670oAL enumC1462670oAL, EnumC1462670oAL enumC1462670oAL2, EnumC1462670oAL enumC1462670oAL3, int i) {
        this(str, enumC1462670oAL, enumC1462670oAL2, enumC1462670oAL3, i, "");
    }

    public C1462680oAM(String str, EnumC1462670oAL enumC1462670oAL, EnumC1462670oAL enumC1462670oAL2, EnumC1462670oAL enumC1462670oAL3, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC1462670oAL;
        this.LIZJ = enumC1462670oAL2;
        this.LIZLLL = enumC1462670oAL3;
        this.LJ = i;
        this.LJFF = str2;
    }
}
