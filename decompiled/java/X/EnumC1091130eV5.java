package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1091130eV5 {
    public static final EnumC1091130eV5 ALPHA_VIDEO;
    public static final /* synthetic */ EnumC1091130eV5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1091130eV5 LYNX;
    public static final EnumC1091130eV5 NATIVE_ANIMATION;

    public static InterfaceC2044707zh<EnumC1091130eV5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1091130eV5 enumC1091130eV5 = new EnumC1091130eV5("NATIVE_ANIMATION", 0);
        NATIVE_ANIMATION = enumC1091130eV5;
        EnumC1091130eV5 enumC1091130eV52 = new EnumC1091130eV5("ALPHA_VIDEO", 1);
        ALPHA_VIDEO = enumC1091130eV52;
        EnumC1091130eV5 enumC1091130eV53 = new EnumC1091130eV5("LYNX", 2);
        LYNX = enumC1091130eV53;
        EnumC1091130eV5[] enumC1091130eV5Arr = {enumC1091130eV5, enumC1091130eV52, enumC1091130eV53};
        LL = enumC1091130eV5Arr;
        LLILLJJLI = new C2254308sP(enumC1091130eV5Arr);
    }

    public static EnumC1091130eV5[] values() {
        return (EnumC1091130eV5[]) LL.clone();
    }

    public static EnumC1091130eV5 valueOf(String str) {
        return (EnumC1091130eV5) C08FF.LIZ(EnumC1091130eV5.class, str);
    }

    public EnumC1091130eV5(String str, int i) {
    }
}
