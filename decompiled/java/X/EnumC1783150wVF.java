package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783150wVF {
    public static final EnumC1783150wVF BUSINESS;
    public static final C1783160wVG Companion;
    public static final /* synthetic */ EnumC1783150wVF[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1783150wVF NONE;
    public static final EnumC1783150wVF QCPX;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1783150wVF> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0wVG] */
    static {
        EnumC1783150wVF enumC1783150wVF = new EnumC1783150wVF("NONE", 0, 0, "none");
        NONE = enumC1783150wVF;
        EnumC1783150wVF enumC1783150wVF2 = new EnumC1783150wVF("QCPX", 1, 1, "platform");
        QCPX = enumC1783150wVF2;
        EnumC1783150wVF enumC1783150wVF3 = new EnumC1783150wVF("BUSINESS", 2, 2, "developer");
        BUSINESS = enumC1783150wVF3;
        EnumC1783150wVF[] enumC1783150wVFArr = {enumC1783150wVF, enumC1783150wVF2, enumC1783150wVF3};
        LLILLL = enumC1783150wVFArr;
        LLILZ = new C2254308sP(enumC1783150wVFArr);
        Companion = new Object() { // from class: X.0wVG
        };
    }

    public static EnumC1783150wVF[] values() {
        return (EnumC1783150wVF[]) LLILLL.clone();
    }

    public final String getAnalyticsValue() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1783150wVF valueOf(String str) {
        return (EnumC1783150wVF) C08FF.LIZ(EnumC1783150wVF.class, str);
    }

    public EnumC1783150wVF(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
