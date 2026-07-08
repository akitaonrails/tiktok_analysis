package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9Y {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D9Y)) {
            return false;
        }
        C0D9Y c0d9y = (C0D9Y) obj;
        return Intrinsics.LJFF(this.LIZ, c0d9y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d9y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d9y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d9y.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d9y.LJ) && Intrinsics.LJFF(this.LJFF, c0d9y.LJFF) && Intrinsics.LJFF(this.LJI, c0d9y.LJI) && Intrinsics.LJFF(this.LJII, c0d9y.LJII) && this.LJIIIIZZ == c0d9y.LJIIIIZZ && this.LJIIIZ == c0d9y.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0d9y.LJIIJ) && this.LJIIJJI == c0d9y.LJIIJJI;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI);
    }

    public final String toString() {
        return "CheckoutCashierRequestParams(host=" + this.LIZ + ", merchantId=" + this.LIZIZ + ", countryOrRegion=" + this.LIZJ + ", amount=" + this.LIZLLL + ", currency=" + this.LJ + ", partnerPlatform=" + this.LJFF + ", googlePayGateway=" + this.LJI + ", googlePayGatewayMerchantId=" + this.LJII + ", needMock=" + this.LJIIIIZZ + ", forceFilterGooglePay=" + this.LJIIIZ + ", checkoutId=" + this.LJIIJ + ", isAcpScene=" + this.LJIIJJI + ')';
    }

    public C0D9Y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = str9;
        this.LJIIJJI = z3;
    }
}
