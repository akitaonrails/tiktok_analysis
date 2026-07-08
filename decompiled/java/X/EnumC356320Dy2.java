package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356320Dy2 {
    public static final EnumC356320Dy2 COLOR;
    public static final EnumC356320Dy2 FONT;
    public static final /* synthetic */ EnumC356320Dy2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC356320Dy2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356320Dy2 enumC356320Dy2 = new EnumC356320Dy2("COLOR", 0);
        COLOR = enumC356320Dy2;
        EnumC356320Dy2 enumC356320Dy22 = new EnumC356320Dy2("FONT", 1);
        FONT = enumC356320Dy22;
        EnumC356320Dy2[] enumC356320Dy2Arr = {enumC356320Dy2, enumC356320Dy22};
        LL = enumC356320Dy2Arr;
        LLILLJJLI = new C2254308sP(enumC356320Dy2Arr);
    }

    public static EnumC356320Dy2[] values() {
        return (EnumC356320Dy2[]) LL.clone();
    }

    public static EnumC356320Dy2 valueOf(String str) {
        return (EnumC356320Dy2) C08FF.LIZ(EnumC356320Dy2.class, str);
    }

    public EnumC356320Dy2(String str, int i) {
    }
}
