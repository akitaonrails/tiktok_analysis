package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C463501rF {
    public static Map<Integer, String> LIZ;

    public static Map LIZ(String str) {
        LinkedHashMap linkedHashMap;
        String string;
        Map<Integer, String> map = LIZ;
        if (map == null) {
            map = null;
            try {
                Keva kevaLIZ = C1702006lW.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("game_name_");
                sbLIZ.append(str);
                string = kevaLIZ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (string != null) {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.01rG
                }.getType();
                c1227904rF.getClass();
                Map map2 = (Map) C1227904rF.LIZJ(string, type);
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                for (Object obj : map2.entrySet()) {
                    linkedHashMap.put(Integer.valueOf(CastIntegerProtector.parseInt((String) ((Map.Entry) obj).getKey())), ((Map.Entry) obj).getValue());
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                LIZ = linkedHashMap;
                return linkedHashMap;
            }
        }
        return map;
    }
}
