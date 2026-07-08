package X;

/* JADX INFO: renamed from: X.0PCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641120PCs {
    public final Integer LIZ;
    public final String LIZIZ;
    public final boolean LIZJ = false;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductCardCellClick(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickRefer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needJump=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C641120PCs(Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
    }
}
