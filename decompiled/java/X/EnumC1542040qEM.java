package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1542040qEM {
    public static final /* synthetic */ EnumC1542040qEM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1542040qEM PAGE;
    public static final EnumC1542040qEM POPUP;
    public static final EnumC1542040qEM VIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1542040qEM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1542040qEM enumC1542040qEM = new EnumC1542040qEM("PAGE", 0, "page");
        PAGE = enumC1542040qEM;
        EnumC1542040qEM enumC1542040qEM2 = new EnumC1542040qEM("POPUP", 1, "popup");
        POPUP = enumC1542040qEM2;
        EnumC1542040qEM enumC1542040qEM3 = new EnumC1542040qEM("VIEW", 2, "view");
        VIEW = enumC1542040qEM3;
        EnumC1542040qEM[] enumC1542040qEMArr = {enumC1542040qEM, enumC1542040qEM2, enumC1542040qEM3};
        LLILLJJLI = enumC1542040qEMArr;
        LLILLL = new C2254308sP(enumC1542040qEMArr);
    }

    public static EnumC1542040qEM[] values() {
        return (EnumC1542040qEM[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1542040qEM valueOf(String str) {
        return (EnumC1542040qEM) C08FF.LIZ(EnumC1542040qEM.class, str);
    }

    public EnumC1542040qEM(String str, int i, String str2) {
        this.LL = str2;
    }
}
