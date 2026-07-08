package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Asl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193331Asl {
    public static final EnumC2193331Asl BANNER_CLICK;
    public static final EnumC2193331Asl BANNER_CLOSE;
    public static final EnumC2193331Asl BANNER_SHOW;
    public static final EnumC2193331Asl BANNER_SWITCH;
    public static final EnumC2193331Asl BANNER_TEXT_FIT;
    public static final EnumC2193331Asl DATA_REQUEST;
    public static final EnumC2193331Asl DELETE_CLOSE_CACHE;
    public static final EnumC2193331Asl FREQ_CHECK;
    public static final /* synthetic */ EnumC2193331Asl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2193331Asl REPO_INIT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2193331Asl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2193331Asl enumC2193331Asl = new EnumC2193331Asl("REPO_INIT", 0, "repo_init");
        REPO_INIT = enumC2193331Asl;
        EnumC2193331Asl enumC2193331Asl2 = new EnumC2193331Asl("FREQ_CHECK", 1, "freq_check");
        FREQ_CHECK = enumC2193331Asl2;
        EnumC2193331Asl enumC2193331Asl3 = new EnumC2193331Asl("DATA_REQUEST", 2, "data_request");
        DATA_REQUEST = enumC2193331Asl3;
        EnumC2193331Asl enumC2193331Asl4 = new EnumC2193331Asl("BANNER_SHOW", 3, "banner_show");
        BANNER_SHOW = enumC2193331Asl4;
        EnumC2193331Asl enumC2193331Asl5 = new EnumC2193331Asl("BANNER_CLICK", 4, "banner_click");
        BANNER_CLICK = enumC2193331Asl5;
        EnumC2193331Asl enumC2193331Asl6 = new EnumC2193331Asl("BANNER_CLOSE", 5, "banner_close");
        BANNER_CLOSE = enumC2193331Asl6;
        EnumC2193331Asl enumC2193331Asl7 = new EnumC2193331Asl("BANNER_SWITCH", 6, "banner_switch");
        BANNER_SWITCH = enumC2193331Asl7;
        EnumC2193331Asl enumC2193331Asl8 = new EnumC2193331Asl("DELETE_CLOSE_CACHE", 7, "delete_close_cache");
        DELETE_CLOSE_CACHE = enumC2193331Asl8;
        EnumC2193331Asl enumC2193331Asl9 = new EnumC2193331Asl("BANNER_TEXT_FIT", 8, "banner_text_fit");
        BANNER_TEXT_FIT = enumC2193331Asl9;
        EnumC2193331Asl[] enumC2193331AslArr = {enumC2193331Asl, enumC2193331Asl2, enumC2193331Asl3, enumC2193331Asl4, enumC2193331Asl5, enumC2193331Asl6, enumC2193331Asl7, enumC2193331Asl8, enumC2193331Asl9};
        LLILLJJLI = enumC2193331AslArr;
        LLILLL = new C2254308sP(enumC2193331AslArr);
    }

    public static EnumC2193331Asl[] values() {
        return (EnumC2193331Asl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2193331Asl valueOf(String str) {
        return (EnumC2193331Asl) C08FF.LIZ(EnumC2193331Asl.class, str);
    }

    public EnumC2193331Asl(String str, int i, String str2) {
        this.LL = str2;
    }
}
