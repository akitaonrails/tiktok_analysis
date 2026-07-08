package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Art, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2192791Art {
    public static final EnumC2192791Art IS_APP_INSTALLED;
    public static final /* synthetic */ EnumC2192791Art[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2192791Art OPEN_APP;
    public static final EnumC2192791Art OPEN_APP_STORE;
    public static final EnumC2192791Art OPEN_MINI_CARD;
    public static final EnumC2192791Art OPEN_OR_INSTALL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2192791Art> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2192791Art enumC2192791Art = new EnumC2192791Art("OPEN_APP", 0, "open_app");
        OPEN_APP = enumC2192791Art;
        EnumC2192791Art enumC2192791Art2 = new EnumC2192791Art("OPEN_APP_STORE", 1, "open_app_store");
        OPEN_APP_STORE = enumC2192791Art2;
        EnumC2192791Art enumC2192791Art3 = new EnumC2192791Art("OPEN_MINI_CARD", 2, "open_mini_card");
        OPEN_MINI_CARD = enumC2192791Art3;
        EnumC2192791Art enumC2192791Art4 = new EnumC2192791Art("IS_APP_INSTALLED", 3, "is_app_installed");
        IS_APP_INSTALLED = enumC2192791Art4;
        EnumC2192791Art enumC2192791Art5 = new EnumC2192791Art("OPEN_OR_INSTALL", 4, "open_or_install");
        OPEN_OR_INSTALL = enumC2192791Art5;
        EnumC2192791Art[] enumC2192791ArtArr = {enumC2192791Art, enumC2192791Art2, enumC2192791Art3, enumC2192791Art4, enumC2192791Art5};
        LLILLJJLI = enumC2192791ArtArr;
        LLILLL = new C2254308sP(enumC2192791ArtArr);
    }

    public static EnumC2192791Art[] values() {
        return (EnumC2192791Art[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC2192791Art valueOf(String str) {
        return (EnumC2192791Art) C08FF.LIZ(EnumC2192791Art.class, str);
    }

    public EnumC2192791Art(String str, int i, String str2) {
        this.LL = str2;
    }
}
