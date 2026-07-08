package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1576680r8E {
    public static final /* synthetic */ EnumC1576680r8E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1576680r8E LOAD_DATA_FAIL;
    public static final EnumC1576680r8E LOAD_DATA_MIX_PAGE_FAIL;
    public static final EnumC1576680r8E LOAD_DATA_MIX_PAGE_START;
    public static final EnumC1576680r8E LOAD_DATA_MIX_PAGE_SUCCESS;
    public static final EnumC1576680r8E LOAD_DATA_START;
    public static final EnumC1576680r8E LOAD_DATA_SUCCESS;
    public static final EnumC1576680r8E ON_CLICK_ENTER;
    public static final EnumC1576680r8E ON_CREATE_DF_START;
    public static final EnumC1576680r8E ON_CREATE_START;
    public static final EnumC1576680r8E ON_PAGE_HIDE;
    public static final EnumC1576680r8E VIDEO_FIRST_FRAME;
    public static final EnumC1576680r8E VIDEO_FIRST_FRAME_FAIL;
    public static final EnumC1576680r8E VIEW_FIRST_FRAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1576680r8E> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1576680r8E enumC1576680r8E = new EnumC1576680r8E("ON_CLICK_ENTER", 0, "on_click_enter");
        ON_CLICK_ENTER = enumC1576680r8E;
        EnumC1576680r8E enumC1576680r8E2 = new EnumC1576680r8E("ON_CREATE_DF_START", 1, "on_create_df_start");
        ON_CREATE_DF_START = enumC1576680r8E2;
        EnumC1576680r8E enumC1576680r8E3 = new EnumC1576680r8E("ON_CREATE_START", 2, "on_create_start");
        ON_CREATE_START = enumC1576680r8E3;
        EnumC1576680r8E enumC1576680r8E4 = new EnumC1576680r8E("ON_PAGE_HIDE", 3, "on_page_hide");
        ON_PAGE_HIDE = enumC1576680r8E4;
        EnumC1576680r8E enumC1576680r8E5 = new EnumC1576680r8E("LOAD_DATA_START", 4, "load_data_start");
        LOAD_DATA_START = enumC1576680r8E5;
        EnumC1576680r8E enumC1576680r8E6 = new EnumC1576680r8E("LOAD_DATA_FAIL", 5, "load_data_fail");
        LOAD_DATA_FAIL = enumC1576680r8E6;
        EnumC1576680r8E enumC1576680r8E7 = new EnumC1576680r8E("LOAD_DATA_SUCCESS", 6, "load_data_success");
        LOAD_DATA_SUCCESS = enumC1576680r8E7;
        EnumC1576680r8E enumC1576680r8E8 = new EnumC1576680r8E("LOAD_DATA_MIX_PAGE_START", 7, "load_data_mix_page_start");
        LOAD_DATA_MIX_PAGE_START = enumC1576680r8E8;
        EnumC1576680r8E enumC1576680r8E9 = new EnumC1576680r8E("LOAD_DATA_MIX_PAGE_FAIL", 8, "load_data_mix_page_fail");
        LOAD_DATA_MIX_PAGE_FAIL = enumC1576680r8E9;
        EnumC1576680r8E enumC1576680r8E10 = new EnumC1576680r8E("LOAD_DATA_MIX_PAGE_SUCCESS", 9, "load_data_mix_page_success");
        LOAD_DATA_MIX_PAGE_SUCCESS = enumC1576680r8E10;
        EnumC1576680r8E enumC1576680r8E11 = new EnumC1576680r8E("VIEW_FIRST_FRAME", 10, "view_first_frame");
        VIEW_FIRST_FRAME = enumC1576680r8E11;
        EnumC1576680r8E enumC1576680r8E12 = new EnumC1576680r8E("VIDEO_FIRST_FRAME", 11, "video_first_frame");
        VIDEO_FIRST_FRAME = enumC1576680r8E12;
        EnumC1576680r8E enumC1576680r8E13 = new EnumC1576680r8E("VIDEO_FIRST_FRAME_FAIL", 12, "video_first_frame_fail");
        VIDEO_FIRST_FRAME_FAIL = enumC1576680r8E13;
        EnumC1576680r8E[] enumC1576680r8EArr = {enumC1576680r8E, enumC1576680r8E2, enumC1576680r8E3, enumC1576680r8E4, enumC1576680r8E5, enumC1576680r8E6, enumC1576680r8E7, enumC1576680r8E8, enumC1576680r8E9, enumC1576680r8E10, enumC1576680r8E11, enumC1576680r8E12, enumC1576680r8E13};
        LLILLJJLI = enumC1576680r8EArr;
        LLILLL = new C2254308sP(enumC1576680r8EArr);
    }

    public static EnumC1576680r8E[] values() {
        return (EnumC1576680r8E[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1576680r8E valueOf(String str) {
        return (EnumC1576680r8E) C08FF.LIZ(EnumC1576680r8E.class, str);
    }

    public EnumC1576680r8E(String str, int i, String str2) {
        this.LL = str2;
    }
}
