package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1671260tam {
    public static final /* synthetic */ EnumC1671260tam[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1671260tam Large;
    public static final EnumC1671260tam Medium;
    public static final EnumC1671260tam Small;
    public static final EnumC1671260tam Tiny;

    public static InterfaceC2044707zh<EnumC1671260tam> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1671260tam enumC1671260tam = new EnumC1671260tam("Tiny", 0);
        Tiny = enumC1671260tam;
        EnumC1671260tam enumC1671260tam2 = new EnumC1671260tam("Small", 1);
        Small = enumC1671260tam2;
        EnumC1671260tam enumC1671260tam3 = new EnumC1671260tam("Medium", 2);
        Medium = enumC1671260tam3;
        EnumC1671260tam enumC1671260tam4 = new EnumC1671260tam("Large", 3);
        Large = enumC1671260tam4;
        EnumC1671260tam[] enumC1671260tamArr = {enumC1671260tam, enumC1671260tam2, enumC1671260tam3, enumC1671260tam4};
        LL = enumC1671260tamArr;
        LLILLJJLI = new C2254308sP(enumC1671260tamArr);
    }

    public static EnumC1671260tam[] values() {
        return (EnumC1671260tam[]) LL.clone();
    }

    public static EnumC1671260tam valueOf(String str) {
        return (EnumC1671260tam) C08FF.LIZ(EnumC1671260tam.class, str);
    }

    public EnumC1671260tam(String str, int i) {
    }
}
