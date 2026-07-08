package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YSX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSX {
    public static final C0YSX ADD_MEMBER;
    public static final C0YSX CREATE_TEMP;
    public static final C874470YSf Companion;
    public static final C0YSX DISSOLVE_CONVERSATION;
    public static final C0YSX DRAFT_CHANGE;
    public static final C0YSX FETCH_BY_INIT;
    public static final C0YSX FETCH_BY_PREVIEW;
    public static final C0YSX HIDE_CONVERSATION;
    public static final C0YSX LEAVE_CONVERSATION;
    public static final /* synthetic */ C0YSX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YSX LOAD_MEMBER;
    public static final C0YSX LOCAL_EXT_CHANGE;
    public static final C0YSX MANUAL_UPDATE;
    public static final C0YSX MARK_NO_MORE;
    public static final C0YSX MARK_READ;
    public static final C0YSX MSG_UPDATE;
    public static final C0YSX RECREATE_CONVERSATION;
    public static final C0YSX REFRESH_INFO;
    public static final C0YSX REMOVE_MEMBER;
    public static final C0YSX SETTING_INFO_CHANGE;
    public static final C0YSX UNKNOWN;

    public static InterfaceC2044707zh<C0YSX> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0YSf] */
    static {
        C0YSX c0ysx = new C0YSX("UNKNOWN", 0);
        UNKNOWN = c0ysx;
        C0YSX c0ysx2 = new C0YSX("ADD_MEMBER", 1);
        ADD_MEMBER = c0ysx2;
        C0YSX c0ysx3 = new C0YSX("MSG_UPDATE", 2);
        MSG_UPDATE = c0ysx3;
        C0YSX c0ysx4 = new C0YSX("MARK_READ", 3);
        MARK_READ = c0ysx4;
        C0YSX c0ysx5 = new C0YSX("LEAVE_CONVERSATION", 4);
        LEAVE_CONVERSATION = c0ysx5;
        C0YSX c0ysx6 = new C0YSX("REFRESH_INFO", 5);
        REFRESH_INFO = c0ysx6;
        C0YSX c0ysx7 = new C0YSX("CREATE_TEMP", 6);
        CREATE_TEMP = c0ysx7;
        C0YSX c0ysx8 = new C0YSX("LOAD_MEMBER", 7);
        LOAD_MEMBER = c0ysx8;
        C0YSX c0ysx9 = new C0YSX("REMOVE_MEMBER", 8);
        REMOVE_MEMBER = c0ysx9;
        C0YSX c0ysx10 = new C0YSX("DRAFT_CHANGE", 9);
        DRAFT_CHANGE = c0ysx10;
        C0YSX c0ysx11 = new C0YSX("LOCAL_EXT_CHANGE", 10);
        LOCAL_EXT_CHANGE = c0ysx11;
        C0YSX c0ysx12 = new C0YSX("FETCH_BY_INIT", 11);
        FETCH_BY_INIT = c0ysx12;
        C0YSX c0ysx13 = new C0YSX("FETCH_BY_PREVIEW", 12);
        FETCH_BY_PREVIEW = c0ysx13;
        C0YSX c0ysx14 = new C0YSX("HIDE_CONVERSATION", 13);
        HIDE_CONVERSATION = c0ysx14;
        C0YSX c0ysx15 = new C0YSX("RECREATE_CONVERSATION", 14);
        RECREATE_CONVERSATION = c0ysx15;
        C0YSX c0ysx16 = new C0YSX("SETTING_INFO_CHANGE", 15);
        SETTING_INFO_CHANGE = c0ysx16;
        C0YSX c0ysx17 = new C0YSX("DISSOLVE_CONVERSATION", 16);
        DISSOLVE_CONVERSATION = c0ysx17;
        C0YSX c0ysx18 = new C0YSX("MARK_NO_MORE", 17);
        MARK_NO_MORE = c0ysx18;
        C0YSX c0ysx19 = new C0YSX("MANUAL_UPDATE", 18);
        MANUAL_UPDATE = c0ysx19;
        C0YSX[] c0ysxArr = {c0ysx, c0ysx2, c0ysx3, c0ysx4, c0ysx5, c0ysx6, c0ysx7, c0ysx8, c0ysx9, c0ysx10, c0ysx11, c0ysx12, c0ysx13, c0ysx14, c0ysx15, c0ysx16, c0ysx17, c0ysx18, c0ysx19};
        LL = c0ysxArr;
        LLILLJJLI = new C2254308sP(c0ysxArr);
        Companion = new Object() { // from class: X.0YSf
        };
    }

    public static C0YSX[] values() {
        return (C0YSX[]) LL.clone();
    }

    public static C0YSX valueOf(String str) {
        return (C0YSX) C08FF.LIZ(C0YSX.class, str);
    }

    public C0YSX(String str, int i) {
    }
}
