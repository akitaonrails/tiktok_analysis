package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063200dm2 {
    public static final EnumC1063200dm2 AGGREGATION_PAGE;
    public static final EnumC1063200dm2 COLD_BOOT;
    public static final EnumC1063200dm2 FEED;
    public static final /* synthetic */ EnumC1063200dm2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1063200dm2 PROFILE;
    public static final EnumC1063200dm2 PUBLISH;
    public static final EnumC1063200dm2 RETRY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1063200dm2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1063200dm2 enumC1063200dm2 = new EnumC1063200dm2("FEED", 0, "feed");
        FEED = enumC1063200dm2;
        EnumC1063200dm2 enumC1063200dm22 = new EnumC1063200dm2("PROFILE", 1, "profile");
        PROFILE = enumC1063200dm22;
        EnumC1063200dm2 enumC1063200dm23 = new EnumC1063200dm2("AGGREGATION_PAGE", 2, "aggregation_page");
        AGGREGATION_PAGE = enumC1063200dm23;
        EnumC1063200dm2 enumC1063200dm24 = new EnumC1063200dm2("COLD_BOOT", 3, "cold_boot");
        COLD_BOOT = enumC1063200dm24;
        EnumC1063200dm2 enumC1063200dm25 = new EnumC1063200dm2("PUBLISH", 4, "publish");
        PUBLISH = enumC1063200dm25;
        EnumC1063200dm2 enumC1063200dm26 = new EnumC1063200dm2("RETRY", 5, "retry");
        RETRY = enumC1063200dm26;
        EnumC1063200dm2[] enumC1063200dm2Arr = {enumC1063200dm2, enumC1063200dm22, enumC1063200dm23, enumC1063200dm24, enumC1063200dm25, enumC1063200dm26};
        LLILLJJLI = enumC1063200dm2Arr;
        LLILLL = new C2254308sP(enumC1063200dm2Arr);
    }

    public static EnumC1063200dm2[] values() {
        return (EnumC1063200dm2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1063200dm2 valueOf(String str) {
        return (EnumC1063200dm2) C08FF.LIZ(EnumC1063200dm2.class, str);
    }

    public EnumC1063200dm2(String str, int i, String str2) {
        this.LL = str2;
    }
}
