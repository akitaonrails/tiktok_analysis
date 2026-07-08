package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475230oUb {
    public static final ConcurrentHashMap<String, C1475400oUs> LIZ = new ConcurrentHashMap<>();
    public static volatile String LIZIZ;

    public static final void LIZ(String str, boolean z) {
        if (C1474810oTv.LL() > 0 && str != null && str.length() != 0 && z) {
            LIZ.put(str, new C1475400oUs(true, System.currentTimeMillis()));
            LIZIZ = str;
        }
    }
}
