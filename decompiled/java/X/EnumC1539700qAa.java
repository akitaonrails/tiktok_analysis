package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1539700qAa {
    public static final EnumC1539700qAa API_DOWNGRADE;
    public static final EnumC1539700qAa BUNDLE_PARSE_ERROR;
    public static final EnumC1539700qAa DEBUG_DISABLED;
    public static final EnumC1539700qAa HYDRATE_FAILED;
    public static final /* synthetic */ EnumC1539700qAa[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1539700qAa NONE;
    public static final EnumC1539700qAa OTHER_ERROR;
    public static final EnumC1539700qAa OTHER_NO_REQUEST_REASON;
    public static final EnumC1539700qAa RENDER_LEPUS_FAILED;
    public static final EnumC1539700qAa SERVER_DOWNGRADE;
    public static final EnumC1539700qAa SETTING_DISABLED;
    public static final EnumC1539700qAa SSR_MODE_CACHE_NOT_EXIST;
    public static final EnumC1539700qAa SSR_MODE_GECKO_EXIST;
    public static final EnumC1539700qAa SSR_MODE_NOT_SUPPORT;
    public static final EnumC1539700qAa UNKNOWN_SSR_MODE;
    public static final EnumC1539700qAa WITHOUT_SSR_URL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1539700qAa> getEntries() {
        return LLILZ;
    }

    static {
        int i = 0;
        EnumC1539700qAa enumC1539700qAa = new EnumC1539700qAa("NONE", i, i);
        NONE = enumC1539700qAa;
        int i2 = 1;
        EnumC1539700qAa enumC1539700qAa2 = new EnumC1539700qAa("SERVER_DOWNGRADE", i2, i2);
        SERVER_DOWNGRADE = enumC1539700qAa2;
        int i3 = 2;
        EnumC1539700qAa enumC1539700qAa3 = new EnumC1539700qAa("API_DOWNGRADE", i3, i3);
        API_DOWNGRADE = enumC1539700qAa3;
        int i4 = 3;
        EnumC1539700qAa enumC1539700qAa4 = new EnumC1539700qAa("BUNDLE_PARSE_ERROR", i4, i4);
        BUNDLE_PARSE_ERROR = enumC1539700qAa4;
        EnumC1539700qAa enumC1539700qAa5 = new EnumC1539700qAa("OTHER_ERROR", 4, 99);
        OTHER_ERROR = enumC1539700qAa5;
        EnumC1539700qAa enumC1539700qAa6 = new EnumC1539700qAa("RENDER_LEPUS_FAILED", 5, 100);
        RENDER_LEPUS_FAILED = enumC1539700qAa6;
        EnumC1539700qAa enumC1539700qAa7 = new EnumC1539700qAa("HYDRATE_FAILED", 6, 101);
        HYDRATE_FAILED = enumC1539700qAa7;
        EnumC1539700qAa enumC1539700qAa8 = new EnumC1539700qAa("SETTING_DISABLED", 7, 200);
        SETTING_DISABLED = enumC1539700qAa8;
        EnumC1539700qAa enumC1539700qAa9 = new EnumC1539700qAa("WITHOUT_SSR_URL", 8, 201, "SSR mode is null");
        WITHOUT_SSR_URL = enumC1539700qAa9;
        EnumC1539700qAa enumC1539700qAa10 = new EnumC1539700qAa("SSR_MODE_NOT_SUPPORT", 9, 202, "SSR mode is 0");
        SSR_MODE_NOT_SUPPORT = enumC1539700qAa10;
        EnumC1539700qAa enumC1539700qAa11 = new EnumC1539700qAa("SSR_MODE_GECKO_EXIST", 10, 203, "Gecko Exists");
        SSR_MODE_GECKO_EXIST = enumC1539700qAa11;
        EnumC1539700qAa enumC1539700qAa12 = new EnumC1539700qAa("SSR_MODE_CACHE_NOT_EXIST", 11, 204, "Cache Not Exists");
        SSR_MODE_CACHE_NOT_EXIST = enumC1539700qAa12;
        EnumC1539700qAa enumC1539700qAa13 = new EnumC1539700qAa("UNKNOWN_SSR_MODE", 12, 209, "Unknown SSR Mode");
        UNKNOWN_SSR_MODE = enumC1539700qAa13;
        EnumC1539700qAa enumC1539700qAa14 = new EnumC1539700qAa("DEBUG_DISABLED", 13, 200);
        DEBUG_DISABLED = enumC1539700qAa14;
        EnumC1539700qAa enumC1539700qAa15 = new EnumC1539700qAa("OTHER_NO_REQUEST_REASON", 14, 299);
        OTHER_NO_REQUEST_REASON = enumC1539700qAa15;
        EnumC1539700qAa[] enumC1539700qAaArr = {enumC1539700qAa, enumC1539700qAa2, enumC1539700qAa3, enumC1539700qAa4, enumC1539700qAa5, enumC1539700qAa6, enumC1539700qAa7, enumC1539700qAa8, enumC1539700qAa9, enumC1539700qAa10, enumC1539700qAa11, enumC1539700qAa12, enumC1539700qAa13, enumC1539700qAa14, enumC1539700qAa15};
        LLILLL = enumC1539700qAaArr;
        LLILZ = new C2254308sP(enumC1539700qAaArr);
    }

    public static EnumC1539700qAa[] values() {
        return (EnumC1539700qAa[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC1539700qAa valueOf(String str) {
        return (EnumC1539700qAa) C08FF.LIZ(EnumC1539700qAa.class, str);
    }

    public /* synthetic */ EnumC1539700qAa(String str, int i, int i2) {
        this(str, i, i2, "");
    }

    public EnumC1539700qAa(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
