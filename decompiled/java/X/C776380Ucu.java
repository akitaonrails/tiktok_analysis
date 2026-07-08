package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiHostSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ucu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C776380Ucu extends C2217421BqW implements Function0<String> {
    public C776380Ucu(C776360Ucs c776360Ucs) {
        super(0, c776360Ucs, C776360Ucs.class, "generateForMultiHost", "generateForMultiHost()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        this.receiver.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapLIZIZ = C776360Ucs.LIZIZ(RtcAbLabelSetting.INSTANCE.getValue());
            Map mapLIZIZ2 = C776360Ucs.LIZIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            Map mapLIZIZ3 = C776360Ucs.LIZIZ(LinkMicRtcAbParamsMultiHostSetting.INSTANCE.getValue());
            linkedHashMap.putAll(mapLIZIZ);
            linkedHashMap.putAll(mapLIZIZ2);
            linkedHashMap.putAll(mapLIZIZ3);
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateForMultiHost failed:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("RtcParamGenerator", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }
}
