package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.13AE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13AE implements C13AN {
    public volatile boolean LIZ;
    public final Map<String, C13AT> LIZIZ = new ConcurrentHashMap();
    public final LinkedBlockingQueue<C13AO> LIZJ = new LinkedBlockingQueue<>();

    @Override // X.C13AN
    public final synchronized C13AX LIZ(String str) {
        C13AT c13at;
        c13at = (C13AT) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (c13at == null) {
            c13at = new C13AT(str, this.LIZJ, this.LIZ);
            ((ConcurrentHashMap) this.LIZIZ).put(str, c13at);
        }
        return c13at;
    }
}
