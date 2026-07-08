package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586470MzN {
    public static final EnumC586470MzN FEED;
    public static final /* synthetic */ EnumC586470MzN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586470MzN PLUGIN_CONFIG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC586470MzN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586470MzN enumC586470MzN = new EnumC586470MzN("PLUGIN_CONFIG", 0, "tiktok/v1/plugin/config");
        PLUGIN_CONFIG = enumC586470MzN;
        EnumC586470MzN enumC586470MzN2 = new EnumC586470MzN("FEED", 1, "aweme/v2/feed");
        FEED = enumC586470MzN2;
        EnumC586470MzN[] enumC586470MzNArr = {enumC586470MzN, enumC586470MzN2};
        LLILLJJLI = enumC586470MzNArr;
        LLILLL = new C2254308sP(enumC586470MzNArr);
    }

    public static EnumC586470MzN[] values() {
        return (EnumC586470MzN[]) LLILLJJLI.clone();
    }

    public final String getEndpoint() {
        return this.LL;
    }

    public static EnumC586470MzN valueOf(String str) {
        return (EnumC586470MzN) C08FF.LIZ(EnumC586470MzN.class, str);
    }

    public EnumC586470MzN(String str, int i, String str2) {
        this.LL = str2;
    }
}
