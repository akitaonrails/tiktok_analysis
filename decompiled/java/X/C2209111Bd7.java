package X;

/* JADX INFO: renamed from: X.1Bd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209111Bd7 {
    public static EnumC2209071Bd3 LIZ(Integer num) {
        for (EnumC2209071Bd3 enumC2209071Bd3 : EnumC2209071Bd3.values()) {
            int value = enumC2209071Bd3.getValue();
            if (num != null && value == num.intValue()) {
                return enumC2209071Bd3;
            }
        }
        return EnumC2209071Bd3.UNKNOWN;
    }
}
