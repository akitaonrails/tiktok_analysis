package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveConsumingFunOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveSettingToJsonOptSetting;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.tiktok.json.gson.GsonOptUtil;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338270kvh {
    public static final Map<String, Object> LIZ = new ConcurrentHashMap();
    public static final long LIZIZ = 50;
    public static final Keva LIZJ;
    public static final C1338280kvi LIZLLL;

    static {
        Keva repoSync = KevaImpl.getRepoSync("setting_from_server", 0);
        LIZJ = repoSync;
        LIZLLL = new C1338280kvi(repoSync);
    }

    public static Object LIZIZ(String str) {
        Object objOpt = LIZLLL.LIZIZ(str).opt(str);
        if (objOpt != null) {
            return objOpt;
        }
        Object valueByKey = SettingsManager.INSTANCE.getValueByKey(str);
        if (!(valueByKey instanceof String)) {
            return valueByKey;
        }
        String str2 = (String) valueByKey;
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }

    public static Object LIZ(Object obj, String str) {
        try {
            Map<String, Object> map = LIZ;
            Object obj2 = ((ConcurrentHashMap) map).get(str);
            if (obj2 != null) {
                return obj2;
            }
            Object objLIZJ = LIZJ(str, obj.getClass(), obj);
            if (objLIZJ == null) {
                objLIZJ = obj;
            }
            ((ConcurrentHashMap) map).put(str, objLIZJ);
            return objLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SettingUtil#getValue exception:");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(", setting: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            HashMap map2 = new HashMap();
            map2.put("exception", strLIZIZ);
            C1CC2.LJII(0, "ttlive_settings_manager_monitor", map2);
            return obj;
        }
    }

    public static void LIZLLL(List list, n nVar) {
        String strLIZJ;
        int i;
        String strLIZJ2;
        C1338280kvi c1338280kvi = LIZLLL;
        c1338280kvi.getClass();
        if (nVar != null) {
            HashSet hashSet = new HashSet(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                hashSet.add(((LiveSettingModel) it2.next()).getSettingsKey());
            }
            n[] nVarArr = new n[32];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update raw setting v2, live setting size: ");
            sbLIZ.append(hashSet.size());
            sbLIZ.append(", new settings size: ");
            sbLIZ.append(nVar.size());
            C2188811AlT.LIZIZ(sbLIZ);
            Iterator<Map.Entry<String, k>> it3 = nVar.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry<String, k> next = it3.next();
                String key = next.getKey();
                if (!hashSet.contains(key)) {
                    k value = next.getValue();
                    if (key != null) {
                        int iHashCode = key.hashCode();
                        i = iHashCode ^ (iHashCode >>> 16);
                    }
                    int i2 = i & 31;
                    n nVar2 = nVarArr[i2];
                    if (nVar2 == null) {
                        nVar2 = new n();
                        nVarArr[i2] = nVar2;
                    }
                    nVar2.LJJIFFI(key, value);
                }
            }
            String[] strArr = new String[32];
            JSONObject[] jSONObjectArr = new JSONObject[32];
            int i3 = 0;
            do {
                if (LiveSettingToJsonOptSetting.enableSettingToJsonOpt()) {
                    strLIZJ2 = C1338280kvi.LIZJ(38000, nVarArr[i3]);
                } else {
                    strLIZJ2 = C1338280kvi.LIZJ(30000, nVarArr[i3]);
                }
                strArr[i3] = strLIZJ2;
                if (!LiveConsumingFunOpt.enableSettingRawOpt() || c1338280kvi.LIZLLL[i3] != null) {
                    jSONObjectArr[i3] = C1338280kvi.LIZ(strLIZJ2);
                }
                i3++;
            } while (i3 < 32);
            StringBuilder sb = new StringBuilder();
            synchronized (C1338280kvi.class) {
                int i4 = 0;
                do {
                    try {
                        if (c1338280kvi.LIZLLL[i4] != null) {
                            if (!LiveConsumingFunOpt.enableSettingRawOpt() || jSONObjectArr[i4] != null) {
                                c1338280kvi.LIZLLL[i4] = jSONObjectArr[i4];
                            } else {
                                jSONObjectArr[i4] = C1338280kvi.LIZ(strArr[i4]);
                            }
                            if (!LiveSettingToJsonOptSetting.enableIndexBuilderOutputOpt()) {
                                sb.append(i4);
                                sb.append(",");
                            }
                        }
                        i4++;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                } while (i4 < 32);
            }
            if (!LiveSettingToJsonOptSetting.enableIndexBuilderOutputOpt()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update raw setting v2 finish, update index: ");
                sbLIZ2.append((Object) sb);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            do {
                c1338280kvi.LIZIZ.storeString("setting_key_part" + i, strArr[i]);
                i++;
            } while (i < 32);
            c1338280kvi.LIZIZ.storeInt("setting_part_enable", 1);
            c1338280kvi.LIZ = 1;
            c1338280kvi.LIZJ = null;
        }
        ((ConcurrentHashMap) LIZ).clear();
        if (!LiveConsumingFunOpt.enableSettingRawOpt()) {
            if (LiveSettingToJsonOptSetting.enableSettingToJsonOpt()) {
                strLIZJ = GsonOptUtil.toStringWithSize(nVar, C08JU.CHAR_ARRAY, 1060000);
            } else {
                strLIZJ = C1338280kvi.LIZJ(500000, nVar);
            }
            LIZJ.storeString("setting_key", strLIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T LIZJ(String str, Type type, T t) {
        JSONObject jSONObjectLIZIZ = LIZLLL.LIZIZ(str);
        if (jSONObjectLIZIZ.has(str)) {
            if (type == Boolean.class) {
                return (T) Boolean.valueOf(jSONObjectLIZIZ.optBoolean(str, ((Boolean) t).booleanValue()));
            }
            if (type != Integer.class && type != Short.class) {
                if (type == Float.class) {
                    return (T) Float.valueOf((float) jSONObjectLIZIZ.optDouble(str, ((Float) t).floatValue()));
                }
                if (type == Long.class) {
                    return (T) Long.valueOf(jSONObjectLIZIZ.optLong(str, ((Long) t).longValue()));
                }
                if (type == Double.class) {
                    return (T) Double.valueOf(jSONObjectLIZIZ.optDouble(str, ((Double) t).doubleValue()));
                }
                if (type == String.class) {
                    return (T) jSONObjectLIZIZ.optString(str, (String) t);
                }
                return (T) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, jSONObjectLIZIZ.optString(str), type);
            }
            return (T) Integer.valueOf(jSONObjectLIZIZ.optInt(str, ((Integer) t).intValue()));
        }
        if (type == Boolean.class) {
            return (T) Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(str, ((Boolean) t).booleanValue()));
        }
        if (type != Integer.class && type != Short.class) {
            if (type == Float.class) {
                return (T) Float.valueOf(SettingsManager.INSTANCE.getFloatValue(str, ((Float) t).floatValue()));
            }
            if (type == Long.class) {
                return (T) Long.valueOf(SettingsManager.INSTANCE.getLongValue(str, ((Long) t).longValue()));
            }
            if (type == Double.class) {
                return (T) Double.valueOf(SettingsManager.INSTANCE.getDoubleValue(str, ((Double) t).doubleValue()));
            }
            if (type == String.class) {
                return (T) SettingsManager.INSTANCE.getStringValue(str, (String) t);
            }
            if (type == String[].class) {
                return (T) SettingsManager.INSTANCE.getStringArrayValue(str, (String[]) t);
            }
            String customOriginalValue = SettingsManager.INSTANCE.getCustomOriginalValue(str);
            if (customOriginalValue == null) {
                return t;
            }
            return (T) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, customOriginalValue, type);
        }
        return (T) Integer.valueOf(SettingsManager.INSTANCE.getIntValue(str, ((Integer) t).intValue()));
    }
}
