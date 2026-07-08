package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0IZG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZG {
    public final InterfaceC471880Iew LIZ;
    public FeedExtra LIZIZ;
    public boolean LIZJ;
    public C11JF LIZLLL;

    public C0IZG(C471860Ieu c471860Ieu) {
        this.LIZ = c471860Ieu;
    }

    public static void LIZ(FeedItem feedItem) {
        Room room;
        int i = feedItem.type;
        if (i == 1 || i == 2) {
            InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
            if ((interfaceC468260IXw instanceof Room) && (room = (Room) interfaceC468260IXw) != null) {
                room.setLog_pb(feedItem.logPb);
                User owner = room.getOwner();
                if (owner != null) {
                    owner.setLogPb(feedItem.logPb);
                }
                room.setRequestId(feedItem.resId);
                room.isFromRecommendCard = feedItem.isRecommendCard;
            }
        }
    }
}
