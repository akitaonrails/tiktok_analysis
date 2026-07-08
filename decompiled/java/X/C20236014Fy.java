package X;

import com.ss.android.ugc.aweme.tako.model.TakoProductCartSignal;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20236014Fy implements C1DD4 {
    public static final C20236014Fy LIZ = new C20236014Fy();

    public static boolean LJ() {
        return C20235814Fw.LIZIZ().enableProduct && C20235814Fw.LIZIZ().enableRecord && C14FR.LIZ.LJIILIIL();
    }

    public static TakoProductCartSignal LIZLLL(Object obj) {
        int iIntValue = 1;
        float fFloatValue = 0.0f;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String strOptString = jSONObject.optString("product_id");
            String strOptString2 = jSONObject.optString("product_name");
            String strOptString3 = jSONObject.optString("sku_id");
            String strOptString4 = jSONObject.optString("currency");
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(jSONObject.optString("sale_price_value"));
            if (fLJIIIIZZ != null) {
                fFloatValue = fLJIIIIZZ.floatValue();
            }
            return new TakoProductCartSignal(strOptString, strOptString2, strOptString3, strOptString4, fFloatValue, jSONObject.optInt("add_sku_num", 1), System.currentTimeMillis());
        }
        if (C19719512Dh.LJII(obj)) {
            Map map = (Map) obj;
            String strValueOf = String.valueOf(map.get("product_id"));
            String strValueOf2 = String.valueOf(map.get("product_name"));
            String strValueOf3 = String.valueOf(map.get("sku_id"));
            String strValueOf4 = String.valueOf(map.get("currency"));
            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(String.valueOf(map.get("sale_price_value")));
            if (fLJIIIIZZ2 != null) {
                fFloatValue = fLJIIIIZZ2.floatValue();
            }
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(String.valueOf(map.get("add_sku_num")));
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            }
            return new TakoProductCartSignal(strValueOf, strValueOf2, strValueOf3, strValueOf4, fFloatValue, iIntValue, System.currentTimeMillis());
        }
        return null;
    }

    @Override // X.C1DD4
    public final void LIZ(Object obj, Object obj2) {
        if (LJ()) {
            C13MK.LIZLLL(new AwS431S0200000_30(obj, obj2, 33));
        }
    }

    @Override // X.C1DD4
    public final void LIZIZ(Object obj, Object obj2) {
        if (LJ()) {
            C13MK.LIZLLL(new AwS431S0200000_30(obj, obj2, 34));
        }
    }

    @Override // X.C1DD4
    public final void LIZJ(Object obj, Object obj2) {
        if (LJ()) {
            C13MK.LIZLLL(new AwS431S0200000_30(obj, obj2, 35));
        }
    }
}
