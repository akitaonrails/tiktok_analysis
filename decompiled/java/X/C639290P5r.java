package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0P5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639290P5r {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ = "";
    public long LJFF;
    public int LJI;
    public long LJII;
    public long LJIIIIZZ;

    public static void LIZ(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                itKeys.remove();
            }
        }
    }
}
