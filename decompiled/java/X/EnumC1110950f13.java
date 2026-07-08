package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1110950f13 {
    public static final /* synthetic */ EnumC1110950f13[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1110950f13 OPERATION_STATE_FAILURE_STATUS;
    public static final EnumC1110950f13 OPERATION_STATE_INITIAL_STATUS;
    public static final EnumC1110950f13 OPERATION_STATE_SUCCESS_STATUS;
    public static final EnumC1110950f13 OPERATION_STATE_UNSET_STATUS;

    public static InterfaceC2044707zh<EnumC1110950f13> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1110950f13 enumC1110950f13 = new EnumC1110950f13("OPERATION_STATE_UNSET_STATUS", 0);
        OPERATION_STATE_UNSET_STATUS = enumC1110950f13;
        EnumC1110950f13 enumC1110950f132 = new EnumC1110950f13("OPERATION_STATE_INITIAL_STATUS", 1);
        OPERATION_STATE_INITIAL_STATUS = enumC1110950f132;
        EnumC1110950f13 enumC1110950f133 = new EnumC1110950f13("OPERATION_STATE_SUCCESS_STATUS", 2);
        OPERATION_STATE_SUCCESS_STATUS = enumC1110950f133;
        EnumC1110950f13 enumC1110950f134 = new EnumC1110950f13("OPERATION_STATE_FAILURE_STATUS", 3);
        OPERATION_STATE_FAILURE_STATUS = enumC1110950f134;
        EnumC1110950f13[] enumC1110950f13Arr = {enumC1110950f13, enumC1110950f132, enumC1110950f133, enumC1110950f134};
        LL = enumC1110950f13Arr;
        LLILLJJLI = new C2254308sP(enumC1110950f13Arr);
    }

    public static EnumC1110950f13[] values() {
        return (EnumC1110950f13[]) LL.clone();
    }

    public static EnumC1110950f13 valueOf(String str) {
        return (EnumC1110950f13) C08FF.LIZ(EnumC1110950f13.class, str);
    }

    public EnumC1110950f13(String str, int i) {
    }
}
