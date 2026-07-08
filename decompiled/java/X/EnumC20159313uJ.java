package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20159313uJ {
    public static final C20159513uL Companion;
    public static final /* synthetic */ EnumC20159313uJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20159313uJ NEAR_ADDITION;
    public static final EnumC20159313uJ NEAR_MULTIPLY;
    public static final EnumC20159313uJ ORIGIN;
    public static final EnumC20159313uJ ROUND_DOWN;
    public static final EnumC20159313uJ ROUND_UP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20159313uJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20159313uJ enumC20159313uJ = new EnumC20159313uJ("ORIGIN", 0, "origin");
        ORIGIN = enumC20159313uJ;
        EnumC20159313uJ enumC20159313uJ2 = new EnumC20159313uJ("NEAR_MULTIPLY", 1, "near_multiply");
        NEAR_MULTIPLY = enumC20159313uJ2;
        EnumC20159313uJ enumC20159313uJ3 = new EnumC20159313uJ("NEAR_ADDITION", 2, "near_addition");
        NEAR_ADDITION = enumC20159313uJ3;
        EnumC20159313uJ enumC20159313uJ4 = new EnumC20159313uJ("ROUND_UP", 3, "round_up");
        ROUND_UP = enumC20159313uJ4;
        EnumC20159313uJ enumC20159313uJ5 = new EnumC20159313uJ("ROUND_DOWN", 4, "round_down");
        ROUND_DOWN = enumC20159313uJ5;
        EnumC20159313uJ[] enumC20159313uJArr = {enumC20159313uJ, enumC20159313uJ2, enumC20159313uJ3, enumC20159313uJ4, enumC20159313uJ5};
        LLILLJJLI = enumC20159313uJArr;
        LLILLL = new C2254308sP(enumC20159313uJArr);
        Companion = new C20159513uL();
    }

    public static EnumC20159313uJ[] values() {
        return (EnumC20159313uJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20159313uJ valueOf(String str) {
        return (EnumC20159313uJ) C08FF.LIZ(EnumC20159313uJ.class, str);
    }

    public EnumC20159313uJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
