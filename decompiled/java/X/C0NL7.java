package X;

/* JADX INFO: renamed from: X.0NL7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NL7 {
    public static C0NL6 LIZ(Integer num) {
        for (C0NL6 c0nl6 : C0NL6.values()) {
            int value = c0nl6.getValue();
            if (num != null && value == num.intValue()) {
                return c0nl6;
            }
        }
        return C0NL6.INVALID;
    }
}
