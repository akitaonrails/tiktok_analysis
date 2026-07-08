package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774090UYd extends C2217421BqW implements Function2<Cert, Bundle, Unit> {
    public C774090UYd(LiveBroadcastFragment liveBroadcastFragment) {
        super(2, liveBroadcastFragment, LiveBroadcastFragment.class, "showEndPage", "showEndPage(Lcom/bytedance/bpea/basics/Cert;Landroid/os/Bundle;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Cert cert, Bundle bundle) {
        ((LiveBroadcastFragment) this.receiver).vT(cert, bundle);
        return Unit.LIZ;
    }
}
