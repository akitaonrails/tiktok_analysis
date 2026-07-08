package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1149370g11 {
    public static final EnumC1149370g11 BOTTOM_GALLERY;
    public static final EnumC1149370g11 GALLERY;
    public static final /* synthetic */ EnumC1149370g11[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1149370g11 PANEL;

    public static InterfaceC2044707zh<EnumC1149370g11> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1149370g11 enumC1149370g11 = new EnumC1149370g11("PANEL", 0);
        PANEL = enumC1149370g11;
        EnumC1149370g11 enumC1149370g112 = new EnumC1149370g11("GALLERY", 1);
        GALLERY = enumC1149370g112;
        EnumC1149370g11 enumC1149370g113 = new EnumC1149370g11("BOTTOM_GALLERY", 2);
        BOTTOM_GALLERY = enumC1149370g113;
        EnumC1149370g11[] enumC1149370g11Arr = {enumC1149370g11, enumC1149370g112, enumC1149370g113};
        LL = enumC1149370g11Arr;
        LLILLJJLI = new C2254308sP(enumC1149370g11Arr);
    }

    public static EnumC1149370g11[] values() {
        return (EnumC1149370g11[]) LL.clone();
    }

    public static EnumC1149370g11 valueOf(String str) {
        return (EnumC1149370g11) C08FF.LIZ(EnumC1149370g11.class, str);
    }

    public EnumC1149370g11(String str, int i) {
    }
}
