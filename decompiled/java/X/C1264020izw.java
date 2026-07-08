package X;

/* JADX INFO: renamed from: X.0izw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264020izw {
    public final C1153800g8A LIZ;
    public final C1246110iX3 LIZIZ;
    public final Integer LIZJ;

    public final int hashCode() {
        C1153800g8A c1153800g8A = this.LIZ;
        int iHashCode = (c1153800g8A == null ? 0 : c1153800g8A.hashCode()) * 31;
        C1246110iX3 c1246110iX3 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1246110iX3 == null ? 0 : c1246110iX3.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationLabelMeta(textInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264020izw(C1153800g8A c1153800g8A, C1246110iX3 c1246110iX3, Integer num) {
        this.LIZ = c1153800g8A;
        this.LIZIZ = c1246110iX3;
        this.LIZJ = num;
    }
}
