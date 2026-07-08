package X;

/* JADX INFO: renamed from: X.0NKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C592240NKs {
    public static C0NLF LIZ(Integer num) {
        for (C0NLF c0nlf : C0NLF.values()) {
            int value = c0nlf.getValue();
            if (num != null && value == num.intValue()) {
                return c0nlf;
            }
        }
        return C0NLF.INVALID;
    }
}
