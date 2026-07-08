package X;

/* JADX INFO: renamed from: X.0M2T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2T {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public C0M2T(String str, int i) {
        this(false, str, null, i, false, 28);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvertExtraInfo(owner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPublish=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", restoreScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", skipStoryScheduleCleanup=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M2T(boolean z, String str, String str2, int i, boolean z2, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? -1 : i;
        if ((i2 & 4) != 0) {
            z = true;
            if (i != 1 && i != 8) {
                z = false;
            }
        }
        str2 = (i2 & 8) != 0 ? " unknown" : str2;
        z2 = (i2 & 16) != 0 ? false : z2;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = z2;
    }
}
