package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308800C8o {
    public static boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1628));

    public static final boolean LIZ() {
        if (!LIZ) {
            if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
                C308810C8p.LIZ().LIZ().clear();
            } else if (C308810C8p.LIZ().LIZ().getLong("last_favorite_timestamp", -1L) < 0) {
                C308810C8p.LIZ().LIZ().storeLong("last_favorite_timestamp", System.currentTimeMillis());
            }
            LIZ = true;
        }
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }
}
