package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1723110uwP {
    public static final EnumC1723110uwP ALPHABETIC;
    public static final EnumC1723110uwP ALPHANUMERIC;
    public static final /* synthetic */ EnumC1723110uwP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1723110uwP NUMERIC;

    public static InterfaceC2044707zh<EnumC1723110uwP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1723110uwP enumC1723110uwP = new EnumC1723110uwP("ALPHABETIC", 0);
        ALPHABETIC = enumC1723110uwP;
        EnumC1723110uwP enumC1723110uwP2 = new EnumC1723110uwP("NUMERIC", 1);
        NUMERIC = enumC1723110uwP2;
        EnumC1723110uwP enumC1723110uwP3 = new EnumC1723110uwP("ALPHANUMERIC", 2);
        ALPHANUMERIC = enumC1723110uwP3;
        EnumC1723110uwP[] enumC1723110uwPArr = {enumC1723110uwP, enumC1723110uwP2, enumC1723110uwP3};
        LL = enumC1723110uwPArr;
        LLILLJJLI = new C2254308sP(enumC1723110uwPArr);
    }

    public static EnumC1723110uwP[] values() {
        return (EnumC1723110uwP[]) LL.clone();
    }

    public static EnumC1723110uwP valueOf(String str) {
        return (EnumC1723110uwP) C08FF.LIZ(EnumC1723110uwP.class, str);
    }

    public EnumC1723110uwP(String str, int i) {
    }
}
