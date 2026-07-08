package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587030N0r {
    public static final /* synthetic */ EnumC587030N0r[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC587030N0r SERIES_DETAIL;
    public static final EnumC587030N0r SERIES_LIST;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC587030N0r> getEntries() {
        return LLILZ;
    }

    static {
        EnumC587030N0r enumC587030N0r = new EnumC587030N0r("SERIES_LIST", 0, "b41589", "paid_content_series_list");
        SERIES_LIST = enumC587030N0r;
        EnumC587030N0r enumC587030N0r2 = new EnumC587030N0r("SERIES_DETAIL", 1, "b6274", "paid_content_series_detail");
        SERIES_DETAIL = enumC587030N0r2;
        EnumC587030N0r[] enumC587030N0rArr = {enumC587030N0r, enumC587030N0r2};
        LLILLL = enumC587030N0rArr;
        LLILZ = new C2254308sP(enumC587030N0rArr);
    }

    public static EnumC587030N0r[] values() {
        return (EnumC587030N0r[]) LLILLL.clone();
    }

    public final String getPageCode() {
        return this.LL;
    }

    public final String getPageName() {
        return this.LLILLJJLI;
    }

    public static EnumC587030N0r valueOf(String str) {
        return (EnumC587030N0r) C08FF.LIZ(EnumC587030N0r.class, str);
    }

    public EnumC587030N0r(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
