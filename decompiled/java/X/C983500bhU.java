package X;

/* JADX INFO: renamed from: X.0bhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983500bhU {
    public static EnumC982700bgC LIZ(Integer num) {
        EnumC982700bgC enumC982700bgC = EnumC982700bgC.UNKNOWN;
        int type = enumC982700bgC.getType();
        if (num == null || num.intValue() != type) {
            EnumC982700bgC enumC982700bgC2 = EnumC982700bgC.INVITER;
            int type2 = enumC982700bgC2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982700bgC2;
            }
            EnumC982700bgC enumC982700bgC3 = EnumC982700bgC.INVITEE;
            int type3 = enumC982700bgC3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982700bgC3;
            }
        }
        return enumC982700bgC;
    }
}
