package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1112150f2z {
    public static final EnumC1112150f2z ExtendedGift;
    public static final EnumC1112150f2z ExtendedMain;
    public static final EnumC1112150f2z ExtendedOuterSource;
    public static final /* synthetic */ EnumC1112150f2z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1112150f2z Main;

    public static InterfaceC2044707zh<EnumC1112150f2z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1112150f2z enumC1112150f2z = new EnumC1112150f2z("Main", 0);
        Main = enumC1112150f2z;
        EnumC1112150f2z enumC1112150f2z2 = new EnumC1112150f2z("ExtendedMain", 1);
        ExtendedMain = enumC1112150f2z2;
        EnumC1112150f2z enumC1112150f2z3 = new EnumC1112150f2z("ExtendedGift", 2);
        ExtendedGift = enumC1112150f2z3;
        EnumC1112150f2z enumC1112150f2z4 = new EnumC1112150f2z("ExtendedOuterSource", 3);
        ExtendedOuterSource = enumC1112150f2z4;
        EnumC1112150f2z[] enumC1112150f2zArr = {enumC1112150f2z, enumC1112150f2z2, enumC1112150f2z3, enumC1112150f2z4};
        LL = enumC1112150f2zArr;
        LLILLJJLI = new C2254308sP(enumC1112150f2zArr);
    }

    public static EnumC1112150f2z[] values() {
        return (EnumC1112150f2z[]) LL.clone();
    }

    public static EnumC1112150f2z valueOf(String str) {
        return (EnumC1112150f2z) C08FF.LIZ(EnumC1112150f2z.class, str);
    }

    public EnumC1112150f2z(String str, int i) {
    }
}
