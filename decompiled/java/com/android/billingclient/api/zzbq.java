package com.android.billingclient.api;

import X.C1794240wn8;
import X.C1794310wnF;
import X.C1796140wqC;
import X.C1796350wqX;
import X.C1AF0;
import X.C1BAY;
import X.EnumC1794330wnH;
import X.InterfaceC1796420wqe;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class zzbq extends ResultReceiver {
    public final /* synthetic */ InterfaceC1796420wqe LL;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C1796350wqX c1796350wqX;
        InterfaceC1796420wqe interfaceC1796420wqe = this.LL;
        if (bundle == null) {
            c1796350wqX = new C1796350wqX(0, null);
        } else {
            c1796350wqX = new C1796350wqX(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
        }
        JSONObject jSONObject = ((C1796140wqC) interfaceC1796420wqe).LIZ;
        String str = c1796350wqX.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("inapp_msg_result_code", c1796350wqX.LIZ);
            if (str == null) {
                str = "";
            }
            jSONObject2.put("purchase_token", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("");
        }
        ((C1794310wnF) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ()).LIZ(EnumC1794330wnH.BOTH, "livesdk_iap_inapp_message_callback", jSONObject, jSONObject2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(C1BAY c1bay, Handler handler, C1796140wqC c1796140wqC) {
        super(handler);
        this.LL = c1796140wqC;
        Objects.requireNonNull(c1bay);
    }
}
