package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2339409Eq {
    public static final C2339209Eo LIZ(String str) {
        return new C2339209Eo(str, null);
    }

    public static final String LIZIZ(InterfaceC1406105et interfaceC1406105et) {
        C2339209Eo c2339209Eo;
        String str;
        Object obj = null;
        if (interfaceC1406105et instanceof C2339209Eo) {
            c2339209Eo = (C2339209Eo) interfaceC1406105et;
            if (c2339209Eo != null && (str = c2339209Eo.LIZ) != null) {
                return str;
            }
        } else {
            c2339209Eo = null;
        }
        ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = C2338909El.LIZ;
        if (c2339209Eo != null) {
            obj = c2339209Eo.LIZIZ;
        }
        return C2338909El.LIZJ(obj);
    }
}
