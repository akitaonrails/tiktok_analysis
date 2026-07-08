package X;

/* JADX INFO: renamed from: X.163x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207143163x {
    public static C163T LIZ(Integer num) {
        for (C163T c163t : C163T.values()) {
            int value = c163t.getValue();
            if (num != null && value == num.intValue()) {
                return c163t;
            }
        }
        return null;
    }
}
