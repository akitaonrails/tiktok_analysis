package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.07eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1912807eQ {
    public final long LIZ = 3600000;
    public final C1912907eR LIZIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.07eR] */
    public C1912807eQ() {
        final int i = 100;
        this.LIZIZ = new LruCache<C1877407Wy, C1877007Wu>(i) { // from class: X.07eR
        };
    }

    public final synchronized String LIZ(C1877407Wy c1877407Wy) {
        C1877007Wu c1877007Wu = get(c1877407Wy);
        if (c1877007Wu == null) {
            return null;
        }
        if (System.currentTimeMillis() - c1877007Wu.LIZIZ > this.LIZ) {
            remove(c1877407Wy);
            return null;
        }
        return c1877007Wu.LIZ;
    }

    public final synchronized void LIZIZ(C1877407Wy c1877407Wy, String str) {
        if (str.length() > 0) {
            put(c1877407Wy, new C1877007Wu(str));
        }
    }
}
