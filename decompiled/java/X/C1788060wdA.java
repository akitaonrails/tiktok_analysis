package X;

/* JADX INFO: renamed from: X.0wdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788060wdA {
    public final EnumC1157990gEv LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Purchase(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentReference=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", token=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", originalJson=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", purchaseTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isAcknowledged=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isATUPurchase=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1788060wdA(EnumC1157990gEv enumC1157990gEv, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.LIZ = enumC1157990gEv;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = j;
        this.LJII = z;
        this.LJIIIIZZ = z2;
    }
}
