package X;

/* JADX INFO: renamed from: X.0brY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989740brY {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public final C989730brX LIZIZ;
    public final C1107810evz LIZJ;

    static {
        new Object() { // from class: X.0bra
        };
    }

    public C989740brY() {
        this(0, null, null, 7);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C989730brX c989730brX = this.LIZIZ;
        int iHashCode = (i + (c989730brX == null ? 0 : c989730brX.hashCode())) * 31;
        C1107810evz c1107810evz = this.LIZJ;
        return iHashCode + (c1107810evz != null ? c1107810evz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiNotifyInfo(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", componentInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessItem=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989740brY(int i, C989730brX c989730brX, C1107810evz c1107810evz, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        c989730brX = (i2 & 2) != 0 ? null : c989730brX;
        c1107810evz = (i2 & 4) != 0 ? null : c1107810evz;
        this.LIZ = i;
        this.LIZIZ = c989730brX;
        this.LIZJ = c1107810evz;
    }
}
