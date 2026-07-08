package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BV1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BV1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4790));

    public static boolean LIZ() {
        int i = C0CJ2.LIZJ().getInt("current_hash_check_count", 0);
        C0CJ2.LIZJ().storeInt("current_hash_check_count", i + 1);
        C01GW c01gw = LIZ;
        if (((Number) c01gw.getValue()).intValue() < 0 || i < ((Number) c01gw.getValue()).intValue()) {
            return false;
        }
        C0CJ2.LIZJ().storeInt("current_hash_check_count", 0);
        return true;
    }
}
