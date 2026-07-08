package X;

import com.bytedance.android.livesdk.livesetting.subscription.LivePcsTurnOffSubSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0Jj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499890Jj1 {
    public static final void LIZIZ() {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin() && LivePcsTurnOffSubSetting.turnOffSub()) {
            ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isM2();
        }
    }

    public static final void LIZ(LiveMode liveMode) {
        Boolean boolValueOf;
        if (liveMode != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LIZLLL(liveMode));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LIZIZ();
        }
    }
}
