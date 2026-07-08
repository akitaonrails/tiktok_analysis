package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1750406tK {
    public static final EnumC1750406tK FILTER_BY_FREQUENCY;
    public static final EnumC1750406tK FILTER_BY_NO_DATA;
    public static final EnumC1750406tK FILTER_BY_SWITCH;
    public static final /* synthetic */ EnumC1750406tK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1750406tK SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1750406tK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1750406tK enumC1750406tK = new EnumC1750406tK("FILTER_BY_SWITCH", 0, "filter_by_switch");
        FILTER_BY_SWITCH = enumC1750406tK;
        EnumC1750406tK enumC1750406tK2 = new EnumC1750406tK("FILTER_BY_NO_DATA", 1, "filter_by_no_data");
        FILTER_BY_NO_DATA = enumC1750406tK2;
        EnumC1750406tK enumC1750406tK3 = new EnumC1750406tK("FILTER_BY_FREQUENCY", 2, "filter_by_frequency");
        FILTER_BY_FREQUENCY = enumC1750406tK3;
        EnumC1750406tK enumC1750406tK4 = new EnumC1750406tK("SUCCESS", 3, "success");
        SUCCESS = enumC1750406tK4;
        EnumC1750406tK[] enumC1750406tKArr = {enumC1750406tK, enumC1750406tK2, enumC1750406tK3, enumC1750406tK4};
        LLILLJJLI = enumC1750406tKArr;
        LLILLL = new C2254308sP(enumC1750406tKArr);
    }

    public static EnumC1750406tK[] values() {
        return (EnumC1750406tK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1750406tK valueOf(String str) {
        return (EnumC1750406tK) C08FF.LIZ(EnumC1750406tK.class, str);
    }

    public EnumC1750406tK(String str, int i, String str2) {
        this.LL = str2;
    }
}
