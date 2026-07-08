package X;

/* JADX INFO: renamed from: X.0NDD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public enum C0NDD {
    DEFAULT("default"),
    PRE_SCHEDULE("pre_schedule"),
    SOLARIA("solaria");

    public String source;

    public static C0NDD fromString(String str) {
        str.getClass();
        if (!str.equals("solaria")) {
            if (!str.equals("pre_schedule")) {
                return DEFAULT;
            }
            return PRE_SCHEDULE;
        }
        return SOLARIA;
    }

    public static C0NDD valueOf(String str) {
        return (C0NDD) C08FF.LIZ(C0NDD.class, str);
    }

    C0NDD(String str) {
        this.source = str;
    }
}
