package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OHL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OHL {
    public static final String LIZ(Aweme aweme, String str) {
        List<LiveRoomStatesTag> liveExtraInfoStruct;
        if (aweme != null && (liveExtraInfoStruct = aweme.getLiveExtraInfoStruct()) != null) {
            Iterator<LiveRoomStatesTag> it2 = liveExtraInfoStruct.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LiveRoomStatesTag next = it2.next();
                if (Intrinsics.LJFF(next.tagKey, str)) {
                    String str2 = next.tagValue;
                    if (str2 == null) {
                        break;
                    }
                    return str2;
                }
            }
        }
        return "";
    }
}
