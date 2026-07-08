package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805370x55 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final double LJFF;
    public final int LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Long LJIIJJI;
    public final Diamond LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805370x55)) {
            return false;
        }
        C1805370x55 c1805370x55 = (C1805370x55) obj;
        return Intrinsics.LJFF(this.LIZ, c1805370x55.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1805370x55.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1805370x55.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1805370x55.LIZLLL) && Intrinsics.LJFF(this.LJ, c1805370x55.LJ) && Double.compare(this.LJFF, c1805370x55.LJFF) == 0 && this.LJI == c1805370x55.LJI && Intrinsics.LJFF(this.LJII, c1805370x55.LJII) && this.LJIIIIZZ == c1805370x55.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1805370x55.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1805370x55.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1805370x55.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1805370x55.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.X2(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31;
        Long l = this.LJIIJJI;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.LJIIL.hashCode();
    }

    public final String toString() {
        return "WalletClientDiamond(iapId=" + this.LIZ + ", contentDescription=" + this.LIZIZ + ", countText=" + this.LIZJ + ", priceText=" + this.LIZLLL + ", priceCurrencyCode=" + this.LJ + ", originalLocalPrice=" + this.LJFF + ", count=" + this.LJI + ", localCurrency=" + this.LJII + ", isTiktok=" + this.LJIIIIZZ + ", customConvertedPrice=" + this.LJIIIZ + ", customPriceCurrency=" + this.LJIIJ + ", priceInUsd=" + this.LJIIJJI + ", legacyDiamond=" + this.LJIIL + ')';
    }

    public C1805370x55(String str, String str2, String str3, String str4, String str5, double d, int i, String str6, boolean z, String str7, String str8, Long l, Diamond diamond) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = d;
        this.LJI = i;
        this.LJII = str6;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
        this.LJIIJJI = l;
        this.LJIIL = diamond;
    }
}
