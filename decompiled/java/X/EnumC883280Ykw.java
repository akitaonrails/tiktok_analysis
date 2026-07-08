package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ykw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC883280Ykw {
    public static final /* synthetic */ EnumC883280Ykw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC883280Ykw LOGIN;
    public static final EnumC883280Ykw LOGOUT;
    public static final EnumC883280Ykw SWITCH;
    public static final EnumC883280Ykw UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC883280Ykw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC883280Ykw enumC883280Ykw = new EnumC883280Ykw("UNKNOWN", 0, -1);
        UNKNOWN = enumC883280Ykw;
        EnumC883280Ykw enumC883280Ykw2 = new EnumC883280Ykw("LOGIN", 1, 0);
        LOGIN = enumC883280Ykw2;
        EnumC883280Ykw enumC883280Ykw3 = new EnumC883280Ykw("LOGOUT", 2, 1);
        LOGOUT = enumC883280Ykw3;
        EnumC883280Ykw enumC883280Ykw4 = new EnumC883280Ykw("SWITCH", 3, 2);
        SWITCH = enumC883280Ykw4;
        EnumC883280Ykw[] enumC883280YkwArr = {enumC883280Ykw, enumC883280Ykw2, enumC883280Ykw3, enumC883280Ykw4};
        LLILLJJLI = enumC883280YkwArr;
        LLILLL = new C2254308sP(enumC883280YkwArr);
    }

    public static EnumC883280Ykw[] values() {
        return (EnumC883280Ykw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC883280Ykw valueOf(String str) {
        return (EnumC883280Ykw) C08FF.LIZ(EnumC883280Ykw.class, str);
    }

    public EnumC883280Ykw(String str, int i, int i2) {
        this.LL = i2;
    }
}
