package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236610iHj {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC1236600iHi LIZ(String str, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                if (C2197221Az2.LIZ(str)) {
                    return EnumC1236600iHi.AUTH_MINIGAME;
                }
                return EnumC1236600iHi.AUTH_MINIS;
            }
            return EnumC1236600iHi.AUTH_WEB;
        }
        return EnumC1236600iHi.AUTH_APP;
    }

    public static void LIZIZ(String str, String str2, String str3, EnumC1236600iHi enumC1236600iHi, EnumC21632119lH enumC21632119lH, EnumC19415410xc enumC19415410xc) {
        C1232830iBd.LIZ.getClass();
        C1232830iBd.LIZ(str, str2, str3, null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("client_key", str);
        jSONObject.put("business_category", enumC1236600iHi);
        jSONObject.put("business_part", enumC21632119lH);
        jSONObject.put("source_type", enumC19415410xc);
        jSONObject.put("business_error_code", str3);
        HashMap map = new HashMap();
        map.put("is_regression_test", CardStruct.IStatusCode.DEFAULT);
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C793770VBv.LJII(str2, jSONObject, null, null);
    }
}
