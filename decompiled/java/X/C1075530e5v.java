package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0e5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075530e5v {
    public static C1075480e5q LIZIZ() {
        return C1075480e5q.LIZIZ.getValue();
    }

    public static C1075520e5u LIZ(String str, ConcurrentHashMap concurrentHashMap) {
        C1075520e5u c1075520e5u = (C1075520e5u) concurrentHashMap.get(str);
        if (c1075520e5u == null) {
            C1075540e5w c1075540e5w = new C1075540e5w();
            c1075540e5w.LIZIZ = str;
            C1075520e5u c1075520e5u2 = new C1075520e5u(c1075540e5w);
            concurrentHashMap.put(str, c1075520e5u2);
            return c1075520e5u2;
        }
        return c1075520e5u;
    }
}
