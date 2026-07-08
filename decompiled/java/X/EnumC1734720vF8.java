package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1734720vF8 {
    public static final EnumC1734720vF8 AD_AUTOFILL;
    public static final /* synthetic */ EnumC1734720vF8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1734720vF8 LOCAL_STORAGE;
    public static final EnumC1734720vF8 NONE;
    public static final EnumC1734720vF8 PNS;
    public static final EnumC1734720vF8 PROFILE;
    public static final EnumC1734720vF8 SERVER_DEFAULT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1734720vF8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1734720vF8 enumC1734720vF8 = new EnumC1734720vF8("NONE", 0, "blank");
        NONE = enumC1734720vF8;
        EnumC1734720vF8 enumC1734720vF82 = new EnumC1734720vF8("LOCAL_STORAGE", 1, "local_storage");
        LOCAL_STORAGE = enumC1734720vF82;
        EnumC1734720vF8 enumC1734720vF83 = new EnumC1734720vF8("SERVER_DEFAULT", 2, "server_default");
        SERVER_DEFAULT = enumC1734720vF83;
        EnumC1734720vF8 enumC1734720vF84 = new EnumC1734720vF8("AD_AUTOFILL", 3, "ad_autofill");
        AD_AUTOFILL = enumC1734720vF84;
        EnumC1734720vF8 enumC1734720vF85 = new EnumC1734720vF8("PROFILE", 4, "profile_prefill");
        PROFILE = enumC1734720vF85;
        EnumC1734720vF8 enumC1734720vF86 = new EnumC1734720vF8("PNS", 5, "pns");
        PNS = enumC1734720vF86;
        EnumC1734720vF8[] enumC1734720vF8Arr = {enumC1734720vF8, enumC1734720vF82, enumC1734720vF83, enumC1734720vF84, enumC1734720vF85, enumC1734720vF86};
        LLILLJJLI = enumC1734720vF8Arr;
        LLILLL = new C2254308sP(enumC1734720vF8Arr);
    }

    public static EnumC1734720vF8[] values() {
        return (EnumC1734720vF8[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1734720vF8 valueOf(String str) {
        return (EnumC1734720vF8) C08FF.LIZ(EnumC1734720vF8.class, str);
    }

    public EnumC1734720vF8(String str, int i, String str2) {
        this.LL = str2;
    }
}
