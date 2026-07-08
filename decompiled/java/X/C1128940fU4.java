package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0fU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128940fU4 extends AnonymousClass0054 {
    public final BagItem LIZ;
    public long LIZIZ;
    public Long LIZJ;
    public long LIZLLL;
    public Long LJ;
    public String LJFF;
    public final String LJI;
    public final ImageModel LJII;
    public final ImageModel LJIIIIZZ;
    public final GiftPanelBanner LJIIIZ;
    public final int LJIIJ;
    public final long LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final long LJIILL;
    public final boolean LJIILLIIL;
    public final long LJIIZILJ;
    public final long LJIL;
    public boolean LJIILJJIL = false;
    public int LJIJ = 0;
    public int LJIJI = 1;
    public int LJIJJ = 0;
    public boolean LJIJJLI = false;
    public boolean LJJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1128940fU4)) {
            return false;
        }
        C1128940fU4 c1128940fU4 = (C1128940fU4) obj;
        return Intrinsics.LJFF(this.LIZ, c1128940fU4.LIZ) && this.LIZIZ == c1128940fU4.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1128940fU4.LIZJ) && this.LIZLLL == c1128940fU4.LIZLLL && Intrinsics.LJFF(this.LJ, c1128940fU4.LJ) && Intrinsics.LJFF(this.LJFF, c1128940fU4.LJFF) && Intrinsics.LJFF(this.LJI, c1128940fU4.LJI) && Intrinsics.LJFF(this.LJII, c1128940fU4.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1128940fU4.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1128940fU4.LJIIIZ) && this.LJIIJ == c1128940fU4.LJIIJ && this.LJIIJJI == c1128940fU4.LJIIJJI && this.LJIIL == c1128940fU4.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1128940fU4.LJIILIIL) && this.LJIILJJIL == c1128940fU4.LJIILJJIL && this.LJIILL == c1128940fU4.LJIILL && this.LJIILLIIL == c1128940fU4.LJIILLIIL && this.LJIIZILJ == c1128940fU4.LJIIZILJ && this.LJIJ == c1128940fU4.LJIJ && this.LJIJI == c1128940fU4.LJIJI && this.LJIJJ == c1128940fU4.LJIJJ && this.LJIJJLI == c1128940fU4.LJIJJLI && this.LJIL == c1128940fU4.LJIL && this.LJJ == c1128940fU4.LJJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        Long l = this.LIZJ;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        Long l2 = this.LJ;
        int iHashCode3 = (((((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        ImageModel imageModel = this.LJII;
        int iHashCode4 = (iHashCode3 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        GiftPanelBanner giftPanelBanner = this.LJIIIZ;
        return ((((((((((((((((((((((((((((iHashCode5 + (giftPanelBanner != null ? giftPanelBanner.hashCode() : 0)) * 31) + this.LJIIJ) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + this.LJIILIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Y2(this.LJIILL)) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + C786410Ut5.Y2(this.LJIIZILJ)) * 31) + this.LJIJ) * 31) + this.LJIJI) * 31) + this.LJIJJ) * 31) + C786410Ut5.Z2(this.LJIJJLI)) * 31) + C786410Ut5.Y2(this.LJIL)) * 31) + C786410Ut5.Z2(this.LJJ);
    }

    public final String toString() {
        return "MatchItem(originItemData=" + this.LIZ + ", count=" + this.LIZIZ + ", nextCount=" + this.LIZJ + ", expireAt=" + this.LIZLLL + ", nextExpireAt=" + this.LJ + ", displayTimeLeft=" + this.LJFF + ", nameText=" + this.LJI + ", previewImage=" + this.LJII + ", image=" + this.LJIIIIZZ + ", banner=" + this.LJIIIZ + ", itemType=" + this.LJIIJ + ", itemId=" + this.LJIIJJI + ", available=" + this.LJIIL + ", toastWhenUnavailable=" + this.LJIILIIL + ", sendLoading=" + this.LJIILJJIL + ", giftPrice=" + this.LJIILL + ", combo=" + this.LJIILLIIL + ", groupId=" + this.LJIIZILJ + ", sentTotalCount=" + this.LJIJ + ", comboCount=" + this.LJIJI + ", comboSeqNo=" + this.LJIJJ + ", isSendError=" + this.LJIJJLI + ", activeAt=" + this.LJIL + ", needUpdate=" + this.LJJ + ')';
    }

    public final String LIZ() {
        switch (this.LJIIJ) {
            case 1:
                return "boosting_gloves";
            case 2:
                return "magic_smokes";
            case 3:
                return "time_extending";
            case 4:
                return "hammer";
            case 5:
            case 6:
            default:
                return "unknown";
            case 7:
                return "no2_booster";
            case 8:
                return "no3_booster";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "vault_gloves";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "virtual_tickets";
        }
    }

    public C1128940fU4(BagItem bagItem, long j, Long l, long j2, Long l2, String str, String str2, ImageModel imageModel, ImageModel imageModel2, GiftPanelBanner giftPanelBanner, int i, long j3, boolean z, String str3, long j4, boolean z2, long j5, long j6) {
        this.LIZ = bagItem;
        this.LIZIZ = j;
        this.LIZJ = l;
        this.LIZLLL = j2;
        this.LJ = l2;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = imageModel;
        this.LJIIIIZZ = imageModel2;
        this.LJIIIZ = giftPanelBanner;
        this.LJIIJ = i;
        this.LJIIJJI = j3;
        this.LJIIL = z;
        this.LJIILIIL = str3;
        this.LJIILL = j4;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = j5;
        this.LJIL = j6;
    }
}
