package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381410m3H {
    public static void LIZ(EnumC1381430m3J enumC1381430m3J, EnumC1395590mQ9 enumC1395590mQ9, EnumC1381400m3G enumC1381400m3G, String str, Integer num, String str2) throws JSONException {
        Bundle bundle = new Bundle();
        if (str != null) {
            C786410Ut5.LJJJI("client_key", str, bundle);
        }
        C786410Ut5.LJJJI("type", enumC1381430m3J.getValue(), bundle);
        C786410Ut5.LJJJI("step", enumC1395590mQ9.getValue(), bundle);
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(enumC1381400m3G.getValue()), bundle);
        if (num != null) {
            C786410Ut5.LJJJI("error_code", String.valueOf(num.intValue()), bundle);
        }
        if (str2 != null) {
            C786410Ut5.LJJJI("error_msg", str2, bundle);
        }
        JSONObject jSONObject = new JSONObject();
        for (String str3 : bundle.keySet()) {
            jSONObject.put(str3, bundle.getString(str3));
        }
        int value = enumC1381400m3G.getValue();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("minis_report", value, jSONObject);
        C08S3 c08s3 = C08S3.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (String str4 : bundle.keySet()) {
            c2344009Gk.LJFF(str4, bundle.getString(str4));
        }
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("minis_report_dev", map);
    }
}
