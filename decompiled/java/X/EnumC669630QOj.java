package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC669630QOj {
    public static final C669660QOm Companion;
    public static final EnumC669630QOj ECOM_LIVE;
    public static final /* synthetic */ EnumC669630QOj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC669630QOj NEW_USER;
    public static final EnumC669630QOj SHOP;
    public static final EnumC669630QOj STORE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC669630QOj> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0QOm] */
    static {
        EnumC669630QOj enumC669630QOj = new EnumC669630QOj("SHOP", 0, "shop");
        SHOP = enumC669630QOj;
        EnumC669630QOj enumC669630QOj2 = new EnumC669630QOj("STORE", 1, "store");
        STORE = enumC669630QOj2;
        EnumC669630QOj enumC669630QOj3 = new EnumC669630QOj("ECOM_LIVE", 2, "ecom_live");
        ECOM_LIVE = enumC669630QOj3;
        EnumC669630QOj enumC669630QOj4 = new EnumC669630QOj("NEW_USER", 3, "tiktok_ecom_new_user");
        NEW_USER = enumC669630QOj4;
        EnumC669630QOj[] enumC669630QOjArr = {enumC669630QOj, enumC669630QOj2, enumC669630QOj3, enumC669630QOj4};
        LLILLJJLI = enumC669630QOjArr;
        LLILLL = new C2254308sP(enumC669630QOjArr);
        Companion = new Object() { // from class: X.0QOm
        };
    }

    public static EnumC669630QOj[] values() {
        return (EnumC669630QOj[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC669630QOj valueOf(String str) {
        return (EnumC669630QOj) C08FF.LIZ(EnumC669630QOj.class, str);
    }

    public EnumC669630QOj(String str, int i, String str2) {
        this.LL = str2;
    }
}
