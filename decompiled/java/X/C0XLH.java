package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0XLH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLH {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0XLI());

    public static void LIZ(C0XM9 c0xm9, Map map, boolean z) {
        if (!a0.LJJIIZI(c0xm9.LIZJ.LJIIIIZZ, "tiktok", false)) {
            return;
        }
        String strLIZJ = c0xm9.LIZLLL.LIZJ("x-tt-request-tag");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<Pair> arrayList = new ArrayList();
        if (C2089508Gn.LIZIZ(strLIZJ, ";", arrayList)) {
            for (Pair pair : arrayList) {
                if (!z || !((LinkedHashMap) map).keySet().contains(pair.first)) {
                    map.put(pair.first, pair.second);
                }
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append('=');
            sbLIZ.append((String) entry.getValue());
            linkedHashSet.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!linkedHashSet.isEmpty()) {
            c0xm9.LIZLLL.LIZLLL("x-tt-request-tag", C13LP.LJJLIIIJ(linkedHashSet, ";", null, null, 0, null, null, 62));
        }
    }
}
