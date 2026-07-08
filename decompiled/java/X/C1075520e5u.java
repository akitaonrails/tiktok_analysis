package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0e5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075520e5u {
    public final ConcurrentHashMap<String, InterfaceC1075470e5p> LIZ;
    public final String LIZIZ;

    public C1075520e5u() {
        this.LIZ = new ConcurrentHashMap<>();
    }

    public C1075520e5u(C1075540e5w c1075540e5w) {
        this();
        this.LIZIZ = c1075540e5w.LIZIZ;
        this.LIZ.putAll(c1075540e5w.LIZ);
    }
}
