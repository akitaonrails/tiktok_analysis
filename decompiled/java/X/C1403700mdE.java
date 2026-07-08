package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403700mdE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("tt_prop") || !JSONObjectProtectorUtils.getBoolean(jSONObject, "tt_prop") || !jSONObject.has("tt_prop_id") || TextUtils.isEmpty(JSONObjectProtectorUtils.getString(jSONObject, "tt_prop_id"))) {
                return "";
            }
            return JSONObjectProtectorUtils.getString(jSONObject, "tt_prop_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static boolean LIZLLL(EffectPointModel effectPointModel) {
        if (LIZJ(effectPointModel.getExtra()).length() > 0) {
            return true;
        }
        return false;
    }

    public static void LJFF(ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (LIZJ(((EffectPointModel) it2.next()).getExtra()).length() > 0) {
                it2.remove();
            }
        }
    }

    public static void LIZ(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        String str;
        String str2;
        if (!linkedHashMap.containsKey("prop_selected_from") || ((str2 = (String) linkedHashMap.get("prop_selected_from")) != null && str2.length() == 0)) {
            str = "";
        } else {
            str = (String) linkedHashMap.get("prop_selected_from");
        }
        ArrayList arrayList2 = new ArrayList();
        if (str != null && str.length() > 0) {
            arrayList2.add(str);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (LIZLLL((EffectPointModel) obj)) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList2.add("edit_page");
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put("prop_selected_from", TextUtils.join(",", arrayList2));
        }
    }

    public static void LIZIZ(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        String str;
        String str2;
        String str3 = "";
        if (!linkedHashMap.containsKey("stickers") || ((str2 = (String) linkedHashMap.get("stickers")) != null && str2.length() == 0)) {
            str = "";
        } else {
            str = (String) linkedHashMap.get("stickers");
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (LIZLLL((EffectPointModel) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(LIZJ(((EffectPointModel) it2.next()).getExtra()));
        }
        String strJoin = TextUtils.join(",", arrayList3);
        if (strJoin.length() == 0) {
            return;
        }
        if (str != null) {
            str3 = str;
        }
        String strLJ = LJ(str3, strJoin);
        if (strLJ.length() > 0) {
            linkedHashMap.put("stickers", strLJ);
        }
    }

    public static String LJ(String str, String str2) {
        if (str.length() > 0 && str2.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(',');
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
