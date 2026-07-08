package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC983380bhI {
    public static final C983520bhW Companion;
    public static final /* synthetic */ EnumC983380bhI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC983380bhI TRIGGER_REASON_OPT_OUT_UPDATE;
    public static final EnumC983380bhI TRIGGER_REASON_SCORE_UPDATE;
    public static final EnumC983380bhI TRIGGER_REASON_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC983380bhI> getEntries() {
        return LLILLL;
    }

    public static final EnumC983380bhI getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983520bhW.LIZ(num);
    }

    static {
        EnumC983380bhI enumC983380bhI = new EnumC983380bhI("TRIGGER_REASON_UNKNOWN", 0, 0);
        TRIGGER_REASON_UNKNOWN = enumC983380bhI;
        EnumC983380bhI enumC983380bhI2 = new EnumC983380bhI("TRIGGER_REASON_SCORE_UPDATE", 1, 1);
        TRIGGER_REASON_SCORE_UPDATE = enumC983380bhI2;
        EnumC983380bhI enumC983380bhI3 = new EnumC983380bhI("TRIGGER_REASON_OPT_OUT_UPDATE", 2, 2);
        TRIGGER_REASON_OPT_OUT_UPDATE = enumC983380bhI3;
        EnumC983380bhI[] enumC983380bhIArr = {enumC983380bhI, enumC983380bhI2, enumC983380bhI3};
        LLILLJJLI = enumC983380bhIArr;
        LLILLL = new C2254308sP(enumC983380bhIArr);
        Companion = new C983520bhW();
    }

    public static EnumC983380bhI[] values() {
        return (EnumC983380bhI[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC983380bhI valueOf(String str) {
        return (EnumC983380bhI) C08FF.LIZ(EnumC983380bhI.class, str);
    }

    public EnumC983380bhI(String str, int i, int i2) {
        this.LL = i2;
    }
}
