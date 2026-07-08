package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035700Ap {
    public static final /* synthetic */ EnumC035700Ap[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC035700Ap REFUNDABLE_SAMPLE_STATUS_CANNOT_CHANGE;
    public static final EnumC035700Ap REFUNDABLE_SAMPLE_STATUS_NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035700Ap> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035700Ap enumC035700Ap = new EnumC035700Ap("REFUNDABLE_SAMPLE_STATUS_NORMAL", 0, 1);
        REFUNDABLE_SAMPLE_STATUS_NORMAL = enumC035700Ap;
        EnumC035700Ap enumC035700Ap2 = new EnumC035700Ap("REFUNDABLE_SAMPLE_STATUS_CANNOT_CHANGE", 1, 2);
        REFUNDABLE_SAMPLE_STATUS_CANNOT_CHANGE = enumC035700Ap2;
        EnumC035700Ap[] enumC035700ApArr = {enumC035700Ap, enumC035700Ap2};
        LLILLJJLI = enumC035700ApArr;
        LLILLL = new C2254308sP(enumC035700ApArr);
    }

    public static EnumC035700Ap[] values() {
        return (EnumC035700Ap[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC035700Ap valueOf(String str) {
        return (EnumC035700Ap) C08FF.LIZ(EnumC035700Ap.class, str);
    }

    public EnumC035700Ap(String str, int i, int i2) {
        this.LL = i2;
    }
}
