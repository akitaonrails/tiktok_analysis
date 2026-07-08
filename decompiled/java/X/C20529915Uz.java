package X;

/* JADX INFO: renamed from: X.15Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20529915Uz {
    public static EnumC20529815Uy LIZ(Integer num) {
        for (EnumC20529815Uy enumC20529815Uy : EnumC20529815Uy.values()) {
            int value = enumC20529815Uy.getValue();
            if (num != null && value == num.intValue()) {
                return enumC20529815Uy;
            }
        }
        return EnumC20529815Uy.EXPLORE_INSERT_CARD_STATUS_TYPE_FAIL;
    }
}
