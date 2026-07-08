package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1B4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2199071B4v {
    public static final EnumC2199071B4v CONFIRMED;
    public static final EnumC2199071B4v EMPTY;
    public static final EnumC2199071B4v ERROR;
    public static final EnumC2199071B4v EXPIRED;
    public static final /* synthetic */ EnumC2199071B4v[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC2199071B4v LOADING;
    public static final EnumC2199071B4v NEW;
    public static final EnumC2199071B4v REFUSED;
    public static final EnumC2199071B4v SCANNED;
    public final String LL;
    public String LLILLJJLI = null;
    public Integer LLILLL = 0;

    public static InterfaceC2044707zh<EnumC2199071B4v> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC2199071B4v enumC2199071B4v = new EnumC2199071B4v(0, "CONFIRMED", "confirmed");
        CONFIRMED = enumC2199071B4v;
        EnumC2199071B4v enumC2199071B4v2 = new EnumC2199071B4v(1, "LOADING", "loading");
        LOADING = enumC2199071B4v2;
        EnumC2199071B4v enumC2199071B4v3 = new EnumC2199071B4v(2, "EXPIRED", "expired");
        EXPIRED = enumC2199071B4v3;
        EnumC2199071B4v enumC2199071B4v4 = new EnumC2199071B4v(3, "REFUSED", "refused");
        REFUSED = enumC2199071B4v4;
        EnumC2199071B4v enumC2199071B4v5 = new EnumC2199071B4v(4, "SCANNED", "scanned");
        SCANNED = enumC2199071B4v5;
        EnumC2199071B4v enumC2199071B4v6 = new EnumC2199071B4v(5, "NEW", "new");
        NEW = enumC2199071B4v6;
        EnumC2199071B4v enumC2199071B4v7 = new EnumC2199071B4v(6, "ERROR", "error");
        ERROR = enumC2199071B4v7;
        EnumC2199071B4v enumC2199071B4v8 = new EnumC2199071B4v(7, "EMPTY", "empty");
        EMPTY = enumC2199071B4v8;
        EnumC2199071B4v[] enumC2199071B4vArr = {enumC2199071B4v, enumC2199071B4v2, enumC2199071B4v3, enumC2199071B4v4, enumC2199071B4v5, enumC2199071B4v6, enumC2199071B4v7, enumC2199071B4v8};
        LLILZ = enumC2199071B4vArr;
        LLILZIL = new C2254308sP(enumC2199071B4vArr);
    }

    public static EnumC2199071B4v[] values() {
        return (EnumC2199071B4v[]) LLILZ.clone();
    }

    public final Integer getErrorCode() {
        return this.LLILLL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2199071B4v valueOf(String str) {
        return (EnumC2199071B4v) C08FF.LIZ(EnumC2199071B4v.class, str);
    }

    public final void setErrorCode(Integer num) {
        this.LLILLL = num;
    }

    public final void setMsg(String str) {
        this.LLILLJJLI = str;
    }

    public EnumC2199071B4v(int i, String str, String str2) {
        this.LL = str2;
    }
}
