package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768040w6s {
    public static final /* synthetic */ EnumC1768040w6s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768040w6s STAGE_CLICK_TAB;
    public static final EnumC1768040w6s STAGE_CREATE_VIEW_END;
    public static final EnumC1768040w6s STAGE_CREATE_VIEW_START;
    public static final EnumC1768040w6s STAGE_LOAD_DATA;
    public static final EnumC1768040w6s STAGE_SET_DATA_STATE;
    public static final EnumC1768040w6s STAGE_UPDATE_DATA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768040w6s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768040w6s enumC1768040w6s = new EnumC1768040w6s("STAGE_CLICK_TAB", 0, "click_tab");
        STAGE_CLICK_TAB = enumC1768040w6s;
        EnumC1768040w6s enumC1768040w6s2 = new EnumC1768040w6s("STAGE_CREATE_VIEW_START", 1, "create_view_start");
        STAGE_CREATE_VIEW_START = enumC1768040w6s2;
        EnumC1768040w6s enumC1768040w6s3 = new EnumC1768040w6s("STAGE_CREATE_VIEW_END", 2, "create_view_end");
        STAGE_CREATE_VIEW_END = enumC1768040w6s3;
        EnumC1768040w6s enumC1768040w6s4 = new EnumC1768040w6s("STAGE_LOAD_DATA", 3, "load_data");
        STAGE_LOAD_DATA = enumC1768040w6s4;
        EnumC1768040w6s enumC1768040w6s5 = new EnumC1768040w6s("STAGE_SET_DATA_STATE", 4, "set_data_state");
        STAGE_SET_DATA_STATE = enumC1768040w6s5;
        EnumC1768040w6s enumC1768040w6s6 = new EnumC1768040w6s("STAGE_UPDATE_DATA", 5, "update_data");
        STAGE_UPDATE_DATA = enumC1768040w6s6;
        EnumC1768040w6s[] enumC1768040w6sArr = {enumC1768040w6s, enumC1768040w6s2, enumC1768040w6s3, enumC1768040w6s4, enumC1768040w6s5, enumC1768040w6s6};
        LLILLJJLI = enumC1768040w6sArr;
        LLILLL = new C2254308sP(enumC1768040w6sArr);
    }

    public static EnumC1768040w6s[] values() {
        return (EnumC1768040w6s[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC1768040w6s valueOf(String str) {
        return (EnumC1768040w6s) C08FF.LIZ(EnumC1768040w6s.class, str);
    }

    public EnumC1768040w6s(String str, int i, String str2) {
        this.LL = str2;
    }
}
