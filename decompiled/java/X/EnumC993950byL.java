package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993950byL {
    public static final EnumC993950byL CARD_EXPOSE;
    public static final /* synthetic */ EnumC993950byL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993950byL PULL_REFRESH;

    public static InterfaceC2044707zh<EnumC993950byL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993950byL enumC993950byL = new EnumC993950byL("CARD_EXPOSE", 0);
        CARD_EXPOSE = enumC993950byL;
        EnumC993950byL enumC993950byL2 = new EnumC993950byL("PULL_REFRESH", 1);
        PULL_REFRESH = enumC993950byL2;
        EnumC993950byL[] enumC993950byLArr = {enumC993950byL, enumC993950byL2};
        LL = enumC993950byLArr;
        LLILLJJLI = new C2254308sP(enumC993950byLArr);
    }

    public static EnumC993950byL[] values() {
        return (EnumC993950byL[]) LL.clone();
    }

    public static EnumC993950byL valueOf(String str) {
        return (EnumC993950byL) C08FF.LIZ(EnumC993950byL.class, str);
    }

    public EnumC993950byL(String str, int i) {
    }
}
