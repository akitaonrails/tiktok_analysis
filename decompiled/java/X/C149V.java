package X;

/* JADX INFO: renamed from: X.149V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C149V {
    VERIFY_POP_CONFLICT_ERROR(1001),
    VERIFY_POP_INVALID_PARAMS_ERROR(1002),
    VERIFY_POP_CHECK_REQUEST_ERROR(1005),
    VERIFY_POP_NOT_SUPPORT_ERROR(1006),
    VERIFY_POP_SYSTEM_TOO_LOW(1007),
    VERIFY_POP_TOO_FREQUENT(1008),
    VERIFY_POP_RISK_INFO_ERROR(1009),
    VERIFY_POP_MISMATCH_TYPE_ERROR(1010),
    VERIFY_POP_BEFORE_PAGE_LOAD_RETURN_ERROR(1011),
    VERIFY_POP_AFTER_PAGE_LOAD_RETURN_ERROR(1012),
    VERIFY_POP_DUP_VERIFY_OVER_COUNT(1013),
    VERIFY_POP_DUP_VERIFY_WAIT(1014),
    VERIFY_POP_LOGIN_FAIL(1015);

    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public static C149V valueOf(String str) {
        return (C149V) C08FF.LIZ(C149V.class, str);
    }

    C149V(int i) {
        this.LL = i;
    }
}
