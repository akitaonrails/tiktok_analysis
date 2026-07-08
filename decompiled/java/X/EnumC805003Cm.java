package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC805003Cm {
    public static final EnumC805003Cm BNPL;
    public static final /* synthetic */ EnumC805003Cm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC805003Cm ONE_STEP_PAYMENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC805003Cm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC805003Cm enumC805003Cm = new EnumC805003Cm("BNPL", 0, 1);
        BNPL = enumC805003Cm;
        EnumC805003Cm enumC805003Cm2 = new EnumC805003Cm("ONE_STEP_PAYMENT", 1, 2);
        ONE_STEP_PAYMENT = enumC805003Cm2;
        EnumC805003Cm[] enumC805003CmArr = {enumC805003Cm, enumC805003Cm2};
        LLILLJJLI = enumC805003CmArr;
        LLILLL = new C2254308sP(enumC805003CmArr);
    }

    public static EnumC805003Cm[] values() {
        return (EnumC805003Cm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC805003Cm valueOf(String str) {
        return (EnumC805003Cm) C08FF.LIZ(EnumC805003Cm.class, str);
    }

    public EnumC805003Cm(String str, int i, int i2) {
        this.LL = i2;
    }
}
