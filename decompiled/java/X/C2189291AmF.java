package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2189291AmF {
    public static void LIZ(C2189301AmG c2189301AmG, JSONArray jSONArray) {
        final int iOptInt;
        AbstractC2189221Am8 abstractC2189221Am8;
        JSONArray jSONArrayOptJSONArray;
        Object objOpt;
        JSONArray jSONArrayOptJSONArray2;
        if (jSONArray != null && jSONArray.length() > 0) {
            c2189301AmG.LIZJ = jSONArray;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("sampling_rate")) < 10000) {
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("sampling_method");
                        final HashSet hashSet = new HashSet();
                        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("events");
                        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                                String strOptString = jSONArrayOptJSONArray3.optString(i2);
                                if (!TextUtils.isEmpty(strOptString)) {
                                    hashSet.add(strOptString);
                                }
                            }
                        }
                        final HashMap map = new HashMap();
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("param_keys");
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!TextUtils.isEmpty(next) && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(next)) != null && jSONArrayOptJSONArray2.length() > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                        JSONArray jSONArrayOptJSONArray4 = jSONArrayOptJSONArray2.optJSONArray(i3);
                                        if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                                            HashSet hashSet2 = new HashSet();
                                            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                                                String strOptString2 = jSONArrayOptJSONArray4.optString(i4);
                                                if (!TextUtils.isEmpty(strOptString2)) {
                                                    hashSet2.add(strOptString2);
                                                }
                                            }
                                            arrayList.add(hashSet2);
                                        }
                                    }
                                    map.put(next, arrayList);
                                }
                            }
                        }
                        final HashMap map2 = new HashMap();
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("param_key_values");
                        if (jSONObjectOptJSONObject3 != null) {
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                if (!TextUtils.isEmpty(next2) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray(next2)) != null && jSONArrayOptJSONArray.length() > 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i5);
                                        if (jSONObjectOptJSONObject4 != null) {
                                            HashMap map3 = new HashMap();
                                            Iterator<String> itKeys3 = jSONObjectOptJSONObject4.keys();
                                            while (itKeys3.hasNext()) {
                                                String next3 = itKeys3.next();
                                                if (!TextUtils.isEmpty(next3) && (objOpt = jSONObjectOptJSONObject4.opt(next3)) != null) {
                                                    map3.put(next3, objOpt);
                                                }
                                            }
                                            arrayList2.add(map3);
                                        }
                                    }
                                    map2.put(next2, arrayList2);
                                }
                            }
                        }
                        if (iOptInt2 != 1) {
                            if (iOptInt2 != 2) {
                                if (iOptInt2 != 3) {
                                    if (iOptInt2 != 4) {
                                        if (iOptInt2 == 6) {
                                            abstractC2189221Am8 = new AbstractC2189221Am8(iOptInt, hashSet, map, map2) { // from class: X.1AmC
                                                @Override // X.AbstractC2189221Am8
                                                public final boolean LIZJ(InterfaceC2189271AmD interfaceC2189271AmD) {
                                                    int iLIZ = LIZ();
                                                    if (iLIZ < 0) {
                                                        return true;
                                                    }
                                                    if (iLIZ > 0 || interfaceC2189271AmD == null) {
                                                        return false;
                                                    }
                                                    String strLIZLLL = interfaceC2189271AmD.LIZLLL();
                                                    if (TextUtils.isEmpty(strLIZLLL)) {
                                                        return false;
                                                    }
                                                    String strLIZ = interfaceC2189271AmD.LIZ();
                                                    if (TextUtils.isEmpty(strLIZ)) {
                                                        return false;
                                                    }
                                                    String strLIZIZ = interfaceC2189271AmD.LIZIZ();
                                                    if (TextUtils.isEmpty(strLIZIZ)) {
                                                        return false;
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(strLIZLLL);
                                                    sbLIZ.append(":");
                                                    sbLIZ.append(strLIZIZ);
                                                    sbLIZ.append("_");
                                                    sbLIZ.append(strLIZ);
                                                    return !C13KM.LIZ(this.LIZ, C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                            };
                                        }
                                    } else {
                                        abstractC2189221Am8 = new AbstractC2189221Am8(iOptInt, hashSet, map, map2) { // from class: X.1AmB
                                            @Override // X.AbstractC2189221Am8
                                            public final boolean LIZJ(InterfaceC2189271AmD interfaceC2189271AmD) {
                                                int iLIZ = LIZ();
                                                if (iLIZ < 0) {
                                                    return true;
                                                }
                                                if (iLIZ > 0 || interfaceC2189271AmD == null || TextUtils.isEmpty(interfaceC2189271AmD.LIZLLL()) || TextUtils.isEmpty(interfaceC2189271AmD.LIZJ())) {
                                                    return false;
                                                }
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(interfaceC2189271AmD.LIZLLL());
                                                sbLIZ.append(":");
                                                sbLIZ.append(interfaceC2189271AmD.LIZJ());
                                                return !C13KM.LIZ(this.LIZ, C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                        };
                                    }
                                } else {
                                    abstractC2189221Am8 = new AbstractC2189221Am8(iOptInt, hashSet, map, map2) { // from class: X.1AmA
                                        @Override // X.AbstractC2189221Am8
                                        public final boolean LIZJ(InterfaceC2189271AmD interfaceC2189271AmD) {
                                            int iLIZ = LIZ();
                                            if (iLIZ < 0) {
                                                return true;
                                            }
                                            if (iLIZ <= 0 && interfaceC2189271AmD != null && !TextUtils.isEmpty(interfaceC2189271AmD.LIZJ())) {
                                                try {
                                                    if (CastLongProtector.parseLong(interfaceC2189271AmD.LIZJ()) % 10000 >= this.LIZ) {
                                                        return true;
                                                    }
                                                    return false;
                                                } catch (NumberFormatException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                }
                                            }
                                            return false;
                                        }
                                    };
                                }
                            } else {
                                abstractC2189221Am8 = new AbstractC2189221Am8(iOptInt, hashSet, map, map2) { // from class: X.1AmE
                                    @Override // X.AbstractC2189221Am8
                                    public final boolean LIZJ(InterfaceC2189271AmD interfaceC2189271AmD) {
                                        int iLIZ = LIZ();
                                        if (iLIZ < 0) {
                                            return true;
                                        }
                                        if (iLIZ > 0 || interfaceC2189271AmD == null || TextUtils.isEmpty(interfaceC2189271AmD.LIZJ())) {
                                            return false;
                                        }
                                        CRC32 crc32 = new CRC32();
                                        crc32.update(interfaceC2189271AmD.LIZJ().getBytes());
                                        if (crc32.getValue() % 10000 >= this.LIZ) {
                                            return true;
                                        }
                                        return false;
                                    }
                                };
                            }
                        } else {
                            abstractC2189221Am8 = new AbstractC2189221Am8(iOptInt, hashSet, map, map2) { // from class: X.1Am9
                                @Override // X.AbstractC2189221Am8
                                public final boolean LIZJ(InterfaceC2189271AmD interfaceC2189271AmD) {
                                    int iLIZ = LIZ();
                                    if (iLIZ < 0) {
                                        return true;
                                    }
                                    if (iLIZ <= 0 && new Random().nextInt(10000) >= this.LIZ) {
                                        return true;
                                    }
                                    return false;
                                }
                            };
                        }
                        ((ArrayList) c2189301AmG.LJ).add(abstractC2189221Am8);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2209791BeD.LJIJJ().LJIILIIL(12, "loadSamplingMapFromJsonArray error", th, new Object[0]);
                    return;
                }
            }
        }
    }

    public static C2189301AmG LIZJ(Context context, String str) {
        C2189301AmG c2189301AmG = new C2189301AmG();
        if (TextUtils.isEmpty(str)) {
            str = "sampling_list";
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, str);
        c2189301AmG.LIZ = sharedPreferencesLIZJ.getInt("version", 0);
        c2189301AmG.LIZIZ = sharedPreferencesLIZJ.getInt("capability", 0);
        String string = sharedPreferencesLIZJ.getString("config_ids", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                c2189301AmG.LIZLLL = new JSONArray(string);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2209791BeD.LJIJJ().LJIILIIL(12, "parseEventSamplingFromLocal config ids error", th, new Object[0]);
            }
        }
        String string2 = sharedPreferencesLIZJ.getString("samplings", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                LIZ(c2189301AmG, new JSONArray(string2));
                return c2189301AmG;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C2209791BeD.LJIJJ().LJIILIIL(12, "parseEventSamplingFromLocal sampling config", th2, new Object[0]);
            }
        }
        return c2189301AmG;
    }

    public static C2189301AmG LIZIZ(Context context, String str, JSONObject jSONObject, C2189301AmG c2189301AmG) {
        try {
            C2189301AmG c2189301AmG2 = new C2189301AmG();
            c2189301AmG2.LIZ = jSONObject.optInt("event_sampling_version", 0);
            c2189301AmG2.LIZIZ = jSONObject.optInt("capability", 0);
            c2189301AmG2.LIZLLL = jSONObject.optJSONArray("config_ids");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("samplings");
            LIZ(c2189301AmG2, jSONArrayOptJSONArray);
            if (TextUtils.isEmpty(str)) {
                str = "sampling_list";
            }
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, str).edit();
            editorEdit.putInt("capability", c2189301AmG2.LIZIZ);
            editorEdit.putInt("version", c2189301AmG2.LIZ);
            if (jSONArrayOptJSONArray != null) {
                editorEdit.putString("samplings", jSONArrayOptJSONArray.toString());
            }
            JSONArray jSONArray = c2189301AmG2.LIZLLL;
            if (jSONArray != null) {
                editorEdit.putString("config_ids", jSONArray.toString());
            }
            editorEdit.apply();
            return c2189301AmG2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILIIL(12, "parseEventSamplingFromServer", th, new Object[0]);
            return c2189301AmG;
        }
    }
}
