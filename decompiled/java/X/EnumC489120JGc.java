package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC489120JGc {
    public static final EnumC489120JGc CAN_EDIT;
    public static final EnumC489120JGc GRAY_OUT_FOR_FREQUENCY_CONTROL;
    public static final EnumC489120JGc GRAY_OUT_FOR_TIME_EXPIRATION;
    public static final EnumC489120JGc GRAY_OUT_FOR_UNDER_REVIEW;
    public static final EnumC489120JGc GRAY_OUT_UNKNOWN_REASON;
    public static final /* synthetic */ EnumC489120JGc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC489120JGc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC489120JGc enumC489120JGc = new EnumC489120JGc("CAN_EDIT", 0);
        CAN_EDIT = enumC489120JGc;
        EnumC489120JGc enumC489120JGc2 = new EnumC489120JGc("GRAY_OUT_FOR_UNDER_REVIEW", 1);
        GRAY_OUT_FOR_UNDER_REVIEW = enumC489120JGc2;
        EnumC489120JGc enumC489120JGc3 = new EnumC489120JGc("GRAY_OUT_FOR_FREQUENCY_CONTROL", 2);
        GRAY_OUT_FOR_FREQUENCY_CONTROL = enumC489120JGc3;
        EnumC489120JGc enumC489120JGc4 = new EnumC489120JGc("GRAY_OUT_FOR_TIME_EXPIRATION", 3);
        GRAY_OUT_FOR_TIME_EXPIRATION = enumC489120JGc4;
        EnumC489120JGc enumC489120JGc5 = new EnumC489120JGc("GRAY_OUT_UNKNOWN_REASON", 4);
        GRAY_OUT_UNKNOWN_REASON = enumC489120JGc5;
        EnumC489120JGc[] enumC489120JGcArr = {enumC489120JGc, enumC489120JGc2, enumC489120JGc3, enumC489120JGc4, enumC489120JGc5};
        LL = enumC489120JGcArr;
        LLILLJJLI = new C2254308sP(enumC489120JGcArr);
    }

    public static EnumC489120JGc[] values() {
        return (EnumC489120JGc[]) LL.clone();
    }

    public static EnumC489120JGc valueOf(String str) {
        return (EnumC489120JGc) C08FF.LIZ(EnumC489120JGc.class, str);
    }

    public EnumC489120JGc(String str, int i) {
    }
}
