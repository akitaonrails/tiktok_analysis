package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0g4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151830g4z implements InterfaceC19483011Ki {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        switch (this.$t) {
            case 0:
                return test$0(this, obj);
            case 1:
                return test$1(this, obj);
            default:
                return false;
        }
    }

    public C1151830g4z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean test$0(C1151830g4z c1151830g4z, Object obj) {
        if (((C1114490f6l) obj).LIZ == ((ISendCommentEvent) c1151830g4z.l0)) {
            return true;
        }
        return false;
    }

    public static final boolean test$1(C1151830g4z c1151830g4z, Object obj) {
        FollowPair followPair = (FollowPair) obj;
        Room room = ((OnlineAudienceRankWidget) c1151830g4z.l0).LLJILLL;
        if (room != null && followPair.LIZ == room.getOwnerUserId()) {
            return true;
        }
        return false;
    }
}
