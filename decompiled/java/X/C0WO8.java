package X;

/* JADX INFO: renamed from: X.0WO8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WO8 {
    AND("and"),
    OR("or"),
    NOT("not"),
    UNKNOWN("unknown");

    public static final C0WOA Companion = new Object() { // from class: X.0WOA
    };
    public final String LL;

    public static C0WO8 valueOf(String str) {
        return (C0WO8) C08FF.LIZ(C0WO8.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C0WO8(String str) {
        this.LL = str;
    }
}
