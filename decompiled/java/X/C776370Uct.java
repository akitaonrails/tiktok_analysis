package X;

import com.bytedance.android.live.liveinteract.multiguestv3.service.MultiGuestV3InternalServiceImplV2;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestCommonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C776370Uct extends C2217421BqW implements Function0<String> {
    public C776370Uct(Object obj) {
        super(0, obj, MultiGuestV3InternalServiceImplV2.class, "generateRTCParamByRole", "generateRTCParamByRole()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Boolean bool;
        DataChannel dataChannel = ((MultiGuestV3InternalServiceImplV2) this.receiver).LLILZ;
        if (!((dataChannel == null || (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null) ? false : bool.booleanValue())) {
            C776360Ucs.LIZ.getClass();
            return C776360Ucs.LIZ();
        }
        C776360Ucs.LIZ.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapLIZIZ = C776360Ucs.LIZIZ(RtcAbLabelSetting.INSTANCE.getValue());
            Map mapLIZIZ2 = C776360Ucs.LIZIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            Map mapLIZIZ3 = C776360Ucs.LIZIZ(LinkMicRtcAbParamsMultiGuestCommonSetting.INSTANCE.getValue());
            Map mapLIZIZ4 = C776360Ucs.LIZIZ(LinkMicRtcAbParamsMultiGuestAnchorSetting.INSTANCE.getValue());
            linkedHashMap.putAll(mapLIZIZ);
            linkedHashMap.putAll(mapLIZIZ2);
            linkedHashMap.putAll(mapLIZIZ3);
            linkedHashMap.putAll(mapLIZIZ4);
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateForMultiGuestAnchor failed:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("RtcParamGenerator", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }
}
