package X;

import java.util.UUID;

/* JADX INFO: renamed from: X.0PON, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PON {
    public static volatile C0P9H LIZ;

    public static final C0P9H LIZ(String str, String str2) {
        C0P9H c0p9h = new C0P9H(System.currentTimeMillis(), 0L, UUID.randomUUID().toString(), str, str2, null);
        LIZ = c0p9h;
        return c0p9h;
    }
}
