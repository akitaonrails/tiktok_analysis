package com.bytedance.android.live.setting;

import X.C1087250eOp;
import X.C1161920gLG;
import X.C500260Jjc;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_load_optimize")
public final class LiveToolbarLoadOptimizeSetting {
    public static final LiveToolbarLoadOptimizeSetting INSTANCE = new LiveToolbarLoadOptimizeSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_toolbar_load_optimize", DEFAULT);

    private final boolean enableOptimize(DataChannel dataChannel) {
        Long lValueOf;
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
        if (iProgrammedLiveService != null && !iProgrammedLiveService.lm1() && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) {
            C1087250eOp roomStatus = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).getRoomStatus();
            Room roomLJJLIIIIJ = null;
            if (dataChannel != null) {
                lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
            } else {
                lValueOf = null;
            }
            if (!roomStatus.LIZ(lValueOf)) {
                LiveToolbarLoadOptEcomEnableSetting liveToolbarLoadOptEcomEnableSetting = LiveToolbarLoadOptEcomEnableSetting.INSTANCE;
                if (dataChannel != null) {
                    roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
                }
                if (!liveToolbarLoadOptEcomEnableSetting.disableOpt(roomLJJLIIIIJ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean enableAnimationOptimize(DataChannel dataChannel) {
        if ((value & 8) == 8 && enableOptimize(dataChannel)) {
            return true;
        }
        return false;
    }

    public final boolean enableGiftIconOptimize(DataChannel dataChannel) {
        if ((value & 2) == 2 && enableOptimize(dataChannel)) {
            return true;
        }
        return false;
    }

    public final boolean enableMultiGuestIconOptimize(DataChannel dataChannel) {
        if ((value & 1) == 1 && enableOptimize(dataChannel)) {
            return true;
        }
        return false;
    }

    public final boolean enableOtherIconOptimize(DataChannel dataChannel) {
        if ((value & 4) == 4 && enableOptimize(dataChannel)) {
            return true;
        }
        return false;
    }

    public final boolean enableTogetherShowOptimize(DataChannel dataChannel) {
        if (value != 0 && enableOptimize(dataChannel)) {
            return true;
        }
        return false;
    }
}
