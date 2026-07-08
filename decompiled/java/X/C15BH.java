package X;

/* JADX INFO: renamed from: X.15BH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BH {
    public final C15BK LIZ;
    public final C15BM LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionInfo(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15BH(C15BK c15bk, C15BM c15bm, int i) {
        this.LIZ = c15bk;
        this.LIZIZ = c15bm;
        this.LIZJ = i;
    }
}
