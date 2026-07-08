package X;

/* JADX INFO: renamed from: X.0IET, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IET {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final InterfaceC463550IFt LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerChangeLayoutParam(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", topMargin=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", leftMargin=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rightMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isFullScreen=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", playerChangeListener=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enableSeiFilter=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0IET(int i, int i2, int i3, int i4, int i5, boolean z, String str) {
        this(i, i2, i3, i4, i5, z, null, false, str);
    }

    public C0IET(int i, int i2, int i3, int i4, int i5, boolean z, InterfaceC463550IFt interfaceC463550IFt, boolean z2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = z;
        this.LJI = interfaceC463550IFt;
        this.LJII = z2;
        this.LJIIIIZZ = str;
    }
}
