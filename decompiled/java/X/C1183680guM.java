package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0guM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183680guM {
    public static final C1183680guM LIZ = new C1183680guM();
    public static final LruCache<String, C1183860gue> LIZIZ = new LruCache<>(4);

    public final synchronized C1183860gue LIZ(String str) {
        return LIZIZ.get(str);
    }
}
