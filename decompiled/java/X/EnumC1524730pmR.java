package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1524730pmR {
    public static final EnumC1524730pmR INVALID_DOMAIN;
    public static final EnumC1524730pmR INVALID_URL;
    public static final /* synthetic */ EnumC1524730pmR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1524730pmR PROTOCOL_ERROR;
    public static final EnumC1524730pmR SUCCESS;

    public static InterfaceC2044707zh<EnumC1524730pmR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1524730pmR enumC1524730pmR = new EnumC1524730pmR("PROTOCOL_ERROR", 0);
        PROTOCOL_ERROR = enumC1524730pmR;
        EnumC1524730pmR enumC1524730pmR2 = new EnumC1524730pmR("INVALID_DOMAIN", 1);
        INVALID_DOMAIN = enumC1524730pmR2;
        EnumC1524730pmR enumC1524730pmR3 = new EnumC1524730pmR("INVALID_URL", 2);
        INVALID_URL = enumC1524730pmR3;
        EnumC1524730pmR enumC1524730pmR4 = new EnumC1524730pmR("SUCCESS", 3);
        SUCCESS = enumC1524730pmR4;
        EnumC1524730pmR[] enumC1524730pmRArr = {enumC1524730pmR, enumC1524730pmR2, enumC1524730pmR3, enumC1524730pmR4};
        LL = enumC1524730pmRArr;
        LLILLJJLI = new C2254308sP(enumC1524730pmRArr);
    }

    public static EnumC1524730pmR[] values() {
        return (EnumC1524730pmR[]) LL.clone();
    }

    public static EnumC1524730pmR valueOf(String str) {
        return (EnumC1524730pmR) C08FF.LIZ(EnumC1524730pmR.class, str);
    }

    public EnumC1524730pmR(String str, int i) {
    }
}
