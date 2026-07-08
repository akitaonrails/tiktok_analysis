package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ayi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955740ayi extends AbstractC957040b0o {
    public final int LIZIZ;
    public final long LIZJ;
    public final C957560b1e LIZLLL;
    public final GiftGalleryBadgeInfo LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955740ayi)) {
            return false;
        }
        C955740ayi c955740ayi = (C955740ayi) obj;
        return this.LIZIZ == c955740ayi.LIZIZ && this.LIZJ == c955740ayi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c955740ayi.LIZLLL) && Intrinsics.LJFF(this.LJ, c955740ayi.LJ);
    }

    public final int hashCode() {
        int iY2 = ((this.LIZIZ * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        C957560b1e c957560b1e = this.LIZLLL;
        int iHashCode = (iY2 + (c957560b1e == null ? 0 : c957560b1e.hashCode())) * 31;
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = this.LJ;
        return iHashCode + (giftGalleryBadgeInfo != null ? giftGalleryBadgeInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleRejectEvent(inviteType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inviterUserId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", coHostParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inviterGiftGalleryBadgeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC957040b0o
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C955740ayi(int i, long j, C957560b1e c957560b1e, GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = c957560b1e;
        this.LJ = giftGalleryBadgeInfo;
    }
}
