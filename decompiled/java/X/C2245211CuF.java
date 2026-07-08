package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.1CuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245211CuF {
    public static final HashMap<String, C2245221CuG> LIZ = new HashMap<>();

    public static void LIZ(String str) {
        C2245221CuG c2245221CuG = LIZ.get(str);
        if (c2245221CuG != null) {
            Iterator<Map.Entry<String, C2245161CuA>> it2 = c2245221CuG.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LIZ.LJIIIZ = true;
            }
        }
    }
}
