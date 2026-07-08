package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18DP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DP {
    public static final Map<Object, C18DN> LIZ = Collections.synchronizedMap(new WeakHashMap());

    public static C18DN LIZ(Object obj) {
        C18DN c18dnLIZJ = LIZJ(obj);
        if (C18DO.LIZ(c18dnLIZJ)) {
            String name = obj.getClass().getName();
            Regex regex = C18C3.LIZ;
            String strLJJI = u.LJJI(name, '.', '_', false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aUnknown.b");
            sbLIZ.append(strLJJI);
            sbLIZ.append(".c0.d0");
            c18dnLIZJ.setPageBtm(C2188811AlT.LIZIZ(sbLIZ));
        }
        return c18dnLIZJ;
    }

    public static C18DN LIZIZ(String str) {
        C18DN c18dn;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Map<Object, C18DN> map = LIZ;
        synchronized (map) {
            try {
                Iterator<T> it2 = map.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((C18DN) next).getMountBtmIds().contains(str)) {
                        obj = next;
                        break;
                    }
                }
                c18dn = (C18DN) obj;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c18dn;
    }

    public static C18DN LIZJ(Object obj) {
        Map<Object, C18DN> map = LIZ;
        C18DN c18dn = map.get(obj);
        if (c18dn == null) {
            C18DN c18dn2 = new C18DN();
            map.put(obj, c18dn2);
            return c18dn2;
        }
        return c18dn;
    }
}
