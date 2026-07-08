package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905820zh6 {
    public static final EnumC1905820zh6 CLICK_CLOSE;
    public static final EnumC1905820zh6 CLICK_TOOLTIPS;
    public static final EnumC1905820zh6 CLICK_TOOLTIPS_POSITION;
    public static final /* synthetic */ EnumC1905820zh6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1905820zh6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1905820zh6 enumC1905820zh6 = new EnumC1905820zh6("CLICK_TOOLTIPS", 0, "click_tooltips");
        CLICK_TOOLTIPS = enumC1905820zh6;
        EnumC1905820zh6 enumC1905820zh62 = new EnumC1905820zh6("CLICK_TOOLTIPS_POSITION", 1, "click_tooltips_position");
        CLICK_TOOLTIPS_POSITION = enumC1905820zh62;
        EnumC1905820zh6 enumC1905820zh63 = new EnumC1905820zh6("CLICK_CLOSE", 2, "click_close");
        CLICK_CLOSE = enumC1905820zh63;
        EnumC1905820zh6[] enumC1905820zh6Arr = {enumC1905820zh6, enumC1905820zh62, enumC1905820zh63};
        LLILLJJLI = enumC1905820zh6Arr;
        LLILLL = new C2254308sP(enumC1905820zh6Arr);
    }

    public static EnumC1905820zh6[] values() {
        return (EnumC1905820zh6[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1905820zh6 valueOf(String str) {
        return (EnumC1905820zh6) C08FF.LIZ(EnumC1905820zh6.class, str);
    }

    public EnumC1905820zh6(String str, int i, String str2) {
        this.LL = str2;
    }
}
