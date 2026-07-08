package X;

import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCustomTab;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCustomTabInfo;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCustomTabs;
import com.ss.android.ugc.aweme.feed.model.live.PreviewEnlargeViewInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: renamed from: X.0J4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4Z {
    public static final C0J4Z LIZ = new C0J4Z();

    public static boolean LIZJ(C945320ahu c945320ahu) {
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        if (c945320ahu == null || (liveSeiStruct = c945320ahu.LIZ) == null || (seiAppData = liveSeiStruct.LIZ) == null || seiAppData.LJIIJ() != 16) {
            return false;
        }
        return true;
    }

    public static float LIZ(LiveRoomStruct liveRoomStruct, DataChannel dataChannel) {
        Boolean bool;
        Boolean boolValueOf;
        C945320ahu c945320ahu;
        Integer numValueOf;
        PreviewEnlargeViewInfo previewEnlargeViewInfo;
        PreviewCustomTabInfo previewCustomTabInfo;
        PreviewCustomTabs previewCustomTabs;
        List<PreviewCustomTab> list;
        Boolean boolValueOf2 = null;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        Integer numValueOf2 = null;
        if (iLiveOuterService != null) {
            bool = (Boolean) iLiveOuterService.LIZJ(Boolean.TRUE, "game_live_pc_render_config");
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIIJIL(bool) || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Fi()) {
            return 0.0f;
        }
        if (liveRoomStruct != null && (previewCustomTabInfo = liveRoomStruct.previewCustomTabInfo) != null && (previewCustomTabs = previewCustomTabInfo.customTabs) != null && (list = previewCustomTabs.customTabList) != null) {
            boolValueOf = Boolean.valueOf(!list.isEmpty());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return 0.0f;
        }
        if (liveRoomStruct != null && (previewEnlargeViewInfo = liveRoomStruct.previewEnlargeViewInfo) != null) {
            boolValueOf2 = Boolean.valueOf(previewEnlargeViewInfo.enablerEnlargeView);
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf2) || liveRoomStruct == null) {
            return 0.0f;
        }
        if (liveRoomStruct.liveRoomMode != 6 && liveRoomStruct.liveRoomMode != 1) {
            return 0.0f;
        }
        if (dataChannel != null) {
            c945320ahu = (C945320ahu) dataChannel.gg0(C1082950eHt.class);
        } else {
            c945320ahu = null;
        }
        if (LIZJ(c945320ahu)) {
            return 0.0f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPCLandscapeCuttingRatio = ");
        PreviewEnlargeViewInfo previewEnlargeViewInfo2 = liveRoomStruct.previewEnlargeViewInfo;
        if (previewEnlargeViewInfo2 != null) {
            numValueOf2 = Integer.valueOf(previewEnlargeViewInfo2.landscapeView);
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("FeedGameLiveCuttingHelper", C2188811AlT.LIZIZ(sbLIZ));
        PreviewEnlargeViewInfo previewEnlargeViewInfo3 = liveRoomStruct.previewEnlargeViewInfo;
        if (previewEnlargeViewInfo3 == null || (numValueOf = Integer.valueOf(previewEnlargeViewInfo3.landscapeView)) == null || numValueOf.intValue() == 0) {
            return 0.0f;
        }
        if (numValueOf.intValue() == 1) {
            return 1.33f;
        }
        if (numValueOf.intValue() != 2) {
            return 0.0f;
        }
        return 1.0f;
    }

    public static int LIZIZ(LiveRoomStruct liveRoomStruct, DataChannel dataChannel) {
        Boolean bool;
        Boolean boolValueOf;
        PreviewEnlargeViewInfo previewEnlargeViewInfo;
        C945320ahu c945320ahu = null;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        Integer numValueOf = null;
        if (iLiveOuterService != null) {
            bool = (Boolean) iLiveOuterService.LIZJ(Boolean.TRUE, "game_live_pc_render_config");
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIIJIL(bool) || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Fi()) {
            return 0;
        }
        if (liveRoomStruct != null && (previewEnlargeViewInfo = liveRoomStruct.previewEnlargeViewInfo) != null) {
            boolValueOf = Boolean.valueOf(previewEnlargeViewInfo.enablerEnlargeView);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf) || liveRoomStruct == null) {
            return 0;
        }
        if (liveRoomStruct.liveRoomMode != 6 && liveRoomStruct.liveRoomMode != 1) {
            return 0;
        }
        if (dataChannel != null) {
            c945320ahu = (C945320ahu) dataChannel.gg0(C1082950eHt.class);
        }
        if (LIZJ(c945320ahu)) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPCPortraitAdaptScreenConfig = ");
        PreviewEnlargeViewInfo previewEnlargeViewInfo2 = liveRoomStruct.previewEnlargeViewInfo;
        if (previewEnlargeViewInfo2 != null) {
            numValueOf = Integer.valueOf(previewEnlargeViewInfo2.portraitView);
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("FeedGameLiveCuttingHelper", C2188811AlT.LIZIZ(sbLIZ));
        PreviewEnlargeViewInfo previewEnlargeViewInfo3 = liveRoomStruct.previewEnlargeViewInfo;
        if (previewEnlargeViewInfo3 == null) {
            return 0;
        }
        return previewEnlargeViewInfo3.portraitView;
    }
}
