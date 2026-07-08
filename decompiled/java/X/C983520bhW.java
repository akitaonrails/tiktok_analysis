package X;

/* JADX INFO: renamed from: X.0bhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983520bhW {
    public static EnumC983380bhI LIZ(Integer num) {
        EnumC983380bhI enumC983380bhI = EnumC983380bhI.TRIGGER_REASON_UNKNOWN;
        int type = enumC983380bhI.getType();
        if (num == null || num.intValue() != type) {
            enumC983380bhI = EnumC983380bhI.TRIGGER_REASON_SCORE_UPDATE;
            int type2 = enumC983380bhI.getType();
            if (num != null && num.intValue() == type2) {
                return enumC983380bhI;
            }
            EnumC983380bhI enumC983380bhI2 = EnumC983380bhI.TRIGGER_REASON_OPT_OUT_UPDATE;
            int type3 = enumC983380bhI2.getType();
            if (num != null && num.intValue() == type3) {
                return enumC983380bhI2;
            }
        }
        return enumC983380bhI;
    }
}
