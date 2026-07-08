package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588750N7h {
    public static final EnumC588750N7h JSON_PARSE_ERROR;
    public static final /* synthetic */ EnumC588750N7h[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC588750N7h REGISTER_DUPLICATE;
    public static final EnumC588750N7h REGISTER_INVERSION;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC588750N7h> getEntries() {
        return LLILZ;
    }

    static {
        EnumC588750N7h enumC588750N7h = new EnumC588750N7h("JSON_PARSE_ERROR", 0, 0, "json_parse_error");
        JSON_PARSE_ERROR = enumC588750N7h;
        EnumC588750N7h enumC588750N7h2 = new EnumC588750N7h("REGISTER_INVERSION", 1, 1, "register_inversion");
        REGISTER_INVERSION = enumC588750N7h2;
        EnumC588750N7h enumC588750N7h3 = new EnumC588750N7h("REGISTER_DUPLICATE", 2, 2, "register_duplicate");
        REGISTER_DUPLICATE = enumC588750N7h3;
        EnumC588750N7h[] enumC588750N7hArr = {enumC588750N7h, enumC588750N7h2, enumC588750N7h3};
        LLILLL = enumC588750N7hArr;
        LLILZ = new C2254308sP(enumC588750N7hArr);
    }

    public static EnumC588750N7h[] values() {
        return (EnumC588750N7h[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getReason() {
        return this.LLILLJJLI;
    }

    public static EnumC588750N7h valueOf(String str) {
        return (EnumC588750N7h) C08FF.LIZ(EnumC588750N7h.class, str);
    }

    public EnumC588750N7h(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
