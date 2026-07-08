package X;

import com.ss.android.ugc.aweme.IMGroupChatApi;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0i68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229420i68 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(EnumC913760Zt0 enumC913760Zt0) {
        if (C1229440i6A.LIZ[enumC913760Zt0.ordinal()] == 1) {
            return EnumC1229430i69.GROUP_SHOT_GROUP.getValue();
        }
        return enumC913760Zt0.getValue();
    }

    public static EnumC913760Zt0 LIZJ(String str) {
        for (EnumC913760Zt0 enumC913760Zt0 : EnumC913760Zt0.values()) {
            if (Intrinsics.LJFF(enumC913760Zt0.getValue(), str)) {
                return enumC913760Zt0;
            }
        }
        return EnumC913760Zt0.NORMAL_GROUP_CHAT;
    }

    public static HashMap LIZ(long j, String str, C900560ZUo c900560ZUo, EnumC1230500i7s enumC1230500i7s, int i) throws JSONException {
        int i2;
        InterfaceC900570ZUp interfaceC900570ZUpLJJIIZI;
        Map<String, String> mapLIZJ;
        if ((i & 2) != 0) {
            i2 = 6;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            c900560ZUo = null;
        }
        if ((i & 16) != 0) {
            enumC1230500i7s = null;
        }
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C0I0B.LJFF.LIZJ();
        jSONObject2.put("source_app_id", C2213981Bky.LIZIZ.getAppId());
        jSONObject3.put("im_user_id", j);
        jSONObject.put("invitee", jSONObject2);
        jSONObject.put("invitor", jSONObject3);
        jSONObject.put("source_type", i2);
        map.put("invitation", C786410Ut5.J3(jSONObject));
        if (str.length() > 0) {
            map.put("a:join_source", str);
        }
        IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
        if (iMGroupChatApiLIZ != null && (interfaceC900570ZUpLJJIIZI = iMGroupChatApiLIZ.LJJIIZI()) != null && (mapLIZJ = interfaceC900570ZUpLJJIIZI.LIZJ("auto", "auto", c900560ZUo, enumC1230500i7s)) != null) {
            map.putAll(mapLIZJ);
        }
        return map;
    }
}
