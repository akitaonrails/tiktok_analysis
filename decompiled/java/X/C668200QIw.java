package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0QIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668200QIw {
    public static final ConcurrentHashMap<String, C668170QIt> LIZ = new ConcurrentHashMap<>();

    public static C668170QIt LIZ(String str) {
        C668170QIt c668170QIt = LIZ.get(str);
        if (c668170QIt == null) {
            return C668180QIu.LIZ;
        }
        return c668170QIt;
    }
}
