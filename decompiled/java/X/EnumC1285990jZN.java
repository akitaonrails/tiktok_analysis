package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1285990jZN {
    public static final EnumC1285990jZN LL;
    public static final EnumC1285990jZN LLILLJJLI;
    public static final EnumC1285990jZN LLILLL;
    public static final /* synthetic */ EnumC1285990jZN[] LLILZ;

    static {
        EnumC1285990jZN enumC1285990jZN = new EnumC1285990jZN("GOOD", 0);
        LL = enumC1285990jZN;
        EnumC1285990jZN enumC1285990jZN2 = new EnumC1285990jZN("OK", 1);
        LLILLJJLI = enumC1285990jZN2;
        EnumC1285990jZN enumC1285990jZN3 = new EnumC1285990jZN("POOR", 2);
        LLILLL = enumC1285990jZN3;
        EnumC1285990jZN[] enumC1285990jZNArr = {enumC1285990jZN, enumC1285990jZN2, enumC1285990jZN3};
        LLILZ = enumC1285990jZNArr;
        new C2254308sP(enumC1285990jZNArr);
    }

    public static EnumC1285990jZN[] values() {
        return (EnumC1285990jZN[]) LLILZ.clone();
    }

    public static EnumC1285990jZN valueOf(String str) {
        return (EnumC1285990jZN) C08FF.LIZ(EnumC1285990jZN.class, str);
    }

    public EnumC1285990jZN(String str, int i) {
    }
}
