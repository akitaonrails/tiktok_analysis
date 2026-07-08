package X;

import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0aAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924750aAj {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        LiveEventInfo liveEventInfo;
        Long l;
        String string;
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        return (roomLJIIIZ == null || (liveEventInfo = roomLJIIIZ.liveEventInfo) == null || (l = liveEventInfo.eventId) == null || (string = l.toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }
}
