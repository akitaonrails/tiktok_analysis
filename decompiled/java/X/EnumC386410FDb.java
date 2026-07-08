package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC386410FDb {
    public static final /* synthetic */ EnumC386410FDb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC386410FDb SHOW_LIST;
    public static final EnumC386410FDb SHOW_LOADING;
    public static final EnumC386410FDb SHOW_NET_ERROR;
    public static final EnumC386410FDb SHOW_NOTHING;

    public static InterfaceC2044707zh<EnumC386410FDb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC386410FDb enumC386410FDb = new EnumC386410FDb("SHOW_LOADING", 0);
        SHOW_LOADING = enumC386410FDb;
        EnumC386410FDb enumC386410FDb2 = new EnumC386410FDb("SHOW_NET_ERROR", 1);
        SHOW_NET_ERROR = enumC386410FDb2;
        EnumC386410FDb enumC386410FDb3 = new EnumC386410FDb("SHOW_LIST", 2);
        SHOW_LIST = enumC386410FDb3;
        EnumC386410FDb enumC386410FDb4 = new EnumC386410FDb("SHOW_NOTHING", 3);
        SHOW_NOTHING = enumC386410FDb4;
        EnumC386410FDb[] enumC386410FDbArr = {enumC386410FDb, enumC386410FDb2, enumC386410FDb3, enumC386410FDb4};
        LL = enumC386410FDbArr;
        LLILLJJLI = new C2254308sP(enumC386410FDbArr);
    }

    public static EnumC386410FDb[] values() {
        return (EnumC386410FDb[]) LL.clone();
    }

    public static EnumC386410FDb valueOf(String str) {
        return (EnumC386410FDb) C08FF.LIZ(EnumC386410FDb.class, str);
    }

    public EnumC386410FDb(String str, int i) {
    }
}
