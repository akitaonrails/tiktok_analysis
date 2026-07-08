package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration;
import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092520eXK {
    public C1092530eXL LIZ;

    public static void LIZIZ(long j) {
        try {
            C189200o6.m2constructorimpl(C144700gv.LIZ.remove(Long.valueOf(j)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final Map<String, String> LIZJ(long j) {
        C1092530eXL c1092530eXL = this.LIZ;
        if (c1092530eXL == null || !c1092530eXL.LIZIZ) {
            if (0 != 0) {
                if (c1092530eXL == null) {
                    return null;
                }
            } else {
                C1092530eXL c1092530eXLLIZ = C144700gv.LIZ(j);
                if (c1092530eXLLIZ == null) {
                    return null;
                }
                return c1092530eXLLIZ.LIZLLL;
            }
        }
        return c1092530eXL.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(long r4) {
        /*
            r3 = this;
            X.0eXL r2 = r3.LIZ
            if (r2 == 0) goto L14
            boolean r1 = r2.LIZIZ
            r0 = 1
            if (r1 != r0) goto L14
        L9:
            java.lang.String r1 = ""
            if (r0 == 0) goto L17
            if (r2 == 0) goto L16
            java.lang.String r0 = r2.LIZJ
            if (r0 == 0) goto L16
            return r0
        L14:
            r0 = 0
            goto L9
        L16:
            return r1
        L17:
            X.0eXL r0 = X.C144700gv.LIZ(r4)
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.LIZJ
            if (r0 == 0) goto L22
            return r0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1092520eXK.LIZLLL(long):java.lang.String");
    }

    public final void LIZ(DataChannel dataChannel, GuidanceConfig guidanceConfig) {
        String strLIZLLL;
        InteractionConfiguration interactionConfiguration;
        Integer numValueOf;
        InteractionConfiguration interactionConfiguration2;
        Map<String, String> map;
        C1092530eXL c1092530eXL;
        InteractionConfiguration interactionConfiguration3;
        if (dataChannel == null || guidanceConfig == null) {
            return;
        }
        String str = "";
        C1092530eXL c1092530eXLPut = null;
        if (this.LIZ == null) {
            this.LIZ = new C1092530eXL(0, "", null, false);
        }
        DisplayConfiguration displayConfiguration = guidanceConfig.displayConfiguration;
        if (displayConfiguration == null || (interactionConfiguration3 = displayConfiguration.interactionConfiguration) == null || !C500260Jjc.LJJIIZ(interactionConfiguration3.schema)) {
            strLIZLLL = "";
        } else {
            C495520Jby c495520Jby = new C495520Jby(interactionConfiguration3.schema);
            for (Map.Entry<String, String> entry : interactionConfiguration3.params.entrySet()) {
                c495520Jby.LIZJ(entry.getKey(), entry.getValue());
            }
            strLIZLLL = c495520Jby.LIZLLL();
        }
        C1092530eXL c1092530eXL2 = this.LIZ;
        if (c1092530eXL2 != null) {
            c1092530eXL2.LIZIZ = true;
        }
        String str2 = guidanceConfig.guidanceKey;
        if (str2 != null) {
            str = str2;
        }
        LJ(dataChannel, str, false);
        DisplayConfiguration displayConfiguration2 = guidanceConfig.displayConfiguration;
        if (displayConfiguration2 != null && (interactionConfiguration2 = displayConfiguration2.interactionConfiguration) != null && (map = interactionConfiguration2.eventParams) != null && (c1092530eXL = this.LIZ) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            c1092530eXL.LIZLLL = linkedHashMap;
        }
        DisplayConfiguration displayConfiguration3 = guidanceConfig.displayConfiguration;
        if (displayConfiguration3 != null && (interactionConfiguration = displayConfiguration3.interactionConfiguration) != null && (numValueOf = Integer.valueOf(interactionConfiguration.effectiveDelayTime)) != null) {
            if (numValueOf.intValue() == -1) {
                C1092530eXL c1092530eXL3 = this.LIZ;
                if (c1092530eXL3 != null) {
                    c1092530eXL3.LIZJ = strLIZLLL;
                    c1092530eXL3.LIZ = -1;
                }
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                C1092530eXL c1092530eXL4 = this.LIZ;
                if (c1092530eXL4 != null) {
                    try {
                        Map<Long, C1092530eXL> map2 = C144700gv.LIZ;
                        Long lValueOf = Long.valueOf(jLJJLIIIJ);
                        int i = c1092530eXL4.LIZ;
                        String str3 = c1092530eXL4.LIZJ;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Map<String, String> map3 = c1092530eXL4.LIZLLL;
                        if (map3 != null) {
                            linkedHashMap2.putAll(map3);
                        }
                        c1092530eXLPut = map2.put(lValueOf, new C1092530eXL(i, str3, linkedHashMap2, true));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                C189200o6.m2constructorimpl(c1092530eXLPut);
                return;
            }
            if (numValueOf.intValue() == -2) {
                C1092530eXL c1092530eXL5 = this.LIZ;
                if (c1092530eXL5 != null) {
                    c1092530eXL5.LIZJ = strLIZLLL;
                    c1092530eXL5.LIZ = -2;
                    return;
                }
                return;
            }
        }
        C1092530eXL c1092530eXL6 = this.LIZ;
        if (c1092530eXL6 != null) {
            c1092530eXL6.LIZJ = strLIZLLL;
            c1092530eXL6.LIZ = 0;
        }
    }

    public static void LJ(DataChannel dataChannel, String str, boolean z) {
        String string;
        long jLJJLIIIJ;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (dataChannel == null || (string = Long.valueOf(C500260Jjc.LIZIZ(dataChannel)).toString()) == null) {
            string = strValueOf;
        }
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        jSONObject.put("uid", strValueOf);
        jSONObject.put("anchor_id", string);
        jSONObject.put("time_ts", System.currentTimeMillis());
        if (jLJJLIIIJ > 0) {
            jSONObject.put("room_id", jLJJLIIIJ);
        }
        if (z) {
            jSONObject.put("operation_complete", z);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLIZ = InterfaceC1093700eZE.Sf.LIZ();
        if (mapLIZ != null && (!mapLIZ.isEmpty())) {
            linkedHashMap.putAll(mapLIZ);
        }
        JSONArray jSONArray = new JSONArray();
        String str2 = (String) linkedHashMap.get(str);
        if (str2 != null) {
            jSONArray = new JSONArray(str2);
        }
        if (z) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("operation_complete", false)) {
                    return;
                }
            }
        }
        jSONArray.put(jSONObject);
        linkedHashMap.put(str, jSONArray.toString());
        InterfaceC1093700eZE.Sf.LIZJ(linkedHashMap);
    }
}
