package X;

/* JADX INFO: renamed from: X.0azk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956380azk {
    public int LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final boolean LIZ() {
        return this.LJ.booleanValue() || this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkCrossRoomEvent{what=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkMicBottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", object=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", isPk=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", compensatoryVideoTopMargin=");
        sbLIZ.append(0);
        sbLIZ.append(", isTakeStageLayout=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isEnlargeLayout=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", isOtherTakeStageLayout=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", takeStageBottomExtraMargin=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C956380azk(int i, String str) {
        Boolean bool = Boolean.FALSE;
        this.LJ = bool;
        this.LJFF = bool;
        this.LJI = bool;
        this.LJII = 0;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
