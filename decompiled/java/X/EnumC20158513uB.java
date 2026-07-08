package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13uB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20158513uB {
    public static final C20159713uN Companion;
    public static final EnumC20158513uB FIRST_PLUS;
    public static final /* synthetic */ EnumC20158513uB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20158513uB NORMAL;
    public static final EnumC20158513uB PLUS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20158513uB> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.13uN] */
    static {
        EnumC20158513uB enumC20158513uB = new EnumC20158513uB("NORMAL", 0, "normal");
        NORMAL = enumC20158513uB;
        EnumC20158513uB enumC20158513uB2 = new EnumC20158513uB("PLUS", 1, "plus");
        PLUS = enumC20158513uB2;
        EnumC20158513uB enumC20158513uB3 = new EnumC20158513uB("FIRST_PLUS", 2, "first_plus");
        FIRST_PLUS = enumC20158513uB3;
        EnumC20158513uB[] enumC20158513uBArr = {enumC20158513uB, enumC20158513uB2, enumC20158513uB3};
        LLILLJJLI = enumC20158513uBArr;
        LLILLL = new C2254308sP(enumC20158513uBArr);
        Companion = new Object() { // from class: X.13uN
        };
    }

    public static EnumC20158513uB[] values() {
        return (EnumC20158513uB[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20158513uB valueOf(String str) {
        return (EnumC20158513uB) C08FF.LIZ(EnumC20158513uB.class, str);
    }

    public EnumC20158513uB(String str, int i, String str2) {
        this.LL = str2;
    }
}
