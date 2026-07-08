package X;

/* JADX INFO: renamed from: X.0DEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335850DEp {
    public final EnumC1709470uaP LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentReadyInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335850DEp(EnumC1709470uaP enumC1709470uaP, String str) {
        this.LIZ = enumC1709470uaP;
        this.LIZIZ = str;
    }
}
