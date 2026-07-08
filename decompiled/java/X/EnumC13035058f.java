package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.058f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13035058f {
    public static final EnumC13035058f CANCEL_ALGORITHM_TASK;
    public static final EnumC13035058f CREATE_ALGORITHM_TASK;
    public static final /* synthetic */ EnumC13035058f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC13035058f RECEIVE_MSG;
    public static final EnumC13035058f RECEIVE_RESPONSE;
    public static final EnumC13035058f REGISTER_MSG_HANDLER;
    public static final EnumC13035058f REGISTER_RESPONSE_HANDLER;
    public static final EnumC13035058f RUN_ALGORITHM_TASK;
    public static final EnumC13035058f SEND_REQUEST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC13035058f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC13035058f enumC13035058f = new EnumC13035058f("REGISTER_MSG_HANDLER", 0, "register_msg_handler");
        REGISTER_MSG_HANDLER = enumC13035058f;
        EnumC13035058f enumC13035058f2 = new EnumC13035058f("REGISTER_RESPONSE_HANDLER", 1, "register_response_handler");
        REGISTER_RESPONSE_HANDLER = enumC13035058f2;
        EnumC13035058f enumC13035058f3 = new EnumC13035058f("RECEIVE_MSG", 2, "receive_msg");
        RECEIVE_MSG = enumC13035058f3;
        EnumC13035058f enumC13035058f4 = new EnumC13035058f("SEND_REQUEST", 3, "send_request");
        SEND_REQUEST = enumC13035058f4;
        EnumC13035058f enumC13035058f5 = new EnumC13035058f("RECEIVE_RESPONSE", 4, "receive_response");
        RECEIVE_RESPONSE = enumC13035058f5;
        EnumC13035058f enumC13035058f6 = new EnumC13035058f("CREATE_ALGORITHM_TASK", 5, "create_algorithm_task");
        CREATE_ALGORITHM_TASK = enumC13035058f6;
        EnumC13035058f enumC13035058f7 = new EnumC13035058f("RUN_ALGORITHM_TASK", 6, "run_algorithm_task");
        RUN_ALGORITHM_TASK = enumC13035058f7;
        EnumC13035058f enumC13035058f8 = new EnumC13035058f("CANCEL_ALGORITHM_TASK", 7, "cancel_algorithm_task");
        CANCEL_ALGORITHM_TASK = enumC13035058f8;
        EnumC13035058f[] enumC13035058fArr = {enumC13035058f, enumC13035058f2, enumC13035058f3, enumC13035058f4, enumC13035058f5, enumC13035058f6, enumC13035058f7, enumC13035058f8};
        LLILLJJLI = enumC13035058fArr;
        LLILLL = new C2254308sP(enumC13035058fArr);
    }

    public static EnumC13035058f[] values() {
        return (EnumC13035058f[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC13035058f valueOf(String str) {
        return (EnumC13035058f) C08FF.LIZ(EnumC13035058f.class, str);
    }

    public EnumC13035058f(String str, int i, String str2) {
        this.LL = str2;
    }
}
