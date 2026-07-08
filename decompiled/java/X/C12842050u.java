package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.050u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12842050u {
    public static final /* synthetic */ int LIZ = 0;

    public static k LIZ(k kVar, Map map) {
        kVar.getClass();
        if (kVar instanceof n) {
            n nVarLJIILIIL = kVar.LJIILIIL();
            LIZIZ(map, nVarLJIILIIL);
            return nVarLJIILIIL;
        }
        if (kVar instanceof h) {
            h hVarLJIIL = kVar.LJIIL();
            Iterator<k> it2 = hVarLJIIL.iterator();
            while (it2.hasNext()) {
                LIZ(it2.next(), map);
            }
            return hVarLJIIL;
        }
        return null;
    }

    public static void LIZIZ(Map map, n nVar) {
        Gson gsonLIZIZ = C08JS.LIZIZ();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            k kVar = (k) entry.getValue();
            Object obj = ((LinkedHashMap) map).get(str);
            if (obj != null) {
                nVar.LJJIFFI(str, GsonProtectorUtils.toJsonTree(gsonLIZIZ, obj));
            }
            kVar.getClass();
            if (kVar instanceof n) {
                LIZIZ(map, kVar.LJIILIIL());
            } else if (kVar instanceof h) {
                for (k kVar2 : kVar.LJIIL()) {
                    kVar2.getClass();
                    if (kVar2 instanceof n) {
                        LIZIZ(map, kVar2.LJIILIIL());
                    }
                }
            } else if ((kVar instanceof q) && (kVar.LJIL().length() == 0 || !map.containsKey(str))) {
                arrayList.add(str);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            nVar.LJJIJL((String) it3.next());
        }
    }
}
