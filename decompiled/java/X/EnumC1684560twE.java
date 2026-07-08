package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0twE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1684560twE {
    public static final EnumC1684560twE FRONT_DETECTION;
    public static final EnumC1684560twE LEFT_DETECTION;
    public static final /* synthetic */ EnumC1684560twE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1684560twE RIGHT_DETECTION;

    public static InterfaceC2044707zh<EnumC1684560twE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1684560twE enumC1684560twE = new EnumC1684560twE("LEFT_DETECTION", 0);
        LEFT_DETECTION = enumC1684560twE;
        EnumC1684560twE enumC1684560twE2 = new EnumC1684560twE("RIGHT_DETECTION", 1);
        RIGHT_DETECTION = enumC1684560twE2;
        EnumC1684560twE enumC1684560twE3 = new EnumC1684560twE("FRONT_DETECTION", 2);
        FRONT_DETECTION = enumC1684560twE3;
        EnumC1684560twE[] enumC1684560twEArr = {enumC1684560twE, enumC1684560twE2, enumC1684560twE3};
        LL = enumC1684560twEArr;
        LLILLJJLI = new C2254308sP(enumC1684560twEArr);
    }

    public static EnumC1684560twE[] values() {
        return (EnumC1684560twE[]) LL.clone();
    }

    public static EnumC1684560twE valueOf(String str) {
        return (EnumC1684560twE) C08FF.LIZ(EnumC1684560twE.class, str);
    }

    public EnumC1684560twE(String str, int i) {
    }
}
