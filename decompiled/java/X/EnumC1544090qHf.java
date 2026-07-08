package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1544090qHf {
    public static final EnumC1544090qHf H5;
    public static final /* synthetic */ EnumC1544090qHf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1544090qHf LYNX;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1544090qHf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1544090qHf enumC1544090qHf = new EnumC1544090qHf("LYNX", 0, "lynx");
        LYNX = enumC1544090qHf;
        EnumC1544090qHf enumC1544090qHf2 = new EnumC1544090qHf("H5", 1, "h5");
        H5 = enumC1544090qHf2;
        EnumC1544090qHf[] enumC1544090qHfArr = {enumC1544090qHf, enumC1544090qHf2};
        LLILLJJLI = enumC1544090qHfArr;
        LLILLL = new C2254308sP(enumC1544090qHfArr);
    }

    public static EnumC1544090qHf[] values() {
        return (EnumC1544090qHf[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1544090qHf valueOf(String str) {
        return (EnumC1544090qHf) C08FF.LIZ(EnumC1544090qHf.class, str);
    }

    public EnumC1544090qHf(String str, int i, String str2) {
        this.LL = str2;
    }
}
