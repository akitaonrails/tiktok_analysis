package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603480Nli {
    public static final Object LIZ(String str, C1509310pNZ c1509310pNZ) {
        JSONObject jSONObject;
        Object obj;
        float[] fArr;
        if (Intrinsics.LJFF(str, "inputParams") && (fArr = c1509310pNZ.LJI) != null) {
            return fArr;
        }
        Map<String, Object> map = c1509310pNZ.LJ;
        if (map == null || (obj = map.get(str)) == null) {
            Object obj2 = c1509310pNZ.LJIIIIZZ;
            if (!(obj2 instanceof JSONObject) || (jSONObject = (JSONObject) obj2) == null) {
                return null;
            }
            return jSONObject.opt(str);
        }
        return obj;
    }
}
