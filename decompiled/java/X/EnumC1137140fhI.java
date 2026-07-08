package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137140fhI {
    public static final EnumC1137140fhI COMB;
    public static final EnumC1137140fhI ENTRY;
    public static final EnumC1137140fhI EXIT;
    public static final EnumC1137140fhI FIRST;
    public static final /* synthetic */ EnumC1137140fhI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1137140fhI SHOW;

    public static InterfaceC2044707zh<EnumC1137140fhI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137140fhI enumC1137140fhI = new EnumC1137140fhI("FIRST", 0);
        FIRST = enumC1137140fhI;
        EnumC1137140fhI enumC1137140fhI2 = new EnumC1137140fhI("ENTRY", 1);
        ENTRY = enumC1137140fhI2;
        EnumC1137140fhI enumC1137140fhI3 = new EnumC1137140fhI("COMB", 2);
        COMB = enumC1137140fhI3;
        EnumC1137140fhI enumC1137140fhI4 = new EnumC1137140fhI("SHOW", 3);
        SHOW = enumC1137140fhI4;
        EnumC1137140fhI enumC1137140fhI5 = new EnumC1137140fhI("EXIT", 4);
        EXIT = enumC1137140fhI5;
        EnumC1137140fhI[] enumC1137140fhIArr = {enumC1137140fhI, enumC1137140fhI2, enumC1137140fhI3, enumC1137140fhI4, enumC1137140fhI5};
        LL = enumC1137140fhIArr;
        LLILLJJLI = new C2254308sP(enumC1137140fhIArr);
    }

    public static EnumC1137140fhI[] values() {
        return (EnumC1137140fhI[]) LL.clone();
    }

    public static EnumC1137140fhI valueOf(String str) {
        return (EnumC1137140fhI) C08FF.LIZ(EnumC1137140fhI.class, str);
    }

    public EnumC1137140fhI(String str, int i) {
    }
}
