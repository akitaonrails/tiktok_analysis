package X;

/* JADX INFO: renamed from: X.0hWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207220hWK {
    public static final /* synthetic */ int LJI = 0;
    public final int LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final long LJFF;

    static {
        new Object() { // from class: X.0hWS
        };
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermissionDataExtras(systemPermissionLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inAppPrecise=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeDiffSinceLastPopup=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", certShowIndex=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1207220hWK(int i, long j, long j2, boolean z, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = j2;
    }
}
