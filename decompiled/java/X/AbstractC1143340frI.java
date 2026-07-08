package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfDiagnosisSetting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0frI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1143340frI {
    public final JSONObject LIZ = new JSONObject();
    public final LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis LIZIZ = LiveGiftSelfDiagnosisSetting.INSTANCE.config();
    public final String LIZJ = "GiftDiagnosis";

    public void LIZIZ() {
    }

    public void LIZJ(AbstractC1143570frf abstractC1143570frf) {
    }

    public String LIZ() {
        return this.LIZJ;
    }

    public void onEvent(AbstractC1143570frf abstractC1143570frf) {
        if (!(abstractC1143570frf instanceof C1143550frd) && !(abstractC1143570frf instanceof C1143560fre)) {
            LIZJ(abstractC1143570frf);
        } else {
            LIZIZ();
        }
    }

    public final void LIZLLL(int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("model", LIZ());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("info", str);
        C1CC2.LJ("ttlive_gift_self_disgnosis", jSONObject, this.LIZ, jSONObject2);
    }
}
