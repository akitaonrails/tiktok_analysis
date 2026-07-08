package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227210i2Z {
    public static final EnumC1227210i2Z GIFT;
    public static final /* synthetic */ EnumC1227210i2Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1227210i2Z SMB;
    public static final EnumC1227210i2Z TIME;
    public static final EnumC1227210i2Z TOP_GUEST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1227210i2Z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1227210i2Z enumC1227210i2Z = new EnumC1227210i2Z("TIME", 0, "5");
        TIME = enumC1227210i2Z;
        EnumC1227210i2Z enumC1227210i2Z2 = new EnumC1227210i2Z("GIFT", 1, "6");
        GIFT = enumC1227210i2Z2;
        EnumC1227210i2Z enumC1227210i2Z3 = new EnumC1227210i2Z("SMB", 2, "7");
        SMB = enumC1227210i2Z3;
        EnumC1227210i2Z enumC1227210i2Z4 = new EnumC1227210i2Z("TOP_GUEST", 3, "8");
        TOP_GUEST = enumC1227210i2Z4;
        EnumC1227210i2Z[] enumC1227210i2ZArr = {enumC1227210i2Z, enumC1227210i2Z2, enumC1227210i2Z3, enumC1227210i2Z4};
        LLILLJJLI = enumC1227210i2ZArr;
        LLILLL = new C2254308sP(enumC1227210i2ZArr);
    }

    public static EnumC1227210i2Z[] values() {
        return (EnumC1227210i2Z[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1227210i2Z valueOf(String str) {
        return (EnumC1227210i2Z) C08FF.LIZ(EnumC1227210i2Z.class, str);
    }

    public EnumC1227210i2Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
