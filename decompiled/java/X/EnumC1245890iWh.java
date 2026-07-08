package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1245890iWh {
    public static final EnumC1245890iWh DEFAULT_PAGE;
    public static final /* synthetic */ EnumC1245890iWh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1245890iWh SEARCH_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1245890iWh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1245890iWh enumC1245890iWh = new EnumC1245890iWh("SEARCH_PAGE", 0, "search_page");
        SEARCH_PAGE = enumC1245890iWh;
        EnumC1245890iWh enumC1245890iWh2 = new EnumC1245890iWh("DEFAULT_PAGE", 1, "default_page");
        DEFAULT_PAGE = enumC1245890iWh2;
        EnumC1245890iWh[] enumC1245890iWhArr = {enumC1245890iWh, enumC1245890iWh2};
        LLILLJJLI = enumC1245890iWhArr;
        LLILLL = new C2254308sP(enumC1245890iWhArr);
    }

    public static EnumC1245890iWh[] values() {
        return (EnumC1245890iWh[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1245890iWh valueOf(String str) {
        return (EnumC1245890iWh) C08FF.LIZ(EnumC1245890iWh.class, str);
    }

    public EnumC1245890iWh(String str, int i, String str2) {
        this.LL = str2;
    }
}
