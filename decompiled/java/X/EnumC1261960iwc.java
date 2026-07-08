package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261960iwc {
    public static final EnumC1261960iwc FOLLOWING_LIST;
    public static final EnumC1261960iwc FRIEND_LIST;
    public static final EnumC1261960iwc INBOX_PAGE;
    public static final /* synthetic */ EnumC1261960iwc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1261960iwc UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1261960iwc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1261960iwc enumC1261960iwc = new EnumC1261960iwc("UNKNOWN", 0, "");
        UNKNOWN = enumC1261960iwc;
        EnumC1261960iwc enumC1261960iwc2 = new EnumC1261960iwc("INBOX_PAGE", 1, "inbox_first_page");
        INBOX_PAGE = enumC1261960iwc2;
        EnumC1261960iwc enumC1261960iwc3 = new EnumC1261960iwc("FOLLOWING_LIST", 2, "personal_homepage_following");
        FOLLOWING_LIST = enumC1261960iwc3;
        EnumC1261960iwc enumC1261960iwc4 = new EnumC1261960iwc("FRIEND_LIST", 3, "personal_homepage_friends");
        FRIEND_LIST = enumC1261960iwc4;
        EnumC1261960iwc[] enumC1261960iwcArr = {enumC1261960iwc, enumC1261960iwc2, enumC1261960iwc3, enumC1261960iwc4};
        LLILLJJLI = enumC1261960iwcArr;
        LLILLL = new C2254308sP(enumC1261960iwcArr);
    }

    public static EnumC1261960iwc[] values() {
        return (EnumC1261960iwc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1261960iwc valueOf(String str) {
        return (EnumC1261960iwc) C08FF.LIZ(EnumC1261960iwc.class, str);
    }

    public EnumC1261960iwc(String str, int i, String str2) {
        this.LL = str2;
    }
}
