package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971640bOM {
    public static final EnumC971640bOM BOLD_TEXT;
    public static final EnumC971640bOM IMAGE;
    public static final /* synthetic */ EnumC971640bOM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC971640bOM NORMAL;
    public static final EnumC971640bOM SUB_NORMAL;

    public static InterfaceC2044707zh<EnumC971640bOM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC971640bOM enumC971640bOM = new EnumC971640bOM("BOLD_TEXT", 0);
        BOLD_TEXT = enumC971640bOM;
        EnumC971640bOM enumC971640bOM2 = new EnumC971640bOM("NORMAL", 1);
        NORMAL = enumC971640bOM2;
        EnumC971640bOM enumC971640bOM3 = new EnumC971640bOM("IMAGE", 2);
        IMAGE = enumC971640bOM3;
        EnumC971640bOM enumC971640bOM4 = new EnumC971640bOM("SUB_NORMAL", 3);
        SUB_NORMAL = enumC971640bOM4;
        EnumC971640bOM[] enumC971640bOMArr = {enumC971640bOM, enumC971640bOM2, enumC971640bOM3, enumC971640bOM4};
        LL = enumC971640bOMArr;
        LLILLJJLI = new C2254308sP(enumC971640bOMArr);
    }

    public static EnumC971640bOM[] values() {
        return (EnumC971640bOM[]) LL.clone();
    }

    public static EnumC971640bOM valueOf(String str) {
        return (EnumC971640bOM) C08FF.LIZ(EnumC971640bOM.class, str);
    }

    public EnumC971640bOM(String str, int i) {
    }
}
