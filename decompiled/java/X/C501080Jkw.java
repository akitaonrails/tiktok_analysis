package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501080Jkw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PushStreamInfo.Quality quality, boolean z, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectGameDefinition. fromDisk=");
        sbLIZ.append(z);
        sbLIZ.append(", selectQuality=");
        sbLIZ.append(quality.sdkKey);
        sbLIZ.append(", from=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("PreviewGameDefinitionHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            ((IGameService) C1161920gLG.LIZJ(IGameService.class)).u71(quality);
        } else {
            Map<String, Object> map = C1338270kvh.LIZ;
            DataChannelGlobal.LLILZ.HQ2(BroadcastShareScreenDefinition.class, quality);
        }
    }
}
