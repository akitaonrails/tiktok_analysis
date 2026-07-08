package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1754390vkr {
    public static final /* synthetic */ EnumC1754390vkr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1754390vkr NONE;
    public static final EnumC1754390vkr NORMAL;
    public static final EnumC1754390vkr NUMBER;
    public static final EnumC1754390vkr SPECIAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1754390vkr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1754390vkr enumC1754390vkr = new EnumC1754390vkr("NONE", 0, "none");
        NONE = enumC1754390vkr;
        EnumC1754390vkr enumC1754390vkr2 = new EnumC1754390vkr("NORMAL", 1, "normal");
        NORMAL = enumC1754390vkr2;
        EnumC1754390vkr enumC1754390vkr3 = new EnumC1754390vkr("NUMBER", 2, "number");
        NUMBER = enumC1754390vkr3;
        EnumC1754390vkr enumC1754390vkr4 = new EnumC1754390vkr("SPECIAL", 3, "special");
        SPECIAL = enumC1754390vkr4;
        EnumC1754390vkr[] enumC1754390vkrArr = {enumC1754390vkr, enumC1754390vkr2, enumC1754390vkr3, enumC1754390vkr4};
        LLILLJJLI = enumC1754390vkrArr;
        LLILLL = new C2254308sP(enumC1754390vkrArr);
    }

    public static EnumC1754390vkr[] values() {
        return (EnumC1754390vkr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1754390vkr valueOf(String str) {
        return (EnumC1754390vkr) C08FF.LIZ(EnumC1754390vkr.class, str);
    }

    public EnumC1754390vkr(String str, int i, String str2) {
        this.LL = str2;
    }
}
