package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562940M6a {
    public static final EnumC562940M6a DEBUG;
    public static final EnumC562940M6a ERROR;
    public static final EnumC562940M6a INFO;
    public static final /* synthetic */ EnumC562940M6a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC562940M6a WARN;

    public static InterfaceC2044707zh<EnumC562940M6a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562940M6a enumC562940M6a = new EnumC562940M6a("DEBUG", 0);
        DEBUG = enumC562940M6a;
        EnumC562940M6a enumC562940M6a2 = new EnumC562940M6a("INFO", 1);
        INFO = enumC562940M6a2;
        EnumC562940M6a enumC562940M6a3 = new EnumC562940M6a("WARN", 2);
        WARN = enumC562940M6a3;
        EnumC562940M6a enumC562940M6a4 = new EnumC562940M6a("ERROR", 3);
        ERROR = enumC562940M6a4;
        EnumC562940M6a[] enumC562940M6aArr = {enumC562940M6a, enumC562940M6a2, enumC562940M6a3, enumC562940M6a4};
        LL = enumC562940M6aArr;
        LLILLJJLI = new C2254308sP(enumC562940M6aArr);
    }

    public static EnumC562940M6a[] values() {
        return (EnumC562940M6a[]) LL.clone();
    }

    public static EnumC562940M6a valueOf(String str) {
        return (EnumC562940M6a) C08FF.LIZ(EnumC562940M6a.class, str);
    }

    public EnumC562940M6a(String str, int i) {
    }
}
