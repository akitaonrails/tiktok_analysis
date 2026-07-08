package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805220x4q {
    public final List<InterfaceC1806790x7N> LIZ;
    public final Map<String, List<C1805370x55>> LIZIZ;
    public final Throwable LIZJ;
    public final IapListResult.ListResultExtra LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final C1805370x55 LJI;
    public final C1803830x2b LJII;
    public final boolean LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final Map<String, Long> LJIIL;
    public final Long LJIILIIL;
    public final Map<String, List<IapListResult.VoucherItem>> LJIILJJIL;
    public final boolean LJIILL;
    public final Integer LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805220x4q)) {
            return false;
        }
        C1805220x4q c1805220x4q = (C1805220x4q) obj;
        return Intrinsics.LJFF(this.LIZ, c1805220x4q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1805220x4q.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1805220x4q.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1805220x4q.LIZLLL) && Intrinsics.LJFF(this.LJ, c1805220x4q.LJ) && this.LJFF == c1805220x4q.LJFF && Intrinsics.LJFF(this.LJI, c1805220x4q.LJI) && Intrinsics.LJFF(this.LJII, c1805220x4q.LJII) && this.LJIIIIZZ == c1805220x4q.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1805220x4q.LJIIIZ) && this.LJIIJ == c1805220x4q.LJIIJ && this.LJIIJJI == c1805220x4q.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1805220x4q.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1805220x4q.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1805220x4q.LJIILJJIL) && this.LJIILL == c1805220x4q.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c1805220x4q.LJIILLIIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Throwable th = this.LIZJ;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        IapListResult.ListResultExtra listResultExtra = this.LIZLLL;
        int iHashCode3 = (((((iHashCode2 + (listResultExtra == null ? 0 : listResultExtra.hashCode())) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        C1805370x55 c1805370x55 = this.LJI;
        int iHashCode4 = (((((iHashCode3 + (c1805370x55 == null ? 0 : c1805370x55.hashCode())) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Boolean bool = this.LJIIIZ;
        int iHashCode5 = (((((((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode()) * 31;
        Long l = this.LJIILIIL;
        int iHashCode6 = (((((iHashCode5 + (l == null ? 0 : l.hashCode())) * 31) + this.LJIILJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31;
        Integer num = this.LJIILLIIL;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "WalletPackageParams(productList=" + this.LIZ + ", packageListMap=" + this.LIZIZ + ", walletPackageError=" + this.LIZJ + ", extra=" + this.LIZLLL + ", panelChannel=" + this.LJ + ", shouldShowKycIncentiveFooterView=" + this.LJFF + ", prevDiamond=" + this.LJI + ", rechargeDialogConfig=" + this.LJII + ", shouldShowTab=" + this.LJIIIIZZ + ", isRecommendPackage=" + this.LJIIIZ + ", isTabChanges=" + this.LJIIJ + ", isCustomV3Supported=" + this.LJIIJJI + ", recommendedPacketIds=" + this.LJIIL + ", recentlyPurchasedPacketId=" + this.LJIILIIL + ", voucherLists=" + this.LJIILJJIL + ", retryAfterFail=" + this.LJIILL + ", kycMaxAmountUsd=" + this.LJIILLIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1805220x4q(List<? extends InterfaceC1806790x7N> list, Map<String, ? extends List<C1805370x55>> map, Throwable th, IapListResult.ListResultExtra listResultExtra, String str, boolean z, C1805370x55 c1805370x55, C1803830x2b c1803830x2b, boolean z2, Boolean bool, boolean z3, boolean z4, Map<String, Long> map2, Long l, Map<String, ? extends List<IapListResult.VoucherItem>> map3, boolean z5, Integer num) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = th;
        this.LIZLLL = listResultExtra;
        this.LJ = str;
        this.LJFF = z;
        this.LJI = c1805370x55;
        this.LJII = c1803830x2b;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = bool;
        this.LJIIJ = z3;
        this.LJIIJJI = z4;
        this.LJIIL = map2;
        this.LJIILIIL = l;
        this.LJIILJJIL = map3;
        this.LJIILL = z5;
        this.LJIILLIIL = num;
    }
}
