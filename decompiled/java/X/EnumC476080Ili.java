package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ili, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC476080Ili {
    public static final /* synthetic */ EnumC476080Ili[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC476080Ili NORMAL_TRAY;
    public static final EnumC476080Ili SMALL_TRAY_ON_PUBLIC_SCREEN;
    public static final EnumC476080Ili SMALL_TRAY_ON_WINDOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC476080Ili> getEntries() {
        return LLILLL;
    }

    static {
        EnumC476080Ili enumC476080Ili = new EnumC476080Ili("NORMAL_TRAY", 0, 0);
        NORMAL_TRAY = enumC476080Ili;
        EnumC476080Ili enumC476080Ili2 = new EnumC476080Ili("SMALL_TRAY_ON_WINDOW", 1, 1);
        SMALL_TRAY_ON_WINDOW = enumC476080Ili2;
        EnumC476080Ili enumC476080Ili3 = new EnumC476080Ili("SMALL_TRAY_ON_PUBLIC_SCREEN", 2, 2);
        SMALL_TRAY_ON_PUBLIC_SCREEN = enumC476080Ili3;
        EnumC476080Ili[] enumC476080IliArr = {enumC476080Ili, enumC476080Ili2, enumC476080Ili3};
        LLILLJJLI = enumC476080IliArr;
        LLILLL = new C2254308sP(enumC476080IliArr);
    }

    public static EnumC476080Ili[] values() {
        return (EnumC476080Ili[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC476080Ili valueOf(String str) {
        return (EnumC476080Ili) C08FF.LIZ(EnumC476080Ili.class, str);
    }

    public EnumC476080Ili(String str, int i, int i2) {
        this.LL = i2;
    }
}
