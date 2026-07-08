package X;

/* JADX INFO: renamed from: X.0SN6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SN6 {
    public static EnumC720070SMj LIZ(Integer num) {
        for (EnumC720070SMj enumC720070SMj : EnumC720070SMj.values()) {
            int value = enumC720070SMj.getValue();
            if (num != null && value == num.intValue()) {
                return enumC720070SMj;
            }
        }
        return EnumC720070SMj.FROM_UNKNOWN;
    }
}
