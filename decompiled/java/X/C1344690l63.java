package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344690l63 {
    public static volatile long LIZIZ;
    public static boolean LIZJ;
    public static final C1344690l63 LIZ = new C1344690l63();
    public static String LIZLLL = "";
    public static String LJ = "";
    public static final Map<String, C1344710l65> LJFF = new LinkedHashMap();
    public static final Set<String> LJI = new LinkedHashSet();

    public static void LIZ(int i, String str, boolean z) {
        int i2;
        if (!C295210Bhf.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endStickerLoad id=");
        sbLIZ.append(str);
        sbLIZ.append(" isSuccess=");
        sbLIZ.append(i);
        sbLIZ.append(" isFromCache=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1344710l65 c1344710l65Remove = LJFF.remove(str);
        if (c1344710l65Remove == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c1344710l65Remove.LJ;
        LJI.add(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", jCurrentTimeMillis);
            jSONObject.put("group_id", c1344710l65Remove.LIZJ);
            jSONObject.put("enter_from", c1344710l65Remove.LIZLLL);
            jSONObject.put("sticker_id", c1344710l65Remove.LIZ);
            jSONObject.put("sticker_type", c1344710l65Remove.LIZIZ);
            jSONObject.put("is_success", i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_from_cache", i2);
            jSONObject.put("resolution_level", c1344710l65Remove.LJFF);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1344030l4z.LIZIZ("CommentStickerMonitorUtil", "endStickerLoad build JSONObject failed", e);
        }
        C20684815ws.LJIJ("comment_list_sticker_first_load", jSONObject);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5) throws JSONException {
        if (!C295210Bhf.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportRenderFailure reason=");
        sbLIZ.append(str);
        sbLIZ.append(" groupId=");
        sbLIZ.append(str2);
        sbLIZ.append(" stickerId=");
        sbLIZ.append(str4);
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.put("reason", str);
        jSONObject.put("group_id", str2);
        jSONObject.put("enter_from", str3);
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("sticker_id", str4);
        jSONObject.put("sticker_type", str5);
        C20684815ws.LJIJ("comment_list_sticker_load_fail", jSONObject);
    }

    public static void LIZJ(int i, String str, String str2, String str3, String str4, String str5) {
        String str6 = str2;
        if (!C295210Bhf.LIZ()) {
            return;
        }
        if (LJI.contains(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startStickerLoad skipped: already reported id=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startStickerLoad id=");
        sbLIZ2.append(str);
        sbLIZ2.append(" stickerId=");
        sbLIZ2.append(str6);
        sbLIZ2.append(" groupId=");
        sbLIZ2.append(str4);
        sbLIZ2.append(" resolutionLevel=");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (str6 == null) {
            str6 = "";
        }
        LJFF.put(str, new C1344710l65(i, str6, str3, System.currentTimeMillis(), str4, str5));
    }
}
