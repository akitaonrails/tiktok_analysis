package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855390yNl {
    public static final EnumC1855390yNl COMMON_ERROR;
    public static final /* synthetic */ EnumC1855390yNl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855390yNl TOO_SHORT_ERROR;
    public static final EnumC1855390yNl UNRECOGNIZED_ERROR;

    public static InterfaceC2044707zh<EnumC1855390yNl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855390yNl enumC1855390yNl = new EnumC1855390yNl("COMMON_ERROR", 0);
        COMMON_ERROR = enumC1855390yNl;
        EnumC1855390yNl enumC1855390yNl2 = new EnumC1855390yNl("UNRECOGNIZED_ERROR", 1);
        UNRECOGNIZED_ERROR = enumC1855390yNl2;
        EnumC1855390yNl enumC1855390yNl3 = new EnumC1855390yNl("TOO_SHORT_ERROR", 2);
        TOO_SHORT_ERROR = enumC1855390yNl3;
        EnumC1855390yNl[] enumC1855390yNlArr = {enumC1855390yNl, enumC1855390yNl2, enumC1855390yNl3};
        LL = enumC1855390yNlArr;
        LLILLJJLI = new C2254308sP(enumC1855390yNlArr);
    }

    public static EnumC1855390yNl[] values() {
        return (EnumC1855390yNl[]) LL.clone();
    }

    public static EnumC1855390yNl valueOf(String str) {
        return (EnumC1855390yNl) C08FF.LIZ(EnumC1855390yNl.class, str);
    }

    public EnumC1855390yNl(String str, int i) {
    }
}
