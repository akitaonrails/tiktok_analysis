package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08W6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08W6 {
    public static final ConcurrentHashMap<String, C08W7> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final C054G LIZJ = C2296808zG.LIZ(C2126308Ur.LIZLLL);

    public static void LIZ() {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C08W7> entry : LIZ.entrySet()) {
            String key = entry.getKey();
            if (jCurrentTimeMillis - entry.getValue().LJI > 60000) {
                arrayList.add(key);
            }
        }
        for (Object obj : arrayList) {
            C08W7 c08w7Remove = LIZ.remove(obj);
            if (c08w7Remove != null && (str = c08w7Remove.LJFF) != null) {
                ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
                if (Intrinsics.LJFF(concurrentHashMap.get(str), obj)) {
                    concurrentHashMap.remove(str);
                }
            }
        }
    }

    public static void LIZIZ(String str, Function0 function0) {
        C08W7 c08w7Remove = LIZ.remove(str);
        if (c08w7Remove == null) {
            return;
        }
        String str2 = c08w7Remove.LJFF;
        if (str2 != null) {
            ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
            if (!Intrinsics.LJFF(concurrentHashMap.get(str2), str)) {
                return;
            } else {
                concurrentHashMap.remove(str2);
            }
        }
        C23250099c.LIZLLL(LIZJ, null, null, new C08W5(function0, c08w7Remove, null), 3);
    }

    public static void LIZJ(String str, C08W7 c08w7) {
        String strPut;
        ConcurrentHashMap<String, C08W7> concurrentHashMap = LIZ;
        concurrentHashMap.put(str, c08w7);
        String str2 = c08w7.LJFF;
        if (str2 != null && (strPut = LIZIZ.put(str2, str)) != null && !Intrinsics.LJFF(strPut, str)) {
            concurrentHashMap.remove(strPut);
        }
    }
}
