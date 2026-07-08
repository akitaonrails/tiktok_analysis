package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC880300Yg8 {
    public static final EnumC880300Yg8 GRAY_DOT;
    public static final EnumC880300Yg8 GRAY_NUM;
    public static final /* synthetic */ EnumC880300Yg8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC880300Yg8 NONE;
    public static final EnumC880300Yg8 RED_DOT;
    public static final EnumC880300Yg8 RED_NUM;

    public static InterfaceC2044707zh<EnumC880300Yg8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC880300Yg8 enumC880300Yg8 = new EnumC880300Yg8("NONE", 0);
        NONE = enumC880300Yg8;
        EnumC880300Yg8 enumC880300Yg82 = new EnumC880300Yg8("RED_NUM", 1);
        RED_NUM = enumC880300Yg82;
        EnumC880300Yg8 enumC880300Yg83 = new EnumC880300Yg8("GRAY_NUM", 2);
        GRAY_NUM = enumC880300Yg83;
        EnumC880300Yg8 enumC880300Yg84 = new EnumC880300Yg8("RED_DOT", 3);
        RED_DOT = enumC880300Yg84;
        EnumC880300Yg8 enumC880300Yg85 = new EnumC880300Yg8("GRAY_DOT", 4);
        GRAY_DOT = enumC880300Yg85;
        EnumC880300Yg8[] enumC880300Yg8Arr = {enumC880300Yg8, enumC880300Yg82, enumC880300Yg83, enumC880300Yg84, enumC880300Yg85};
        LL = enumC880300Yg8Arr;
        LLILLJJLI = new C2254308sP(enumC880300Yg8Arr);
    }

    public static EnumC880300Yg8[] values() {
        return (EnumC880300Yg8[]) LL.clone();
    }

    public static EnumC880300Yg8 valueOf(String str) {
        return (EnumC880300Yg8) C08FF.LIZ(EnumC880300Yg8.class, str);
    }

    public EnumC880300Yg8(String str, int i) {
    }
}
