package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1325870kbh {
    public static final EnumC1325870kbh ACTION_ERROR;
    public static final EnumC1325870kbh ASSERT;
    public static final EnumC1325870kbh CUSTOM_ERROR;
    public static final EnumC1325870kbh EXPRESSION_ERROR;
    public static final EnumC1325870kbh LAYOUT_INVALID;
    public static final /* synthetic */ EnumC1325870kbh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1325870kbh PARAMS_INVALID;
    public static final EnumC1325870kbh PRELOAD_ERROR;
    public static final EnumC1325870kbh RENDER_ERROR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1325870kbh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1325870kbh enumC1325870kbh = new EnumC1325870kbh("RENDER_ERROR", 0, "RENDER_ERROR");
        RENDER_ERROR = enumC1325870kbh;
        EnumC1325870kbh enumC1325870kbh2 = new EnumC1325870kbh("EXPRESSION_ERROR", 1, "EXPRESSION_ERROR");
        EXPRESSION_ERROR = enumC1325870kbh2;
        EnumC1325870kbh enumC1325870kbh3 = new EnumC1325870kbh("LAYOUT_INVALID", 2, "LAYOUT_INVALID");
        LAYOUT_INVALID = enumC1325870kbh3;
        EnumC1325870kbh enumC1325870kbh4 = new EnumC1325870kbh("ACTION_ERROR", 3, "ACTION_ERROR");
        ACTION_ERROR = enumC1325870kbh4;
        EnumC1325870kbh enumC1325870kbh5 = new EnumC1325870kbh("PARAMS_INVALID", 4, "PARAMS_INVALID");
        PARAMS_INVALID = enumC1325870kbh5;
        EnumC1325870kbh enumC1325870kbh6 = new EnumC1325870kbh("ASSERT", 5, "ASSERT");
        ASSERT = enumC1325870kbh6;
        EnumC1325870kbh enumC1325870kbh7 = new EnumC1325870kbh("CUSTOM_ERROR", 6, "CUSTOM_ERROR");
        CUSTOM_ERROR = enumC1325870kbh7;
        EnumC1325870kbh enumC1325870kbh8 = new EnumC1325870kbh("PRELOAD_ERROR", 7, "PRELOAD_ERROR");
        PRELOAD_ERROR = enumC1325870kbh8;
        EnumC1325870kbh[] enumC1325870kbhArr = {enumC1325870kbh, enumC1325870kbh2, enumC1325870kbh3, enumC1325870kbh4, enumC1325870kbh5, enumC1325870kbh6, enumC1325870kbh7, enumC1325870kbh8};
        LLILLJJLI = enumC1325870kbhArr;
        LLILLL = new C2254308sP(enumC1325870kbhArr);
    }

    public static EnumC1325870kbh[] values() {
        return (EnumC1325870kbh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1325870kbh valueOf(String str) {
        return (EnumC1325870kbh) C08FF.LIZ(EnumC1325870kbh.class, str);
    }

    public EnumC1325870kbh(String str, int i, String str2) {
        this.LL = str2;
    }
}
