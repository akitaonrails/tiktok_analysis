package X;

/* JADX INFO: renamed from: X.09H5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C09H5 {
    INT("int"),
    STRING("java.lang.String"),
    LONG("long"),
    DOUBLE("double"),
    BOOLEAN("boolean");

    public static final C09H9 Companion = new Object() { // from class: X.09H9
    };
    public String LL;

    public static C09H5 valueOf(String str) {
        return (C09H5) C08FF.LIZ(C09H5.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    public final void setValue(String str) {
        this.LL = str;
    }

    C09H5(String str) {
        this.LL = str;
    }
}
