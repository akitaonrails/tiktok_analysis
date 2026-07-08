package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1086920eOI {
    public static final EnumC1086920eOI GIFT;
    public static final /* synthetic */ EnumC1086920eOI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1086920eOI NORMAL;

    public static InterfaceC2044707zh<EnumC1086920eOI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1086920eOI enumC1086920eOI = new EnumC1086920eOI("NORMAL", 0);
        NORMAL = enumC1086920eOI;
        EnumC1086920eOI enumC1086920eOI2 = new EnumC1086920eOI("GIFT", 1);
        GIFT = enumC1086920eOI2;
        EnumC1086920eOI[] enumC1086920eOIArr = {enumC1086920eOI, enumC1086920eOI2};
        LL = enumC1086920eOIArr;
        LLILLJJLI = new C2254308sP(enumC1086920eOIArr);
    }

    public static EnumC1086920eOI[] values() {
        return (EnumC1086920eOI[]) LL.clone();
    }

    public static EnumC1086920eOI valueOf(String str) {
        return (EnumC1086920eOI) C08FF.LIZ(EnumC1086920eOI.class, str);
    }

    public EnumC1086920eOI(String str, int i) {
    }
}
