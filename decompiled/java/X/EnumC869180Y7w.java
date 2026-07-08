package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869180Y7w {
    public static final EnumC869180Y7w FAIL_WITH_API_CALL;
    public static final EnumC869180Y7w FAIL_WITH_DB_INSERT;
    public static final EnumC869180Y7w FAIL_WITH_INVALID_INPUT;
    public static final /* synthetic */ EnumC869180Y7w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC869180Y7w SUCCESS_WITHOUT_SAVED_MSG;
    public static final EnumC869180Y7w SUCCESS_WITH_SAVED_MSG;
    public static final EnumC869180Y7w SUCCESS_WITH_SAVED_MSG_TOO_NEW;
    public static final EnumC869180Y7w SUCCESS_WITH_SAVED_MSG_TOO_OLD;

    public static InterfaceC2044707zh<EnumC869180Y7w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC869180Y7w enumC869180Y7w = new EnumC869180Y7w("SUCCESS_WITH_SAVED_MSG", 0);
        SUCCESS_WITH_SAVED_MSG = enumC869180Y7w;
        EnumC869180Y7w enumC869180Y7w2 = new EnumC869180Y7w("SUCCESS_WITH_SAVED_MSG_TOO_NEW", 1);
        SUCCESS_WITH_SAVED_MSG_TOO_NEW = enumC869180Y7w2;
        EnumC869180Y7w enumC869180Y7w3 = new EnumC869180Y7w("SUCCESS_WITH_SAVED_MSG_TOO_OLD", 2);
        SUCCESS_WITH_SAVED_MSG_TOO_OLD = enumC869180Y7w3;
        EnumC869180Y7w enumC869180Y7w4 = new EnumC869180Y7w("SUCCESS_WITHOUT_SAVED_MSG", 3);
        SUCCESS_WITHOUT_SAVED_MSG = enumC869180Y7w4;
        EnumC869180Y7w enumC869180Y7w5 = new EnumC869180Y7w("FAIL_WITH_API_CALL", 4);
        FAIL_WITH_API_CALL = enumC869180Y7w5;
        EnumC869180Y7w enumC869180Y7w6 = new EnumC869180Y7w("FAIL_WITH_INVALID_INPUT", 5);
        FAIL_WITH_INVALID_INPUT = enumC869180Y7w6;
        EnumC869180Y7w enumC869180Y7w7 = new EnumC869180Y7w("FAIL_WITH_DB_INSERT", 6);
        FAIL_WITH_DB_INSERT = enumC869180Y7w7;
        EnumC869180Y7w[] enumC869180Y7wArr = {enumC869180Y7w, enumC869180Y7w2, enumC869180Y7w3, enumC869180Y7w4, enumC869180Y7w5, enumC869180Y7w6, enumC869180Y7w7};
        LL = enumC869180Y7wArr;
        LLILLJJLI = new C2254308sP(enumC869180Y7wArr);
    }

    public static EnumC869180Y7w[] values() {
        return (EnumC869180Y7w[]) LL.clone();
    }

    public static EnumC869180Y7w valueOf(String str) {
        return (EnumC869180Y7w) C08FF.LIZ(EnumC869180Y7w.class, str);
    }

    public EnumC869180Y7w(String str, int i) {
    }
}
