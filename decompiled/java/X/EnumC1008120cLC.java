package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1008120cLC {
    public static final EnumC1008120cLC EACH;
    public static final EnumC1008120cLC FIRST;
    public static final EnumC1008120cLC LAST;
    public static final /* synthetic */ EnumC1008120cLC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1008120cLC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1008120cLC enumC1008120cLC = new EnumC1008120cLC("FIRST", 0, "first");
        FIRST = enumC1008120cLC;
        EnumC1008120cLC enumC1008120cLC2 = new EnumC1008120cLC("LAST", 1, "last");
        LAST = enumC1008120cLC2;
        EnumC1008120cLC enumC1008120cLC3 = new EnumC1008120cLC("EACH", 2, "each");
        EACH = enumC1008120cLC3;
        EnumC1008120cLC[] enumC1008120cLCArr = {enumC1008120cLC, enumC1008120cLC2, enumC1008120cLC3};
        LLILLJJLI = enumC1008120cLCArr;
        LLILLL = new C2254308sP(enumC1008120cLCArr);
    }

    public static EnumC1008120cLC[] values() {
        return (EnumC1008120cLC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1008120cLC valueOf(String str) {
        return (EnumC1008120cLC) C08FF.LIZ(EnumC1008120cLC.class, str);
    }

    public EnumC1008120cLC(String str, int i, String str2) {
        this.LL = str2;
    }
}
