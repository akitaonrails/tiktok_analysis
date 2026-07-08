package X;

/* JADX INFO: renamed from: X.0VJY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VJY {
    SPEC_STATUS_SPEC_ON("spec_on"),
    SPEC_STATUS_SPEC_OFF("spec_off"),
    SPEC_STATUS_SPEC_DIST("spec_dist"),
    SPEC_STATUS_RULE_ON("rule_on"),
    SPEC_STATUS_RULE_OFF("rule_off"),
    SPEC_STATUS_RULE_DIST("rule_dist"),
    SPEC_STATUS_RULE_GET("rule_get"),
    SPEC_STATUS_RULE_PARSE("rule_parse"),
    SPEC_STATUS_RULE_RUN("rule_run"),
    SPEC_STATUS_RULE_RESULT("rule_result");

    public final String LL;

    public static C0VJY valueOf(String str) {
        return (C0VJY) C08FF.LIZ(C0VJY.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C0VJY(String str) {
        this.LL = str;
    }
}
