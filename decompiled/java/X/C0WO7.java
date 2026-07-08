package X;

/* JADX INFO: renamed from: X.0WO7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WO7 {
    In("in"),
    Equal("equals"),
    Contains("contains"),
    StartWith("startsWith"),
    EndWith("endsWith"),
    UNKNOWN("unknown");

    public static final C0WOB Companion = new Object() { // from class: X.0WOB
    };
    public final String LL;

    public static C0WO7 valueOf(String str) {
        return (C0WO7) C08FF.LIZ(C0WO7.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C0WO7(String str) {
        this.LL = str;
    }
}
