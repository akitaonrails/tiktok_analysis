package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC920530a3v {
    public static final EnumC920530a3v EOY_LV1;
    public static final EnumC920530a3v EOY_LV2;
    public static final EnumC920530a3v EOY_LV3;
    public static final /* synthetic */ EnumC920530a3v[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC920530a3v> getEntries() {
        return LLILLL;
    }

    static {
        EnumC920530a3v enumC920530a3v = new EnumC920530a3v("EOY_LV1", 0, "2023_eoy_lv1");
        EOY_LV1 = enumC920530a3v;
        EnumC920530a3v enumC920530a3v2 = new EnumC920530a3v("EOY_LV2", 1, "2023_eoy_lv2");
        EOY_LV2 = enumC920530a3v2;
        EnumC920530a3v enumC920530a3v3 = new EnumC920530a3v("EOY_LV3", 2, "2023_eoy_lv3");
        EOY_LV3 = enumC920530a3v3;
        EnumC920530a3v[] enumC920530a3vArr = {enumC920530a3v, enumC920530a3v2, enumC920530a3v3};
        LLILLJJLI = enumC920530a3vArr;
        LLILLL = new C2254308sP(enumC920530a3vArr);
    }

    public static EnumC920530a3v[] values() {
        return (EnumC920530a3v[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC920530a3v valueOf(String str) {
        return (EnumC920530a3v) C08FF.LIZ(EnumC920530a3v.class, str);
    }

    public EnumC920530a3v(String str, int i, String str2) {
        this.LL = str2;
    }
}
