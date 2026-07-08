package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.game.EnableMobileGameBroadcastFeedbackInfoAndDiagnose;

/* JADX INFO: renamed from: X.0URS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0URS {
    public static final void LIZ() {
        if (EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable()) {
            ((IGameService) C1161920gLG.LIZJ(IGameService.class)).NI0();
        }
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).qz0();
    }
}
