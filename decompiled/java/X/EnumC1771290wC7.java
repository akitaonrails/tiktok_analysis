package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771290wC7 {
    public static final /* synthetic */ EnumC1771290wC7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771290wC7 ROUTER;
    public static final EnumC1771290wC7 TAB_CLICK;
    public static final EnumC1771290wC7 TAB_TOUCH_DOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1771290wC7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771290wC7 enumC1771290wC7 = new EnumC1771290wC7("ROUTER", 0, "router");
        ROUTER = enumC1771290wC7;
        EnumC1771290wC7 enumC1771290wC72 = new EnumC1771290wC7("TAB_CLICK", 1, "tab_click");
        TAB_CLICK = enumC1771290wC72;
        EnumC1771290wC7 enumC1771290wC73 = new EnumC1771290wC7("TAB_TOUCH_DOWN", 2, "tab_touch_down");
        TAB_TOUCH_DOWN = enumC1771290wC73;
        EnumC1771290wC7[] enumC1771290wC7Arr = {enumC1771290wC7, enumC1771290wC72, enumC1771290wC73};
        LLILLJJLI = enumC1771290wC7Arr;
        LLILLL = new C2254308sP(enumC1771290wC7Arr);
    }

    public static EnumC1771290wC7[] values() {
        return (EnumC1771290wC7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1771290wC7 valueOf(String str) {
        return (EnumC1771290wC7) C08FF.LIZ(EnumC1771290wC7.class, str);
    }

    public EnumC1771290wC7(String str, int i, String str2) {
        this.LL = str2;
    }
}
