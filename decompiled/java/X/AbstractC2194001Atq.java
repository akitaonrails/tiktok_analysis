package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Atq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2194001Atq implements InterfaceC2194031Att {
    public static final C2194011Atr LIZJ = new C08UT<Keva>() { // from class: X.1Atr
        @Override // X.C08UT
        public final Object LIZ() {
            return Keva.getRepo("applog_server_filter.keva");
        }
    };
    public final HashSet<String> LIZ;
    public final HashMap<String, HashSet<String>> LIZIZ;

    public abstract boolean LIZLLL(String str);

    public abstract boolean LJ(HashSet<String> hashSet, String str);

    public AbstractC2194001Atq(HashSet hashSet, HashMap map) {
        this.LIZ = hashSet;
        this.LIZIZ = map;
    }

    public boolean LIZJ(String str, String str2) {
        HashMap<String, HashSet<String>> map;
        HashSet<String> hashSet;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet<String> hashSet2 = this.LIZ;
        if (hashSet2 != null && !hashSet2.isEmpty()) {
            if (LIZLLL(str)) {
                return false;
            }
            if (!TextUtils.isEmpty(str2) && (map = this.LIZIZ) != null && !map.isEmpty() && this.LIZIZ.containsKey(str) && (hashSet = this.LIZIZ.get(str)) != null && !hashSet.isEmpty()) {
                try {
                    Iterator<String> itKeys = new JSONObject(str2).keys();
                    while (itKeys.hasNext()) {
                        if (LJ(hashSet, itKeys.next())) {
                            try {
                                itKeys.remove();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0147: IGET (r2 I:X.1BeD) = (r10 I:X.1BeO) (LINE:50331975) X.1BeO.LJJZZI X.1BeD, block:B:77:0x0144 */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.1BeO] */
    public static AbstractC2194001Atq LJFF(C2209901BeO c2209901BeO, String str, JSONObject jSONObject) {
        ?? r10;
        SharedPreferences.Editor editorEdit;
        JSONObject jSONObjectOptJSONObject;
        try {
            boolean z = c2209901BeO.LJJLIL;
            C2194011Atr c2194011Atr = LIZJ;
            if (z) {
                c2194011Atr.LIZIZ(new Object[0]).clear();
                editorEdit = null;
            } else {
                editorEdit = C810670Vr7.LIZJ(c2209901BeO.LJIIJ, 0, str).edit();
                editorEdit.clear().apply();
            }
            if (jSONObject == null || !jSONObject.has("event_list") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("event_list")) == null) {
                return null;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("is_block", 0);
            if (z) {
                c2194011Atr.LIZIZ(new Object[0]).storeInt("is_block", iOptInt);
            } else {
                editorEdit.putInt("is_block", iOptInt);
            }
            HashSet hashSet = new HashSet();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("events");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
            }
            if (hashSet.size() > 0) {
                if (!z) {
                    editorEdit.putStringSet("events", hashSet);
                } else {
                    c2194011Atr.LIZIZ(new Object[0]).storeStringSetJustDisk("events", hashSet);
                }
            }
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject2 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        HashSet hashSet2 = new HashSet();
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    hashSet2.add(strOptString2);
                                }
                            }
                        }
                        if (hashSet2.size() > 0) {
                            map.put(next, hashSet2);
                        }
                    }
                }
            }
            if (map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    if (z) {
                        c2194011Atr.LIZIZ(new Object[0]).storeStringSetJustDisk((String) entry.getKey(), (Set) entry.getValue());
                    } else {
                        editorEdit.putStringSet((String) entry.getKey(), (Set) entry.getValue());
                    }
                }
            }
            if (editorEdit != null) {
                editorEdit.apply();
            }
            if (iOptInt > 0) {
                return new C2193991Atp(hashSet, map);
            }
            return new C2193981Ato(hashSet, map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            r10.LJJZZI.LJIIZILJ(null, "parseFilterFromServer error: ", th, new Object[0]);
            return null;
        }
    }

    @Override // X.InterfaceC2194031Att
    public final boolean LIZ(EnumC2192221Aqy enumC2192221Aqy, String str, String str2, JSONObject jSONObject) {
        if (!EnumC2192221Aqy.event_v3.equals(enumC2192221Aqy)) {
            return false;
        }
        return !LIZJ(str, str2);
    }
}
