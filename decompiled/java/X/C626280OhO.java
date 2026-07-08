package X;

/* JADX INFO: renamed from: X.0OhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626280OhO {
    public static EnumC626270OhN LIZ(Integer num) {
        for (EnumC626270OhN enumC626270OhN : EnumC626270OhN.values()) {
            int value = enumC626270OhN.getValue();
            if (num != null && value == num.intValue()) {
                return enumC626270OhN;
            }
        }
        return EnumC626270OhN.UNKNOWN;
    }
}
