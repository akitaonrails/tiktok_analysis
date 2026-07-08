package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YG6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YG6 {
    public static final C0YG6 DEMOTED;
    public static final C0YG6 FOUND_IN_DB_WITHOUT_LAST_MSG;
    public static final C0YG6 FOUND_IN_DB_WITH_LAST_MSG;
    public static final /* synthetic */ C0YG6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YG6 MSG_CHECK_INFO_API_FAIL;
    public static final C0YG6 MSG_CHECK_INFO_EMPTY;
    public static final C0YG6 MSG_CHECK_INFO_NON_EMPTY;
    public static final C0YG6 NOT_FOUND_IN_DB;
    public static final C0YG6 REPAIR_FAIL_AT_API_CALL;
    public static final C0YG6 REPAIR_FAIL_AT_DB_INSERT;
    public static final C0YG6 REPAIR_SKIPPED;
    public static final C0YG6 REPAIR_SUCCESS_WITH_MSG;
    public static final C0YG6 REPAIR_SUCCESS_WITH_NO_MSG;
    public static final C0YG6 UNKNOWN;

    public static InterfaceC2044707zh<C0YG6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YG6 c0yg6 = new C0YG6("NOT_FOUND_IN_DB", 0);
        NOT_FOUND_IN_DB = c0yg6;
        C0YG6 c0yg62 = new C0YG6("FOUND_IN_DB_WITH_LAST_MSG", 1);
        FOUND_IN_DB_WITH_LAST_MSG = c0yg62;
        C0YG6 c0yg63 = new C0YG6("FOUND_IN_DB_WITHOUT_LAST_MSG", 2);
        FOUND_IN_DB_WITHOUT_LAST_MSG = c0yg63;
        C0YG6 c0yg64 = new C0YG6("DEMOTED", 3);
        DEMOTED = c0yg64;
        C0YG6 c0yg65 = new C0YG6("MSG_CHECK_INFO_API_FAIL", 4);
        MSG_CHECK_INFO_API_FAIL = c0yg65;
        C0YG6 c0yg66 = new C0YG6("MSG_CHECK_INFO_EMPTY", 5);
        MSG_CHECK_INFO_EMPTY = c0yg66;
        C0YG6 c0yg67 = new C0YG6("MSG_CHECK_INFO_NON_EMPTY", 6);
        MSG_CHECK_INFO_NON_EMPTY = c0yg67;
        C0YG6 c0yg68 = new C0YG6("REPAIR_SKIPPED", 7);
        REPAIR_SKIPPED = c0yg68;
        C0YG6 c0yg69 = new C0YG6("REPAIR_SUCCESS_WITH_MSG", 8);
        REPAIR_SUCCESS_WITH_MSG = c0yg69;
        C0YG6 c0yg610 = new C0YG6("REPAIR_SUCCESS_WITH_NO_MSG", 9);
        REPAIR_SUCCESS_WITH_NO_MSG = c0yg610;
        C0YG6 c0yg611 = new C0YG6("REPAIR_FAIL_AT_API_CALL", 10);
        REPAIR_FAIL_AT_API_CALL = c0yg611;
        C0YG6 c0yg612 = new C0YG6("REPAIR_FAIL_AT_DB_INSERT", 11);
        REPAIR_FAIL_AT_DB_INSERT = c0yg612;
        C0YG6 c0yg613 = new C0YG6("UNKNOWN", 12);
        UNKNOWN = c0yg613;
        C0YG6[] c0yg6Arr = {c0yg6, c0yg62, c0yg63, c0yg64, c0yg65, c0yg66, c0yg67, c0yg68, c0yg69, c0yg610, c0yg611, c0yg612, c0yg613};
        LL = c0yg6Arr;
        LLILLJJLI = new C2254308sP(c0yg6Arr);
    }

    public static C0YG6[] values() {
        return (C0YG6[]) LL.clone();
    }

    public static C0YG6 valueOf(String str) {
        return (C0YG6) C08FF.LIZ(C0YG6.class, str);
    }

    public C0YG6(String str, int i) {
    }
}
