package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.WatchReason;
import com.bytedance.android.livesdkapi.depend.model.live.WatchReasonItem;

/* JADX INFO: renamed from: X.00d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C120500d1 {
    public static final C120500d1 LIZ = new C120500d1();
    public static boolean LIZIZ;

    public static WatchReasonItem LIZ(Room room) {
        String str;
        WatchReason watchReason = room.innerWatchReason;
        if (watchReason != null) {
            long id = room.getId();
            int i = 0;
            for (WatchReasonItem watchReasonItem : watchReason.watchReasons) {
                int i2 = i + 1;
                if (i >= 0) {
                    WatchReasonItem watchReasonItem2 = watchReasonItem;
                    C1088200eQM c1088200eQM = C1088200eQM.LIZ;
                    Text text = watchReasonItem2.content;
                    if (text != null) {
                        str = text.key;
                    } else {
                        str = null;
                    }
                    Long lValueOf = Long.valueOf(id);
                    c1088200eQM.getClass();
                    if (C1088200eQM.LIZLLL(lValueOf, str, false)) {
                        return watchReasonItem2;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return null;
    }
}
