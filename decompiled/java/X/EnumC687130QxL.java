package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC687130QxL {
    public static final EnumC687130QxL HALF_MIDDLE;
    public static final EnumC687130QxL HALF_RESULT;
    public static final /* synthetic */ EnumC687130QxL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC687130QxL MIDDLE;
    public static final EnumC687130QxL NINE_MIDDLE;
    public static final EnumC687130QxL NINE_RESULT;
    public static final EnumC687130QxL RESULT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC687130QxL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC687130QxL enumC687130QxL = new EnumC687130QxL("MIDDLE", 0, "middle");
        MIDDLE = enumC687130QxL;
        EnumC687130QxL enumC687130QxL2 = new EnumC687130QxL("RESULT", 1, "result");
        RESULT = enumC687130QxL2;
        EnumC687130QxL enumC687130QxL3 = new EnumC687130QxL("NINE_MIDDLE", 2, "90_middle");
        NINE_MIDDLE = enumC687130QxL3;
        EnumC687130QxL enumC687130QxL4 = new EnumC687130QxL("NINE_RESULT", 3, "90_result");
        NINE_RESULT = enumC687130QxL4;
        EnumC687130QxL enumC687130QxL5 = new EnumC687130QxL("HALF_MIDDLE", 4, "half_middle");
        HALF_MIDDLE = enumC687130QxL5;
        EnumC687130QxL enumC687130QxL6 = new EnumC687130QxL("HALF_RESULT", 5, "half_result");
        HALF_RESULT = enumC687130QxL6;
        EnumC687130QxL[] enumC687130QxLArr = {enumC687130QxL, enumC687130QxL2, enumC687130QxL3, enumC687130QxL4, enumC687130QxL5, enumC687130QxL6};
        LLILLJJLI = enumC687130QxLArr;
        LLILLL = new C2254308sP(enumC687130QxLArr);
    }

    public static EnumC687130QxL[] values() {
        return (EnumC687130QxL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC687130QxL valueOf(String str) {
        return (EnumC687130QxL) C08FF.LIZ(EnumC687130QxL.class, str);
    }

    public EnumC687130QxL(String str, int i, String str2) {
        this.LL = str2;
    }
}
