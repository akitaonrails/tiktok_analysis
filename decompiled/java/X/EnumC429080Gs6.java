package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429080Gs6 {
    public static final /* synthetic */ EnumC429080Gs6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429080Gs6 RECTANGLE_374X234;
    public static final EnumC429080Gs6 SQUARE_374X374;

    public static InterfaceC2044707zh<EnumC429080Gs6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429080Gs6 enumC429080Gs6 = new EnumC429080Gs6("RECTANGLE_374X234", 0);
        RECTANGLE_374X234 = enumC429080Gs6;
        EnumC429080Gs6 enumC429080Gs62 = new EnumC429080Gs6("SQUARE_374X374", 1);
        SQUARE_374X374 = enumC429080Gs62;
        EnumC429080Gs6[] enumC429080Gs6Arr = {enumC429080Gs6, enumC429080Gs62};
        LL = enumC429080Gs6Arr;
        LLILLJJLI = new C2254308sP(enumC429080Gs6Arr);
    }

    public static EnumC429080Gs6[] values() {
        return (EnumC429080Gs6[]) LL.clone();
    }

    public static EnumC429080Gs6 valueOf(String str) {
        return (EnumC429080Gs6) C08FF.LIZ(EnumC429080Gs6.class, str);
    }

    public EnumC429080Gs6(String str, int i) {
    }
}
