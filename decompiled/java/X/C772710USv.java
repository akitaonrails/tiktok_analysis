package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByAutoSpeedDetection;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByManuallySpeedDetection;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: renamed from: X.0USv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772710USv {
    public static final boolean LIZIZ() {
        return TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter();
    }

    public static final String LIZ() {
        CreateInfoResponse.ResponseData responseDataI92;
        String str = "";
        if (!LIZIZ()) {
            return "";
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        String str2 = (String) dataChannelGlobal.gg0(SuggestedDefinitionByManuallySpeedDetection.class);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) dataChannelGlobal.gg0(SuggestedDefinitionByAutoSpeedDetection.class);
        if (str3 == null) {
            str3 = "";
        }
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if ((iGameService == null || (responseDataI92 = iGameService.I92()) == null || !responseDataI92.haveScreenshotRecord) && C500260Jjc.LJJIIZ(str3)) {
            str = str3;
        }
        if (!C500260Jjc.LJJIIZ(str2)) {
            str2 = str;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        return str2;
    }

    public static final boolean LIZJ() {
        return LIZIZ() && LIZIZ() && C500260Jjc.LJJIIZ((CharSequence) DataChannelGlobal.LLILZ.gg0(C931140aL2.class)) && C500260Jjc.LJJIIZ((CharSequence) DataChannelGlobal.LLILZ.gg0(SuggestedDefinitionByAutoSpeedDetection.class));
    }

    public static final boolean LIZLLL() {
        return LIZIZ() && LIZIZ() && C500260Jjc.LJJIIZ((CharSequence) DataChannelGlobal.LLILZ.gg0(C931140aL2.class)) && C500260Jjc.LJJIIZ((CharSequence) DataChannelGlobal.LLILZ.gg0(SuggestedDefinitionByManuallySpeedDetection.class));
    }
}
