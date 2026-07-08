package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869540Y9g {
    public static final EnumC869540Y9g COLUMN_INBOX_TYPE;
    public static final EnumC869540Y9g COLUMN_MESSAGE_BODY;
    public static final EnumC869540Y9g COLUMN_MESSAGE_ID;
    public static final EnumC869540Y9g COLUMN_MSG_SOURCE;
    public static final EnumC869540Y9g COLUMN_RECEIVED_FROM;
    public static final EnumC869540Y9g COLUMN_RECEIVED_TIME;
    public static final EnumC869540Y9g COLUMN_REGION;
    public static final /* synthetic */ EnumC869540Y9g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<EnumC869540Y9g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC869540Y9g enumC869540Y9g = new EnumC869540Y9g("COLUMN_MESSAGE_ID", 0, "message_id", "BIGINT");
        COLUMN_MESSAGE_ID = enumC869540Y9g;
        EnumC869540Y9g enumC869540Y9g2 = new EnumC869540Y9g("COLUMN_MESSAGE_BODY", 1, "message_body", "BLOB");
        COLUMN_MESSAGE_BODY = enumC869540Y9g2;
        EnumC869540Y9g enumC869540Y9g3 = new EnumC869540Y9g("COLUMN_REGION", 2, "region", "TEXT");
        COLUMN_REGION = enumC869540Y9g3;
        EnumC869540Y9g enumC869540Y9g4 = new EnumC869540Y9g("COLUMN_MSG_SOURCE", 3, "msg_source", "INTEGER");
        COLUMN_MSG_SOURCE = enumC869540Y9g4;
        EnumC869540Y9g enumC869540Y9g5 = new EnumC869540Y9g("COLUMN_INBOX_TYPE", 4, "inbox_type", "INTEGER");
        COLUMN_INBOX_TYPE = enumC869540Y9g5;
        EnumC869540Y9g enumC869540Y9g6 = new EnumC869540Y9g("COLUMN_RECEIVED_FROM", 5, "received_from", "TEXT");
        COLUMN_RECEIVED_FROM = enumC869540Y9g6;
        EnumC869540Y9g enumC869540Y9g7 = new EnumC869540Y9g("COLUMN_RECEIVED_TIME", 6, "received_time", "BIGINT");
        COLUMN_RECEIVED_TIME = enumC869540Y9g7;
        EnumC869540Y9g[] enumC869540Y9gArr = {enumC869540Y9g, enumC869540Y9g2, enumC869540Y9g3, enumC869540Y9g4, enumC869540Y9g5, enumC869540Y9g6, enumC869540Y9g7};
        LL = enumC869540Y9gArr;
        LLILLJJLI = new C2254308sP(enumC869540Y9gArr);
    }

    public static EnumC869540Y9g[] values() {
        return (EnumC869540Y9g[]) LL.clone();
    }

    public static EnumC869540Y9g valueOf(String str) {
        return (EnumC869540Y9g) C08FF.LIZ(EnumC869540Y9g.class, str);
    }

    public EnumC869540Y9g(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
