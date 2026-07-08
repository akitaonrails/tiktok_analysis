package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020900cfo {
    public static final C1020900cfo LIZ = new C1020900cfo();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Integer, C1020840cfi>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Integer, C09AE>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Integer, C1020910cfp>> LIZLLL = new ConcurrentHashMap<>();
    public static final C054G LJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, AtomicInteger> LJFF = new ConcurrentHashMap<>();
    public static final String LJI = "\"height\":\"${carouselUpdateInfo.jigsaw_data.jigsaw_layout.height}\"";
    public static final String LJII = "\"height\":\"${carouselUpdateInfo.jigsaw_data.main_container_layout.height}\"";

    public static String LIZ(C1015550cXB c1015550cXB) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1015550cXB.LLILLJJLI.LIZ);
        sbLIZ.append(':');
        sbLIZ.append(c1015550cXB.LL.getID());
        sbLIZ.append(':');
        sbLIZ.append(c1015550cXB.LL.type);
        sbLIZ.append(':');
        sbLIZ.append(c1015550cXB.LL.slotID);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(String str) {
        String string;
        String strLJJI;
        String strReplace;
        if (str == null || (strLJJI = u.LJJI(str, '\n', ' ', false)) == null || (strReplace = new Regex("\\s+").replace(strLJJI, " ")) == null || (string = a0.LJLIIIL(strReplace).toString()) == null) {
            string = "";
        }
        if (string.length() <= 72) {
            return string;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LN.LJZL(71, string));
        sbLIZ.append((char) 8230);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static JSONObject LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("common_data");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("jump_data")) != null) {
            jSONObject3 = C1020890cfn.LJ(jSONObjectOptJSONObject);
        } else {
            jSONObject3 = new JSONObject();
        }
        if (jSONObject == null || jSONObject.optBoolean("use_jump_data_in_raw_ad_data")) {
            return jSONObject3;
        }
        String strOptString = jSONObject.optString("open_url");
        if (a0.LJJJIL(strOptString)) {
            strOptString = jSONObject.optString("web_url");
        }
        if (!a0.LJJJIL(strOptString)) {
            jSONObject3.put("open_url", strOptString);
        }
        String strOptString2 = jSONObject.optString("web_url");
        if ((!a0.LJJJIL(strOptString2)) && strOptString2 != null) {
            jSONObject3.put("web_url", strOptString2);
        }
        String strOptString3 = jSONObject.optString("anchor_title");
        if ((!a0.LJJJIL(strOptString3)) && strOptString3 != null) {
            jSONObject3.put("web_title", strOptString3);
        }
        jSONObject3.put("product_id", jSONObject.optString("product_id"));
        jSONObject3.put("refer", "individual_image");
        return jSONObject3;
    }

    public static void LIZLLL(final C1015550cXB c1015550cXB, final JSONObject jSONObject, final JSONObject jSONObject2, int i) {
        ConcurrentHashMap<Integer, C09AE> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<Integer, C1020840cfi> concurrentHashMapPutIfAbsent2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("product_list");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            String strLIZ = LIZ(c1015550cXB);
            ConcurrentHashMap<String, ConcurrentHashMap<Integer, C1020840cfi>> concurrentHashMap = LIZIZ;
            ConcurrentHashMap<Integer, C1020840cfi> concurrentHashMap2 = concurrentHashMap.get(strLIZ);
            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent2 = concurrentHashMap.putIfAbsent(strLIZ, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap2 = concurrentHashMapPutIfAbsent2;
            }
            final ConcurrentHashMap<Integer, C1020840cfi> concurrentHashMap3 = concurrentHashMap2;
            ConcurrentHashMap<String, ConcurrentHashMap<Integer, C09AE>> concurrentHashMap4 = LIZJ;
            ConcurrentHashMap<Integer, C09AE> concurrentHashMap5 = concurrentHashMap4.get(strLIZ);
            if (concurrentHashMap5 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap4.putIfAbsent(strLIZ, (concurrentHashMap5 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap5 = concurrentHashMapPutIfAbsent;
            }
            final ConcurrentHashMap<Integer, C09AE> concurrentHashMap6 = concurrentHashMap5;
            int iMin = Math.min(3, (length - i) - 1);
            int i2 = i + 1;
            for (int i3 = 0; i3 < iMin; i3++) {
                final int i4 = i2 + i3;
                if (!concurrentHashMap3.containsKey(Integer.valueOf(i4))) {
                    concurrentHashMap6.computeIfAbsent(Integer.valueOf(i4), new Function() { // from class: X.0NJM
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return C23250099c.LIZLLL(C1020900cfo.LJ, null, null, new C0NJL(c1015550cXB, jSONObject, jSONObject2, i4, concurrentHashMap3, concurrentHashMap6, null), 3);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0bbe A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1020840cfi LIZJ(X.C1015550cXB r62, org.json.JSONObject r63, org.json.JSONObject r64, int r65, boolean r66, boolean r67) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 3213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1020900cfo.LIZJ(X.0cXB, org.json.JSONObject, org.json.JSONObject, int, boolean, boolean):X.0cfi");
    }
}
