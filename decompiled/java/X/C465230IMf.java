package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerNewLayoutTopicIdSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465230IMf {
    public static final boolean LIZ(DataChannel dataChannel) {
        Long l;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            return false;
        }
        for (long j : LivePlayerNewLayoutTopicIdSetting.INSTANCE.getValue()) {
            Hashtag hashtag = room.hashtag;
            if (hashtag != null && (l = hashtag.id) != null) {
                l.longValue();
                Long l2 = room.hashtag.id;
                if (l2 != null && l2.longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }
}
