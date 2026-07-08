package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC323250Cln {
    public static final EnumC323250Cln INBOX_NEW_FOLLOWER_FRIENDS_LIST_TAB;
    public static final /* synthetic */ EnumC323250Cln[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC323250Cln RELATION_PAGE_FRIENDS_LIST_TAB;
    public static final EnumC323250Cln UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC323250Cln> getEntries() {
        return LLILLL;
    }

    static {
        EnumC323250Cln enumC323250Cln = new EnumC323250Cln("UNKNOWN", 0, -1);
        UNKNOWN = enumC323250Cln;
        EnumC323250Cln enumC323250Cln2 = new EnumC323250Cln("INBOX_NEW_FOLLOWER_FRIENDS_LIST_TAB", 1, 1);
        INBOX_NEW_FOLLOWER_FRIENDS_LIST_TAB = enumC323250Cln2;
        EnumC323250Cln enumC323250Cln3 = new EnumC323250Cln("RELATION_PAGE_FRIENDS_LIST_TAB", 2, 2);
        RELATION_PAGE_FRIENDS_LIST_TAB = enumC323250Cln3;
        EnumC323250Cln[] enumC323250ClnArr = {enumC323250Cln, enumC323250Cln2, enumC323250Cln3};
        LLILLJJLI = enumC323250ClnArr;
        LLILLL = new C2254308sP(enumC323250ClnArr);
    }

    public static EnumC323250Cln[] values() {
        return (EnumC323250Cln[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC323250Cln valueOf(String str) {
        return (EnumC323250Cln) C08FF.LIZ(EnumC323250Cln.class, str);
    }

    public EnumC323250Cln(String str, int i, int i2) {
        this.LL = i2;
    }
}
