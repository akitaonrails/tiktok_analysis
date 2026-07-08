package X;

/* JADX INFO: renamed from: X.0x3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804190x3B {
    public static boolean LIZ(Integer num) {
        int version = EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_2_V1.getVersion();
        if (num == null || num.intValue() != version) {
            int version2 = EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_2_V2.getVersion();
            if (num != null && num.intValue() == version2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
