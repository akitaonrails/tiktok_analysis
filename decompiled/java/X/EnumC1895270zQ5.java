package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1895270zQ5 {
    public static final /* synthetic */ EnumC1895270zQ5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1895270zQ5 TYPE_BYTESYNC;
    public static final EnumC1895270zQ5 TYPE_INIT;
    public static final EnumC1895270zQ5 TYPE_LOGIN;
    public static final EnumC1895270zQ5 TYPE_LOGOUT;
    public static final EnumC1895270zQ5 TYPE_SWITCH;

    public static InterfaceC2044707zh<EnumC1895270zQ5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1895270zQ5 enumC1895270zQ5 = new EnumC1895270zQ5("TYPE_INIT", 0);
        TYPE_INIT = enumC1895270zQ5;
        EnumC1895270zQ5 enumC1895270zQ52 = new EnumC1895270zQ5("TYPE_LOGIN", 1);
        TYPE_LOGIN = enumC1895270zQ52;
        EnumC1895270zQ5 enumC1895270zQ53 = new EnumC1895270zQ5("TYPE_LOGOUT", 2);
        TYPE_LOGOUT = enumC1895270zQ53;
        EnumC1895270zQ5 enumC1895270zQ54 = new EnumC1895270zQ5("TYPE_SWITCH", 3);
        TYPE_SWITCH = enumC1895270zQ54;
        EnumC1895270zQ5 enumC1895270zQ55 = new EnumC1895270zQ5("TYPE_BYTESYNC", 4);
        TYPE_BYTESYNC = enumC1895270zQ55;
        EnumC1895270zQ5[] enumC1895270zQ5Arr = {enumC1895270zQ5, enumC1895270zQ52, enumC1895270zQ53, enumC1895270zQ54, enumC1895270zQ55};
        LL = enumC1895270zQ5Arr;
        LLILLJJLI = new C2254308sP(enumC1895270zQ5Arr);
    }

    public static EnumC1895270zQ5[] values() {
        return (EnumC1895270zQ5[]) LL.clone();
    }

    public static EnumC1895270zQ5 valueOf(String str) {
        return (EnumC1895270zQ5) C08FF.LIZ(EnumC1895270zQ5.class, str);
    }

    public EnumC1895270zQ5(String str, int i) {
    }
}
