package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1514560pW2 {
    public static final EnumC1514560pW2 All;
    public static final /* synthetic */ EnumC1514560pW2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1514560pW2 Lynx;
    public static final EnumC1514560pW2 Web;

    public static InterfaceC2044707zh<EnumC1514560pW2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1514560pW2 enumC1514560pW2 = new EnumC1514560pW2("All", 0);
        All = enumC1514560pW2;
        EnumC1514560pW2 enumC1514560pW22 = new EnumC1514560pW2("Lynx", 1);
        Lynx = enumC1514560pW22;
        EnumC1514560pW2 enumC1514560pW23 = new EnumC1514560pW2("Web", 2);
        Web = enumC1514560pW23;
        EnumC1514560pW2[] enumC1514560pW2Arr = {enumC1514560pW2, enumC1514560pW22, enumC1514560pW23};
        LL = enumC1514560pW2Arr;
        LLILLJJLI = new C2254308sP(enumC1514560pW2Arr);
    }

    public static EnumC1514560pW2[] values() {
        return (EnumC1514560pW2[]) LL.clone();
    }

    public static EnumC1514560pW2 valueOf(String str) {
        return (EnumC1514560pW2) C08FF.LIZ(EnumC1514560pW2.class, str);
    }

    public EnumC1514560pW2(String str, int i) {
    }
}
