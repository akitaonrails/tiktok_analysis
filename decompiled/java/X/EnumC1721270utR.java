package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0utR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1721270utR {
    public static final /* synthetic */ EnumC1721270utR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1721270utR LOAD_FAIL;
    public static final EnumC1721270utR START;
    public static final EnumC1721270utR TIME_OUT;

    public static InterfaceC2044707zh<EnumC1721270utR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1721270utR enumC1721270utR = new EnumC1721270utR("START", 0);
        START = enumC1721270utR;
        EnumC1721270utR enumC1721270utR2 = new EnumC1721270utR("TIME_OUT", 1);
        TIME_OUT = enumC1721270utR2;
        EnumC1721270utR enumC1721270utR3 = new EnumC1721270utR("LOAD_FAIL", 2);
        LOAD_FAIL = enumC1721270utR3;
        EnumC1721270utR[] enumC1721270utRArr = {enumC1721270utR, enumC1721270utR2, enumC1721270utR3};
        LL = enumC1721270utRArr;
        LLILLJJLI = new C2254308sP(enumC1721270utRArr);
    }

    public static EnumC1721270utR[] values() {
        return (EnumC1721270utR[]) LL.clone();
    }

    public static EnumC1721270utR valueOf(String str) {
        return (EnumC1721270utR) C08FF.LIZ(EnumC1721270utR.class, str);
    }

    public EnumC1721270utR(String str, int i) {
    }
}
