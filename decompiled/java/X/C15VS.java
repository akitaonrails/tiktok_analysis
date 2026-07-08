package X;

/* JADX INFO: renamed from: X.15VS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VS {
    public static C15VN LIZ(Integer num) {
        for (C15VN c15vn : C15VN.values()) {
            int value = c15vn.getValue();
            if (num != null && value == num.intValue()) {
                return c15vn;
            }
        }
        return C15VN.EXPLORE_INSERT_CARD_TYPE_DEFAULT;
    }

    public static EnumC1229960i70 LIZIZ(C15VN c15vn) {
        switch (C15VT.LIZ[c15vn.ordinal()]) {
            case 1:
                return EnumC1229960i70.UNKNOWN;
            case 2:
                return EnumC1229960i70.CAN_JOIN;
            case 3:
                return EnumC1229960i70.IN_GROUP;
            case 4:
                return EnumC1229960i70.NOT_QUALIFIED;
            case 5:
                return EnumC1229960i70.REQUEST_PENDING_APPROVAL;
            case 6:
                return EnumC1229960i70.FULL;
            default:
                throw new C1954807lC();
        }
    }
}
