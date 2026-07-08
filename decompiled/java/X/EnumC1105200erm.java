package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0erm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1105200erm {
    public static final /* synthetic */ EnumC1105200erm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1105200erm LYNX;
    public static final EnumC1105200erm SDUI;
    public static final EnumC1105200erm UNKNOWN;
    public static final EnumC1105200erm WEB;

    public static InterfaceC2044707zh<EnumC1105200erm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1105200erm enumC1105200erm = new EnumC1105200erm("UNKNOWN", 0);
        UNKNOWN = enumC1105200erm;
        EnumC1105200erm enumC1105200erm2 = new EnumC1105200erm("WEB", 1);
        WEB = enumC1105200erm2;
        EnumC1105200erm enumC1105200erm3 = new EnumC1105200erm("LYNX", 2);
        LYNX = enumC1105200erm3;
        EnumC1105200erm enumC1105200erm4 = new EnumC1105200erm("SDUI", 3);
        SDUI = enumC1105200erm4;
        EnumC1105200erm[] enumC1105200ermArr = {enumC1105200erm, enumC1105200erm2, enumC1105200erm3, enumC1105200erm4};
        LL = enumC1105200ermArr;
        LLILLJJLI = new C2254308sP(enumC1105200ermArr);
    }

    public static EnumC1105200erm[] values() {
        return (EnumC1105200erm[]) LL.clone();
    }

    public static EnumC1105200erm valueOf(String str) {
        return (EnumC1105200erm) C08FF.LIZ(EnumC1105200erm.class, str);
    }

    public EnumC1105200erm(String str, int i) {
    }
}
