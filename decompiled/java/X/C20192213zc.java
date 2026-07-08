package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20192213zc {
    public static final C20192213zc LIZ = new C20192213zc();
    public static final ConcurrentHashMap<String, C20192313zd> LIZIZ = new ConcurrentHashMap<>();

    public static C20192313zd LIZ(String str) {
        C20192313zd c20192313zdPutIfAbsent;
        ConcurrentHashMap<String, C20192313zd> concurrentHashMap = LIZIZ;
        C20192313zd c20192313zd = concurrentHashMap.get(str);
        if (c20192313zd == null && (c20192313zdPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c20192313zd = new C20192313zd(0)))) != null) {
            c20192313zd = c20192313zdPutIfAbsent;
        }
        return c20192313zd;
    }
}
