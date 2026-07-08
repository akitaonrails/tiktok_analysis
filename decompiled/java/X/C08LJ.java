package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LJ {
    public static final String[] LIZ = {"cpu_usage", "mem_usage", "drop_frame_count", "dynamic_perf_cur_score", "overall_score", "net_quality_lv", "battery_pct", "battery_temperature"};
    public static final Pair<String, String>[] LIZIZ = {new Pair<>("skip", "skip_rate"), new Pair<>("like", "like_rate"), new Pair<>("dislike", "dislike_rate"), new Pair<>("comment", "comment_rate"), new Pair<>("share", "share_rate"), new Pair<>("favorite", "favorite_rate"), new Pair<>("follow", "follow_rate"), new Pair<>("head", "profile_enter_rate")};

    public static C1921107fl LIZJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        LJI(jSONObject, jSONObject2, jSONObject3);
        JSONObject jSONObjectLIZIZ = LIZIZ(jSONObject2, jSONObject3);
        if (jSONObjectLIZIZ.length() == 0) {
            return null;
        }
        return new C1921107fl(jSONObjectLIZIZ, null, C13BV.INSTANCE, 0);
    }

    public static JSONObject LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Double dLJIIIZ;
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            int iOptInt = jSONObject2.optInt(next, 0);
            if (iOptInt > 0 && (dLJIIIZ = LJIIIZ(next, jSONObject)) != null) {
                jSONObject3.put(next, dLJIIIZ.doubleValue() / ((double) iOptInt));
            }
        }
        return jSONObject3;
    }

    public static JSONObject LIZLLL(long j, String str) throws JSONException {
        boolean z;
        JSONObject jSONObject;
        if (!C117600cY.LIZ().baselineEnable) {
            return null;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("updated_at", 0L);
        if (jOptLong > 0) {
            long j2 = j - jOptLong;
            long j3 = C117600cY.LIZ().baselineMaxStaleMs;
            if (j3 < 60000) {
                j3 = 60000;
            }
            if (j2 <= j3) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("real_time");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("video");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        jSONObject2.put(next2, jSONObjectOptJSONObject2.opt(next2));
                    }
                }
                LJFF("real_time_sample_count", jSONObject, jSONObject2);
                LJFF("video_sample_count", jSONObject, jSONObject2);
                LJFF("first_ts", jSONObject, jSONObject2);
                LJFF("updated_at", jSONObject, jSONObject2);
                if (jSONObject2.length() > 0) {
                    return jSONObject2;
                }
            }
        }
        return null;
    }

    public static void LJ(int i, JSONObject jSONObject) throws JSONException {
        double dDoubleValue;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        double d = 0.0d;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Double dLJIIIZ = LJIIIZ(next, jSONObject);
            if (dLJIIIZ != null) {
                dDoubleValue = dLJIIIZ.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            if (Intrinsics.LJFF(next, "other")) {
                d += dDoubleValue;
            } else if (dDoubleValue > 0.0d) {
                arrayList.add(new Pair(next, Double.valueOf(dDoubleValue)));
            }
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new C512401z8(38));
        }
        JSONObject jSONObject2 = new JSONObject();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) ListProtector.get(arrayList, i2);
            String str = (String) pair.getFirst();
            double dDoubleValue2 = ((Number) pair.getSecond()).doubleValue();
            if (i2 < i) {
                jSONObject2.put(str, dDoubleValue2);
            } else {
                d += dDoubleValue2;
            }
        }
        if (d > 0.0d) {
            jSONObject2.put("other", d);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            arrayList2.add(itKeys2.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            jSONObject.remove((String) it2.next());
        }
        Iterator<String> itKeys3 = jSONObject2.keys();
        while (itKeys3.hasNext()) {
            String next2 = itKeys3.next();
            jSONObject.put(next2, jSONObject2.opt(next2));
        }
    }

    public static Boolean LJII(String str, JSONObject jSONObject) {
        Double dLJIIIZ;
        boolean z;
        if (!jSONObject.has(str) || (dLJIIIZ = LJIIIZ(str, jSONObject)) == null) {
            return null;
        }
        if (dLJIIIZ.doubleValue() > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static String LJIIIIZZ(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str, "");
        if (!(!a0.LJJJIL(strOptString)) || Intrinsics.LJFF(strOptString, "null")) {
            return null;
        }
        return strOptString;
    }

    public static Double LJIIIZ(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble(str, Double.NaN);
        if (Double.isNaN(dOptDouble) || Double.isInfinite(dOptDouble)) {
            return null;
        }
        return Double.valueOf(dOptDouble);
    }

    public static void LJFF(String str, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject.has(str)) {
            jSONObject2.put(str, jSONObject.opt(str));
        }
    }

    public static void LJI(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        Double dLJIIIZ = LJIIIZ("fyp_day_view_time", jSONObject);
        if (dLJIIIZ != null) {
            LIZ(jSONObject2, jSONObject3, "avg_fyp_day_view_time_ms", dLJIIIZ.doubleValue());
        }
        if (jSONObject.has("content_min_gap_info")) {
            Object objOpt = jSONObject.opt("content_min_gap_info");
            double d = 0.0d;
            if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL) && (!(objOpt instanceof Number) ? !(objOpt instanceof Boolean) ? !(objOpt instanceof String) || ((!a0.LJJJIL((CharSequence) objOpt)) && !Intrinsics.LJFF(objOpt, CardStruct.IStatusCode.DEFAULT) && !u.LJIJI((String) objOpt, "false", true)) : ((Boolean) objOpt).booleanValue() : ((Number) objOpt).doubleValue() > 0.0d)) {
                d = 1.0d;
            }
            LIZ(jSONObject2, jSONObject3, "content_min_gap_trigger_rate", d);
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, String str, double d) throws JSONException {
        double dDoubleValue;
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            Double dLJIIIZ = LJIIIZ(str, jSONObject);
            if (dLJIIIZ != null) {
                dDoubleValue = dLJIIIZ.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            jSONObject.put(str, dDoubleValue + d);
            jSONObject2.put(str, jSONObject2.optInt(str, 0) + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJ(java.lang.String r45, long r46, org.json.JSONObject r48, org.json.JSONObject r49) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08LJ.LJIIJ(java.lang.String, long, org.json.JSONObject, org.json.JSONObject):java.lang.String");
    }

    public static boolean LJIIJJI(JSONObject jSONObject, String str, String str2, double d, double d2) {
        if (str2 == null || a0.LJJJIL(str2)) {
            return false;
        }
        return LJIIL(jSONObject, str, new JSONObject().put(str2, 1.0d), d, d2);
    }

    public static boolean LJIIL(JSONObject jSONObject, String str, JSONObject jSONObject2, double d, double d2) throws JSONException {
        Double dLJIIIZ;
        double dDoubleValue;
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put(str, jSONObjectOptJSONObject);
            }
            if (jSONObjectOptJSONObject.length() == 0) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Double dLJIIIZ2 = LJIIIZ(next, jSONObject2);
                    if (dLJIIIZ2 != null) {
                        jSONObjectOptJSONObject.put(next, dLJIIIZ2.doubleValue());
                    }
                }
                LJ(C13LZ.LJ(C117600cY.LIZ().baselineDistributionCap, 1, 256), jSONObjectOptJSONObject);
                return true;
            }
            ArrayList<String> arrayList = new ArrayList();
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            while (itKeys2.hasNext()) {
                arrayList.add(itKeys2.next());
            }
            for (String str2 : arrayList) {
                Double dLJIIIZ3 = LJIIIZ(str2, jSONObject2);
                double dDoubleValue2 = 0.0d;
                if (dLJIIIZ3 != null) {
                    dDoubleValue = dLJIIIZ3.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                Double dLJIIIZ4 = LJIIIZ(str2, jSONObjectOptJSONObject);
                if (dLJIIIZ4 != null) {
                    dDoubleValue2 = dLJIIIZ4.doubleValue();
                }
                jSONObjectOptJSONObject.put(str2, (dDoubleValue2 * d2) + (dDoubleValue * d));
            }
            Iterator<String> itKeys3 = jSONObject2.keys();
            while (itKeys3.hasNext()) {
                String next2 = itKeys3.next();
                if (!jSONObjectOptJSONObject.has(next2) && (dLJIIIZ = LJIIIZ(next2, jSONObject2)) != null) {
                    jSONObjectOptJSONObject.put(next2, dLJIIIZ.doubleValue() * d);
                }
            }
            LJ(C13LZ.LJ(C117600cY.LIZ().baselineDistributionCap, 1, 256), jSONObjectOptJSONObject);
            return true;
        }
        return false;
    }

    public static void LJIILIIL(JSONObject jSONObject, String str, double d, double d2, double d3) throws JSONException {
        Double dLJIIIZ = LJIIIZ(str, jSONObject);
        if (dLJIIIZ != null) {
            d = (d2 * d) + (d3 * dLJIIIZ.doubleValue());
        }
        jSONObject.put(str, d);
    }
}
