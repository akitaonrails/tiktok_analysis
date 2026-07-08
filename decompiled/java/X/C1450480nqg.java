package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0nqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450480nqg {
    public static final ConcurrentHashMap<String, C1455790nzF> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        LIZ.remove(str);
    }
}
