package X;

import android.content.Context;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541610qDf {
    public static Context LJI;
    public static C1539060q9Y LJII;
    public static final Map<String, List<Pair<Class<? extends InterfaceC1541860qE4>, AbstractC1541720qDq>>> LJIIIIZZ = new HashMap();
    public static final Map<String, Map<Class<? extends InterfaceC1541860qE4>, C1541610qDf>> LJIIIZ = new HashMap();
    public final Class<? extends InterfaceC1541860qE4> LIZ;
    public final LinkedHashSet<Class<? extends AbstractC1541650qDj>> LIZIZ;
    public final LinkedHashSet<Class<? extends AbstractC1541650qDj>> LIZJ;
    public LinkedHashSet<InterfaceC1541740qDs> LIZLLL;
    public HashMap<Class<? extends AbstractC1541650qDj>, LinkedHashSet<InterfaceC1541740qDs>> LJ;
    public HashSet<C0V1Z> LJFF;

    public C1541610qDf() {
        throw null;
    }

    public static void LIZIZ() {
        LJII.getClass();
    }

    public static C1541610qDf LIZ(Class cls, String str) {
        Map<String, Map<Class<? extends InterfaceC1541860qE4>, C1541610qDf>> map = LJIIIZ;
        Map hashtable = (Map) ((HashMap) map).get(str);
        if (hashtable == null) {
            synchronized (C1541610qDf.class) {
                try {
                    hashtable = (Map) ((HashMap) map).get(str);
                    if (hashtable == null) {
                        hashtable = new Hashtable();
                        ((HashMap) map).put(str, hashtable);
                    }
                } finally {
                }
            }
        }
        C1541610qDf c1541610qDf = (C1541610qDf) hashtable.get(cls);
        if (c1541610qDf != null) {
            return c1541610qDf;
        }
        synchronized (C1541610qDf.class) {
            try {
                C1541610qDf c1541610qDf2 = (C1541610qDf) hashtable.get(cls);
                if (c1541610qDf2 != null) {
                    return c1541610qDf2;
                }
                C1541630qDh c1541630qDh = new C1541630qDh();
                List<Pair> list = (List) ((HashMap) LJIIIIZZ).get(str);
                if (list == null) {
                    return null;
                }
                for (Pair pair : list) {
                    if (((Class) pair.first).equals(cls)) {
                        AbstractC1541720qDq abstractC1541720qDq = (AbstractC1541720qDq) pair.second;
                        abstractC1541720qDq.getClass();
                        abstractC1541720qDq.LIZ(c1541630qDh);
                    }
                }
                C1541610qDf c1541610qDf3 = new C1541610qDf(cls, c1541630qDh.LIZ, c1541630qDh.LIZIZ);
                c1541610qDf3.LIZLLL = c1541630qDh.LIZJ;
                c1541610qDf3.LJ = c1541630qDh.LIZLLL;
                c1541610qDf3.LJFF = c1541630qDh.LJ;
                hashtable.put(cls, c1541610qDf3);
                return c1541610qDf3;
            } finally {
            }
        }
    }

    public C1541610qDf(Class cls, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.LIZ = cls;
        this.LIZIZ = linkedHashSet;
        this.LIZJ = linkedHashSet2;
    }
}
