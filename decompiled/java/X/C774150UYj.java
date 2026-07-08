package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774150UYj extends C2217421BqW implements Function1<Integer, Unit> {
    public C774150UYj(LiveBroadcastFragment liveBroadcastFragment) {
        super(1, liveBroadcastFragment, LiveBroadcastFragment.class, "notifyServerLiveEnd", "notifyServerLiveEnd(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((LiveBroadcastFragment) this.receiver).RS(num.intValue());
        return Unit.LIZ;
    }
}
