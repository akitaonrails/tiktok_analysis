package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129140fUO extends AbstractC991550buT {
    public final List<GiftPage> LIZ;
    public final int LIZIZ;
    public final Gift LIZJ;
    public final boolean LIZLLL;
    public final C1091480eVe LJ;
    public final Long LJFF;
    public final int LJI;
    public final C157100iv LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129140fUO)) {
            return false;
        }
        C1129140fUO c1129140fUO = (C1129140fUO) obj;
        return Intrinsics.LJFF(this.LIZ, c1129140fUO.LIZ) && this.LIZIZ == c1129140fUO.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1129140fUO.LIZJ) && this.LIZLLL == c1129140fUO.LIZLLL && Intrinsics.LJFF(this.LJ, c1129140fUO.LJ) && Intrinsics.LJFF(this.LJFF, c1129140fUO.LJFF) && this.LJI == c1129140fUO.LJI && Intrinsics.LJFF(this.LJII, c1129140fUO.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Gift gift = this.LIZJ;
        int iHashCode2 = (((iHashCode + (gift == null ? 0 : gift.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C1091480eVe c1091480eVe = this.LJ;
        int iHashCode3 = (iHashCode2 + (c1091480eVe == null ? 0 : c1091480eVe.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode4 = (((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31) + this.LJI) * 31;
        C157100iv c157100iv = this.LJII;
        return iHashCode4 + (c157100iv != null ? c157100iv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(giftPages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedTabType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedGift=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelSnapshot=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", updatedStoredGiftId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", selectedGiftIndex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", sourceTagIndex=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1129140fUO(List list, int i, Gift gift, boolean z, C1091480eVe c1091480eVe, int i2, C157100iv c157100iv, int i3) {
        this((List<? extends GiftPage>) list, i, gift, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : c1091480eVe, (Long) null, (i3 & 64) != 0 ? -1 : i2, (i3 & 128) == 0 ? c157100iv : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1129140fUO(List<? extends GiftPage> list, int i, Gift gift, boolean z, C1091480eVe c1091480eVe, Long l, int i2, C157100iv c157100iv) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = gift;
        this.LIZLLL = z;
        this.LJ = c1091480eVe;
        this.LJFF = l;
        this.LJI = i2;
        this.LJII = c157100iv;
    }
}
