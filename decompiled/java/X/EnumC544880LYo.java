package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC544880LYo {
    public static final EnumC544880LYo DIRECT_CLICK;
    public static final EnumC544880LYo EXIT_BUTTON;
    public static final /* synthetic */ EnumC544880LYo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC544880LYo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC544880LYo enumC544880LYo = new EnumC544880LYo("DIRECT_CLICK", 0, "direct_click");
        DIRECT_CLICK = enumC544880LYo;
        EnumC544880LYo enumC544880LYo2 = new EnumC544880LYo("EXIT_BUTTON", 1, "exit_button");
        EXIT_BUTTON = enumC544880LYo2;
        EnumC544880LYo[] enumC544880LYoArr = {enumC544880LYo, enumC544880LYo2};
        LLILLJJLI = enumC544880LYoArr;
        LLILLL = new C2254308sP(enumC544880LYoArr);
    }

    public static EnumC544880LYo[] values() {
        return (EnumC544880LYo[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC544880LYo valueOf(String str) {
        return (EnumC544880LYo) C08FF.LIZ(EnumC544880LYo.class, str);
    }

    public EnumC544880LYo(String str, int i, String str2) {
        this.LL = str2;
    }
}
