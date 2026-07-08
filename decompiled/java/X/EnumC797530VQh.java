package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797530VQh {
    public static final EnumC797530VQh COLUMN_CURR_UID;
    public static final EnumC797530VQh COLUMN_ID;
    public static final EnumC797530VQh COLUMN_SEND_TIME;
    public static final EnumC797530VQh COLUMN_SHARE_TIME;
    public static final EnumC797530VQh COLUMN_SHARE_TYPE;
    public static final /* synthetic */ EnumC797530VQh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<EnumC797530VQh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC797530VQh enumC797530VQh = new EnumC797530VQh("COLUMN_ID", 0, "ID", "TEXT NOT NULL");
        COLUMN_ID = enumC797530VQh;
        EnumC797530VQh enumC797530VQh2 = new EnumC797530VQh("COLUMN_SHARE_TIME", 1, "SHARE_TIME", "INTEGER NOT NULL");
        COLUMN_SHARE_TIME = enumC797530VQh2;
        EnumC797530VQh enumC797530VQh3 = new EnumC797530VQh("COLUMN_SEND_TIME", 2, "SEND_TIME", "INTEGER NOT NULL DEFAULT -1");
        COLUMN_SEND_TIME = enumC797530VQh3;
        EnumC797530VQh enumC797530VQh4 = new EnumC797530VQh("COLUMN_CURR_UID", 3, "CURR_UID", "TEXT NOT NULL");
        COLUMN_CURR_UID = enumC797530VQh4;
        EnumC797530VQh enumC797530VQh5 = new EnumC797530VQh("COLUMN_SHARE_TYPE", 4, "SHARE_TYPE", "TEXT NOT NULL DEFAULT ''");
        COLUMN_SHARE_TYPE = enumC797530VQh5;
        EnumC797530VQh[] enumC797530VQhArr = {enumC797530VQh, enumC797530VQh2, enumC797530VQh3, enumC797530VQh4, enumC797530VQh5};
        LL = enumC797530VQhArr;
        LLILLJJLI = new C2254308sP(enumC797530VQhArr);
    }

    public static EnumC797530VQh[] values() {
        return (EnumC797530VQh[]) LL.clone();
    }

    public static EnumC797530VQh valueOf(String str) {
        return (EnumC797530VQh) C08FF.LIZ(EnumC797530VQh.class, str);
    }

    public EnumC797530VQh(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
