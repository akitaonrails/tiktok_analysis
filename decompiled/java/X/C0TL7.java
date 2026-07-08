package X;

import com.ss.android.ugc.aweme.ab.LiveNewAiSummaryConfig;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TL7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TL7 {
    public static final LiveNewAiSummaryConfig LIZ = new LiveNewAiSummaryConfig(false, 1000, 0, 10);
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(168));

    public static LiveNewAiSummaryConfig LIZ(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct != null && Intrinsics.LJFF(liveRoomStruct.enableSMBLiveAiSummary(), Boolean.TRUE)) {
            return (LiveNewAiSummaryConfig) C0TL8.LIZIZ.getValue();
        }
        return (LiveNewAiSummaryConfig) LIZIZ.getValue();
    }
}
