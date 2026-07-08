package X;

/* JADX INFO: renamed from: X.0aWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938510aWv {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraInfo(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", muteAudio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", muteVideo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onlineUserState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", linkedUserSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C938510aWv(int i, int i2, int i3, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
