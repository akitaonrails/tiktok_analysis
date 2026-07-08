package X;

import android.content.Context;
import com.bytedance.android.live.walletnew.jsb.ChargeV3FailEntity;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0x2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803640x2I extends C1803630x2H {
    public C1803640x2I(Context context, IESJsBridge iESJsBridge) {
        super(context, iESJsBridge);
    }

    @Override // X.C1803630x2H, X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        super.call(c1058910df7, jSONObject);
        LIZ().LJIIJJI = false;
        JSONObject jSONObject2 = LIZ().LIZLLL;
        String strOptString3 = null;
        if (jSONObject2 != null) {
            strOptString3 = jSONObject2.optString("error_code");
        }
        String str = "";
        if (strOptString3 == null) {
            strOptString3 = "";
        }
        if (jSONObject2 == null || (strOptString = jSONObject2.optString("error_message")) == null) {
            strOptString = "";
        }
        if (jSONObject2 != null && (strOptString2 = jSONObject2.optString("order_id")) != null) {
            str = strOptString2;
        }
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).event("recharge_fail", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, new ChargeV3FailEntity(strOptString3, strOptString, str)));
    }
}
