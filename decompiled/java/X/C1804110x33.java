package X;

/* JADX INFO: renamed from: X.0x33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804110x33 {
    public static EnumC1804100x32 LIZ(boolean z, Integer num, boolean z2) {
        if (num != null) {
            if (num.intValue() == 0) {
                if (z) {
                    if (z2) {
                        return EnumC1804100x32.CHARGE_FROM_HASH_V3_PHASE2_LIVE_ROOM;
                    }
                    return EnumC1804100x32.CHARGE_FROM_HASH_V3_LIVE_ROOM;
                }
                return EnumC1804100x32.CHARGE_FROM_HASH_V2_LIVE_ROOM;
            }
            if (num.intValue() == 5) {
                if (z2) {
                    return EnumC1804100x32.CHARGE_FROM_HASH_PROMOTION;
                }
                return EnumC1804100x32.CHARGE_FROM_HASH_V3_PHASE2_PROMOTION;
            }
            if (num.intValue() == 1) {
                if (z2) {
                    return EnumC1804100x32.CHARGE_FROM_HASH_BALANCE;
                }
                return EnumC1804100x32.CHARGE_FROM_HASH_V3_PHASE2_BALANCE;
            }
            return null;
        }
        return null;
    }
}
