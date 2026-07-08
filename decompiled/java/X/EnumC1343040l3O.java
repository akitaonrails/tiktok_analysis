package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1343040l3O {
    public static final EnumC1343040l3O AD_FORBID;
    public static final EnumC1343040l3O COMMENT_CLOSE;
    public static final EnumC1343040l3O COMMENT_DISLIKE;
    public static final EnumC1343040l3O EMPTY_LIST;
    public static final EnumC1343040l3O ERROR_STATE;
    public static final /* synthetic */ EnumC1343040l3O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1343040l3O LOADING_STATE;
    public static final EnumC1343040l3O NORMAL_LIST;
    public static final EnumC1343040l3O UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1343040l3O> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1343040l3O enumC1343040l3O = new EnumC1343040l3O("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1343040l3O;
        EnumC1343040l3O enumC1343040l3O2 = new EnumC1343040l3O("NORMAL_LIST", 1, "normal_list");
        NORMAL_LIST = enumC1343040l3O2;
        EnumC1343040l3O enumC1343040l3O3 = new EnumC1343040l3O("EMPTY_LIST", 2, "empty_list");
        EMPTY_LIST = enumC1343040l3O3;
        EnumC1343040l3O enumC1343040l3O4 = new EnumC1343040l3O("ERROR_STATE", 3, "error_state");
        ERROR_STATE = enumC1343040l3O4;
        EnumC1343040l3O enumC1343040l3O5 = new EnumC1343040l3O("LOADING_STATE", 4, "loading_state");
        LOADING_STATE = enumC1343040l3O5;
        EnumC1343040l3O enumC1343040l3O6 = new EnumC1343040l3O("COMMENT_CLOSE", 5, "comment_close");
        COMMENT_CLOSE = enumC1343040l3O6;
        EnumC1343040l3O enumC1343040l3O7 = new EnumC1343040l3O("AD_FORBID", 6, "ad_forbid");
        AD_FORBID = enumC1343040l3O7;
        EnumC1343040l3O enumC1343040l3O8 = new EnumC1343040l3O("COMMENT_DISLIKE", 7, "comment_dislike");
        COMMENT_DISLIKE = enumC1343040l3O8;
        EnumC1343040l3O[] enumC1343040l3OArr = {enumC1343040l3O, enumC1343040l3O2, enumC1343040l3O3, enumC1343040l3O4, enumC1343040l3O5, enumC1343040l3O6, enumC1343040l3O7, enumC1343040l3O8};
        LLILLJJLI = enumC1343040l3OArr;
        LLILLL = new C2254308sP(enumC1343040l3OArr);
    }

    public static EnumC1343040l3O[] values() {
        return (EnumC1343040l3O[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1343040l3O valueOf(String str) {
        return (EnumC1343040l3O) C08FF.LIZ(EnumC1343040l3O.class, str);
    }

    public EnumC1343040l3O(String str, int i, String str2) {
        this.LL = str2;
    }
}
