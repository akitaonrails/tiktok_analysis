package X;

/* JADX INFO: renamed from: X.0HHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHQ {
    public final String LIZ;
    public final double LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarImageInfo(uri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", boyProb=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", skinColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HHQ() {
        this("", 0.0d, "");
    }

    public C0HHQ(String str, double d, String str2) {
        this.LIZ = str;
        this.LIZIZ = d;
        this.LIZJ = str2;
    }
}
