package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993670bxt {
    public static final /* synthetic */ EnumC993670bxt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993670bxt TYPE_BROWSER_WEB;
    public static final EnumC993670bxt TYPE_DEEPLINK_FALLBACK_STORE;
    public static final EnumC993670bxt TYPE_DEEPLINK_FALLBACK_WEB;
    public static final EnumC993670bxt TYPE_WEB_URL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993670bxt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993670bxt enumC993670bxt = new EnumC993670bxt("TYPE_WEB_URL", 0, 0);
        TYPE_WEB_URL = enumC993670bxt;
        EnumC993670bxt enumC993670bxt2 = new EnumC993670bxt("TYPE_DEEPLINK_FALLBACK_STORE", 1, 1);
        TYPE_DEEPLINK_FALLBACK_STORE = enumC993670bxt2;
        EnumC993670bxt enumC993670bxt3 = new EnumC993670bxt("TYPE_DEEPLINK_FALLBACK_WEB", 2, 2);
        TYPE_DEEPLINK_FALLBACK_WEB = enumC993670bxt3;
        EnumC993670bxt enumC993670bxt4 = new EnumC993670bxt("TYPE_BROWSER_WEB", 3, 4);
        TYPE_BROWSER_WEB = enumC993670bxt4;
        EnumC993670bxt[] enumC993670bxtArr = {enumC993670bxt, enumC993670bxt2, enumC993670bxt3, enumC993670bxt4};
        LLILLJJLI = enumC993670bxtArr;
        LLILLL = new C2254308sP(enumC993670bxtArr);
    }

    public static EnumC993670bxt[] values() {
        return (EnumC993670bxt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993670bxt valueOf(String str) {
        return (EnumC993670bxt) C08FF.LIZ(EnumC993670bxt.class, str);
    }

    public EnumC993670bxt(String str, int i, int i2) {
        this.LL = i2;
    }
}
