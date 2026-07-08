package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC457070Hw9 {
    public static final EnumC457070Hw9 BACKGROUND;
    public static final /* synthetic */ EnumC457070Hw9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC457070Hw9 NORMAL;
    public static final EnumC457070Hw9 OUTLINE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC457070Hw9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC457070Hw9 enumC457070Hw9 = new EnumC457070Hw9("NORMAL", 0, 0);
        NORMAL = enumC457070Hw9;
        EnumC457070Hw9 enumC457070Hw92 = new EnumC457070Hw9("OUTLINE", 1, 1);
        OUTLINE = enumC457070Hw92;
        EnumC457070Hw9 enumC457070Hw93 = new EnumC457070Hw9("BACKGROUND", 2, 2);
        BACKGROUND = enumC457070Hw93;
        EnumC457070Hw9[] enumC457070Hw9Arr = {enumC457070Hw9, enumC457070Hw92, enumC457070Hw93};
        LLILLJJLI = enumC457070Hw9Arr;
        LLILLL = new C2254308sP(enumC457070Hw9Arr);
    }

    public static EnumC457070Hw9[] values() {
        return (EnumC457070Hw9[]) LLILLJJLI.clone();
    }

    public final int getStyleValue() {
        return this.LL;
    }

    public static EnumC457070Hw9 valueOf(String str) {
        return (EnumC457070Hw9) C08FF.LIZ(EnumC457070Hw9.class, str);
    }

    public EnumC457070Hw9(String str, int i, int i2) {
        this.LL = i2;
    }
}
