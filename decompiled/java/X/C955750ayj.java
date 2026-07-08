package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ayj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955750ayj extends AbstractC957610b1j {
    public final int LIZ;
    public final long LIZIZ;
    public final C957560b1e LIZJ;
    public final GiftGalleryBadgeInfo LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955750ayj)) {
            return false;
        }
        C955750ayj c955750ayj = (C955750ayj) obj;
        return this.LIZ == c955750ayj.LIZ && this.LIZIZ == c955750ayj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c955750ayj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c955750ayj.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        C957560b1e c957560b1e = this.LIZJ;
        int iHashCode = (iY2 + (c957560b1e == null ? 0 : c957560b1e.hashCode())) * 31;
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = this.LIZLLL;
        return iHashCode + (giftGalleryBadgeInfo != null ? giftGalleryBadgeInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleInviteIM(inviteType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviterUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coHostParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inviterGiftGalleryBadgeInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955750ayj(int i, long j, C957560b1e c957560b1e, GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = c957560b1e;
        this.LIZLLL = giftGalleryBadgeInfo;
    }
}
