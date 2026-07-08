package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1736950vIj {
    public static final C1736960vIk Companion;
    public static final EnumC1736950vIj EFFECT_ICON_FEMALE;
    public static final EnumC1736950vIj EFFECT_ICON_MALE;
    public static final /* synthetic */ EnumC1736950vIj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1736950vIj NONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1736950vIj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1736950vIj enumC1736950vIj = new EnumC1736950vIj("NONE", 0, "");
        NONE = enumC1736950vIj;
        EnumC1736950vIj enumC1736950vIj2 = new EnumC1736950vIj("EFFECT_ICON_FEMALE", 1, "effect_icon_female");
        EFFECT_ICON_FEMALE = enumC1736950vIj2;
        EnumC1736950vIj enumC1736950vIj3 = new EnumC1736950vIj("EFFECT_ICON_MALE", 2, "effect_icon_male");
        EFFECT_ICON_MALE = enumC1736950vIj3;
        EnumC1736950vIj[] enumC1736950vIjArr = {enumC1736950vIj, enumC1736950vIj2, enumC1736950vIj3};
        LLILLJJLI = enumC1736950vIjArr;
        LLILLL = new C2254308sP(enumC1736950vIjArr);
        Companion = new C1736960vIk();
    }

    public static EnumC1736950vIj[] values() {
        return (EnumC1736950vIj[]) LLILLJJLI.clone();
    }

    public final String getTypeVal() {
        return this.LL;
    }

    public static EnumC1736950vIj valueOf(String str) {
        return (EnumC1736950vIj) C08FF.LIZ(EnumC1736950vIj.class, str);
    }

    public EnumC1736950vIj(String str, int i, String str2) {
        this.LL = str2;
    }
}
