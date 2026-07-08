package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10YR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10YR {
    public static void LIZ(String str, String str2, boolean z) {
        int i = C19266010Yw.LIZ;
        if (i != 4 && i != 5) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("url", str);
            c2241008qG.LIZ.put("errorDesc", str2);
            if (z) {
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_open_schema_rate", 0, jSONObjectLJ);
            } else {
                JSONObject jSONObjectLJ2 = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_open_schema_rate", 1, jSONObjectLJ2);
            }
        }
    }
}
