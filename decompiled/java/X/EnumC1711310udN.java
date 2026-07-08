package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0udN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1711310udN {
    public static final EnumC1711310udN EMBEDDED;
    public static final /* synthetic */ EnumC1711310udN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1711310udN MAIN;

    public static InterfaceC2044707zh<EnumC1711310udN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1711310udN enumC1711310udN = new EnumC1711310udN("EMBEDDED", 0);
        EMBEDDED = enumC1711310udN;
        EnumC1711310udN enumC1711310udN2 = new EnumC1711310udN("MAIN", 1);
        MAIN = enumC1711310udN2;
        EnumC1711310udN[] enumC1711310udNArr = {enumC1711310udN, enumC1711310udN2};
        LL = enumC1711310udNArr;
        LLILLJJLI = new C2254308sP(enumC1711310udNArr);
    }

    public static EnumC1711310udN[] values() {
        return (EnumC1711310udN[]) LL.clone();
    }

    public static EnumC1711310udN valueOf(String str) {
        return (EnumC1711310udN) C08FF.LIZ(EnumC1711310udN.class, str);
    }

    public EnumC1711310udN(String str, int i) {
    }
}
