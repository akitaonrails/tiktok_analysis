package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826860Wc8 {
    public static C826860Wc8 LIZIZ;
    public final Context LIZ;

    public C826860Wc8() {
        C844470XAv.LIZ.getClass();
        this.LIZ = C844470XAv.LIZ();
        C11NZ.LJIJJLI(new C854780Xg4(this, 3)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LIZIZ(new C854790Xg5(1));
    }

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            Object obj = new Object() { // from class: X.0Wc9
            };
            jSONObject.optInt("update_sdk", 1);
            jSONObject.optInt("pre_download_version", 0);
            jSONObject.optInt("pre_download_start_time", 0);
            jSONObject.optInt("pre_download_delay_days", 0);
            jSONObject.optLong("pre_download_delay_second", -1L);
            C813020Vuu.LJIIL().LJIIJ(this.LIZ, obj, "update_params");
        }
    }
}
