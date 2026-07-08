package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0UYW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UYW extends C2217421BqW implements InterfaceC1631630sYr<Boolean, Cert, Bundle, Boolean, Unit> {
    public C0UYW(LiveBroadcastFragment liveBroadcastFragment) {
        super(4, liveBroadcastFragment, LiveBroadcastFragment.class, "onLiveEnd", "onLiveEnd(ZLcom/bytedance/bpea/basics/Cert;Landroid/os/Bundle;Z)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, Cert cert, Bundle bundle, Boolean bool2) {
        boolean zBooleanValue = bool2.booleanValue();
        ((LiveBroadcastFragment) this.receiver).eT(bool.booleanValue(), cert, bundle, zBooleanValue);
        return Unit.LIZ;
    }
}
