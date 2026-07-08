package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Uh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779010Uh9 {
    public static void LIZ(DataChannel dataChannel, int i, ImageModel imageModel) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        String strLJIJJ = C497740JfY.LJIJJ(2131842962, C2188811AlT.LIZIZ(sbLIZ));
        String strLJIJJ2 = C497740JfY.LJIJJ(2131842960, strLJIJJ);
        if (i == 80) {
            str = "live_goal_80%";
        } else {
            str = "live_goal_50%";
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJII(new C778150Ufl("live_goal", str, C779060UhE.LIZ(strLJIJJ2, strLJIJJ), imageModel, 16));
        } else {
            if (dataChannel == null) {
                return;
            }
            dataChannel.zW(TipMessageChannel.class, new C778500UgK(C779060UhE.LIZ(strLJIJJ2, strLJIJJ), EnumC778100Ufg.LIVE_TIP_GAMING_LIVE_GOAL.ordinal(), new C778610UgV(str, imageModel, null, 4), 8));
        }
    }
}
