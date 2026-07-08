package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298130jsx {
    public static final C1298130jsx LIZ = new C1298130jsx();

    public static C1297910jsb LIZ(JSONArray jSONArray) {
        C1297910jsb c1297910jsb = new C1297910jsb();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object objOpt = jSONArray.opt(i);
                if (objOpt instanceof JSONArray) {
                    c1297910jsb.add(LIZ((JSONArray) objOpt));
                } else if (objOpt instanceof JSONObject) {
                    c1297910jsb.add(LIZIZ((JSONObject) objOpt));
                } else {
                    c1297910jsb.add(objOpt);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return c1297910jsb;
    }

    public static C1297860jsW LIZIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        C1297860jsW c1297860jsW = new C1297860jsW();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                c1297860jsW.put(next, LIZIZ((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                c1297860jsW.put(next, LIZ((JSONArray) objOpt));
            } else if (Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                c1297860jsW.put(next, null);
            } else {
                c1297860jsW.put(next, objOpt);
            }
        }
        return c1297860jsW;
    }
}
