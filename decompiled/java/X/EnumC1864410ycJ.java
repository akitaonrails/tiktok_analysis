package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ycJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1864410ycJ {
    public static final EnumC1864410ycJ FULL_SCREEN;
    public static final /* synthetic */ EnumC1864410ycJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1864410ycJ NINE_SPLIT_SCREEN;
    public static final EnumC1864410ycJ SEVEN_SPLIT_SCREEN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1864410ycJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1864410ycJ enumC1864410ycJ = new EnumC1864410ycJ("FULL_SCREEN", 0, "full_screen");
        FULL_SCREEN = enumC1864410ycJ;
        EnumC1864410ycJ enumC1864410ycJ2 = new EnumC1864410ycJ("NINE_SPLIT_SCREEN", 1, "nine_split_screen");
        NINE_SPLIT_SCREEN = enumC1864410ycJ2;
        EnumC1864410ycJ enumC1864410ycJ3 = new EnumC1864410ycJ("SEVEN_SPLIT_SCREEN", 2, "seven_split_screen");
        SEVEN_SPLIT_SCREEN = enumC1864410ycJ3;
        EnumC1864410ycJ[] enumC1864410ycJArr = {enumC1864410ycJ, enumC1864410ycJ2, enumC1864410ycJ3};
        LLILLJJLI = enumC1864410ycJArr;
        LLILLL = new C2254308sP(enumC1864410ycJArr);
    }

    public static EnumC1864410ycJ[] values() {
        return (EnumC1864410ycJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1864410ycJ valueOf(String str) {
        return (EnumC1864410ycJ) C08FF.LIZ(EnumC1864410ycJ.class, str);
    }

    public EnumC1864410ycJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
