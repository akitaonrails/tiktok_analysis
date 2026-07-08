package X;

import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDT {
    public SubInfo LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public int LJI;
    public RefundInfo LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public PGCTipsInfo LJIIJJI;
    public PGCSubsTransitionPeriodInfo LJIIL;

    public C0KDT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KDT)) {
            return false;
        }
        C0KDT c0kdt = (C0KDT) obj;
        return Intrinsics.LJFF(this.LIZ, c0kdt.LIZ) && this.LIZIZ == c0kdt.LIZIZ && this.LIZJ == c0kdt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kdt.LIZLLL) && this.LJ == c0kdt.LJ && Intrinsics.LJFF(this.LJFF, c0kdt.LJFF) && this.LJI == c0kdt.LJI && Intrinsics.LJFF(this.LJII, c0kdt.LJII) && this.LJIIIIZZ == c0kdt.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c0kdt.LJIIIZ) && this.LJIIJ == c0kdt.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0kdt.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0kdt.LJIIL);
    }

    public final int hashCode() {
        SubInfo subInfo = this.LIZ;
        int iHashCode = (((((((((((((subInfo == null ? 0 : subInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31;
        RefundInfo refundInfo = this.LJII;
        int iHashCode2 = (((iHashCode + (refundInfo == null ? 0 : refundInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        String str = this.LJIIIZ;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        PGCTipsInfo pGCTipsInfo = this.LJIIJJI;
        int iHashCode4 = (iHashCode3 + (pGCTipsInfo == null ? 0 : pGCTipsInfo.hashCode())) * 31;
        PGCSubsTransitionPeriodInfo pGCSubsTransitionPeriodInfo = this.LJIIL;
        return iHashCode4 + (pGCSubsTransitionPeriodInfo != null ? pGCSubsTransitionPeriodInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PGCUiData(subInfo=" + this.LIZ + ", isRenewalScene=" + this.LIZIZ + ", isSelectedRenewPlan=" + this.LIZJ + ", offerTermString=" + this.LIZLLL + ", isInOfferState=" + this.LJ + ", promotionDesc=" + this.LJFF + ", renewalPeriod=" + this.LJI + ", refundInfo=" + this.LJII + ", isFreeTrial=" + this.LJIIIIZZ + ", originalPrice=" + this.LJIIIZ + ", isEuRegion=" + this.LJIIJ + ", pgcTipsInfo=" + this.LJIIJJI + ", pgcSubsTransitionPeriodInfo=" + this.LJIIL + ')';
    }

    public /* synthetic */ C0KDT(int i) {
        this(null, false, false, "", false, "", 1, null, false, null, false, null, null);
    }

    public C0KDT(SubInfo subInfo, boolean z, boolean z2, String str, boolean z3, String str2, int i, RefundInfo refundInfo, boolean z4, String str3, boolean z5, PGCTipsInfo pGCTipsInfo, PGCSubsTransitionPeriodInfo pGCSubsTransitionPeriodInfo) {
        this.LIZ = subInfo;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = z3;
        this.LJFF = str2;
        this.LJI = i;
        this.LJII = refundInfo;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = str3;
        this.LJIIJ = z5;
        this.LJIIJJI = pGCTipsInfo;
        this.LJIIL = pGCSubsTransitionPeriodInfo;
    }
}
