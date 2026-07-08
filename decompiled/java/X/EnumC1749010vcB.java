package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749010vcB {
    public static final EnumC1749010vcB FAIL_CURP_1;
    public static final EnumC1749010vcB FAIL_CURP_2;
    public static final EnumC1749010vcB FAIL_CURP_3;
    public static final EnumC1749010vcB FAIL_OTHER;
    public static final EnumC1749010vcB FAIL_RFC_1;
    public static final EnumC1749010vcB FAIL_RFC_2;
    public static final EnumC1749010vcB FAIL_RFC_3;
    public static final /* synthetic */ EnumC1749010vcB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1749010vcB SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1749010vcB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1749010vcB enumC1749010vcB = new EnumC1749010vcB("SUCCESS", 0, 0);
        SUCCESS = enumC1749010vcB;
        EnumC1749010vcB enumC1749010vcB2 = new EnumC1749010vcB("FAIL_RFC_1", 1, 1);
        FAIL_RFC_1 = enumC1749010vcB2;
        EnumC1749010vcB enumC1749010vcB3 = new EnumC1749010vcB("FAIL_RFC_2", 2, 2);
        FAIL_RFC_2 = enumC1749010vcB3;
        EnumC1749010vcB enumC1749010vcB4 = new EnumC1749010vcB("FAIL_RFC_3", 3, 3);
        FAIL_RFC_3 = enumC1749010vcB4;
        EnumC1749010vcB enumC1749010vcB5 = new EnumC1749010vcB("FAIL_CURP_1", 4, 4);
        FAIL_CURP_1 = enumC1749010vcB5;
        EnumC1749010vcB enumC1749010vcB6 = new EnumC1749010vcB("FAIL_CURP_2", 5, 5);
        FAIL_CURP_2 = enumC1749010vcB6;
        EnumC1749010vcB enumC1749010vcB7 = new EnumC1749010vcB("FAIL_CURP_3", 6, 6);
        FAIL_CURP_3 = enumC1749010vcB7;
        EnumC1749010vcB enumC1749010vcB8 = new EnumC1749010vcB("FAIL_OTHER", 7, 7);
        FAIL_OTHER = enumC1749010vcB8;
        EnumC1749010vcB[] enumC1749010vcBArr = {enumC1749010vcB, enumC1749010vcB2, enumC1749010vcB3, enumC1749010vcB4, enumC1749010vcB5, enumC1749010vcB6, enumC1749010vcB7, enumC1749010vcB8};
        LLILLJJLI = enumC1749010vcBArr;
        LLILLL = new C2254308sP(enumC1749010vcBArr);
    }

    public static EnumC1749010vcB[] values() {
        return (EnumC1749010vcB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1749010vcB valueOf(String str) {
        return (EnumC1749010vcB) C08FF.LIZ(EnumC1749010vcB.class, str);
    }

    public EnumC1749010vcB(String str, int i, int i2) {
        this.LL = i2;
    }
}
