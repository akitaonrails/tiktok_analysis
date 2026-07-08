package X;

/* JADX INFO: renamed from: X.0SAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716870SAb {
    public static C0SAY LIZ(Integer num) {
        for (C0SAY c0say : C0SAY.values()) {
            int value = c0say.getValue();
            if (num != null && value == num.intValue()) {
                return c0say;
            }
        }
        return C0SAY.UNKNOWN;
    }
}
