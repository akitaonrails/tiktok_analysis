package X;

/* JADX INFO: renamed from: X.0i5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229290i5v {
    public static EnumC1229300i5w LIZ(Integer num) {
        for (EnumC1229300i5w enumC1229300i5w : EnumC1229300i5w.values()) {
            int value = enumC1229300i5w.getValue();
            if (num != null && value == num.intValue()) {
                return enumC1229300i5w;
            }
        }
        return EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN;
    }
}
