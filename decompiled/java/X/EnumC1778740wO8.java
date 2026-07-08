package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778740wO8 {
    public static final EnumC1778740wO8 DATA_INVALID;
    public static final EnumC1778740wO8 GENERATE_FAILED;
    public static final /* synthetic */ EnumC1778740wO8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778740wO8 SENDING_FAILED;
    public static final EnumC1778740wO8 WAITING_TIME_OUT;

    public static InterfaceC2044707zh<EnumC1778740wO8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778740wO8 enumC1778740wO8 = new EnumC1778740wO8("WAITING_TIME_OUT", 0);
        WAITING_TIME_OUT = enumC1778740wO8;
        EnumC1778740wO8 enumC1778740wO82 = new EnumC1778740wO8("DATA_INVALID", 1);
        DATA_INVALID = enumC1778740wO82;
        EnumC1778740wO8 enumC1778740wO83 = new EnumC1778740wO8("SENDING_FAILED", 2);
        SENDING_FAILED = enumC1778740wO83;
        EnumC1778740wO8 enumC1778740wO84 = new EnumC1778740wO8("GENERATE_FAILED", 3);
        GENERATE_FAILED = enumC1778740wO84;
        EnumC1778740wO8[] enumC1778740wO8Arr = {enumC1778740wO8, enumC1778740wO82, enumC1778740wO83, enumC1778740wO84};
        LL = enumC1778740wO8Arr;
        LLILLJJLI = new C2254308sP(enumC1778740wO8Arr);
    }

    public static EnumC1778740wO8[] values() {
        return (EnumC1778740wO8[]) LL.clone();
    }

    public static EnumC1778740wO8 valueOf(String str) {
        return (EnumC1778740wO8) C08FF.LIZ(EnumC1778740wO8.class, str);
    }

    public EnumC1778740wO8(String str, int i) {
    }
}
