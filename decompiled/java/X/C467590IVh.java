package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveAppLogCommonParamsMergeExp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.applog.AppLog;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467590IVh {
    public static String LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(330));

    public static void LIZ(EnterRoomConfig enterRoomConfig, Room room, int i, String str, String str2) {
        String strLIZ;
        LiveAppLogCommonParamsMergeExp liveAppLogCommonParamsMergeExp = LiveAppLogCommonParamsMergeExp.INSTANCE;
        if (!liveAppLogCommonParamsMergeExp.enable()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (room == null || enterRoomConfig == null) {
            return;
        }
        C467600IVi c467600IVi = new C467600IVi(enterRoomConfig, room, i);
        JSONObject jSONObject = new JSONObject();
        for (String str3 : liveAppLogCommonParamsMergeExp.commonParamsListRoom()) {
            InterfaceC467580IVg interfaceC467580IVg = (InterfaceC467580IVg) ((Map) LIZIZ.getValue()).get(str3);
            if (interfaceC467580IVg != null && (strLIZ = interfaceC467580IVg.LIZ(c467600IVi)) != null) {
                jSONObject.put(str3, strLIZ);
            }
        }
        String strLIZ2 = AppLog.getParamsExtractApi().LIZ(jSONObject);
        if (strLIZ2 != null) {
            C0IUA.LJJIIZI = strLIZ2;
        }
    }
}
