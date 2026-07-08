package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyFrequencyControlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyMockEnabledSetting;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0enD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102370enD {
    public static final boolean LIZ;
    public static final C01GW LIZIZ;

    static {
        LIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest();
        LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(137));
    }

    public static Map LIZJ() {
        return (Map) LIZIZ.getValue();
    }

    public static void LJ(NotifyFCConfig notifyFCConfig, long j) {
        AbstractC1102390enF abstractC1102390enF = (AbstractC1102390enF) LIZJ().get(2);
        if (abstractC1102390enF != null) {
            abstractC1102390enF.LJIIJJI(notifyFCConfig, 2, j);
        }
    }

    public static void LIZLLL(String str, AbstractC1102390enF abstractC1102390enF, long j) {
        if (LIZ || LiveEffectNotifyMockEnabledSetting.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_effect_notify_frequency_control_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            abstractC1102390enF.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Object obj = abstractC1102390enF.LIZIZ;
            if (obj != null) {
                Iterator it2 = ((LinkedHashMap) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(((C1102400enG) ((Map.Entry) it2.next()).getValue()).LIZ(j));
                }
            }
            jSONObject.put("quota_mapping", jSONArray);
            jSONObject.put("action", str);
            C1CC2.LJIIL(0, strLIZIZ, jSONObject);
        }
    }

    public static void LIZ(DataChannel dataChannel, int i, int i2, int i3) {
        Room room;
        if (dataChannel != null && LiveEffectNotifyFrequencyControlSetting.enable() && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            long id = room.getId();
            if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                AbstractC1102390enF abstractC1102390enF = (AbstractC1102390enF) LIZJ().get(1);
                if (abstractC1102390enF != null) {
                    abstractC1102390enF.LIZ(i, i2, i3, id);
                    return;
                }
                return;
            }
            AbstractC1102390enF abstractC1102390enF2 = (AbstractC1102390enF) LIZJ().get(2);
            if (abstractC1102390enF2 == null) {
                return;
            }
            abstractC1102390enF2.LIZ(i, i2, i3, id);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1102330en9 LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel r13, int r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102370enD.LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel, int, int, int):X.0en9");
    }
}
