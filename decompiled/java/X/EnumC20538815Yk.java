package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20538815Yk {
    public static final C15Z6 Companion;
    public static final EnumC20538815Yk DAILY_SCREEN_TIME;
    public static final EnumC20538815Yk DISMISS;
    public static final /* synthetic */ EnumC20538815Yk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20538815Yk LYNX_OVERLAY;
    public static final EnumC20538815Yk MEDITATION_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20538815Yk> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.15Z6] */
    static {
        EnumC20538815Yk enumC20538815Yk = new EnumC20538815Yk("DISMISS", 0, "");
        DISMISS = enumC20538815Yk;
        EnumC20538815Yk enumC20538815Yk2 = new EnumC20538815Yk("MEDITATION_VIDEO", 1, "meditation");
        MEDITATION_VIDEO = enumC20538815Yk2;
        EnumC20538815Yk enumC20538815Yk3 = new EnumC20538815Yk("DAILY_SCREEN_TIME", 2, "daily_screen_time");
        DAILY_SCREEN_TIME = enumC20538815Yk3;
        EnumC20538815Yk enumC20538815Yk4 = new EnumC20538815Yk("LYNX_OVERLAY", 3, "lynx_overlay");
        LYNX_OVERLAY = enumC20538815Yk4;
        EnumC20538815Yk[] enumC20538815YkArr = {enumC20538815Yk, enumC20538815Yk2, enumC20538815Yk3, enumC20538815Yk4};
        LLILLJJLI = enumC20538815YkArr;
        LLILLL = new C2254308sP(enumC20538815YkArr);
        Companion = new Object() { // from class: X.15Z6
        };
    }

    public static EnumC20538815Yk[] values() {
        return (EnumC20538815Yk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20538815Yk valueOf(String str) {
        return (EnumC20538815Yk) C08FF.LIZ(EnumC20538815Yk.class, str);
    }

    public EnumC20538815Yk(String str, int i, String str2) {
        this.LL = str2;
    }
}
