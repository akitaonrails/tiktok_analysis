package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0cvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030690cvb {
    public final ConcurrentLinkedQueue<String> LIZ = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public final boolean LIZ(String str) {
        if (str.length() == 0 || this.LIZ.isEmpty()) {
            return false;
        }
        return this.LIZ.contains(str);
    }
}
