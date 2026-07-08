package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0spA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641740spA {
    public static final EnumC1641740spA LL;
    public static final EnumC1641740spA LLILLJJLI;
    public static final EnumC1641740spA LLILLL;
    public static final EnumC1641740spA LLILZ;
    public static final EnumC1641740spA LLILZIL;
    public static final /* synthetic */ EnumC1641740spA[] LLILZLL;

    static {
        EnumC1641740spA enumC1641740spA = new EnumC1641740spA("UNKNOWN", 0);
        LL = enumC1641740spA;
        EnumC1641740spA enumC1641740spA2 = new EnumC1641740spA("SHOWING", 1);
        LLILLJJLI = enumC1641740spA2;
        EnumC1641740spA enumC1641740spA3 = new EnumC1641740spA("SHOWN", 2);
        LLILLL = enumC1641740spA3;
        EnumC1641740spA enumC1641740spA4 = new EnumC1641740spA("HIDING", 3);
        LLILZ = enumC1641740spA4;
        EnumC1641740spA enumC1641740spA5 = new EnumC1641740spA("HIDE", 4);
        LLILZIL = enumC1641740spA5;
        EnumC1641740spA[] enumC1641740spAArr = {enumC1641740spA, enumC1641740spA2, enumC1641740spA3, enumC1641740spA4, enumC1641740spA5};
        LLILZLL = enumC1641740spAArr;
        new C2254308sP(enumC1641740spAArr);
    }

    public static EnumC1641740spA[] values() {
        return (EnumC1641740spA[]) LLILZLL.clone();
    }

    public static EnumC1641740spA valueOf(String str) {
        return (EnumC1641740spA) C08FF.LIZ(EnumC1641740spA.class, str);
    }

    public EnumC1641740spA(String str, int i) {
    }
}
