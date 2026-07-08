package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587530N2p {
    public static final EnumC587530N2p CA_PROP_65;
    public static final /* synthetic */ EnumC587530N2p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587530N2p PRODUCT_SAFETY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587530N2p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587530N2p enumC587530N2p = new EnumC587530N2p("CA_PROP_65", 0, 0);
        CA_PROP_65 = enumC587530N2p;
        EnumC587530N2p enumC587530N2p2 = new EnumC587530N2p("PRODUCT_SAFETY", 1, 1);
        PRODUCT_SAFETY = enumC587530N2p2;
        EnumC587530N2p[] enumC587530N2pArr = {enumC587530N2p, enumC587530N2p2};
        LLILLJJLI = enumC587530N2pArr;
        LLILLL = new C2254308sP(enumC587530N2pArr);
    }

    public static EnumC587530N2p[] values() {
        return (EnumC587530N2p[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587530N2p valueOf(String str) {
        return (EnumC587530N2p) C08FF.LIZ(EnumC587530N2p.class, str);
    }

    public EnumC587530N2p(String str, int i, int i2) {
        this.LL = i2;
    }
}
