package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146350fw9 implements InterfaceC1146480fwM {
    public final long LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final ImageModel LLILZLL;
    public final ImageModel LLIZ;
    public final ImageModel LLIZLLLIL;
    public final InterfaceC1665500tRU<GiftPanelCardletByCreator> LLJ;
    public final boolean LLJI;
    public final C1133650fbf LLJIJIL;
    public final boolean LLJILJIL;
    public final Long LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final AbstractC1146450fwJ LLJJI;
    public final String LLJJIII;
    public final boolean LLJJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146350fw9)) {
            return false;
        }
        C1146350fw9 c1146350fw9 = (C1146350fw9) obj;
        return this.LL == c1146350fw9.LL && this.LLILLJJLI == c1146350fw9.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1146350fw9.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1146350fw9.LLILZ) && this.LLILZIL == c1146350fw9.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1146350fw9.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1146350fw9.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1146350fw9.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1146350fw9.LLJ) && this.LLJI == c1146350fw9.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1146350fw9.LLJIJIL) && this.LLJILJIL == c1146350fw9.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c1146350fw9.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1146350fw9.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1146350fw9.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1146350fw9.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1146350fw9.LLJJIII);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31;
        ImageModel imageModel = this.LLILZLL;
        int iHashCode = (iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LLIZ;
        int iHashCode2 = (iHashCode + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        ImageModel imageModel3 = this.LLIZLLLIL;
        int iHashCode3 = (((((((((iHashCode2 + (imageModel3 == null ? 0 : imageModel3.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31;
        Long l = this.LLJILJILJ;
        return ((((((((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode();
    }

    public final String toString() {
        return "AnchorGiftUiItem(giftId=" + this.LL + ", type=" + this.LLILLJJLI + ", name=" + this.LLILLL + ", coinsText=" + this.LLILZ + ", diamondCount=" + this.LLILZIL + ", image=" + this.LLILZLL + ", previewImage=" + this.LLIZ + ", leftLogo=" + this.LLIZLLLIL + ", giftPanelCardlets=" + this.LLJ + ", isBoxGift=" + this.LLJI + ", liveGoalGiftsInfo=" + this.LLJIJIL + ", fromRecommendGift=" + this.LLJILJIL + ", actEventId=" + this.LLJILJILJ + ", schemeUrl=" + this.LLJILLL + ", schemeDescribe=" + this.LLJJ + ", state=" + this.LLJJI + ", communityGiftStatusGiftPanel=" + this.LLJJIII + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1146350fw9) {
            C1146350fw9 c1146350fw9 = (C1146350fw9) interfaceC1891350zJl;
            if (c1146350fw9.LL == this.LL && Intrinsics.LJFF(c1146350fw9.LLJILJILJ, this.LLJILJILJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C1146350fw9 LIZ(C1146350fw9 c1146350fw9, AbstractC1146450fwJ abstractC1146450fwJ) {
        long j = c1146350fw9.LL;
        int i = c1146350fw9.LLILLJJLI;
        String str = c1146350fw9.LLILLL;
        String str2 = c1146350fw9.LLILZ;
        int i2 = c1146350fw9.LLILZIL;
        ImageModel imageModel = c1146350fw9.LLILZLL;
        ImageModel imageModel2 = c1146350fw9.LLIZ;
        ImageModel imageModel3 = c1146350fw9.LLIZLLLIL;
        InterfaceC1665500tRU<GiftPanelCardletByCreator> interfaceC1665500tRU = c1146350fw9.LLJ;
        boolean z = c1146350fw9.LLJI;
        C1133650fbf c1133650fbf = c1146350fw9.LLJIJIL;
        boolean z2 = c1146350fw9.LLJILJIL;
        Long l = c1146350fw9.LLJILJILJ;
        String str3 = c1146350fw9.LLJILLL;
        String str4 = c1146350fw9.LLJJ;
        String str5 = c1146350fw9.LLJJIII;
        c1146350fw9.getClass();
        return new C1146350fw9(j, i, str, str2, i2, imageModel, imageModel2, imageModel3, interfaceC1665500tRU, z, c1133650fbf, z2, l, str3, str4, abstractC1146450fwJ, str5);
    }

    public /* synthetic */ C1146350fw9(long j, int i, String str, String str2, int i2, ImageModel imageModel, ImageModel imageModel2, ImageModel imageModel3, InterfaceC1665500tRU interfaceC1665500tRU, boolean z, C1133650fbf c1133650fbf, boolean z2, Long l, String str3, String str4, String str5) {
        this(j, i, str, str2, i2, imageModel, imageModel2, imageModel3, interfaceC1665500tRU, z, c1133650fbf, z2, l, str3, str4, C1146460fwK.LIZ, str5);
    }

    public C1146350fw9(long j, int i, String str, String str2, int i2, ImageModel imageModel, ImageModel imageModel2, ImageModel imageModel3, InterfaceC1665500tRU<GiftPanelCardletByCreator> interfaceC1665500tRU, boolean z, C1133650fbf c1133650fbf, boolean z2, Long l, String str3, String str4, AbstractC1146450fwJ abstractC1146450fwJ, String str5) {
        boolean z3;
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i2;
        this.LLILZLL = imageModel;
        this.LLIZ = imageModel2;
        this.LLIZLLLIL = imageModel3;
        this.LLJ = interfaceC1665500tRU;
        this.LLJI = z;
        this.LLJIJIL = c1133650fbf;
        this.LLJILJIL = z2;
        this.LLJILJILJ = l;
        this.LLJILLL = str3;
        this.LLJJ = str4;
        this.LLJJI = abstractC1146450fwJ;
        this.LLJJIII = str5;
        if (l != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJJIJI = z3;
    }
}
