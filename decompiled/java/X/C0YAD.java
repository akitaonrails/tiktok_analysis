package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAD {
    public static final C0YAD COLUMN_ALIAS;
    public static final C0YAD COLUMN_CONVERSATION_ID;
    public static final C0YAD COLUMN_ROLE;
    public static final C0YAD COLUMN_SEC_UID;
    public static final C0YAD COLUMN_SILENT;
    public static final C0YAD COLUMN_SILENT_TIME;
    public static final C0YAD COLUMN_SORT_ORDER;
    public static final C0YAD COLUMN_USER_ID;
    public static final /* synthetic */ C0YAD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<C0YAD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YAD c0yad = new C0YAD("COLUMN_USER_ID", 0, "user_id", "INTEGER NOT NULL");
        COLUMN_USER_ID = c0yad;
        C0YAD c0yad2 = new C0YAD("COLUMN_SORT_ORDER", 1, "sort_order", "INTEGER");
        COLUMN_SORT_ORDER = c0yad2;
        C0YAD c0yad3 = new C0YAD("COLUMN_ROLE", 2, "role", "INTEGER");
        COLUMN_ROLE = c0yad3;
        C0YAD c0yad4 = new C0YAD("COLUMN_CONVERSATION_ID", 3, "conversation_id", "TEXT");
        COLUMN_CONVERSATION_ID = c0yad4;
        C0YAD c0yad5 = new C0YAD("COLUMN_ALIAS", 4, "alias", "TEXT");
        COLUMN_ALIAS = c0yad5;
        C0YAD c0yad6 = new C0YAD("COLUMN_SEC_UID", 5, "sec_uid", "TEXT");
        COLUMN_SEC_UID = c0yad6;
        C0YAD c0yad7 = new C0YAD("COLUMN_SILENT", 6, "silent", "INTEGER");
        COLUMN_SILENT = c0yad7;
        C0YAD c0yad8 = new C0YAD("COLUMN_SILENT_TIME", 7, "silent_time", "INTEGER");
        COLUMN_SILENT_TIME = c0yad8;
        C0YAD[] c0yadArr = {c0yad, c0yad2, c0yad3, c0yad4, c0yad5, c0yad6, c0yad7, c0yad8};
        LL = c0yadArr;
        LLILLJJLI = new C2254308sP(c0yadArr);
    }

    public static C0YAD[] values() {
        return (C0YAD[]) LL.clone();
    }

    public static C0YAD valueOf(String str) {
        return (C0YAD) C08FF.LIZ(C0YAD.class, str);
    }

    public C0YAD(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
