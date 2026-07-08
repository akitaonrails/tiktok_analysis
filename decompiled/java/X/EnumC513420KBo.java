package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513420KBo {
    public static final EnumC513420KBo AUTO_RENEWAL_CANCEL_SCENE;
    public static final EnumC513420KBo INCORRECT_GP_ACCOUNT;
    public static final EnumC513420KBo INCORRECT_PAYMENT_CHANNEL;
    public static final EnumC513420KBo INCORRECT_PRECHECK_UNKNOWN;
    public static final EnumC513420KBo INCORRECT_TIKTOK_OR_GP_ACCOUNT;
    public static final EnumC513420KBo LATE_CALLBACK_SCENE;
    public static final /* synthetic */ EnumC513420KBo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC513420KBo NOT_SPECIAL_SCENE;
    public static final EnumC513420KBo ONHOLD_SCENE;

    public static InterfaceC2044707zh<EnumC513420KBo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC513420KBo enumC513420KBo = new EnumC513420KBo("NOT_SPECIAL_SCENE", 0);
        NOT_SPECIAL_SCENE = enumC513420KBo;
        EnumC513420KBo enumC513420KBo2 = new EnumC513420KBo("LATE_CALLBACK_SCENE", 1);
        LATE_CALLBACK_SCENE = enumC513420KBo2;
        EnumC513420KBo enumC513420KBo3 = new EnumC513420KBo("ONHOLD_SCENE", 2);
        ONHOLD_SCENE = enumC513420KBo3;
        EnumC513420KBo enumC513420KBo4 = new EnumC513420KBo("AUTO_RENEWAL_CANCEL_SCENE", 3);
        AUTO_RENEWAL_CANCEL_SCENE = enumC513420KBo4;
        EnumC513420KBo enumC513420KBo5 = new EnumC513420KBo("INCORRECT_TIKTOK_OR_GP_ACCOUNT", 4);
        INCORRECT_TIKTOK_OR_GP_ACCOUNT = enumC513420KBo5;
        EnumC513420KBo enumC513420KBo6 = new EnumC513420KBo("INCORRECT_GP_ACCOUNT", 5);
        INCORRECT_GP_ACCOUNT = enumC513420KBo6;
        EnumC513420KBo enumC513420KBo7 = new EnumC513420KBo("INCORRECT_PAYMENT_CHANNEL", 6);
        INCORRECT_PAYMENT_CHANNEL = enumC513420KBo7;
        EnumC513420KBo enumC513420KBo8 = new EnumC513420KBo("INCORRECT_PRECHECK_UNKNOWN", 7);
        INCORRECT_PRECHECK_UNKNOWN = enumC513420KBo8;
        EnumC513420KBo[] enumC513420KBoArr = {enumC513420KBo, enumC513420KBo2, enumC513420KBo3, enumC513420KBo4, enumC513420KBo5, enumC513420KBo6, enumC513420KBo7, enumC513420KBo8};
        LL = enumC513420KBoArr;
        LLILLJJLI = new C2254308sP(enumC513420KBoArr);
    }

    public static EnumC513420KBo[] values() {
        return (EnumC513420KBo[]) LL.clone();
    }

    public static EnumC513420KBo valueOf(String str) {
        return (EnumC513420KBo) C08FF.LIZ(EnumC513420KBo.class, str);
    }

    public EnumC513420KBo(String str, int i) {
    }
}
