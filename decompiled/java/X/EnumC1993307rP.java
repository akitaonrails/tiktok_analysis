package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1993307rP {
    public static final EnumC1993307rP GENERAL_SEARCH_INFLOW;
    public static final EnumC1993307rP GENERAL_SEARCH_SINGLE;
    public static final EnumC1993307rP GENERAL_SEARCH_STREAM;
    public static final /* synthetic */ EnumC1993307rP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1993307rP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1993307rP enumC1993307rP = new EnumC1993307rP("GENERAL_SEARCH_STREAM", 0, "/aweme/v1/general/search/stream/", "/aweme/v2/search/general/stream/");
        GENERAL_SEARCH_STREAM = enumC1993307rP;
        EnumC1993307rP enumC1993307rP2 = new EnumC1993307rP("GENERAL_SEARCH_SINGLE", 1, "/aweme/v1/general/search/single/", "/aweme/v2/search/general/single/");
        GENERAL_SEARCH_SINGLE = enumC1993307rP2;
        EnumC1993307rP enumC1993307rP3 = new EnumC1993307rP("GENERAL_SEARCH_INFLOW", 2, "/aweme/v1/search/general/inflow/", "/aweme/v2/search/general/inflow/");
        GENERAL_SEARCH_INFLOW = enumC1993307rP3;
        EnumC1993307rP[] enumC1993307rPArr = {enumC1993307rP, enumC1993307rP2, enumC1993307rP3};
        LLILLJJLI = enumC1993307rPArr;
        LLILLL = new C2254308sP(enumC1993307rPArr);
    }

    public static EnumC1993307rP[] values() {
        return (EnumC1993307rP[]) LLILLJJLI.clone();
    }

    public final String getPath() {
        return this.LL;
    }

    public static EnumC1993307rP valueOf(String str) {
        return (EnumC1993307rP) C08FF.LIZ(EnumC1993307rP.class, str);
    }

    public EnumC1993307rP(String str, int i, String str2, String str3) {
        this.LL = ((Boolean) C079I.LIZ.getValue()).booleanValue() ? str3 : str2;
    }
}
