package X;

/* JADX INFO: renamed from: X.0bhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983330bhD {
    public static EnumC982730bgF LIZ(Integer num) {
        EnumC982730bgF enumC982730bgF = EnumC982730bgF.UNKNOWN;
        int type = enumC982730bgF.getType();
        if (num == null || num.intValue() != type) {
            EnumC982730bgF enumC982730bgF2 = EnumC982730bgF.NO_PERMISSION;
            int type2 = enumC982730bgF2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982730bgF2;
            }
            EnumC982730bgF enumC982730bgF3 = EnumC982730bgF.ANCHOR_CLOSED;
            int type3 = enumC982730bgF3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982730bgF3;
            }
            EnumC982730bgF enumC982730bgF4 = EnumC982730bgF.HAS_PERMISSION;
            int type4 = enumC982730bgF4.getType();
            if (num != null && num.intValue() == type4) {
                return enumC982730bgF4;
            }
            EnumC982730bgF enumC982730bgF5 = EnumC982730bgF.ANCHOR_BANNED;
            int type5 = enumC982730bgF5.getType();
            if (num != null && num.intValue() == type5) {
                return enumC982730bgF5;
            }
        }
        return enumC982730bgF;
    }
}
