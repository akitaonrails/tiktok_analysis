package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993160bx4 {
    public static final EnumC993160bx4 CALL_A_UNREGISTER_METHOD;
    public static final EnumC993160bx4 CALL_METHORD_WITHOUTBACK_IN_TIMEOUT;
    public static final EnumC993160bx4 INVALID_CONTEXT;
    public static final /* synthetic */ EnumC993160bx4[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC993160bx4 REMOVE_REGISTERED_FAIL;
    public static final EnumC993160bx4 REPEAT_REGISTER_SAME_METHOD;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993160bx4> getEntries() {
        return LLILZ;
    }

    static {
        EnumC993160bx4 enumC993160bx4 = new EnumC993160bx4("REPEAT_REGISTER_SAME_METHOD", 0, 1, "repeat register same method");
        REPEAT_REGISTER_SAME_METHOD = enumC993160bx4;
        EnumC993160bx4 enumC993160bx42 = new EnumC993160bx4("CALL_A_UNREGISTER_METHOD", 1, 2, "call a unregister method");
        CALL_A_UNREGISTER_METHOD = enumC993160bx42;
        EnumC993160bx4 enumC993160bx43 = new EnumC993160bx4("CALL_METHORD_WITHOUTBACK_IN_TIMEOUT", 2, 3, "call methord withoutback in timeout");
        CALL_METHORD_WITHOUTBACK_IN_TIMEOUT = enumC993160bx43;
        EnumC993160bx4 enumC993160bx44 = new EnumC993160bx4("INVALID_CONTEXT", 3, 4, "invalid context");
        INVALID_CONTEXT = enumC993160bx44;
        EnumC993160bx4 enumC993160bx45 = new EnumC993160bx4("REMOVE_REGISTERED_FAIL", 4, 5, "remove registered fail");
        REMOVE_REGISTERED_FAIL = enumC993160bx45;
        EnumC993160bx4[] enumC993160bx4Arr = {enumC993160bx4, enumC993160bx42, enumC993160bx43, enumC993160bx44, enumC993160bx45};
        LLILLL = enumC993160bx4Arr;
        LLILZ = new C2254308sP(enumC993160bx4Arr);
    }

    public static EnumC993160bx4[] values() {
        return (EnumC993160bx4[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC993160bx4 valueOf(String str) {
        return (EnumC993160bx4) C08FF.LIZ(EnumC993160bx4.class, str);
    }

    public EnumC993160bx4(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
