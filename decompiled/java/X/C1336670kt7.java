package X;

import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336670kt7 {
    public static final C1336670kt7 LIZ = new C1336670kt7();
    public static final C1336680kt8 LIZIZ = new C1336680kt8();

    public final synchronized void LIZ(JSONObject jSONObject, boolean z) {
        String strOptString = jSONObject.optString("uri");
        if (strOptString != null && strOptString.length() != 0) {
            boolean zLJJIIZI = a0.LJJIIZI(strOptString, "~tplv-tiktok-shrink", false);
            if (z) {
                C1336680kt8 c1336680kt8 = LIZIZ;
                c1336680kt8.LIZ++;
                c1336680kt8.LIZJ += jSONObject.optInt("file_size") / 1024;
                c1336680kt8.LJ += jSONObject.optInt("duration");
                if (zLJJIIZI) {
                    c1336680kt8.LIZIZ++;
                    c1336680kt8.LIZLLL += jSONObject.optInt("file_size") / 1024;
                    c1336680kt8.LJFF += jSONObject.optInt("duration");
                }
            } else {
                C1336680kt8 c1336680kt82 = LIZIZ;
                c1336680kt82.LJI++;
                if (zLJJIIZI) {
                    c1336680kt82.LJII++;
                }
            }
        }
    }
}
