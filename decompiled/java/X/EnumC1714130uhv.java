package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1714130uhv {
    public static final EnumC1714130uhv LLILLJJLI;
    public static final EnumC1714130uhv LLILLL;
    public static final EnumC1714130uhv LLILZ;
    public static final EnumC1714130uhv LLILZIL;
    public static final EnumC1714130uhv LLILZLL;
    public static final EnumC1714130uhv LLIZ;
    public static final EnumC1714130uhv LLIZLLLIL;
    public static final EnumC1714130uhv LLJ;
    public static final /* synthetic */ EnumC1714130uhv[] LLJI;
    public final String LL;

    static {
        EnumC1714130uhv enumC1714130uhv = new EnumC1714130uhv("RENDER", 0, "render");
        LLILLJJLI = enumC1714130uhv;
        EnumC1714130uhv enumC1714130uhv2 = new EnumC1714130uhv("FIRST_INPUT", 1, "first_input");
        LLILLL = enumC1714130uhv2;
        EnumC1714130uhv enumC1714130uhv3 = new EnumC1714130uhv("INPUTTING", 2, "inputting");
        LLILZ = enumC1714130uhv3;
        EnumC1714130uhv enumC1714130uhv4 = new EnumC1714130uhv("NETWORK", 3, "network");
        LLILZIL = enumC1714130uhv4;
        EnumC1714130uhv enumC1714130uhv5 = new EnumC1714130uhv("ERROR_STAY", 4, "error_stay");
        LLILZLL = enumC1714130uhv5;
        EnumC1714130uhv enumC1714130uhv6 = new EnumC1714130uhv("FORGOT_PIN", 5, "forgot_pin");
        LLIZ = enumC1714130uhv6;
        EnumC1714130uhv enumC1714130uhv7 = new EnumC1714130uhv("BACKGROUND", 6, "background");
        LLIZLLLIL = enumC1714130uhv7;
        EnumC1714130uhv enumC1714130uhv8 = new EnumC1714130uhv("EXIT_IDLE", 7, "exit_idle");
        LLJ = enumC1714130uhv8;
        EnumC1714130uhv[] enumC1714130uhvArr = {enumC1714130uhv, enumC1714130uhv2, enumC1714130uhv3, enumC1714130uhv4, enumC1714130uhv5, enumC1714130uhv6, enumC1714130uhv7, enumC1714130uhv8};
        LLJI = enumC1714130uhvArr;
        new C2254308sP(enumC1714130uhvArr);
    }

    public static EnumC1714130uhv[] values() {
        return (EnumC1714130uhv[]) LLJI.clone();
    }

    public static EnumC1714130uhv valueOf(String str) {
        return (EnumC1714130uhv) C08FF.LIZ(EnumC1714130uhv.class, str);
    }

    public EnumC1714130uhv(String str, int i, String str2) {
        this.LL = str2;
    }
}
