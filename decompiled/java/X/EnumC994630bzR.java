package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994630bzR {
    public static final /* synthetic */ EnumC994630bzR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994630bzR MILD;
    public static final EnumC994630bzR MODERATE;
    public static final EnumC994630bzR NORMAL;
    public static final EnumC994630bzR SEVERE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC994630bzR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994630bzR enumC994630bzR = new EnumC994630bzR("NORMAL", 0, 0);
        NORMAL = enumC994630bzR;
        EnumC994630bzR enumC994630bzR2 = new EnumC994630bzR("MILD", 1, 1);
        MILD = enumC994630bzR2;
        EnumC994630bzR enumC994630bzR3 = new EnumC994630bzR("MODERATE", 2, 2);
        MODERATE = enumC994630bzR3;
        EnumC994630bzR enumC994630bzR4 = new EnumC994630bzR("SEVERE", 3, 3);
        SEVERE = enumC994630bzR4;
        EnumC994630bzR[] enumC994630bzRArr = {enumC994630bzR, enumC994630bzR2, enumC994630bzR3, enumC994630bzR4};
        LLILLJJLI = enumC994630bzRArr;
        LLILLL = new C2254308sP(enumC994630bzRArr);
    }

    public static EnumC994630bzR[] values() {
        return (EnumC994630bzR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC994630bzR valueOf(String str) {
        return (EnumC994630bzR) C08FF.LIZ(EnumC994630bzR.class, str);
    }

    public EnumC994630bzR(String str, int i, int i2) {
        this.LL = i2;
    }
}
