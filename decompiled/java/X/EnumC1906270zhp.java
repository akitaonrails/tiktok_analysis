package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1906270zhp {
    public static final EnumC1906270zhp AGGREGATE_PAGE;
    public static final EnumC1906270zhp FRIENDS_TAB;
    public static final EnumC1906270zhp INBOX_SEARCH;
    public static final /* synthetic */ EnumC1906270zhp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1906270zhp NEW_ACTIVITY;
    public static final EnumC1906270zhp NEW_FOLLOWER;
    public static final EnumC1906270zhp NONE;
    public static final EnumC1906270zhp SYSTEM_NOTIFICATION;

    public static InterfaceC2044707zh<EnumC1906270zhp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1906270zhp enumC1906270zhp = new EnumC1906270zhp("NONE", 0);
        NONE = enumC1906270zhp;
        EnumC1906270zhp enumC1906270zhp2 = new EnumC1906270zhp("NEW_ACTIVITY", 1);
        NEW_ACTIVITY = enumC1906270zhp2;
        EnumC1906270zhp enumC1906270zhp3 = new EnumC1906270zhp("NEW_FOLLOWER", 2);
        NEW_FOLLOWER = enumC1906270zhp3;
        EnumC1906270zhp enumC1906270zhp4 = new EnumC1906270zhp("SYSTEM_NOTIFICATION", 3);
        SYSTEM_NOTIFICATION = enumC1906270zhp4;
        EnumC1906270zhp enumC1906270zhp5 = new EnumC1906270zhp("FRIENDS_TAB", 4);
        FRIENDS_TAB = enumC1906270zhp5;
        EnumC1906270zhp enumC1906270zhp6 = new EnumC1906270zhp("INBOX_SEARCH", 5);
        INBOX_SEARCH = enumC1906270zhp6;
        EnumC1906270zhp enumC1906270zhp7 = new EnumC1906270zhp("AGGREGATE_PAGE", 6);
        AGGREGATE_PAGE = enumC1906270zhp7;
        EnumC1906270zhp[] enumC1906270zhpArr = {enumC1906270zhp, enumC1906270zhp2, enumC1906270zhp3, enumC1906270zhp4, enumC1906270zhp5, enumC1906270zhp6, enumC1906270zhp7};
        LL = enumC1906270zhpArr;
        LLILLJJLI = new C2254308sP(enumC1906270zhpArr);
    }

    public static EnumC1906270zhp[] values() {
        return (EnumC1906270zhp[]) LL.clone();
    }

    public static EnumC1906270zhp valueOf(String str) {
        return (EnumC1906270zhp) C08FF.LIZ(EnumC1906270zhp.class, str);
    }

    public EnumC1906270zhp(String str, int i) {
    }
}
