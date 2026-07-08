package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC970360bMI {
    public static final EnumC970360bMI ANCHOR;
    public static final EnumC970360bMI AUDIENCE;
    public static final /* synthetic */ EnumC970360bMI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC970360bMI SENDER;

    public static InterfaceC2044707zh<EnumC970360bMI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC970360bMI enumC970360bMI = new EnumC970360bMI("SENDER", 0);
        SENDER = enumC970360bMI;
        EnumC970360bMI enumC970360bMI2 = new EnumC970360bMI("ANCHOR", 1);
        ANCHOR = enumC970360bMI2;
        EnumC970360bMI enumC970360bMI3 = new EnumC970360bMI("AUDIENCE", 2);
        AUDIENCE = enumC970360bMI3;
        EnumC970360bMI[] enumC970360bMIArr = {enumC970360bMI, enumC970360bMI2, enumC970360bMI3};
        LL = enumC970360bMIArr;
        LLILLJJLI = new C2254308sP(enumC970360bMIArr);
    }

    public static EnumC970360bMI[] values() {
        return (EnumC970360bMI[]) LL.clone();
    }

    public static EnumC970360bMI valueOf(String str) {
        return (EnumC970360bMI) C08FF.LIZ(EnumC970360bMI.class, str);
    }

    public EnumC970360bMI(String str, int i) {
    }
}
