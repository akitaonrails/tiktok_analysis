package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.dataChannel.FastScrollPredict;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePredictEnterSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePredictLoadmoreSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveFastScrollOnlyCheckIsFast;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveFastScrollThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LivePredictFastScrollSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IR8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IR8 {
    public static final InterfaceC472980Igi LIZ;
    public static volatile String LIZIZ;

    static {
        C157V hostClientAiService;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        LIZ = (iHostAction == null || (hostClientAiService = iHostAction.getHostClientAiService()) == null) ? null : hostClientAiService.LJIJJLI();
    }

    public static final boolean LIZ(DataChannel dataChannel) {
        double d;
        C0IR7 c0ir7 = (C0IR7) dataChannel.gg0(FastScrollPredict.class);
        if (c0ir7 != null) {
            if (LiveFastScrollOnlyCheckIsFast.isEnable()) {
                return c0ir7.LIZ;
            }
            if (LivePredictFastScrollSetting.isTwoSecondModel()) {
                d = c0ir7.LIZIZ;
            } else {
                d = c0ir7.LIZJ;
            }
            if (d > LiveFastScrollThresholdSetting.INSTANCE.getSettingValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final synchronized void LIZIZ(String str) {
        if (!LivePredictEnterSetting.isEnablePredictEnter() && !LivePredictLoadmoreSetting.isEnablePredictLoadmore()) {
            return;
        }
        if (!Intrinsics.LJFF(LIZIZ, str)) {
            return;
        }
        LIZIZ = null;
        ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        if (iLiveDecisionService != null) {
            iLiveDecisionService.CW("predict_internal");
        }
    }
}
