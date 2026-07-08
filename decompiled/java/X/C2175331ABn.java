package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.game.PreviewGameMomentDiscardGameNameSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRewardsFypTagSetting;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.List;

/* JADX INFO: renamed from: X.1ABn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175331ABn {
    public static boolean LIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        boolean z;
        boolean z2;
        LiveRoomStruct liveRoomStruct4;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct5;
        GameTagDetail gameTagDetail2;
        List<Integer> listLIZJ;
        if ((c1aca != null && C1ABT.LJIIIIZZ(c1aca) && GameLivePartnershipRewardsFypTagSetting.INSTANCE.isInvolve()) || C999380c76.LIZ(c1aca) || c1aca == null || (((liveRoomStruct = c1aca.LIZJ) == null || liveRoomStruct.liveRoomMode != 4) && (((liveRoomStruct2 = c1aca.LIZJ) == null || liveRoomStruct2.liveRoomMode != 6) && ((liveRoomStruct3 = c1aca.LIZJ) == null || liveRoomStruct3.liveRoomMode != 1)))) {
            return false;
        }
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).hY();
        if (!C1152480g62.LIZIZ()) {
            return false;
        }
        if (PreviewGameMomentDiscardGameNameSetting.INSTANCE.getValue()) {
            if (c1aca == null || (liveRoomStruct5 = c1aca.LIZJ) == null || (gameTagDetail2 = liveRoomStruct5.gameTagDetail) == null || !gameTagDetail2.previewGameMomentEnable || (listLIZJ = C1152480g62.LIZJ()) == null || !(!listLIZJ.isEmpty())) {
                return false;
            }
        } else {
            if (c1aca != null && (liveRoomStruct4 = c1aca.LIZJ) != null && (gameTagDetail = liveRoomStruct4.gameTagDetail) != null) {
                z = gameTagDetail.previewGameMomentEnable;
            } else {
                z = false;
            }
            if (C1152480g62.LIZJ() != null && (!r0.isEmpty()) && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLIZ = C1152480g62.LIZ();
            if (!z2 && !zLIZ) {
                return false;
            }
        }
        return true;
    }
}
