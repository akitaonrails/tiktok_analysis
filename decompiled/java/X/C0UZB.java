package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UZB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UZB extends C1696260uF6 implements Function1<Cert, Unit> {
    public C0UZB(LiveBroadcastFragment liveBroadcastFragment) {
        super(1, liveBroadcastFragment, LiveBroadcastFragment.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/Cert;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Cert cert) {
        ((LiveBroadcastFragment) this.receiver).VS(0, cert);
        return Unit.LIZ;
    }
}
