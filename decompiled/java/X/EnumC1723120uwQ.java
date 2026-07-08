package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1723120uwQ {
    public static final EnumC1723120uwQ ALPHABETIC;
    public static final EnumC1723120uwQ ALPHANUMERIC;
    public static final /* synthetic */ EnumC1723120uwQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1723120uwQ NUMERIC;

    public static InterfaceC2044707zh<EnumC1723120uwQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1723120uwQ enumC1723120uwQ = new EnumC1723120uwQ("ALPHABETIC", 0);
        ALPHABETIC = enumC1723120uwQ;
        EnumC1723120uwQ enumC1723120uwQ2 = new EnumC1723120uwQ("NUMERIC", 1);
        NUMERIC = enumC1723120uwQ2;
        EnumC1723120uwQ enumC1723120uwQ3 = new EnumC1723120uwQ("ALPHANUMERIC", 2);
        ALPHANUMERIC = enumC1723120uwQ3;
        EnumC1723120uwQ[] enumC1723120uwQArr = {enumC1723120uwQ, enumC1723120uwQ2, enumC1723120uwQ3};
        LL = enumC1723120uwQArr;
        LLILLJJLI = new C2254308sP(enumC1723120uwQArr);
    }

    public static EnumC1723120uwQ[] values() {
        return (EnumC1723120uwQ[]) LL.clone();
    }

    public static EnumC1723120uwQ valueOf(String str) {
        return (EnumC1723120uwQ) C08FF.LIZ(EnumC1723120uwQ.class, str);
    }

    public EnumC1723120uwQ(String str, int i) {
    }
}
