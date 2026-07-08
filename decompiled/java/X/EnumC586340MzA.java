package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586340MzA {
    public static final EnumC586340MzA ACTION_CALLBACK_TIMEOUT;
    public static final EnumC586340MzA CONTEXT_IS_NULL;
    public static final EnumC586340MzA DUPLICATED_REGISTER;
    public static final EnumC586340MzA EMPTY_ACTION_CALLBACK;
    public static final EnumC586340MzA EMPTY_CALLBACK_ID;
    public static final EnumC586340MzA INVOKE_ACTION_FAIL;
    public static final /* synthetic */ EnumC586340MzA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586340MzA UNKNOWN_ERROR;
    public static final EnumC586340MzA UNREGISTER_NULL;
    public final Number LL;

    public static InterfaceC2044707zh<EnumC586340MzA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586340MzA enumC586340MzA = new EnumC586340MzA(0, 10000, "UNKNOWN_ERROR");
        UNKNOWN_ERROR = enumC586340MzA;
        EnumC586340MzA enumC586340MzA2 = new EnumC586340MzA(1, 10001, "DUPLICATED_REGISTER");
        DUPLICATED_REGISTER = enumC586340MzA2;
        EnumC586340MzA enumC586340MzA3 = new EnumC586340MzA(2, 10002, "UNREGISTER_NULL");
        UNREGISTER_NULL = enumC586340MzA3;
        EnumC586340MzA enumC586340MzA4 = new EnumC586340MzA(3, 10003, "EMPTY_CALLBACK_ID");
        EMPTY_CALLBACK_ID = enumC586340MzA4;
        EnumC586340MzA enumC586340MzA5 = new EnumC586340MzA(4, 10004, "EMPTY_ACTION_CALLBACK");
        EMPTY_ACTION_CALLBACK = enumC586340MzA5;
        EnumC586340MzA enumC586340MzA6 = new EnumC586340MzA(5, 10005, "ACTION_CALLBACK_TIMEOUT");
        ACTION_CALLBACK_TIMEOUT = enumC586340MzA6;
        EnumC586340MzA enumC586340MzA7 = new EnumC586340MzA(6, 10006, "INVOKE_ACTION_FAIL");
        INVOKE_ACTION_FAIL = enumC586340MzA7;
        EnumC586340MzA enumC586340MzA8 = new EnumC586340MzA(7, 10007, "CONTEXT_IS_NULL");
        CONTEXT_IS_NULL = enumC586340MzA8;
        EnumC586340MzA[] enumC586340MzAArr = {enumC586340MzA, enumC586340MzA2, enumC586340MzA3, enumC586340MzA4, enumC586340MzA5, enumC586340MzA6, enumC586340MzA7, enumC586340MzA8};
        LLILLJJLI = enumC586340MzAArr;
        LLILLL = new C2254308sP(enumC586340MzAArr);
    }

    public static EnumC586340MzA[] values() {
        return (EnumC586340MzA[]) LLILLJJLI.clone();
    }

    public final Number getValue() {
        return this.LL;
    }

    public static EnumC586340MzA valueOf(String str) {
        return (EnumC586340MzA) C08FF.LIZ(EnumC586340MzA.class, str);
    }

    public EnumC586340MzA(int i, Number number, String str) {
        this.LL = number;
    }
}
