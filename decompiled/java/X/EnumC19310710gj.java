package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19310710gj {
    public static final EnumC19310710gj ACTIVE_SHOOTER_HEADER;
    public static final EnumC19310710gj DYNAMIC_HEIGHT;
    public static final EnumC19310710gj INCREASE_1P_SIGNUP;
    public static final /* synthetic */ EnumC19310710gj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19310710gj ONLINE;
    public static final EnumC19310710gj TRIAL_EXPIRES;

    public static InterfaceC2044707zh<EnumC19310710gj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19310710gj enumC19310710gj = new EnumC19310710gj("ONLINE", 0);
        ONLINE = enumC19310710gj;
        EnumC19310710gj enumC19310710gj2 = new EnumC19310710gj("DYNAMIC_HEIGHT", 1);
        DYNAMIC_HEIGHT = enumC19310710gj2;
        EnumC19310710gj enumC19310710gj3 = new EnumC19310710gj("TRIAL_EXPIRES", 2);
        TRIAL_EXPIRES = enumC19310710gj3;
        EnumC19310710gj enumC19310710gj4 = new EnumC19310710gj("ACTIVE_SHOOTER_HEADER", 3);
        ACTIVE_SHOOTER_HEADER = enumC19310710gj4;
        EnumC19310710gj enumC19310710gj5 = new EnumC19310710gj("INCREASE_1P_SIGNUP", 4);
        INCREASE_1P_SIGNUP = enumC19310710gj5;
        EnumC19310710gj[] enumC19310710gjArr = {enumC19310710gj, enumC19310710gj2, enumC19310710gj3, enumC19310710gj4, enumC19310710gj5};
        LL = enumC19310710gjArr;
        LLILLJJLI = new C2254308sP(enumC19310710gjArr);
    }

    public static EnumC19310710gj[] values() {
        return (EnumC19310710gj[]) LL.clone();
    }

    public static EnumC19310710gj valueOf(String str) {
        return (EnumC19310710gj) C08FF.LIZ(EnumC19310710gj.class, str);
    }

    public EnumC19310710gj(String str, int i) {
    }
}
