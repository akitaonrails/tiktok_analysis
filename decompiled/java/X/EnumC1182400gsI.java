package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1182400gsI {
    public static final /* synthetic */ EnumC1182400gsI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1182400gsI MODULE;
    public static final EnumC1182400gsI PAGE;
    public static final EnumC1182400gsI SESSION;

    public static InterfaceC2044707zh<EnumC1182400gsI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1182400gsI enumC1182400gsI = new EnumC1182400gsI("MODULE", 0);
        MODULE = enumC1182400gsI;
        EnumC1182400gsI enumC1182400gsI2 = new EnumC1182400gsI("PAGE", 1);
        PAGE = enumC1182400gsI2;
        EnumC1182400gsI enumC1182400gsI3 = new EnumC1182400gsI("SESSION", 2);
        SESSION = enumC1182400gsI3;
        EnumC1182400gsI[] enumC1182400gsIArr = {enumC1182400gsI, enumC1182400gsI2, enumC1182400gsI3};
        LL = enumC1182400gsIArr;
        LLILLJJLI = new C2254308sP(enumC1182400gsIArr);
    }

    public static EnumC1182400gsI[] values() {
        return (EnumC1182400gsI[]) LL.clone();
    }

    public static EnumC1182400gsI valueOf(String str) {
        return (EnumC1182400gsI) C08FF.LIZ(EnumC1182400gsI.class, str);
    }

    public EnumC1182400gsI(String str, int i) {
    }
}
