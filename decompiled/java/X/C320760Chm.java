package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Chm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320760Chm {
    public static final C320760Chm LIZ = new C320760Chm();
    public static final ConcurrentHashMap<String, C320640Cha> LIZIZ = new ConcurrentHashMap<>();

    public static C320640Cha LIZ(Integer num, Long l) {
        if (l != null && num != null) {
            return LIZIZ.get(C320610ChX.LJ(num.intValue(), l.longValue()));
        }
        return null;
    }
}
