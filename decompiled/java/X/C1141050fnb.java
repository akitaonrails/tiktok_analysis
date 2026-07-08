package X;

/* JADX INFO: renamed from: X.0fnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141050fnb {
    public final int LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;
    public C1138610fjf LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1141050fnb(int i, String str, Throwable th) {
        String str2;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = th;
        switch (i) {
            case -32:
            case -31:
            case -29:
            case -27:
            case -26:
            case -25:
            case -23:
                str2 = "effect_finish";
                break;
            case -30:
            case -22:
            case -21:
            case -20:
            case -18:
            case -16:
            case -14:
            case -13:
            case -11:
            case -10:
                str2 = "render_start";
                break;
            case -28:
            case -24:
            case -19:
            case -17:
            case -15:
            case -12:
            default:
                str2 = "unknown";
                break;
        }
        this.LJ = str2;
    }
}
