package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UZH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UZH extends C1696260uF6 implements Function0<Unit> {
    public C0UZH(LiveBroadcastFragment liveBroadcastFragment) {
        super(0, liveBroadcastFragment, LiveBroadcastFragment.class, "onFinishBroadcastPopupShow", "onFinishBroadcastPopupShow(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((LiveBroadcastFragment) this.receiver).XS(0, false);
        return Unit.LIZ;
    }
}
