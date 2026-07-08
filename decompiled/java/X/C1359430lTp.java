package X;

/* JADX INFO: renamed from: X.0lTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359430lTp {
    public final boolean LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359430lTp)) {
            return false;
        }
        C1359430lTp c1359430lTp = (C1359430lTp) obj;
        return this.LIZ == c1359430lTp.LIZ && this.LIZIZ == c1359430lTp.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeState(liked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1359430lTp(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
