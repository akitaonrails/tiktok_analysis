package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1074240e3q {
    public static final EnumC1074240e3q COLD_START;
    public static final EnumC1074240e3q FIND_FRIENDS;
    public static final EnumC1074240e3q FOLLOWING_LIST;
    public static final EnumC1074240e3q FRIENDS_TAB;
    public static final EnumC1074240e3q HOMEPAGE_FOLLOW;
    public static final EnumC1074240e3q HOMEPAGE_HOT;
    public static final EnumC1074240e3q INBOX;
    public static final EnumC1074240e3q INVITE_PANEL;
    public static final /* synthetic */ EnumC1074240e3q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1074240e3q LOGIN;
    public static final EnumC1074240e3q NEW_VERSION;
    public static final EnumC1074240e3q OTHER_FOLLOWING_LIST;
    public static final EnumC1074240e3q PRIVACY_SETTING;
    public static final EnumC1074240e3q SELF_PROFILE;
    public static final EnumC1074240e3q SIGN_UP;
    public static final EnumC1074240e3q SUGGEST_ACCOUNT;
    public static final EnumC1074240e3q UNKNOWN;
    public static final EnumC1074240e3q USER_PROFILE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1074240e3q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1074240e3q enumC1074240e3q = new EnumC1074240e3q("UNKNOWN", 0, 0);
        UNKNOWN = enumC1074240e3q;
        EnumC1074240e3q enumC1074240e3q2 = new EnumC1074240e3q("FIND_FRIENDS", 1, 1);
        FIND_FRIENDS = enumC1074240e3q2;
        EnumC1074240e3q enumC1074240e3q3 = new EnumC1074240e3q("SIGN_UP", 2, 2);
        SIGN_UP = enumC1074240e3q3;
        EnumC1074240e3q enumC1074240e3q4 = new EnumC1074240e3q("LOGIN", 3, 3);
        LOGIN = enumC1074240e3q4;
        EnumC1074240e3q enumC1074240e3q5 = new EnumC1074240e3q("NEW_VERSION", 4, 4);
        NEW_VERSION = enumC1074240e3q5;
        EnumC1074240e3q enumC1074240e3q6 = new EnumC1074240e3q("INBOX", 5, 5);
        INBOX = enumC1074240e3q6;
        EnumC1074240e3q enumC1074240e3q7 = new EnumC1074240e3q("USER_PROFILE", 6, 6);
        USER_PROFILE = enumC1074240e3q7;
        EnumC1074240e3q enumC1074240e3q8 = new EnumC1074240e3q("FOLLOWING_LIST", 7, 7);
        FOLLOWING_LIST = enumC1074240e3q8;
        EnumC1074240e3q enumC1074240e3q9 = new EnumC1074240e3q("FRIENDS_TAB", 8, 8);
        FRIENDS_TAB = enumC1074240e3q9;
        EnumC1074240e3q enumC1074240e3q10 = new EnumC1074240e3q("INVITE_PANEL", 9, 9);
        INVITE_PANEL = enumC1074240e3q10;
        EnumC1074240e3q enumC1074240e3q11 = new EnumC1074240e3q("PRIVACY_SETTING", 10, 10);
        PRIVACY_SETTING = enumC1074240e3q11;
        EnumC1074240e3q enumC1074240e3q12 = new EnumC1074240e3q("SUGGEST_ACCOUNT", 11, 11);
        SUGGEST_ACCOUNT = enumC1074240e3q12;
        EnumC1074240e3q enumC1074240e3q13 = new EnumC1074240e3q("HOMEPAGE_FOLLOW", 12, 12);
        HOMEPAGE_FOLLOW = enumC1074240e3q13;
        EnumC1074240e3q enumC1074240e3q14 = new EnumC1074240e3q("HOMEPAGE_HOT", 13, 13);
        HOMEPAGE_HOT = enumC1074240e3q14;
        EnumC1074240e3q enumC1074240e3q15 = new EnumC1074240e3q("COLD_START", 14, 20);
        COLD_START = enumC1074240e3q15;
        EnumC1074240e3q enumC1074240e3q16 = new EnumC1074240e3q("SELF_PROFILE", 15, 6);
        SELF_PROFILE = enumC1074240e3q16;
        EnumC1074240e3q enumC1074240e3q17 = new EnumC1074240e3q("OTHER_FOLLOWING_LIST", 16, 7);
        OTHER_FOLLOWING_LIST = enumC1074240e3q17;
        EnumC1074240e3q[] enumC1074240e3qArr = {enumC1074240e3q, enumC1074240e3q2, enumC1074240e3q3, enumC1074240e3q4, enumC1074240e3q5, enumC1074240e3q6, enumC1074240e3q7, enumC1074240e3q8, enumC1074240e3q9, enumC1074240e3q10, enumC1074240e3q11, enumC1074240e3q12, enumC1074240e3q13, enumC1074240e3q14, enumC1074240e3q15, enumC1074240e3q16, enumC1074240e3q17};
        LLILLJJLI = enumC1074240e3qArr;
        LLILLL = new C2254308sP(enumC1074240e3qArr);
    }

    public static EnumC1074240e3q[] values() {
        return (EnumC1074240e3q[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1074240e3q valueOf(String str) {
        return (EnumC1074240e3q) C08FF.LIZ(EnumC1074240e3q.class, str);
    }

    public EnumC1074240e3q(String str, int i, int i2) {
        this.LL = i2;
    }
}
