package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1995007rg {
    public static final /* synthetic */ EnumC1995007rg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1995007rg TAKO_BOT_MARKET;
    public static final EnumC1995007rg TAKO_CONTAINER_SUG;
    public static final EnumC1995007rg TAKO_LINK_FLOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1995007rg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1995007rg enumC1995007rg = new EnumC1995007rg("TAKO_CONTAINER_SUG", 0, "tako_container_sug");
        TAKO_CONTAINER_SUG = enumC1995007rg;
        EnumC1995007rg enumC1995007rg2 = new EnumC1995007rg("TAKO_LINK_FLOW", 1, "tako_link_flow");
        TAKO_LINK_FLOW = enumC1995007rg2;
        EnumC1995007rg enumC1995007rg3 = new EnumC1995007rg("TAKO_BOT_MARKET", 2, "tako_bot_market");
        TAKO_BOT_MARKET = enumC1995007rg3;
        EnumC1995007rg[] enumC1995007rgArr = {enumC1995007rg, enumC1995007rg2, enumC1995007rg3};
        LLILLJJLI = enumC1995007rgArr;
        LLILLL = new C2254308sP(enumC1995007rgArr);
    }

    public static EnumC1995007rg[] values() {
        return (EnumC1995007rg[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1995007rg valueOf(String str) {
        return (EnumC1995007rg) C08FF.LIZ(EnumC1995007rg.class, str);
    }

    public EnumC1995007rg(String str, int i, String str2) {
        this.LL = str2;
    }
}
