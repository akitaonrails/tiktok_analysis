package X;

/* JADX INFO: renamed from: X.0wrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796880wrO {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckOrderResultInfo(productId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1796880wrO(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
