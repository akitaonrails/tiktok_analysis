package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356010DxX {
    public static final EnumC356010DxX ADJUST_BRIGHTNESS;
    public static final EnumC356010DxX ADJUST_CONTRAST;
    public static final EnumC356010DxX ADJUST_ENHANCE;
    public static final EnumC356010DxX ADJUST_EXPOSURE;
    public static final EnumC356010DxX ADJUST_HIGHLIGHT;
    public static final EnumC356010DxX ADJUST_NOISE;
    public static final EnumC356010DxX ADJUST_SATURATION;
    public static final EnumC356010DxX ADJUST_SHADOW;
    public static final EnumC356010DxX ADJUST_TEMPERATURE;
    public static final EnumC356010DxX ADJUST_TINT;
    public static final EnumC356010DxX BEAUTY;
    public static final EnumC356010DxX COLOR;
    public static final /* synthetic */ EnumC356010DxX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC356010DxX MULTI_SEGMENT;
    public static final EnumC356010DxX UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC356010DxX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC356010DxX enumC356010DxX = new EnumC356010DxX("COLOR", 0, 12);
        COLOR = enumC356010DxX;
        EnumC356010DxX enumC356010DxX2 = new EnumC356010DxX("BEAUTY", 1, 1);
        BEAUTY = enumC356010DxX2;
        EnumC356010DxX enumC356010DxX3 = new EnumC356010DxX("MULTI_SEGMENT", 2, 2);
        MULTI_SEGMENT = enumC356010DxX3;
        EnumC356010DxX enumC356010DxX4 = new EnumC356010DxX("ADJUST_ENHANCE", 3, 0);
        ADJUST_ENHANCE = enumC356010DxX4;
        EnumC356010DxX enumC356010DxX5 = new EnumC356010DxX("ADJUST_EXPOSURE", 4, 11);
        ADJUST_EXPOSURE = enumC356010DxX5;
        EnumC356010DxX enumC356010DxX6 = new EnumC356010DxX("ADJUST_BRIGHTNESS", 5, 3);
        ADJUST_BRIGHTNESS = enumC356010DxX6;
        EnumC356010DxX enumC356010DxX7 = new EnumC356010DxX("ADJUST_CONTRAST", 6, 4);
        ADJUST_CONTRAST = enumC356010DxX7;
        EnumC356010DxX enumC356010DxX8 = new EnumC356010DxX("ADJUST_HIGHLIGHT", 7, 6);
        ADJUST_HIGHLIGHT = enumC356010DxX8;
        EnumC356010DxX enumC356010DxX9 = new EnumC356010DxX("ADJUST_SHADOW", 8, 7);
        ADJUST_SHADOW = enumC356010DxX9;
        EnumC356010DxX enumC356010DxX10 = new EnumC356010DxX("ADJUST_SATURATION", 9, 5);
        ADJUST_SATURATION = enumC356010DxX10;
        EnumC356010DxX enumC356010DxX11 = new EnumC356010DxX("ADJUST_TEMPERATURE", 10, 8);
        ADJUST_TEMPERATURE = enumC356010DxX11;
        EnumC356010DxX enumC356010DxX12 = new EnumC356010DxX("ADJUST_TINT", 11, 9);
        ADJUST_TINT = enumC356010DxX12;
        EnumC356010DxX enumC356010DxX13 = new EnumC356010DxX("ADJUST_NOISE", 12, 10);
        ADJUST_NOISE = enumC356010DxX13;
        EnumC356010DxX enumC356010DxX14 = new EnumC356010DxX("UNKNOWN", 13, -1);
        UNKNOWN = enumC356010DxX14;
        EnumC356010DxX[] enumC356010DxXArr = {enumC356010DxX, enumC356010DxX2, enumC356010DxX3, enumC356010DxX4, enumC356010DxX5, enumC356010DxX6, enumC356010DxX7, enumC356010DxX8, enumC356010DxX9, enumC356010DxX10, enumC356010DxX11, enumC356010DxX12, enumC356010DxX13, enumC356010DxX14};
        LLILLJJLI = enumC356010DxXArr;
        LLILLL = new C2254308sP(enumC356010DxXArr);
    }

    public static EnumC356010DxX[] values() {
        return (EnumC356010DxX[]) LLILLJJLI.clone();
    }

    public final int getLevel() {
        return this.LL;
    }

    public static EnumC356010DxX valueOf(String str) {
        return (EnumC356010DxX) C08FF.LIZ(EnumC356010DxX.class, str);
    }

    public EnumC356010DxX(String str, int i, int i2) {
        this.LL = i2;
    }
}
