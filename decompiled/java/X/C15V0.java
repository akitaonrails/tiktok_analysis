package X;

/* JADX INFO: renamed from: X.15V0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15V0 {
    public static EnumC20529715Ux LIZ(Integer num) {
        for (EnumC20529715Ux enumC20529715Ux : EnumC20529715Ux.values()) {
            int value = enumC20529715Ux.getValue();
            if (num != null && value == num.intValue()) {
                return enumC20529715Ux;
            }
        }
        return EnumC20529715Ux.EXPLORE_INSERT_CARD_TYPE_DEFAULT;
    }
}
