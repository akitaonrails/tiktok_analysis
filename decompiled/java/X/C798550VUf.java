package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0VUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798550VUf {
    public static final Map<String, InterfaceC798580VUi> LIZ;
    public static final C798570VUh LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0VUh] */
    static {
        Map map = C798520VUc.LIZJ;
        Map map2 = map;
        if (map == null) {
            map2 = null;
        }
        LIZ = map2;
        LIZIZ = new InterfaceC798580VUi() { // from class: X.0VUh
            @Override // X.InterfaceC798580VUi
            public final InterfaceC798560VUg LIZ(String str) {
                return new C798670VUr(str);
            }
        };
    }
}
