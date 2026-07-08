package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestCommonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ucq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C776340Ucq extends C2217421BqW implements Function0<String> {
    public C776340Ucq(C0TCX c0tcx) {
        super(0, c0tcx, C0TCX.class, "generateRTCParamByRole", "generateRTCParamByRole()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        this.receiver.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapLIZ = C744340THs.LIZ(RtcAbLabelSetting.INSTANCE.getValue());
            Map mapLIZ2 = C744340THs.LIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            Map mapLIZ3 = C744340THs.LIZ(LinkMicRtcAbParamsMultiGuestCommonSetting.INSTANCE.getValue());
            Map mapLIZ4 = C744340THs.LIZ(LinkMicRtcAbParamsMultiGuestGuestSetting.INSTANCE.getValue());
            linkedHashMap.putAll(mapLIZ);
            linkedHashMap.putAll(mapLIZ2);
            linkedHashMap.putAll(mapLIZ3);
            linkedHashMap.putAll(mapLIZ4);
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str = C0TCX.LJIILJJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateForMultiGuestGuest failed:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }
}
