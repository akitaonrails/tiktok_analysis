package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.15zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20703215zq {
    public static final long LIZ;
    public static final long LIZIZ;

    static {
        LIZ = C255820A0u.LIZ() ? 30000L : TimeUnit.DAYS.toMillis(3L);
        LIZIZ = C255820A0u.LIZ() ? 60000L : TimeUnit.DAYS.toMillis(7L);
    }
}
