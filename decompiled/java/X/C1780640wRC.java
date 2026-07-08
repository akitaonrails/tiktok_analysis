package X;

/* JADX INFO: renamed from: X.0wRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780640wRC {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final EnumC1780670wRF LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Price(formattedPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priceAmountMicros=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priceCurrencyCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", billingPeriod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", billingCycleCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", recurrenceMode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780640wRC(String str, long j, String str2, String str3, int i, EnumC1780670wRF enumC1780670wRF) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = enumC1780670wRF;
    }
}
