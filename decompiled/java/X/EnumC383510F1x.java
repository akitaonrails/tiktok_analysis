package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC383510F1x {
    public static final EnumC383510F1x COLOR;
    public static final EnumC383510F1x DISTANCE;
    public static final EnumC383510F1x HORIZONTAL_SHIFT;
    public static final /* synthetic */ EnumC383510F1x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC383510F1x OPACITY;
    public static final EnumC383510F1x SIZE;
    public static final EnumC383510F1x TEXTURE;
    public static final EnumC383510F1x VERTICAL_SHIFT;

    public static InterfaceC2044707zh<EnumC383510F1x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC383510F1x enumC383510F1x = new EnumC383510F1x("COLOR", 0);
        COLOR = enumC383510F1x;
        EnumC383510F1x enumC383510F1x2 = new EnumC383510F1x("SIZE", 1);
        SIZE = enumC383510F1x2;
        EnumC383510F1x enumC383510F1x3 = new EnumC383510F1x("DISTANCE", 2);
        DISTANCE = enumC383510F1x3;
        EnumC383510F1x enumC383510F1x4 = new EnumC383510F1x("OPACITY", 3);
        OPACITY = enumC383510F1x4;
        EnumC383510F1x enumC383510F1x5 = new EnumC383510F1x("HORIZONTAL_SHIFT", 4);
        HORIZONTAL_SHIFT = enumC383510F1x5;
        EnumC383510F1x enumC383510F1x6 = new EnumC383510F1x("VERTICAL_SHIFT", 5);
        VERTICAL_SHIFT = enumC383510F1x6;
        EnumC383510F1x enumC383510F1x7 = new EnumC383510F1x("TEXTURE", 6);
        TEXTURE = enumC383510F1x7;
        EnumC383510F1x[] enumC383510F1xArr = {enumC383510F1x, enumC383510F1x2, enumC383510F1x3, enumC383510F1x4, enumC383510F1x5, enumC383510F1x6, enumC383510F1x7};
        LL = enumC383510F1xArr;
        LLILLJJLI = new C2254308sP(enumC383510F1xArr);
    }

    public static EnumC383510F1x[] values() {
        return (EnumC383510F1x[]) LL.clone();
    }

    public static EnumC383510F1x valueOf(String str) {
        return (EnumC383510F1x) C08FF.LIZ(EnumC383510F1x.class, str);
    }

    public EnumC383510F1x(String str, int i) {
    }
}
