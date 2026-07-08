package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1791270wiL {
    public static final EnumC1791270wiL CANCELED;
    public static final EnumC1791270wiL FAILED;
    public static final /* synthetic */ EnumC1791270wiL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1791270wiL SUCCEED;

    public static InterfaceC2044707zh<EnumC1791270wiL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1791270wiL enumC1791270wiL = new EnumC1791270wiL("SUCCEED", 0);
        SUCCEED = enumC1791270wiL;
        EnumC1791270wiL enumC1791270wiL2 = new EnumC1791270wiL("FAILED", 1);
        FAILED = enumC1791270wiL2;
        EnumC1791270wiL enumC1791270wiL3 = new EnumC1791270wiL("CANCELED", 2);
        CANCELED = enumC1791270wiL3;
        EnumC1791270wiL[] enumC1791270wiLArr = {enumC1791270wiL, enumC1791270wiL2, enumC1791270wiL3};
        LL = enumC1791270wiLArr;
        LLILLJJLI = new C2254308sP(enumC1791270wiLArr);
    }

    public static EnumC1791270wiL[] values() {
        return (EnumC1791270wiL[]) LL.clone();
    }

    public static EnumC1791270wiL valueOf(String str) {
        return (EnumC1791270wiL) C08FF.LIZ(EnumC1791270wiL.class, str);
    }

    public EnumC1791270wiL(String str, int i) {
    }
}
