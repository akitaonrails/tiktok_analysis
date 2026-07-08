package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2189301AmG {
    public int LIZ;
    public int LIZIZ;
    public JSONArray LIZJ;
    public JSONArray LIZLLL;
    public final List<AbstractC2189221Am8> LJ = new ArrayList();

    public final boolean LIZ(C2184561Aec c2184561Aec, String str, JSONObject jSONObject) {
        Set<String> set;
        for (AbstractC2189221Am8 abstractC2189221Am8 : (ArrayList) this.LJ) {
            abstractC2189221Am8.getClass();
            if (!TextUtils.isEmpty(str) && (((set = abstractC2189221Am8.LIZIZ) != null && set.contains(str)) || abstractC2189221Am8.LIZIZ(str, jSONObject))) {
                return abstractC2189221Am8.LIZJ(c2184561Aec);
            }
        }
        return false;
    }
}
