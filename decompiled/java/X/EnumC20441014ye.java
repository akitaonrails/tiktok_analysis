package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20441014ye {
    public static final /* synthetic */ EnumC20441014ye[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20441014ye N;
    public static final EnumC20441014ye V;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20441014ye> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20441014ye enumC20441014ye = new EnumC20441014ye("V", 0, "V");
        V = enumC20441014ye;
        EnumC20441014ye enumC20441014ye2 = new EnumC20441014ye("N", 1, "N");
        N = enumC20441014ye2;
        EnumC20441014ye[] enumC20441014yeArr = {enumC20441014ye, enumC20441014ye2};
        LLILLJJLI = enumC20441014yeArr;
        LLILLL = new C2254308sP(enumC20441014yeArr);
    }

    public static EnumC20441014ye[] values() {
        return (EnumC20441014ye[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20441014ye valueOf(String str) {
        return (EnumC20441014ye) C08FF.LIZ(EnumC20441014ye.class, str);
    }

    public EnumC20441014ye(String str, int i, String str2) {
        this.LL = str2;
    }
}
