package X;

import android.util.LruCache;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180320gow {
    public static final LruCache<String, String> LIZ = new LruCache<>(3);

    public static String LIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            return LIZ.get(str);
        }
        return null;
    }

    public static void LIZIZ(String str, String str2) {
        if (str != null) {
            LIZ.put(str, str2);
        }
    }
}
