package X;

import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0f9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116070f9J implements InterfaceC1116090f9L {
    public final DataChannel LIZ;
    public InterfaceC1114220f6K LIZIZ;
    public boolean LIZJ;
    public final EnumC2007607ti LIZLLL = EnumC2007607ti.HIGH_TRAFFIC_STREAM;

    @Override // X.InterfaceC1116090f9L
    public final void release() {
        if (this.LIZJ) {
            try {
                try {
                    DataChannelGlobal.LLILZ.zQ2(this);
                    C20441214yg.LIZIZ("HighTrafficStreamDowngradeStrategy", "Strategy unregistered successfully");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIILIIL("HighTrafficStreamDowngradeStrategy", "Failed to unregister strategy", e);
                }
                this.LIZIZ = null;
                this.LIZJ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ = null;
                this.LIZJ = false;
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1116090f9L
    public final boolean isEnabled() {
        return ScalableDowngradeSetting.getRankEntranceLoopIntervalMs() > 0;
    }

    @Override // X.InterfaceC1116090f9L
    public final EnumC2007607ti getType() {
        return this.LIZLLL;
    }

    public C1116070f9J(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC1116090f9L
    public final void LIZ(InterfaceC1114220f6K interfaceC1114220f6K, DataChannel dataChannel) {
        if (!this.LIZJ && isEnabled()) {
            this.LIZIZ = interfaceC1114220f6K;
            this.LIZJ = true;
            C20441214yg.LIZIZ("HighTrafficStreamDowngradeStrategy", "Strategy initialized successfully");
        }
    }
}
