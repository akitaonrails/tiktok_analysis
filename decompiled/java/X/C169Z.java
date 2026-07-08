package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.169Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C169Z {
    public static final C169Z BETTER_PERFORMANCE_TASK;
    public static final C169Z COMMON_LEAVE_NEW_PAGE_TASK;
    public static final C169Z COMMON_OPEN_NEW_PAGE_TASK;
    public static final C169Z COMMON_SCROLL_OPT_END_TASK;
    public static final C169Z COMMON_SCROLL_OPT_START_TASK;
    public static final C169Z ENTER_CHAT_CORRECTNESS_MONITOR_TASK;
    public static final C169Z ENTER_CHAT_PAGE_DOWNGRADE_LEGO_TASK;
    public static final C169Z ENTER_CHAT_PAGE_PRELOAD_MESSAGE_MODEL;
    public static final C169Z ENTER_INBOX_ACTOR_THREAD_OPT_TASK;
    public static final C169Z ENTER_INBOX_CORRECTNESS_MONITOR_TASK;
    public static final C169Z ENTER_INBOX_DOWNGRADE_LEGO_TASK;
    public static final C169Z ENTER_INBOX_START_CLIENT_AI;
    public static final C169Z LEAVE_CHAT_PAGE_RECOVER_LEGO_TASK;
    public static final C169Z LEAVE_INBOX_ACTOR_THREAD_OPT_TASK;
    public static final C169Z LEAVE_INBOX_RECOVER_LEGO_TASK;
    public static final C169Z LEAVE_INBOX_STOP_CLIENT_AI;
    public static final /* synthetic */ C169Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C169Z SCP_REQUEST_TASK;
    public static final C169Z START_UP_STATE_ID;
    public static final C169Z WS_STATE_CHANGE_TASK;
    public final String LL;

    public static InterfaceC2044707zh<C169Z> getEntries() {
        return LLILLL;
    }

    static {
        C169Z c169z = new C169Z("COMMON_SCROLL_OPT_START_TASK", 0, "common_scroll_opt_start_task");
        COMMON_SCROLL_OPT_START_TASK = c169z;
        C169Z c169z2 = new C169Z("COMMON_SCROLL_OPT_END_TASK", 1, "common_scroll_opt_end_task");
        COMMON_SCROLL_OPT_END_TASK = c169z2;
        C169Z c169z3 = new C169Z("COMMON_OPEN_NEW_PAGE_TASK", 2, "common_open_new_page_task");
        COMMON_OPEN_NEW_PAGE_TASK = c169z3;
        C169Z c169z4 = new C169Z("COMMON_LEAVE_NEW_PAGE_TASK", 3, "common_leave_new_page_task");
        COMMON_LEAVE_NEW_PAGE_TASK = c169z4;
        C169Z c169z5 = new C169Z("ENTER_INBOX_DOWNGRADE_LEGO_TASK", 4, "enter_inbox_downgrade_lego_task");
        ENTER_INBOX_DOWNGRADE_LEGO_TASK = c169z5;
        C169Z c169z6 = new C169Z("LEAVE_INBOX_RECOVER_LEGO_TASK", 5, "leave_inbox_recover_lego_task");
        LEAVE_INBOX_RECOVER_LEGO_TASK = c169z6;
        C169Z c169z7 = new C169Z("ENTER_INBOX_ACTOR_THREAD_OPT_TASK", 6, "enter_inbox_actor_thread_opt_task");
        ENTER_INBOX_ACTOR_THREAD_OPT_TASK = c169z7;
        C169Z c169z8 = new C169Z("LEAVE_INBOX_ACTOR_THREAD_OPT_TASK", 7, "leave_inbox_actor_thread_opt_task");
        LEAVE_INBOX_ACTOR_THREAD_OPT_TASK = c169z8;
        C169Z c169z9 = new C169Z("ENTER_CHAT_PAGE_DOWNGRADE_LEGO_TASK", 8, "enter_chat_page_downgrade_lego_task");
        ENTER_CHAT_PAGE_DOWNGRADE_LEGO_TASK = c169z9;
        C169Z c169z10 = new C169Z("LEAVE_CHAT_PAGE_RECOVER_LEGO_TASK", 9, "leave_chat_page_recover_lego_task");
        LEAVE_CHAT_PAGE_RECOVER_LEGO_TASK = c169z10;
        C169Z c169z11 = new C169Z("START_UP_STATE_ID", 10, "start_up_state_id");
        START_UP_STATE_ID = c169z11;
        C169Z c169z12 = new C169Z("SCP_REQUEST_TASK", 11, "scp_request_task");
        SCP_REQUEST_TASK = c169z12;
        C169Z c169z13 = new C169Z("WS_STATE_CHANGE_TASK", 12, "ws_state_change_task");
        WS_STATE_CHANGE_TASK = c169z13;
        C169Z c169z14 = new C169Z("BETTER_PERFORMANCE_TASK", 13, "better_performance_task");
        BETTER_PERFORMANCE_TASK = c169z14;
        C169Z c169z15 = new C169Z("ENTER_CHAT_CORRECTNESS_MONITOR_TASK", 14, "enter_chat_correctness_monitor_task");
        ENTER_CHAT_CORRECTNESS_MONITOR_TASK = c169z15;
        C169Z c169z16 = new C169Z("ENTER_INBOX_CORRECTNESS_MONITOR_TASK", 15, "enter_inbox_correctness_monitor_task");
        ENTER_INBOX_CORRECTNESS_MONITOR_TASK = c169z16;
        C169Z c169z17 = new C169Z("ENTER_CHAT_PAGE_PRELOAD_MESSAGE_MODEL", 16, "enter_chat_page_preload_message_model");
        ENTER_CHAT_PAGE_PRELOAD_MESSAGE_MODEL = c169z17;
        C169Z c169z18 = new C169Z("ENTER_INBOX_START_CLIENT_AI", 17, "enter_inbox_start_client_ai");
        ENTER_INBOX_START_CLIENT_AI = c169z18;
        C169Z c169z19 = new C169Z("LEAVE_INBOX_STOP_CLIENT_AI", 18, "leave_inbox_stop_client_ai");
        LEAVE_INBOX_STOP_CLIENT_AI = c169z19;
        C169Z[] c169zArr = {c169z, c169z2, c169z3, c169z4, c169z5, c169z6, c169z7, c169z8, c169z9, c169z10, c169z11, c169z12, c169z13, c169z14, c169z15, c169z16, c169z17, c169z18, c169z19};
        LLILLJJLI = c169zArr;
        LLILLL = new C2254308sP(c169zArr);
    }

    public static C169Z[] values() {
        return (C169Z[]) LLILLJJLI.clone();
    }

    public final String getTaskId() {
        return this.LL;
    }

    public static C169Z valueOf(String str) {
        return (C169Z) C08FF.LIZ(C169Z.class, str);
    }

    public C169Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
