package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609560rzG {
    public static final EnumC1609560rzG BRAND_BACKGROUND;
    public static final EnumC1609560rzG BRAND_FILL_CIRCLE;
    public static final EnumC1609560rzG BRAND_RING;
    public static final EnumC1609560rzG BREATH;
    public static final EnumC1609560rzG COLOR_MODE;
    public static final EnumC1609560rzG GRAY_RING;
    public static final EnumC1609560rzG GUIDE_BACKGROUND;
    public static final /* synthetic */ EnumC1609560rzG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1609560rzG NONE;
    public static final EnumC1609560rzG PRORGRESS;
    public static final EnumC1609560rzG RED_RING;
    public static final EnumC1609560rzG SHADER_MODE;
    public static final EnumC1609560rzG VERSION2_BACKGROUND;

    public static InterfaceC2044707zh<EnumC1609560rzG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1609560rzG enumC1609560rzG = new EnumC1609560rzG("PRORGRESS", 0);
        PRORGRESS = enumC1609560rzG;
        EnumC1609560rzG enumC1609560rzG2 = new EnumC1609560rzG("BRAND_RING", 1);
        BRAND_RING = enumC1609560rzG2;
        EnumC1609560rzG enumC1609560rzG3 = new EnumC1609560rzG("GRAY_RING", 2);
        GRAY_RING = enumC1609560rzG3;
        EnumC1609560rzG enumC1609560rzG4 = new EnumC1609560rzG("RED_RING", 3);
        RED_RING = enumC1609560rzG4;
        EnumC1609560rzG enumC1609560rzG5 = new EnumC1609560rzG("BRAND_FILL_CIRCLE", 4);
        BRAND_FILL_CIRCLE = enumC1609560rzG5;
        EnumC1609560rzG enumC1609560rzG6 = new EnumC1609560rzG("BRAND_BACKGROUND", 5);
        BRAND_BACKGROUND = enumC1609560rzG6;
        EnumC1609560rzG enumC1609560rzG7 = new EnumC1609560rzG("GUIDE_BACKGROUND", 6);
        GUIDE_BACKGROUND = enumC1609560rzG7;
        EnumC1609560rzG enumC1609560rzG8 = new EnumC1609560rzG("BREATH", 7);
        BREATH = enumC1609560rzG8;
        EnumC1609560rzG enumC1609560rzG9 = new EnumC1609560rzG("VERSION2_BACKGROUND", 8);
        VERSION2_BACKGROUND = enumC1609560rzG9;
        EnumC1609560rzG enumC1609560rzG10 = new EnumC1609560rzG("SHADER_MODE", 9);
        SHADER_MODE = enumC1609560rzG10;
        EnumC1609560rzG enumC1609560rzG11 = new EnumC1609560rzG("COLOR_MODE", 10);
        COLOR_MODE = enumC1609560rzG11;
        EnumC1609560rzG enumC1609560rzG12 = new EnumC1609560rzG("NONE", 11);
        NONE = enumC1609560rzG12;
        EnumC1609560rzG[] enumC1609560rzGArr = {enumC1609560rzG, enumC1609560rzG2, enumC1609560rzG3, enumC1609560rzG4, enumC1609560rzG5, enumC1609560rzG6, enumC1609560rzG7, enumC1609560rzG8, enumC1609560rzG9, enumC1609560rzG10, enumC1609560rzG11, enumC1609560rzG12};
        LL = enumC1609560rzGArr;
        LLILLJJLI = new C2254308sP(enumC1609560rzGArr);
    }

    public static EnumC1609560rzG[] values() {
        return (EnumC1609560rzG[]) LL.clone();
    }

    public static EnumC1609560rzG valueOf(String str) {
        return (EnumC1609560rzG) C08FF.LIZ(EnumC1609560rzG.class, str);
    }

    public EnumC1609560rzG(String str, int i) {
    }
}
