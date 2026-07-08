package X;

import com.bytedance.im.core.legacy.internal.utils.EnumTypeAdapterFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.09EF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EF {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    static {
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new EnumTypeAdapterFactory());
        LIZ = eVar.LIZ();
        e eVar2 = new e();
        ((ArrayList) eVar2.LJ).add(new EnumTypeAdapterFactory());
        eVar2.LIZ = eVar2.LIZ.LJFF(new a() { // from class: X.09ED
            @Override // com.google.gson.a
            public final boolean shouldSkipClass(Class<?> cls) {
                return false;
            }

            @Override // com.google.gson.a
            public final boolean shouldSkipField(b bVar) {
                if (bVar.LIZ(C09EE.class) != null) {
                    return true;
                }
                return false;
            }
        }, true, false);
        LIZIZ = eVar2.LIZ();
    }

    public static String LIZ(Map<String, String> map) {
        String strLJIILL = "";
        if (map != null) {
            try {
                if (map.size() > 0) {
                    strLJIILL = LIZ.LJIILL(map);
                    return strLJIILL;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLJIILL;
    }

    public static Map<String, String> LIZIZ(String str) {
        try {
            return (Map) LIZ.LJIIIIZZ(str, new TypeToken<Map<String, String>>() { // from class: X.09EG
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
