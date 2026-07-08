package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1980607pM {
    public static final EnumC1980607pM EQUAL;
    public static final EnumC1980607pM GREATER_THAN;
    public static final EnumC1980607pM GREATER_THAN_OR_EQUAL;
    public static final EnumC1980607pM IN;
    public static final EnumC1980607pM LESS_THAN;
    public static final EnumC1980607pM LESS_THAN_OR_EQUAL;
    public static final /* synthetic */ EnumC1980607pM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1980607pM NOT_EQUAL;
    public static final EnumC1980607pM NOT_IN;
    public static final EnumC1980607pM UNKNOWN;

    public static InterfaceC2044707zh<EnumC1980607pM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1980607pM enumC1980607pM = new EnumC1980607pM("GREATER_THAN", 0);
        GREATER_THAN = enumC1980607pM;
        EnumC1980607pM enumC1980607pM2 = new EnumC1980607pM("GREATER_THAN_OR_EQUAL", 1);
        GREATER_THAN_OR_EQUAL = enumC1980607pM2;
        EnumC1980607pM enumC1980607pM3 = new EnumC1980607pM("LESS_THAN", 2);
        LESS_THAN = enumC1980607pM3;
        EnumC1980607pM enumC1980607pM4 = new EnumC1980607pM("LESS_THAN_OR_EQUAL", 3);
        LESS_THAN_OR_EQUAL = enumC1980607pM4;
        EnumC1980607pM enumC1980607pM5 = new EnumC1980607pM("EQUAL", 4);
        EQUAL = enumC1980607pM5;
        EnumC1980607pM enumC1980607pM6 = new EnumC1980607pM("NOT_EQUAL", 5);
        NOT_EQUAL = enumC1980607pM6;
        EnumC1980607pM enumC1980607pM7 = new EnumC1980607pM("IN", 6);
        IN = enumC1980607pM7;
        EnumC1980607pM enumC1980607pM8 = new EnumC1980607pM("NOT_IN", 7);
        NOT_IN = enumC1980607pM8;
        EnumC1980607pM enumC1980607pM9 = new EnumC1980607pM("UNKNOWN", 8);
        UNKNOWN = enumC1980607pM9;
        EnumC1980607pM[] enumC1980607pMArr = {enumC1980607pM, enumC1980607pM2, enumC1980607pM3, enumC1980607pM4, enumC1980607pM5, enumC1980607pM6, enumC1980607pM7, enumC1980607pM8, enumC1980607pM9};
        LL = enumC1980607pMArr;
        LLILLJJLI = new C2254308sP(enumC1980607pMArr);
    }

    public static EnumC1980607pM[] values() {
        return (EnumC1980607pM[]) LL.clone();
    }

    public static EnumC1980607pM valueOf(String str) {
        return (EnumC1980607pM) C08FF.LIZ(EnumC1980607pM.class, str);
    }

    public EnumC1980607pM(String str, int i) {
    }
}
