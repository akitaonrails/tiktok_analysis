package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N0A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0A {
    public static void LIZ(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        C2241008qG c2241008qG = new C2241008qG();
        if (i2 != 0) {
            c2241008qG.LIZ.put("error_code", Integer.valueOf(i2));
            c2241008qG.LIZ.put("error_desc", str);
            if (str2 == null) {
                str2 = "";
            }
            c2241008qG.LIZLLL("client_key", str2);
        }
        c2241008qG.LIZ.put("opensdk_name", str3);
        c2241008qG.LIZ.put("opensdk_version", str4);
        c2241008qG.LIZ.put("commonsdk_name", str5);
        c2241008qG.LIZLLL("commsdk_version", str6);
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("monitor_login_authorize", i, jSONObjectLJ);
    }
}
