package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y71, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y71 implements C0Y73 {
    public static final C0Y71 CMD_MSG_NOT_HANDLED;
    public static final C0Y71 EMPTY_MSG_BODY;
    public static final C0Y71 INSERT_MSG_INTO_DB_FAIL;
    public static final /* synthetic */ C0Y71[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Y71 MISSING_ENTITY;
    public static final C0Y71 MSG_NOT_ENABLED;
    public static final C0Y71 UPDATE_MSG_IN_DB_FAIL;

    public static InterfaceC2044707zh<C0Y71> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Y71 c0y71 = new C0Y71("EMPTY_MSG_BODY", 0);
        EMPTY_MSG_BODY = c0y71;
        C0Y71 c0y712 = new C0Y71("MSG_NOT_ENABLED", 1);
        MSG_NOT_ENABLED = c0y712;
        C0Y71 c0y713 = new C0Y71("CMD_MSG_NOT_HANDLED", 2);
        CMD_MSG_NOT_HANDLED = c0y713;
        C0Y71 c0y714 = new C0Y71("MISSING_ENTITY", 3);
        MISSING_ENTITY = c0y714;
        C0Y71 c0y715 = new C0Y71("INSERT_MSG_INTO_DB_FAIL", 4);
        INSERT_MSG_INTO_DB_FAIL = c0y715;
        C0Y71 c0y716 = new C0Y71("UPDATE_MSG_IN_DB_FAIL", 5);
        UPDATE_MSG_IN_DB_FAIL = c0y716;
        C0Y71[] c0y71Arr = {c0y71, c0y712, c0y713, c0y714, c0y715, c0y716};
        LL = c0y71Arr;
        LLILLJJLI = new C2254308sP(c0y71Arr);
    }

    public static C0Y71[] values() {
        return (C0Y71[]) LL.clone();
    }

    public static C0Y71 valueOf(String str) {
        return (C0Y71) C08FF.LIZ(C0Y71.class, str);
    }

    public C0Y71(String str, int i) {
    }
}
