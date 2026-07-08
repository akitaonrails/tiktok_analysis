package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009N {
    public static final C009N END_ZIP_IMAGE;
    public static final C009N FINISH_IMAGE_LOAD;
    public static final C009N GENERATE_IN_VM;
    public static final C009N GET_BITMAP_END;
    public static final /* synthetic */ C009N[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C009N OPEN_SEARCH_ACTIVITY_FINISH;
    public static final C009N OPEN_VISUAL_RESULT_PAGE;
    public static final C009N SEND_DATA_TO_FRAGMENT;
    public static final C009N SEND_DATA_TO_VM;
    public static final C009N START_DATA_PROCESS;
    public static final C009N START_IMAGE_LOAD;
    public static final C009N START_NETWORK;
    public static final C009N START_OPEN_SEARCH_ACTIVITY;
    public static final C009N START_PARSE_MODEL;
    public static final C009N START_SESSION;
    public static final C009N START_UI_RENDER;
    public static final C009N START_ZIP_IMAGE;
    public static final C009N SWITCH_THREAD_TO_MAIN;
    public static final C009N TAG_VALID_CHECK_END;
    public static final C009N TAG_VALID_CHECK_START;
    public static final C009N UPDATE_IMAGE_PRELOAD_STATUS;
    public static final C009N UPDATE_PREFETCH_STATUS;
    public final String LL;

    public static InterfaceC2044707zh<C009N> getEntries() {
        return LLILLL;
    }

    static {
        C009N c009n = new C009N("START_SESSION", 0, "start_session");
        START_SESSION = c009n;
        C009N c009n2 = new C009N("GET_BITMAP_END", 1, "get_bitmap_end");
        GET_BITMAP_END = c009n2;
        C009N c009n3 = new C009N("START_OPEN_SEARCH_ACTIVITY", 2, "start_open_search_activity");
        START_OPEN_SEARCH_ACTIVITY = c009n3;
        C009N c009n4 = new C009N("OPEN_SEARCH_ACTIVITY_FINISH", 3, "open_search_activity_finish");
        OPEN_SEARCH_ACTIVITY_FINISH = c009n4;
        C009N c009n5 = new C009N("START_IMAGE_LOAD", 4, "start_image_load");
        START_IMAGE_LOAD = c009n5;
        C009N c009n6 = new C009N("FINISH_IMAGE_LOAD", 5, "finish_image_load");
        FINISH_IMAGE_LOAD = c009n6;
        C009N c009n7 = new C009N("START_ZIP_IMAGE", 6, "start_zip_image");
        START_ZIP_IMAGE = c009n7;
        C009N c009n8 = new C009N("END_ZIP_IMAGE", 7, "end_zip_image");
        END_ZIP_IMAGE = c009n8;
        C009N c009n9 = new C009N("START_NETWORK", 8, "start_network");
        START_NETWORK = c009n9;
        C009N c009n10 = new C009N("UPDATE_PREFETCH_STATUS", 9, "update_prefetch_status");
        UPDATE_PREFETCH_STATUS = c009n10;
        C009N c009n11 = new C009N("UPDATE_IMAGE_PRELOAD_STATUS", 10, "update_image_preload_status");
        UPDATE_IMAGE_PRELOAD_STATUS = c009n11;
        C009N c009n12 = new C009N("START_PARSE_MODEL", 11, "start_parse_model");
        START_PARSE_MODEL = c009n12;
        C009N c009n13 = new C009N("START_DATA_PROCESS", 12, "start_data_process");
        START_DATA_PROCESS = c009n13;
        C009N c009n14 = new C009N("SWITCH_THREAD_TO_MAIN", 13, "switch_thread_to_main");
        SWITCH_THREAD_TO_MAIN = c009n14;
        C009N c009n15 = new C009N("SEND_DATA_TO_VM", 14, "send_data_to_vm");
        SEND_DATA_TO_VM = c009n15;
        C009N c009n16 = new C009N("GENERATE_IN_VM", 15, "generate_in_vm");
        GENERATE_IN_VM = c009n16;
        C009N c009n17 = new C009N("SEND_DATA_TO_FRAGMENT", 16, "send_data_to_fragment");
        SEND_DATA_TO_FRAGMENT = c009n17;
        C009N c009n18 = new C009N("START_UI_RENDER", 17, "start_ui_render");
        START_UI_RENDER = c009n18;
        C009N c009n19 = new C009N("OPEN_VISUAL_RESULT_PAGE", 18, "open_visual_result_page");
        OPEN_VISUAL_RESULT_PAGE = c009n19;
        C009N c009n20 = new C009N("TAG_VALID_CHECK_START", 19, "tag_valid_check");
        TAG_VALID_CHECK_START = c009n20;
        C009N c009n21 = new C009N("TAG_VALID_CHECK_END", 20, "tag_valid_check");
        TAG_VALID_CHECK_END = c009n21;
        C009N[] c009nArr = {c009n, c009n2, c009n3, c009n4, c009n5, c009n6, c009n7, c009n8, c009n9, c009n10, c009n11, c009n12, c009n13, c009n14, c009n15, c009n16, c009n17, c009n18, c009n19, c009n20, c009n21};
        LLILLJJLI = c009nArr;
        LLILLL = new C2254308sP(c009nArr);
    }

    public static C009N[] values() {
        return (C009N[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C009N valueOf(String str) {
        return (C009N) C08FF.LIZ(C009N.class, str);
    }

    public C009N(String str, int i, String str2) {
        this.LL = str2;
    }
}
