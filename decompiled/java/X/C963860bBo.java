package X;

/* JADX INFO: renamed from: X.0bBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963860bBo {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicAdjustVideoStreamEvent{source='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", left=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C963860bBo() {
    }

    public C963860bBo(int i, int i2, int i3, int i4, String str) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LIZ = str;
    }
}
