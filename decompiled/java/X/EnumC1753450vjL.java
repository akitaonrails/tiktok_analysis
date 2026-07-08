package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1753450vjL {
    public static final EnumC1753450vjL BUBBLE;
    public static final EnumC1753450vjL DYNAMIC_TAG;
    public static final /* synthetic */ EnumC1753450vjL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1753450vjL TAG;
    public static final EnumC1753450vjL UNDEFINE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1753450vjL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1753450vjL enumC1753450vjL = new EnumC1753450vjL("UNDEFINE", 0, 0);
        UNDEFINE = enumC1753450vjL;
        EnumC1753450vjL enumC1753450vjL2 = new EnumC1753450vjL("TAG", 1, 1);
        TAG = enumC1753450vjL2;
        EnumC1753450vjL enumC1753450vjL3 = new EnumC1753450vjL("DYNAMIC_TAG", 2, 2);
        DYNAMIC_TAG = enumC1753450vjL3;
        EnumC1753450vjL enumC1753450vjL4 = new EnumC1753450vjL("BUBBLE", 3, 3);
        BUBBLE = enumC1753450vjL4;
        EnumC1753450vjL[] enumC1753450vjLArr = {enumC1753450vjL, enumC1753450vjL2, enumC1753450vjL3, enumC1753450vjL4};
        LLILLJJLI = enumC1753450vjLArr;
        LLILLL = new C2254308sP(enumC1753450vjLArr);
    }

    public static EnumC1753450vjL[] values() {
        return (EnumC1753450vjL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1753450vjL valueOf(String str) {
        return (EnumC1753450vjL) C08FF.LIZ(EnumC1753450vjL.class, str);
    }

    public EnumC1753450vjL(String str, int i, int i2) {
        this.LL = i2;
    }
}
