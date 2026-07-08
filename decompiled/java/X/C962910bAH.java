package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAppLogAudienceSampleRate;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAppLogSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962910bAH {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC919170a1j LIZIZ() {
        if (C915980Zwa.LJFF().xB0().isMatch()) {
            return C915980Zwa.LJFF().xB0();
        }
        if (!C915980Zwa.LIZIZ().Dn0().isCompetitionArch()) {
            return EnumC919170a1j.UNKNOWN;
        }
        C962950bAL c962950bAL = EnumC962960bAM.Companion;
        EnumC962960bAM enumC962960bAMDn0 = C915980Zwa.LIZIZ().Dn0();
        c962950bAL.getClass();
        return C962950bAL.LJFF(enumC962960bAMDn0);
    }

    public static void LIZ(JSONObject jSONObject, Map map) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.get(next).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    public static void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z, int i, boolean z2) {
        String str2;
        String str3;
        if (!LiveMatchAppLogSetting.INSTANCE.isEnable()) {
            return;
        }
        int rate = LiveMatchAppLogAudienceSampleRate.INSTANCE.getRate();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!z2 && new Random().nextInt(100) >= rate) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C259800zU c259800zU = new C259800zU();
        if (i == 1) {
            if (z2) {
                str2 = "livesdk_match_";
            } else {
                str2 = "livesdk_match_audience_";
            }
        } else if (z2) {
            str2 = "livesdk_cohost_";
        } else {
            str2 = "livesdk_cohost_audience_";
        }
        if (u.LJJIIJZLJL(str, "battle_", false)) {
            c259800zU.element = u.LJJIII(str, "battle_", str2, false);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZ(jSONObject, linkedHashMap);
        LIZ(jSONObject3, linkedHashMap);
        LIZ(jSONObject2, linkedHashMap);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_multi", str3);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jLIZIZ = LIZIZ();
        int size = C915980Zwa.LJII().LJIJJ().size();
        c917350Zyn.getClass();
        linkedHashMap.put("sub_match_type", C917350Zyn.LIZIZ(enumC919170a1jLIZIZ, size));
        C474500IjA c474500IjALIZ = C0IJT.LIZ((String) c259800zU.element);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        if (Intrinsics.LJFF("livesdk_match_audience_room_enter_identify", c259800zU.element) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        } else {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        }
        InterfaceC954910axN.LIZ.getClass();
        C958790b3d.LIZ("InteractAppLogUtil", "event_tracking").LIZIZ(new AwS594S0100000_15(c259800zU, (C259800zU<String>) 678));
    }
}
