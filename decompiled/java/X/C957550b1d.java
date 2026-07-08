package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.0b1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957550b1d {
    public static void LIZ(Map map, int i, long j, Integer num) {
        GiftGalleryBadgeInfo giftGalleryBadgeInfo;
        if (LiveDirectMatchSetting.INSTANCE.isEnabled() && i == 5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyCohostStatusChangeOnAcceptSuccess, inviteType = ");
            sbLIZ.append(i);
            sbLIZ.append(", inviterUserId = ");
            sbLIZ.append(j);
            sbLIZ.append(", sourceType = ");
            sbLIZ.append(num);
            C20441214yg.LIZIZ("TwoMatchInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C957560b1e c957560b1e = null;
            if (map != null) {
                giftGalleryBadgeInfo = (GiftGalleryBadgeInfo) map.get(Long.valueOf(j));
            } else {
                giftGalleryBadgeInfo = null;
            }
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            if (num != null) {
                c957560b1e = new C957560b1e(num.intValue(), 2);
            }
            c784440UpuLIZ.LIZIZ(new C955730ayh(5, j, c957560b1e, giftGalleryBadgeInfo));
        }
    }

    public static void LIZIZ(Map map, int i, long j, Integer num) {
        GiftGalleryBadgeInfo giftGalleryBadgeInfo;
        if (LiveDirectMatchSetting.INSTANCE.isEnabled() && i == 5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyCohostStatusChangeOnReceiveRejectSuccess, inviteType = ");
            sbLIZ.append(i);
            sbLIZ.append(", inviterUserId = ");
            sbLIZ.append(j);
            sbLIZ.append(", sourceType = ");
            sbLIZ.append(num);
            C20441214yg.LIZIZ("TwoMatchInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C957560b1e c957560b1e = null;
            if (map != null) {
                giftGalleryBadgeInfo = (GiftGalleryBadgeInfo) map.get(Long.valueOf(j));
            } else {
                giftGalleryBadgeInfo = null;
            }
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            if (num != null) {
                c957560b1e = new C957560b1e(num.intValue(), 2);
            }
            c784440UpuLIZ.LIZIZ(new C955740ayi(5, j, c957560b1e, giftGalleryBadgeInfo));
        }
    }
}
