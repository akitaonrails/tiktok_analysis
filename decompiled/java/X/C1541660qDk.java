package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0qDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541660qDk {
    public static final Set<C0V1X> LIZ = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public static AbstractC1541670qDl LIZIZ(C1541620qDg c1541620qDg, String str) {
        TreeMap<Integer, AbstractC1541670qDl> treeMap;
        if (c1541620qDg == null) {
            C786950Utx.LIZ("EventManager");
            return null;
        }
        Map<String, TreeMap<Integer, AbstractC1541670qDl>> map = c1541620qDg.LJFF;
        if (map == null || (treeMap = map.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        AbstractC1541670qDl value = treeMap.firstEntry().getValue();
        AbstractC1541650qDj extension = value.getExtension();
        if (extension.LLILLJJLI && extension.LIZIZ()) {
            C1541610qDf.LIZIZ();
            return value;
        }
        C1541610qDf.LIZIZ();
        return LIZ(c1541620qDg, value, str);
    }

    public static AbstractC1541670qDl LIZ(C0V1X c0v1x, AbstractC1541670qDl abstractC1541670qDl, String str) {
        TreeMap<Integer, AbstractC1541670qDl> treeMap;
        Map<String, TreeMap<Integer, AbstractC1541670qDl>> map = ((C1541620qDg) c0v1x).LJFF;
        if (map == null || (treeMap = map.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        Iterator<AbstractC1541670qDl> it2 = treeMap.values().iterator();
        while (it2.hasNext()) {
            if (abstractC1541670qDl == it2.next()) {
                while (it2.hasNext()) {
                    AbstractC1541670qDl next = it2.next();
                    AbstractC1541650qDj extension = next.getExtension();
                    if (extension.LLILLJJLI && extension.LIZIZ()) {
                        C1541610qDf.LIZIZ();
                        return next;
                    }
                    C1541610qDf.LIZIZ();
                }
                C1541610qDf.LIZIZ();
                return null;
            }
        }
        C1541610qDf.LIZIZ();
        return null;
    }

    public static void LIZJ(C1541620qDg c1541620qDg, String str, AbstractC1541670qDl abstractC1541670qDl, int i) {
        if (c1541620qDg == null) {
            return;
        }
        Map<String, TreeMap<Integer, AbstractC1541670qDl>> mapSynchronizedMap = c1541620qDg.LJFF;
        if (mapSynchronizedMap == null) {
            mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            c1541620qDg.LJFF = mapSynchronizedMap;
            LIZ.add(c1541620qDg);
        }
        C1541690qDn c1541690qDn = (C1541690qDn) mapSynchronizedMap.get(str);
        if (c1541690qDn == null) {
            c1541690qDn = new C1541690qDn();
            mapSynchronizedMap.put(str, c1541690qDn);
        }
        if (c1541690qDn.containsValue(abstractC1541670qDl)) {
            return;
        }
        synchronized (C1541660qDk.class) {
            try {
                int i2 = c1541690qDn.LL + 1;
                c1541690qDn.LL = i2;
                if (i2 != 10000) {
                    c1541690qDn.put(Integer.valueOf((i * 10000) + i2), abstractC1541670qDl);
                } else {
                    throw new Error("listener id > 999");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
