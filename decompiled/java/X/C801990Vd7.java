package X;

import com.bytedance.crash.monitor.k;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801990Vd7 {
    public final JSONObject LIZ;
    public JSONObject LIZIZ;
    public final String LIZJ;

    public final void LIZ() {
        C801940Vd2 c801940Vd2 = C801940Vd2.LIZIZ;
        if (c801940Vd2 != null) {
            C802790VeP c802790VeP = k.LIZ;
            if (c802790VeP != null) {
                HashMap map = new HashMap();
                map.put("aid", c802790VeP.LIZ());
                map.put("device_id", c802790VeP.LIZLLL(CardStruct.IStatusCode.DEFAULT));
                map.put("update_version_code", String.valueOf(c802790VeP.LJFF()));
                map.put("version_code", String.valueOf(c802790VeP.LJIIIIZZ()));
                map.put("app_version", String.valueOf(c802790VeP.LJIIIZ()));
                map.put("channel", c802790VeP.LIZIZ());
                map.put("npth_version", AnonymousClass0825.LIZ);
                C0VJO.LJIIIZ(this.LIZ, map);
            }
            c801940Vd2.LIZ.LJIIJ(this.LIZJ, 1, this.LIZ, this.LIZIZ);
        }
    }

    public C801990Vd7(String str) {
        this.LIZIZ = new JSONObject();
        this.LIZJ = str;
        this.LIZ = new JSONObject();
    }

    public C801990Vd7(JSONObject jSONObject) {
        this.LIZIZ = new JSONObject();
        this.LIZJ = "crash_data_check";
        this.LIZ = jSONObject;
    }
}
