package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930140aJQ implements InterfaceC951240arS<Object> {
    public final int LIZ;
    public final ListByTypeResponse.GiftScoreAppliedUser LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C930140aJQ)) {
            return false;
        }
        C930140aJQ c930140aJQ = (C930140aJQ) obj;
        return this.LIZ == c930140aJQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c930140aJQ.LIZIZ) && this.LIZJ == c930140aJQ.LIZJ && this.LIZLLL == c930140aJQ.LIZLLL && Intrinsics.LJFF(this.LJ, c930140aJQ.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Integer num = this.LJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplierGifterUserInfo(rank=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", applier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSelfTop=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isBottom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", selfRank=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        Long lValueOf;
        User user;
        User user2;
        if (obj instanceof C930140aJQ) {
            C930140aJQ c930140aJQ = (C930140aJQ) obj;
            if (c930140aJQ.LIZ != this.LIZ) {
                return false;
            }
            ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser = c930140aJQ.LIZIZ;
            if (giftScoreAppliedUser.giftScore == this.LIZIZ.giftScore) {
                LinkPlayerInfo linkPlayerInfo = giftScoreAppliedUser.listUser;
                Long lValueOf2 = null;
                if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                    lValueOf = Long.valueOf(user2.getId());
                } else {
                    lValueOf = null;
                }
                LinkPlayerInfo linkPlayerInfo2 = this.LIZIZ.listUser;
                if (linkPlayerInfo2 != null && (user = linkPlayerInfo2.mUser) != null) {
                    lValueOf2 = Long.valueOf(user.getId());
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2) || c930140aJQ.LIZJ != this.LIZJ || c930140aJQ.LIZLLL != this.LIZLLL) {
                    return false;
                }
                Integer num = c930140aJQ.LJ;
                if (!Intrinsics.LJFF(num, num)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C930140aJQ;
    }

    public C930140aJQ(int i, ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser, boolean z, boolean z2, Integer num, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        this.LIZ = i;
        this.LIZIZ = giftScoreAppliedUser;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = num;
    }
}
