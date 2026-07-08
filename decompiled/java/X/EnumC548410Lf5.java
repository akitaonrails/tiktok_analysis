package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC548410Lf5 {
    public static final /* synthetic */ EnumC548410Lf5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC548410Lf5 PLUGIN_MISSING;
    public static final EnumC548410Lf5 USER_CLICK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC548410Lf5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC548410Lf5 enumC548410Lf5 = new EnumC548410Lf5("USER_CLICK", 0, "user_click");
        USER_CLICK = enumC548410Lf5;
        EnumC548410Lf5 enumC548410Lf52 = new EnumC548410Lf5("PLUGIN_MISSING", 1, "plugin_missing");
        PLUGIN_MISSING = enumC548410Lf52;
        EnumC548410Lf5[] enumC548410Lf5Arr = {enumC548410Lf5, enumC548410Lf52};
        LLILLJJLI = enumC548410Lf5Arr;
        LLILLL = new C2254308sP(enumC548410Lf5Arr);
    }

    public static EnumC548410Lf5[] values() {
        return (EnumC548410Lf5[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC548410Lf5 valueOf(String str) {
        return (EnumC548410Lf5) C08FF.LIZ(EnumC548410Lf5.class, str);
    }

    public EnumC548410Lf5(String str, int i, String str2) {
        this.LL = str2;
    }
}
