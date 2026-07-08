package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2187408hc {
    public static final EnumC2187408hc INTERRUPTED;
    public static final /* synthetic */ EnumC2187408hc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2187408hc OUT_OF_SCREEN;
    public static final EnumC2187408hc TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2187408hc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2187408hc enumC2187408hc = new EnumC2187408hc("TIMEOUT", 0, "timeout");
        TIMEOUT = enumC2187408hc;
        EnumC2187408hc enumC2187408hc2 = new EnumC2187408hc("INTERRUPTED", 1, "interrupted");
        INTERRUPTED = enumC2187408hc2;
        EnumC2187408hc enumC2187408hc3 = new EnumC2187408hc("OUT_OF_SCREEN", 2, "out_of_screen");
        OUT_OF_SCREEN = enumC2187408hc3;
        EnumC2187408hc[] enumC2187408hcArr = {enumC2187408hc, enumC2187408hc2, enumC2187408hc3};
        LLILLJJLI = enumC2187408hcArr;
        LLILLL = new C2254308sP(enumC2187408hcArr);
    }

    public static EnumC2187408hc[] values() {
        return (EnumC2187408hc[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC2187408hc valueOf(String str) {
        return (EnumC2187408hc) C08FF.LIZ(EnumC2187408hc.class, str);
    }

    public EnumC2187408hc(String str, int i, String str2) {
        this.LL = str2;
    }
}
