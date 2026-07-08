package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.livestudio.LiveStudioMonitorFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0U4X, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U4X {
    public final LiveStudioMonitorFragment LIZ;
    public LiveDialog LIZIZ;
    public long LIZJ;
    public AnonymousClass0956 LIZLLL;
    public AnonymousClass0956 LJ;
    public AnonymousClass0956 LJFF;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = this.LJFF;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
    }

    public final void LIZIZ() {
        if (System.currentTimeMillis() - this.LIZJ >= 60000) {
            this.LIZJ = System.currentTimeMillis();
            C766270U4b.LJII(2131843646, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL));
        }
    }

    public C0U4X(DataChannel dataChannel, LiveStudioMonitorFragment liveStudioMonitorFragment) {
        this.LIZ = liveStudioMonitorFragment;
    }
}
