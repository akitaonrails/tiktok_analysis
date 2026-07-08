package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC905780Zg8 {
    public static final EnumC905780Zg8 CANCELLED;
    public static final EnumC905780Zg8 ERROR;
    public static final EnumC905780Zg8 FINISHED;
    public static final EnumC905780Zg8 INSERT_CARD_FAILED;
    public static final /* synthetic */ EnumC905780Zg8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC905780Zg8 REMOTE_MESSAGE_ARRIVED;
    public static final EnumC905780Zg8 SERVICE_UNAVAILABLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC905780Zg8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC905780Zg8 enumC905780Zg8 = new EnumC905780Zg8("FINISHED", 0, "finished");
        FINISHED = enumC905780Zg8;
        EnumC905780Zg8 enumC905780Zg82 = new EnumC905780Zg8("ERROR", 1, "error");
        ERROR = enumC905780Zg82;
        EnumC905780Zg8 enumC905780Zg83 = new EnumC905780Zg8("CANCELLED", 2, "cancelled");
        CANCELLED = enumC905780Zg83;
        EnumC905780Zg8 enumC905780Zg84 = new EnumC905780Zg8("REMOTE_MESSAGE_ARRIVED", 3, "remote_message_arrived");
        REMOTE_MESSAGE_ARRIVED = enumC905780Zg84;
        EnumC905780Zg8 enumC905780Zg85 = new EnumC905780Zg8("SERVICE_UNAVAILABLE", 4, "service_unavailable");
        SERVICE_UNAVAILABLE = enumC905780Zg85;
        EnumC905780Zg8 enumC905780Zg86 = new EnumC905780Zg8("INSERT_CARD_FAILED", 5, "insert_card_failed");
        INSERT_CARD_FAILED = enumC905780Zg86;
        EnumC905780Zg8[] enumC905780Zg8Arr = {enumC905780Zg8, enumC905780Zg82, enumC905780Zg83, enumC905780Zg84, enumC905780Zg85, enumC905780Zg86};
        LLILLJJLI = enumC905780Zg8Arr;
        LLILLL = new C2254308sP(enumC905780Zg8Arr);
    }

    public static EnumC905780Zg8[] values() {
        return (EnumC905780Zg8[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC905780Zg8 valueOf(String str) {
        return (EnumC905780Zg8) C08FF.LIZ(EnumC905780Zg8.class, str);
    }

    public EnumC905780Zg8(String str, int i, String str2) {
        this.LL = str2;
    }
}
