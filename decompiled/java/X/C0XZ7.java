package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZ7 {
    public static final C0XZ7 ACTIVATION_AUTHORIZE;
    public static final C0XZ7 ACTIVATION_BIND;
    public static final C0XZ7 ACTIVATION_BIND_V2;
    public static final C0XZ7 ACTIVATION_BIND_WAP;
    public static final C0XZ7 ACTIVATION_CHANGE_MOBILE;
    public static final C0XZ7 ACTIVATION_CHANGE_MOBILE_VERIFY;
    public static final C0XZ7 ACTIVATION_DEFAULT;
    public static final C0XZ7 ACTIVATION_FORGET;
    public static final C0XZ7 ACTIVATION_GET_OR_REGISTER;
    public static final C0XZ7 ACTIVATION_IDENTIFY_VERIFICATION;
    public static final C0XZ7 ACTIVATION_LOGIN_ONLY;
    public static final C0XZ7 ACTIVATION_LOGIN_PASSWORD_NOTIFY;
    public static final C0XZ7 ACTIVATION_MODIFY;
    public static final C0XZ7 ACTIVATION_NEW_REGISTER;
    public static final C0XZ7 ACTIVATION_QUICK_LOGIN;
    public static final C0XZ7 ACTIVATION_REGISTER;
    public static final C0XZ7 ACTIVATION_REGISTER_WAP;
    public static final C0XZ7 ACTIVATION_SAFE_LOCK;
    public static final C0XZ7 ACTIVATION_SAFE_UNLOCK;
    public static final C0XZ7 ACTIVATION_SUBJECT_INVITE_DEPUTY;
    public static final /* synthetic */ C0XZ7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0XZ7> getEntries() {
        return LLILLL;
    }

    static {
        C0XZ7 c0xz7 = new C0XZ7("ACTIVATION_DEFAULT", 0, 0);
        ACTIVATION_DEFAULT = c0xz7;
        C0XZ7 c0xz72 = new C0XZ7("ACTIVATION_REGISTER", 1, 1);
        ACTIVATION_REGISTER = c0xz72;
        C0XZ7 c0xz73 = new C0XZ7("ACTIVATION_BIND", 2, 2);
        ACTIVATION_BIND = c0xz73;
        C0XZ7 c0xz74 = new C0XZ7("ACTIVATION_FORGET", 3, 3);
        ACTIVATION_FORGET = c0xz74;
        C0XZ7 c0xz75 = new C0XZ7("ACTIVATION_MODIFY", 4, 4);
        ACTIVATION_MODIFY = c0xz75;
        C0XZ7 c0xz76 = new C0XZ7("ACTIVATION_REGISTER_WAP", 5, 5);
        ACTIVATION_REGISTER_WAP = c0xz76;
        C0XZ7 c0xz77 = new C0XZ7("ACTIVATION_BIND_WAP", 6, 6);
        ACTIVATION_BIND_WAP = c0xz77;
        C0XZ7 c0xz78 = new C0XZ7("ACTIVATION_NEW_REGISTER", 7, 7);
        ACTIVATION_NEW_REGISTER = c0xz78;
        C0XZ7 c0xz79 = new C0XZ7("ACTIVATION_LOGIN_PASSWORD_NOTIFY", 8, 8);
        ACTIVATION_LOGIN_PASSWORD_NOTIFY = c0xz79;
        C0XZ7 c0xz710 = new C0XZ7("ACTIVATION_BIND_V2", 9, 9);
        ACTIVATION_BIND_V2 = c0xz710;
        C0XZ7 c0xz711 = new C0XZ7("ACTIVATION_CHANGE_MOBILE", 10, 10);
        ACTIVATION_CHANGE_MOBILE = c0xz711;
        C0XZ7 c0xz712 = new C0XZ7("ACTIVATION_QUICK_LOGIN", 11, 11);
        ACTIVATION_QUICK_LOGIN = c0xz712;
        C0XZ7 c0xz713 = new C0XZ7("ACTIVATION_IDENTIFY_VERIFICATION", 12, 13);
        ACTIVATION_IDENTIFY_VERIFICATION = c0xz713;
        C0XZ7 c0xz714 = new C0XZ7("ACTIVATION_CHANGE_MOBILE_VERIFY", 13, 14);
        ACTIVATION_CHANGE_MOBILE_VERIFY = c0xz714;
        C0XZ7 c0xz715 = new C0XZ7("ACTIVATION_SAFE_LOCK", 14, 15);
        ACTIVATION_SAFE_LOCK = c0xz715;
        C0XZ7 c0xz716 = new C0XZ7("ACTIVATION_SAFE_UNLOCK", 15, 16);
        ACTIVATION_SAFE_UNLOCK = c0xz716;
        C0XZ7 c0xz717 = new C0XZ7("ACTIVATION_AUTHORIZE", 16, 17);
        ACTIVATION_AUTHORIZE = c0xz717;
        C0XZ7 c0xz718 = new C0XZ7("ACTIVATION_GET_OR_REGISTER", 17, 18);
        ACTIVATION_GET_OR_REGISTER = c0xz718;
        C0XZ7 c0xz719 = new C0XZ7("ACTIVATION_LOGIN_ONLY", 18, 19);
        ACTIVATION_LOGIN_ONLY = c0xz719;
        C0XZ7 c0xz720 = new C0XZ7("ACTIVATION_SUBJECT_INVITE_DEPUTY", 19, 100);
        ACTIVATION_SUBJECT_INVITE_DEPUTY = c0xz720;
        C0XZ7[] c0xz7Arr = {c0xz7, c0xz72, c0xz73, c0xz74, c0xz75, c0xz76, c0xz77, c0xz78, c0xz79, c0xz710, c0xz711, c0xz712, c0xz713, c0xz714, c0xz715, c0xz716, c0xz717, c0xz718, c0xz719, c0xz720};
        LLILLJJLI = c0xz7Arr;
        LLILLL = new C2254308sP(c0xz7Arr);
    }

    public static C0XZ7[] values() {
        return (C0XZ7[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C0XZ7 valueOf(String str) {
        return (C0XZ7) C08FF.LIZ(C0XZ7.class, str);
    }

    public C0XZ7(String str, int i, int i2) {
        this.LL = i2;
    }
}
