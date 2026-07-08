package X;

/* JADX INFO: renamed from: X.0bhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983430bhN {
    public static EnumC982900bgW LIZ(Integer num) {
        EnumC982900bgW enumC982900bgW = EnumC982900bgW.UNKNOWN;
        int type = enumC982900bgW.getType();
        if (num == null || num.intValue() != type) {
            EnumC982900bgW enumC982900bgW2 = EnumC982900bgW.USER_CLICK;
            int type2 = enumC982900bgW2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982900bgW2;
            }
            EnumC982900bgW enumC982900bgW3 = EnumC982900bgW.USER_LEFT;
            int type3 = enumC982900bgW3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982900bgW3;
            }
            EnumC982900bgW enumC982900bgW4 = EnumC982900bgW.COUNTDOWN_END;
            int type4 = enumC982900bgW4.getType();
            if (num != null && num.intValue() == type4) {
                return enumC982900bgW4;
            }
        }
        return enumC982900bgW;
    }
}
