package X;

import com.bytedance.android.livesdkapi.depend.model.live.PollConf;
import com.bytedance.android.livesdkapi.depend.model.live.PollCountLimit;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0KWM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWM {
    public static final boolean LIZ(Room room) {
        PollCountLimit pollCountLimit;
        boolean z = false;
        if (room == null) {
            return false;
        }
        PollConf pollConf = room.pollConf;
        if (pollConf != null && (pollCountLimit = pollConf.giftPollLimit) != null && !pollCountLimit.unlimited) {
            z = true;
        }
        return !z;
    }

    public static final boolean LIZIZ(Room room) {
        if (room != null) {
            PollConf pollConf = room.pollConf;
            if (pollConf != null && pollConf.pollTemplateOptimizeGroup == 1) {
                return true;
            }
            PollConf pollConf2 = room.pollConf;
            if (pollConf2 != null && pollConf2.pollTemplateOptimizeGroup == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(Long l) {
        if (l != null) {
            if (l.longValue() == 1 || l.longValue() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
