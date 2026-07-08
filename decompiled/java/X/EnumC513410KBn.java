package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513410KBn {
    public static final EnumC513410KBn AUTO_RENEWAL_CANCEL_SCENE;
    public static final EnumC513410KBn INCORRECT_GP_ACCOUNT;
    public static final EnumC513410KBn INCORRECT_PAYMENT_CHANNEL;
    public static final EnumC513410KBn INCORRECT_PRECHECK_UNKNOWN;
    public static final EnumC513410KBn INCORRECT_TIKTOK_OR_GP_ACCOUNT;
    public static final EnumC513410KBn LATE_CALLBACK_SCENE;
    public static final /* synthetic */ EnumC513410KBn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC513410KBn NOT_SPECIAL_SCENE;
    public static final EnumC513410KBn ONHOLD_SCENE;

    public static InterfaceC2044707zh<EnumC513410KBn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC513410KBn enumC513410KBn = new EnumC513410KBn("NOT_SPECIAL_SCENE", 0);
        NOT_SPECIAL_SCENE = enumC513410KBn;
        EnumC513410KBn enumC513410KBn2 = new EnumC513410KBn("LATE_CALLBACK_SCENE", 1);
        LATE_CALLBACK_SCENE = enumC513410KBn2;
        EnumC513410KBn enumC513410KBn3 = new EnumC513410KBn("ONHOLD_SCENE", 2);
        ONHOLD_SCENE = enumC513410KBn3;
        EnumC513410KBn enumC513410KBn4 = new EnumC513410KBn("AUTO_RENEWAL_CANCEL_SCENE", 3);
        AUTO_RENEWAL_CANCEL_SCENE = enumC513410KBn4;
        EnumC513410KBn enumC513410KBn5 = new EnumC513410KBn("INCORRECT_TIKTOK_OR_GP_ACCOUNT", 4);
        INCORRECT_TIKTOK_OR_GP_ACCOUNT = enumC513410KBn5;
        EnumC513410KBn enumC513410KBn6 = new EnumC513410KBn("INCORRECT_GP_ACCOUNT", 5);
        INCORRECT_GP_ACCOUNT = enumC513410KBn6;
        EnumC513410KBn enumC513410KBn7 = new EnumC513410KBn("INCORRECT_PAYMENT_CHANNEL", 6);
        INCORRECT_PAYMENT_CHANNEL = enumC513410KBn7;
        EnumC513410KBn enumC513410KBn8 = new EnumC513410KBn("INCORRECT_PRECHECK_UNKNOWN", 7);
        INCORRECT_PRECHECK_UNKNOWN = enumC513410KBn8;
        EnumC513410KBn[] enumC513410KBnArr = {enumC513410KBn, enumC513410KBn2, enumC513410KBn3, enumC513410KBn4, enumC513410KBn5, enumC513410KBn6, enumC513410KBn7, enumC513410KBn8};
        LL = enumC513410KBnArr;
        LLILLJJLI = new C2254308sP(enumC513410KBnArr);
    }

    public static EnumC513410KBn[] values() {
        return (EnumC513410KBn[]) LL.clone();
    }

    public static EnumC513410KBn valueOf(String str) {
        return (EnumC513410KBn) C08FF.LIZ(EnumC513410KBn.class, str);
    }

    public EnumC513410KBn(String str, int i) {
    }
}
