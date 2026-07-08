package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC883260Yku {
    public static final EnumC883260Yku ABORT_ACCOUNT_NOT_LOGIN;
    public static final EnumC883260Yku ABORT_EXCEPTION;
    public static final EnumC883260Yku ABORT_FTC;
    public static final EnumC883260Yku ABORT_IM_OFF;
    public static final EnumC883260Yku ABORT_INVALID_UID;
    public static final /* synthetic */ EnumC883260Yku[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC883260Yku PROCEED_TO_LOGIN_SDK;
    public static final EnumC883260Yku SDK_MGR_IS_INIT;
    public static final EnumC883260Yku SKIP_SDK_ALREADY_LOGIN;

    public static InterfaceC2044707zh<EnumC883260Yku> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC883260Yku enumC883260Yku = new EnumC883260Yku("PROCEED_TO_LOGIN_SDK", 0);
        PROCEED_TO_LOGIN_SDK = enumC883260Yku;
        EnumC883260Yku enumC883260Yku2 = new EnumC883260Yku("SKIP_SDK_ALREADY_LOGIN", 1);
        SKIP_SDK_ALREADY_LOGIN = enumC883260Yku2;
        EnumC883260Yku enumC883260Yku3 = new EnumC883260Yku("ABORT_FTC", 2);
        ABORT_FTC = enumC883260Yku3;
        EnumC883260Yku enumC883260Yku4 = new EnumC883260Yku("ABORT_IM_OFF", 3);
        ABORT_IM_OFF = enumC883260Yku4;
        EnumC883260Yku enumC883260Yku5 = new EnumC883260Yku("ABORT_ACCOUNT_NOT_LOGIN", 4);
        ABORT_ACCOUNT_NOT_LOGIN = enumC883260Yku5;
        EnumC883260Yku enumC883260Yku6 = new EnumC883260Yku("ABORT_INVALID_UID", 5);
        ABORT_INVALID_UID = enumC883260Yku6;
        EnumC883260Yku enumC883260Yku7 = new EnumC883260Yku("ABORT_EXCEPTION", 6);
        ABORT_EXCEPTION = enumC883260Yku7;
        EnumC883260Yku enumC883260Yku8 = new EnumC883260Yku("SDK_MGR_IS_INIT", 7);
        SDK_MGR_IS_INIT = enumC883260Yku8;
        EnumC883260Yku[] enumC883260YkuArr = {enumC883260Yku, enumC883260Yku2, enumC883260Yku3, enumC883260Yku4, enumC883260Yku5, enumC883260Yku6, enumC883260Yku7, enumC883260Yku8};
        LL = enumC883260YkuArr;
        LLILLJJLI = new C2254308sP(enumC883260YkuArr);
    }

    public static EnumC883260Yku[] values() {
        return (EnumC883260Yku[]) LL.clone();
    }

    public static EnumC883260Yku valueOf(String str) {
        return (EnumC883260Yku) C08FF.LIZ(EnumC883260Yku.class, str);
    }

    public EnumC883260Yku(String str, int i) {
    }
}
