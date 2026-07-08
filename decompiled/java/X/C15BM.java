package X;

/* JADX INFO: renamed from: X.15BM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BM {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInfo(userTag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15BM) || ((C15BM) obj).LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C15BM(int i, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
