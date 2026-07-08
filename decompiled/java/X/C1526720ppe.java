package X;

import com.bytedance.sync.model.Topic;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ppe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526720ppe implements InterfaceC1526520ppK<Void> {
    public final InterfaceC1526520ppK<Void> LIZ;
    public final Topic LIZIZ;
    public final String LIZJ;

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" success");
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1526520ppK<Void> interfaceC1526520ppK = this.LIZ;
        if (interfaceC1526520ppK != null) {
            ((C1526720ppe) interfaceC1526520ppK).LIZJ();
        }
        LIZ(0, null, true);
    }

    public final void LIZIZ(InterfaceC1526740ppg interfaceC1526740ppg) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" failed. reason :code-> ");
        sbLIZ.append(interfaceC1526740ppg.getErrorCode());
        sbLIZ.append(", msg = ");
        sbLIZ.append(interfaceC1526740ppg.getErrorMsg());
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1526520ppK<Void> interfaceC1526520ppK = this.LIZ;
        if (interfaceC1526520ppK != null) {
            ((C1526720ppe) interfaceC1526520ppK).LIZIZ(interfaceC1526740ppg);
        }
        LIZ(interfaceC1526740ppg.getErrorCode(), interfaceC1526740ppg.getErrorMsg(), false);
    }

    public C1526720ppe(Topic topic, String str, InterfaceC1526520ppK<Void> interfaceC1526520ppK) {
        this.LIZ = interfaceC1526520ppK;
        this.LIZIZ = topic;
        this.LIZJ = str;
    }

    public final void LIZ(int i, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1499090p75.LIZJ("method", this.LIZJ, jSONObject);
        C1499090p75.LIZIZ("business", this.LIZIZ.business, jSONObject);
        if (!z) {
            C1499090p75.LIZ(i, "error_code", jSONObject);
            C1499090p75.LIZJ("error_msg", str, jSONObject);
        }
        C1526300poy.LIZ("sync_sdk_custom_topic", jSONObject, null, null);
    }
}
