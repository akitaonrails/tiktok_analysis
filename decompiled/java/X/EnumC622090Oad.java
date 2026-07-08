package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622090Oad {
    public static final EnumC622090Oad BULLETIN_BOARD_ID;
    public static final EnumC622090Oad CHANNEL_ACCESS_CONTROL;
    public static final EnumC622090Oad CHANNEL_COMMAND_VERSION;
    public static final EnumC622090Oad CHANNEL_OWNER;
    public static final EnumC622090Oad CHANNEL_STATUS_CODE;
    public static final EnumC622090Oad CHANNEL_TYPE;
    public static final EnumC622090Oad CHANNEL_VERSION;
    public static final EnumC622090Oad IDENTITY_TYPE;
    public static final /* synthetic */ EnumC622090Oad[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC622090Oad SUBSCRIBE_STATUS_CODE;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC622090Oad> getEntries() {
        return LLILZ;
    }

    static {
        EnumC622090Oad enumC622090Oad = new EnumC622090Oad("BULLETIN_BOARD_ID", 0, "bulletin_board_id", "TEXT PRIMARY KEY");
        BULLETIN_BOARD_ID = enumC622090Oad;
        EnumC622090Oad enumC622090Oad2 = new EnumC622090Oad("CHANNEL_VERSION", 1, "channel_version", "TEXT");
        CHANNEL_VERSION = enumC622090Oad2;
        EnumC622090Oad enumC622090Oad3 = new EnumC622090Oad("CHANNEL_COMMAND_VERSION", 2, "channel_command_version", "TEXT");
        CHANNEL_COMMAND_VERSION = enumC622090Oad3;
        EnumC622090Oad enumC622090Oad4 = new EnumC622090Oad("CHANNEL_OWNER", 3, "channel_owner", "TEXT");
        CHANNEL_OWNER = enumC622090Oad4;
        EnumC622090Oad enumC622090Oad5 = new EnumC622090Oad("CHANNEL_STATUS_CODE", 4, "channel_status_code", "INTEGER NOT NULL");
        CHANNEL_STATUS_CODE = enumC622090Oad5;
        EnumC622090Oad enumC622090Oad6 = new EnumC622090Oad("IDENTITY_TYPE", 5, "identity_type", "INTEGER NOT NULL");
        IDENTITY_TYPE = enumC622090Oad6;
        EnumC622090Oad enumC622090Oad7 = new EnumC622090Oad("CHANNEL_ACCESS_CONTROL", 6, "channel_access_control", "TEXT NOT NULL");
        CHANNEL_ACCESS_CONTROL = enumC622090Oad7;
        EnumC622090Oad enumC622090Oad8 = new EnumC622090Oad("SUBSCRIBE_STATUS_CODE", 7, "subscribe_status_code", "INTEGER NOT NULL DEFAULT 0");
        SUBSCRIBE_STATUS_CODE = enumC622090Oad8;
        EnumC622090Oad enumC622090Oad9 = new EnumC622090Oad("CHANNEL_TYPE", 8, "channel_type", "INTEGER NOT NULL");
        CHANNEL_TYPE = enumC622090Oad9;
        EnumC622090Oad[] enumC622090OadArr = {enumC622090Oad, enumC622090Oad2, enumC622090Oad3, enumC622090Oad4, enumC622090Oad5, enumC622090Oad6, enumC622090Oad7, enumC622090Oad8, enumC622090Oad9};
        LLILLL = enumC622090OadArr;
        LLILZ = new C2254308sP(enumC622090OadArr);
    }

    public static EnumC622090Oad[] values() {
        return (EnumC622090Oad[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC622090Oad valueOf(String str) {
        return (EnumC622090Oad) C08FF.LIZ(EnumC622090Oad.class, str);
    }

    public EnumC622090Oad(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
