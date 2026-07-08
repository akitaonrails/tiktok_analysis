package X;

/* JADX INFO: renamed from: X.0bhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983530bhX {
    public static EnumC982750bgH LIZ(Integer num) {
        EnumC982750bgH enumC982750bgH = EnumC982750bgH.UNKNOWN;
        int type = enumC982750bgH.getType();
        if (num == null || num.intValue() != type) {
            EnumC982750bgH enumC982750bgH2 = EnumC982750bgH.NORMAL;
            int type2 = enumC982750bgH2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982750bgH2;
            }
            EnumC982750bgH enumC982750bgH3 = EnumC982750bgH.CUTSHORT;
            int type3 = enumC982750bgH3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982750bgH3;
            }
        }
        return enumC982750bgH;
    }
}
