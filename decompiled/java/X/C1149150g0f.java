package X;

/* JADX INFO: renamed from: X.0g0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149150g0f {
    public final EnumC1151140g3s LIZ;
    public final EnumC1151140g3s LIZIZ;
    public final EnumC1151140g3s LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149150g0f)) {
            return false;
        }
        C1149150g0f c1149150g0f = (C1149150g0f) obj;
        return this.LIZ == c1149150g0f.LIZ && this.LIZIZ == c1149150g0f.LIZIZ && this.LIZJ == c1149150g0f.LIZJ && this.LIZLLL == c1149150g0f.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletBalanceInfo(balanceServerState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", liveExchangeServerStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ugExchangeStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasExchangeBalance=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1149150g0f(EnumC1151140g3s enumC1151140g3s, EnumC1151140g3s enumC1151140g3s2, EnumC1151140g3s enumC1151140g3s3, boolean z) {
        this.LIZ = enumC1151140g3s;
        this.LIZIZ = enumC1151140g3s2;
        this.LIZJ = enumC1151140g3s3;
        this.LIZLLL = z;
    }
}
