package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992060bvI {
    public static final EnumC992060bvI BOTTOM_BAR;
    public static final /* synthetic */ EnumC992060bvI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992060bvI SEEK_BAR;
    public static final EnumC992060bvI TOP_BAR;
    public static final EnumC992060bvI UNSPECIFIED;

    public static InterfaceC2044707zh<EnumC992060bvI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992060bvI enumC992060bvI = new EnumC992060bvI("UNSPECIFIED", 0);
        UNSPECIFIED = enumC992060bvI;
        EnumC992060bvI enumC992060bvI2 = new EnumC992060bvI("TOP_BAR", 1);
        TOP_BAR = enumC992060bvI2;
        EnumC992060bvI enumC992060bvI3 = new EnumC992060bvI("BOTTOM_BAR", 2);
        BOTTOM_BAR = enumC992060bvI3;
        EnumC992060bvI enumC992060bvI4 = new EnumC992060bvI("SEEK_BAR", 3);
        SEEK_BAR = enumC992060bvI4;
        EnumC992060bvI[] enumC992060bvIArr = {enumC992060bvI, enumC992060bvI2, enumC992060bvI3, enumC992060bvI4};
        LL = enumC992060bvIArr;
        LLILLJJLI = new C2254308sP(enumC992060bvIArr);
    }

    public static EnumC992060bvI[] values() {
        return (EnumC992060bvI[]) LL.clone();
    }

    public static EnumC992060bvI valueOf(String str) {
        return (EnumC992060bvI) C08FF.LIZ(EnumC992060bvI.class, str);
    }

    public EnumC992060bvI(String str, int i) {
    }
}
