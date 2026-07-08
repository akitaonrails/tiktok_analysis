package X;

/* JADX INFO: renamed from: X.0jGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274150jGH {
    public final int LIZ;
    public final int LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraSize{width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" aspect= ");
        sbLIZ.append((this.LIZ * 1.0f) / this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1274150jGH(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
