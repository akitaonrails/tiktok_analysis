package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1614520s7G {
    public static final EnumC1614520s7G INNER_FEED;
    public static final /* synthetic */ EnumC1614520s7G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1614520s7G SUBSCRIPTION_PAGE;
    public static final EnumC1614520s7G UNKNOWN;

    public static InterfaceC2044707zh<EnumC1614520s7G> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1614520s7G enumC1614520s7G = new EnumC1614520s7G("SUBSCRIPTION_PAGE", 0);
        SUBSCRIPTION_PAGE = enumC1614520s7G;
        EnumC1614520s7G enumC1614520s7G2 = new EnumC1614520s7G("INNER_FEED", 1);
        INNER_FEED = enumC1614520s7G2;
        EnumC1614520s7G enumC1614520s7G3 = new EnumC1614520s7G("UNKNOWN", 2);
        UNKNOWN = enumC1614520s7G3;
        EnumC1614520s7G[] enumC1614520s7GArr = {enumC1614520s7G, enumC1614520s7G2, enumC1614520s7G3};
        LL = enumC1614520s7GArr;
        LLILLJJLI = new C2254308sP(enumC1614520s7GArr);
    }

    public static EnumC1614520s7G[] values() {
        return (EnumC1614520s7G[]) LL.clone();
    }

    public static EnumC1614520s7G valueOf(String str) {
        return (EnumC1614520s7G) C08FF.LIZ(EnumC1614520s7G.class, str);
    }

    public EnumC1614520s7G(String str, int i) {
    }
}
