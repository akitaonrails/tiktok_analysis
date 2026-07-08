package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS0S2500100_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599380Nf6 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC599460NfE LIZ;

    static {
        new C600390Ngj();
    }

    public C599380Nf6(InterfaceC599460NfE interfaceC599460NfE) {
        this.LIZ = interfaceC599460NfE;
    }

    public final void LIZLLL(EnumC599390Nf7 enumC599390Nf7, String str, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ.getTrackParams());
        linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("code", Integer.valueOf(enumC599390Nf7.getCode())), new Pair("message", str)));
        linkedHashMap.putAll(map);
        C1018703yb.LJ("rd_tiktokec_sea_content_lynx_card_error", linkedHashMap);
    }

    public final void LJ(EnumC599630NfV enumC599630NfV, EnumC599440NfC enumC599440NfC, String str, EnumC599400Nf8 enumC599400Nf8, Map<String, ? extends Object> map) {
        String source;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> trackParams = this.LIZ.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.putAll(trackParams);
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("operation", Integer.valueOf(enumC599630NfV.getValue()));
        pairArr[1] = new Pair("data_key", str);
        pairArr[2] = new Pair("code", Integer.valueOf(enumC599440NfC.getCode()));
        pairArr[3] = new Pair("message", enumC599440NfC.getMessage());
        Object obj = "";
        if (enumC599400Nf8 == null || (source = enumC599400Nf8.getSource()) == null) {
            source = "";
        }
        pairArr[4] = new Pair("source", source);
        Object obj2 = null;
        if (map != null) {
            obj2 = map.get("schema");
        }
        if ((obj2 instanceof String) && obj2 != null) {
            obj = obj2;
        }
        pairArr[5] = new Pair("schema", obj);
        linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        C1018703yb.LJ("rd_tiktokec_sea_content_state_context", linkedHashMap);
    }

    public static void LIZIZ(String str, EnumC599530NfL enumC599530NfL, EnumC598910NeL enumC598910NeL, EnumC599040NeY enumC599040NeY, Object obj, String str2, EnumC598920NeM enumC598920NeM, long j) {
        EnumC599400Nf8 enumC599400Nf8;
        if (obj instanceof InterfaceC634840OvC) {
            enumC599400Nf8 = EnumC599400Nf8.LYNX;
        } else {
            enumC599400Nf8 = EnumC599400Nf8.NATIVE;
        }
        AwS0S2500100_9 awS0S2500100_9 = new AwS0S2500100_9(str, enumC599530NfL, enumC598910NeL, enumC599400Nf8, enumC599040NeY, str2, enumC598920NeM, j, 0);
        JSONObject jSONObject = new JSONObject();
        C957403oi c957403oi = new C957403oi();
        awS0S2500100_9.invoke(c957403oi);
        Object key = "";
        try {
            for (Map.Entry entry : ((HashMap) c957403oi.LIZ).entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1018903yd("rd_tiktokec_sea_content_communication", null, jSONObject), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog4: fail send event ");
            sbLIZ.append("rd_tiktokec_sea_content_communication");
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(C599380Nf6 c599380Nf6, Exception exc, String str, EnumC599530NfL enumC599530NfL, EnumC598910NeL enumC598910NeL, EnumC599040NeY enumC599040NeY, Object obj, EnumC598920NeM enumC598920NeM, long j, int i) {
        long j2 = j;
        EnumC598920NeM enumC598920NeM2 = enumC598920NeM;
        Object obj2 = obj;
        if ((i & 32) != 0) {
            obj2 = null;
        }
        if ((i & 64) != 0) {
            enumC598920NeM2 = EnumC598920NeM.UNKNOWN_ERROR;
        }
        if ((i & 128) != 0) {
            j2 = 0;
        }
        c599380Nf6.getClass();
        LIZIZ(str, enumC599530NfL, enumC598910NeL, enumC599040NeY, obj2, exc.getMessage(), enumC598920NeM2, j2);
    }
}
