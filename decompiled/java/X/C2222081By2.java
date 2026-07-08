package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchSettingAnchor;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSettingAnchor;

/* JADX INFO: renamed from: X.1By2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222081By2 {
    public final C2222091By3 LIZ;
    public final C2221701BxQ LIZIZ;
    public final C2221921Bxm LIZJ;
    public C2221721BxS LIZLLL;

    public final long LIZ() {
        C2221721BxS c2221721BxS = this.LIZLLL;
        return c2221721BxS == null ? this.LIZ.LJII : c2221721BxS.LIZ ? LiveMessageDispatchSettingAnchor.INSTANCE.dispatchMessageTimeout() : LiveMessageDispatchSetting.INSTANCE.dispatchMessageTimeout();
    }

    public final boolean LIZIZ() {
        C2221721BxS c2221721BxS = this.LIZLLL;
        return c2221721BxS == null ? this.LIZ.LJIIL : c2221721BxS.LIZ ? LiveMessageDispatchSettingAnchor.INSTANCE.enableInactiveOpt() : LiveMessageDispatchSetting.INSTANCE.enableInactiveOpt();
    }

    public final int LIZJ() {
        C2221721BxS c2221721BxS = this.LIZLLL;
        return c2221721BxS == null ? this.LIZ.LJIIJ : c2221721BxS.LIZ ? LiveMessageDispatchSettingAnchor.INSTANCE.optwindowMinDispatchSize() : LiveMessageDispatchSetting.INSTANCE.optwindowMinDispatchSize();
    }

    public final long LIZLLL() {
        C2221721BxS c2221721BxS = this.LIZLLL;
        return c2221721BxS == null ? this.LIZ.LJIIIZ : c2221721BxS.LIZ ? LiveMessageDispatchSettingAnchor.INSTANCE.optwindowWindowTime() : LiveMessageDispatchSetting.INSTANCE.optwindowWindowTime();
    }

    public final long LJ() {
        C2221721BxS c2221721BxS = this.LIZLLL;
        if (c2221721BxS != null) {
            return c2221721BxS.LIZ ? LiveMessageTimeoutSettingAnchor.INSTANCE.getWsConnectTimeout() : LiveMessageTimeoutSetting.INSTANCE.getWsConnectTimeout();
        }
        C2222241ByI c2222241ByI = this.LIZIZ.LIZIZ;
        if (c2222241ByI == null) {
            return 3000L;
        }
        return c2222241ByI.LIZIZ;
    }

    public C2222081By2(C2222091By3 c2222091By3, C2221701BxQ c2221701BxQ, C2221921Bxm c2221921Bxm) {
        this.LIZ = c2222091By3;
        this.LIZIZ = c2221701BxQ;
        this.LIZJ = c2221921Bxm;
    }
}
