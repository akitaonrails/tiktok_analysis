package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC355990DxV {
    public static final EnumC355990DxV ADJUST;
    public static final EnumC355990DxV CAPTION;
    public static final EnumC355990DxV EFFECT;
    public static final EnumC355990DxV FILTER;
    public static final /* synthetic */ EnumC355990DxV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC355990DxV OVERLAY;
    public static final EnumC355990DxV STICKER;
    public static final EnumC355990DxV TEXT;

    public static InterfaceC2044707zh<EnumC355990DxV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC355990DxV enumC355990DxV = new EnumC355990DxV("OVERLAY", 0);
        OVERLAY = enumC355990DxV;
        EnumC355990DxV enumC355990DxV2 = new EnumC355990DxV("TEXT", 1);
        TEXT = enumC355990DxV2;
        EnumC355990DxV enumC355990DxV3 = new EnumC355990DxV("STICKER", 2);
        STICKER = enumC355990DxV3;
        EnumC355990DxV enumC355990DxV4 = new EnumC355990DxV("FILTER", 3);
        FILTER = enumC355990DxV4;
        EnumC355990DxV enumC355990DxV5 = new EnumC355990DxV("EFFECT", 4);
        EFFECT = enumC355990DxV5;
        EnumC355990DxV enumC355990DxV6 = new EnumC355990DxV("ADJUST", 5);
        ADJUST = enumC355990DxV6;
        EnumC355990DxV enumC355990DxV7 = new EnumC355990DxV("CAPTION", 6);
        CAPTION = enumC355990DxV7;
        EnumC355990DxV[] enumC355990DxVArr = {enumC355990DxV, enumC355990DxV2, enumC355990DxV3, enumC355990DxV4, enumC355990DxV5, enumC355990DxV6, enumC355990DxV7};
        LL = enumC355990DxVArr;
        LLILLJJLI = new C2254308sP(enumC355990DxVArr);
    }

    public static EnumC355990DxV[] values() {
        return (EnumC355990DxV[]) LL.clone();
    }

    public static EnumC355990DxV valueOf(String str) {
        return (EnumC355990DxV) C08FF.LIZ(EnumC355990DxV.class, str);
    }

    public EnumC355990DxV(String str, int i) {
    }
}
