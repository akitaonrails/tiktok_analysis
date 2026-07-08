package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1595320rcI {
    public static final EnumC1595320rcI COMPLETE;
    public static final EnumC1595320rcI FAIL;
    public static final /* synthetic */ EnumC1595320rcI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1595320rcI SUCCESS;

    public static InterfaceC2044707zh<EnumC1595320rcI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1595320rcI enumC1595320rcI = new EnumC1595320rcI("SUCCESS", 0);
        SUCCESS = enumC1595320rcI;
        EnumC1595320rcI enumC1595320rcI2 = new EnumC1595320rcI("FAIL", 1);
        FAIL = enumC1595320rcI2;
        EnumC1595320rcI enumC1595320rcI3 = new EnumC1595320rcI("COMPLETE", 2);
        COMPLETE = enumC1595320rcI3;
        EnumC1595320rcI[] enumC1595320rcIArr = {enumC1595320rcI, enumC1595320rcI2, enumC1595320rcI3};
        LL = enumC1595320rcIArr;
        LLILLJJLI = new C2254308sP(enumC1595320rcIArr);
    }

    public static EnumC1595320rcI[] values() {
        return (EnumC1595320rcI[]) LL.clone();
    }

    public static EnumC1595320rcI valueOf(String str) {
        return (EnumC1595320rcI) C08FF.LIZ(EnumC1595320rcI.class, str);
    }

    public EnumC1595320rcI(String str, int i) {
    }
}
