package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597490rfn {
    public static final /* synthetic */ int LIZJ = 0;
    public final Map<String, InterfaceC1891350zJl> LIZ;
    public final IdentityHashMap<InterfaceC1891350zJl, String> LIZIZ;

    static {
        C2097608Jq.LJ();
        new IdentityHashMap();
        new IdentityHashMap();
    }

    public final String LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        return this.LIZIZ.get(interfaceC1891350zJl);
    }

    public C1597490rfn(Map map, IdentityHashMap identityHashMap) {
        this.LIZ = map;
        this.LIZIZ = identityHashMap;
    }
}
