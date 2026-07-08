package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0pPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510410pPL {
    public static HashMap<String, C1510420pPM> LIZIZ;
    public static final C1510410pPL LIZ = new C1510410pPL();
    public static boolean LIZJ = true;

    public static HashMap LIZIZ(Field[] fieldArr) {
        HashMap map = new HashMap();
        for (Field field : fieldArr) {
            C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
            if (c09ct != null) {
                try {
                    map.put(c09ct.value(), new C1510420pPM(field.getName(), null));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exception:");
                    sbLIZ.append(e);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return map;
    }

    public static Object LIZ(Object obj, String str, Map map) {
        C1510420pPM c1510420pPM;
        String str2;
        Object obj2 = null;
        if (map != null && (c1510420pPM = (C1510420pPM) map.get(str)) != null && (str2 = c1510420pPM.LIZ) != null) {
            try {
                Class<?> superclass = obj.getClass();
                Field declaredField = null;
                while (superclass != null && declaredField == null) {
                    try {
                        declaredField = superclass.getDeclaredField(str2);
                    } catch (NoSuchFieldException e) {
                        TryCatchGuardChecker.doCheck(e);
                        superclass = superclass.getSuperclass();
                    }
                }
                if (declaredField == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                obj2 = declaredField.get(obj);
                return obj2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return obj2;
    }
}
