package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993350bxN {
    public static final EnumC993350bxN ADD_TO_CART;
    public static final EnumC993350bxN FORBIDDEN;
    public static final /* synthetic */ EnumC993350bxN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993350bxN OPEN_SECONDARY_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993350bxN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993350bxN enumC993350bxN = new EnumC993350bxN("ADD_TO_CART", 0, 1);
        ADD_TO_CART = enumC993350bxN;
        EnumC993350bxN enumC993350bxN2 = new EnumC993350bxN("OPEN_SECONDARY_PAGE", 1, 2);
        OPEN_SECONDARY_PAGE = enumC993350bxN2;
        EnumC993350bxN enumC993350bxN3 = new EnumC993350bxN("FORBIDDEN", 2, 3);
        FORBIDDEN = enumC993350bxN3;
        EnumC993350bxN[] enumC993350bxNArr = {enumC993350bxN, enumC993350bxN2, enumC993350bxN3};
        LLILLJJLI = enumC993350bxNArr;
        LLILLL = new C2254308sP(enumC993350bxNArr);
    }

    public static EnumC993350bxN[] values() {
        return (EnumC993350bxN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993350bxN valueOf(String str) {
        return (EnumC993350bxN) C08FF.LIZ(EnumC993350bxN.class, str);
    }

    public EnumC993350bxN(String str, int i, int i2) {
        this.LL = i2;
    }
}
