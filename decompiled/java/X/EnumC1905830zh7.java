package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905830zh7 {
    public static final EnumC1905830zh7 BEYOND_TIME_LIMIT;
    public static final EnumC1905830zh7 CLICK_CLOSE;
    public static final EnumC1905830zh7 CLICK_TOOLTIPS;
    public static final EnumC1905830zh7 CLICK_TOOLTIPS_POSITION;
    public static final /* synthetic */ EnumC1905830zh7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1905830zh7 OTHER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1905830zh7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1905830zh7 enumC1905830zh7 = new EnumC1905830zh7("CLICK_TOOLTIPS", 0, "click_tooltips");
        CLICK_TOOLTIPS = enumC1905830zh7;
        EnumC1905830zh7 enumC1905830zh72 = new EnumC1905830zh7("CLICK_TOOLTIPS_POSITION", 1, "click_tooltips_position");
        CLICK_TOOLTIPS_POSITION = enumC1905830zh72;
        EnumC1905830zh7 enumC1905830zh73 = new EnumC1905830zh7("BEYOND_TIME_LIMIT", 2, "beyond_time_limit");
        BEYOND_TIME_LIMIT = enumC1905830zh73;
        EnumC1905830zh7 enumC1905830zh74 = new EnumC1905830zh7("CLICK_CLOSE", 3, "click_close");
        CLICK_CLOSE = enumC1905830zh74;
        EnumC1905830zh7 enumC1905830zh75 = new EnumC1905830zh7("OTHER", 4, "other");
        OTHER = enumC1905830zh75;
        EnumC1905830zh7[] enumC1905830zh7Arr = {enumC1905830zh7, enumC1905830zh72, enumC1905830zh73, enumC1905830zh74, enumC1905830zh75};
        LLILLJJLI = enumC1905830zh7Arr;
        LLILLL = new C2254308sP(enumC1905830zh7Arr);
    }

    public static EnumC1905830zh7[] values() {
        return (EnumC1905830zh7[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1905830zh7 valueOf(String str) {
        return (EnumC1905830zh7) C08FF.LIZ(EnumC1905830zh7.class, str);
    }

    public EnumC1905830zh7(String str, int i, String str2) {
        this.LL = str2;
    }
}
