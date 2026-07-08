package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774070UYb extends C2217421BqW implements Function2<Boolean, Integer, Unit> {
    public C774070UYb(LiveBroadcastFragment liveBroadcastFragment) {
        super(2, liveBroadcastFragment, LiveBroadcastFragment.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        ((LiveBroadcastFragment) this.receiver).US(num.intValue(), zBooleanValue);
        return Unit.LIZ;
    }
}
