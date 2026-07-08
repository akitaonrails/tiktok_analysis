package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992150bvR {
    public static final /* synthetic */ EnumC992150bvR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992150bvR ORIGINAL;
    public static final EnumC992150bvR ORIGINAL_CAN_TRANSLATE;
    public static final EnumC992150bvR TRANSLATED_CAN_SEE_ORIGINAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992150bvR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992150bvR enumC992150bvR = new EnumC992150bvR("ORIGINAL", 0, 0);
        ORIGINAL = enumC992150bvR;
        EnumC992150bvR enumC992150bvR2 = new EnumC992150bvR("ORIGINAL_CAN_TRANSLATE", 1, 1);
        ORIGINAL_CAN_TRANSLATE = enumC992150bvR2;
        EnumC992150bvR enumC992150bvR3 = new EnumC992150bvR("TRANSLATED_CAN_SEE_ORIGINAL", 2, 2);
        TRANSLATED_CAN_SEE_ORIGINAL = enumC992150bvR3;
        EnumC992150bvR[] enumC992150bvRArr = {enumC992150bvR, enumC992150bvR2, enumC992150bvR3};
        LLILLJJLI = enumC992150bvRArr;
        LLILLL = new C2254308sP(enumC992150bvRArr);
    }

    public static EnumC992150bvR[] values() {
        return (EnumC992150bvR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992150bvR valueOf(String str) {
        return (EnumC992150bvR) C08FF.LIZ(EnumC992150bvR.class, str);
    }

    public EnumC992150bvR(String str, int i, int i2) {
        this.LL = i2;
    }
}
