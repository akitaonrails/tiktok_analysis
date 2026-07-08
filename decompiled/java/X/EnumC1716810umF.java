package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0umF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1716810umF {
    public static final EnumC1716810umF CANCEL;
    public static final /* synthetic */ EnumC1716810umF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1716810umF SKIP;
    public static final EnumC1716810umF SUCCESS;

    public static InterfaceC2044707zh<EnumC1716810umF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1716810umF enumC1716810umF = new EnumC1716810umF("SUCCESS", 0);
        SUCCESS = enumC1716810umF;
        EnumC1716810umF enumC1716810umF2 = new EnumC1716810umF("SKIP", 1);
        SKIP = enumC1716810umF2;
        EnumC1716810umF enumC1716810umF3 = new EnumC1716810umF("CANCEL", 2);
        CANCEL = enumC1716810umF3;
        EnumC1716810umF[] enumC1716810umFArr = {enumC1716810umF, enumC1716810umF2, enumC1716810umF3};
        LL = enumC1716810umFArr;
        LLILLJJLI = new C2254308sP(enumC1716810umFArr);
    }

    public static EnumC1716810umF[] values() {
        return (EnumC1716810umF[]) LL.clone();
    }

    public static EnumC1716810umF valueOf(String str) {
        return (EnumC1716810umF) C08FF.LIZ(EnumC1716810umF.class, str);
    }

    public EnumC1716810umF(String str, int i) {
    }
}
