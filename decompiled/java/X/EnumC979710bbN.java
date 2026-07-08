package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC979710bbN {
    public static final EnumC979710bbN FAQ;
    public static final /* synthetic */ EnumC979710bbN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC979710bbN SETTING;

    public static InterfaceC2044707zh<EnumC979710bbN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC979710bbN enumC979710bbN = new EnumC979710bbN("SETTING", 0);
        SETTING = enumC979710bbN;
        EnumC979710bbN enumC979710bbN2 = new EnumC979710bbN("FAQ", 1);
        FAQ = enumC979710bbN2;
        EnumC979710bbN[] enumC979710bbNArr = {enumC979710bbN, enumC979710bbN2};
        LL = enumC979710bbNArr;
        LLILLJJLI = new C2254308sP(enumC979710bbNArr);
    }

    public static EnumC979710bbN[] values() {
        return (EnumC979710bbN[]) LL.clone();
    }

    public static EnumC979710bbN valueOf(String str) {
        return (EnumC979710bbN) C08FF.LIZ(EnumC979710bbN.class, str);
    }

    public EnumC979710bbN(String str, int i) {
    }
}
