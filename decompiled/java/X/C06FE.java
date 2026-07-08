package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06FE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06FE {
    public static final C06FE CHAT_TYPE;
    public static final C06FE CONVERSATION_ID;
    public static final C06FE CONVERSATION_TYPE;
    public static final C06FE ENTER_FROM;
    public static final C06FE ERROR_CODE;
    public static final C06FE ERROR_MSG;
    public static final C06FE FROM_USER_ID;
    public static final C06FE IS_EXPIRED;
    public static final C06FE IS_GREY;
    public static final C06FE IS_LOAD_SUCCESS;
    public static final C06FE IS_STORY;
    public static final C06FE LEVEL;
    public static final /* synthetic */ C06FE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06FE LOAD_STAGE;
    public static final C06FE PANEL_TYPE;
    public static final C06FE STREAK_COUNT;
    public static final C06FE STREAK_LEVEL;
    public final String LL;

    public static InterfaceC2044707zh<C06FE> getEntries() {
        return LLILLL;
    }

    static {
        C06FE c06fe = new C06FE("CONVERSATION_ID", 0, "conversation_id");
        CONVERSATION_ID = c06fe;
        C06FE c06fe2 = new C06FE("CONVERSATION_TYPE", 1, "conversation_type");
        CONVERSATION_TYPE = c06fe2;
        C06FE c06fe3 = new C06FE("FROM_USER_ID", 2, "from_user_id");
        FROM_USER_ID = c06fe3;
        C06FE c06fe4 = new C06FE("ENTER_FROM", 3, "enter_from");
        ENTER_FROM = c06fe4;
        C06FE c06fe5 = new C06FE("STREAK_COUNT", 4, "streak_cnt");
        STREAK_COUNT = c06fe5;
        C06FE c06fe6 = new C06FE("STREAK_LEVEL", 5, "streak_level");
        STREAK_LEVEL = c06fe6;
        C06FE c06fe7 = new C06FE("CHAT_TYPE", 6, "chat_type");
        CHAT_TYPE = c06fe7;
        C06FE c06fe8 = new C06FE("IS_GREY", 7, "is_grey");
        IS_GREY = c06fe8;
        C06FE c06fe9 = new C06FE("IS_EXPIRED", 8, "is_expired");
        IS_EXPIRED = c06fe9;
        C06FE c06fe10 = new C06FE("PANEL_TYPE", 9, "panel_type");
        PANEL_TYPE = c06fe10;
        C06FE c06fe11 = new C06FE("LOAD_STAGE", 10, "load_stage");
        LOAD_STAGE = c06fe11;
        C06FE c06fe12 = new C06FE("IS_LOAD_SUCCESS", 11, "is_load_success");
        IS_LOAD_SUCCESS = c06fe12;
        C06FE c06fe13 = new C06FE("ERROR_CODE", 12, "error_code");
        ERROR_CODE = c06fe13;
        C06FE c06fe14 = new C06FE("ERROR_MSG", 13, "error_msg");
        ERROR_MSG = c06fe14;
        C06FE c06fe15 = new C06FE("LEVEL", 14, "streak_level");
        LEVEL = c06fe15;
        C06FE c06fe16 = new C06FE("IS_STORY", 15, "is_story");
        IS_STORY = c06fe16;
        C06FE[] c06feArr = {c06fe, c06fe2, c06fe3, c06fe4, c06fe5, c06fe6, c06fe7, c06fe8, c06fe9, c06fe10, c06fe11, c06fe12, c06fe13, c06fe14, c06fe15, c06fe16};
        LLILLJJLI = c06feArr;
        LLILLL = new C2254308sP(c06feArr);
    }

    public static C06FE[] values() {
        return (C06FE[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06FE valueOf(String str) {
        return (C06FE) C08FF.LIZ(C06FE.class, str);
    }

    public C06FE(String str, int i, String str2) {
        this.LL = str2;
    }
}
