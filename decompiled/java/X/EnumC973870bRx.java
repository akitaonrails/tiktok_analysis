package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973870bRx {
    public static final EnumC973870bRx FINAL_CALL;
    public static final /* synthetic */ EnumC973870bRx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973870bRx PERFORMANCE;
    public static final EnumC973870bRx VICTORY_LAP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973870bRx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973870bRx enumC973870bRx = new EnumC973870bRx("PERFORMANCE", 0, "performance");
        PERFORMANCE = enumC973870bRx;
        EnumC973870bRx enumC973870bRx2 = new EnumC973870bRx("FINAL_CALL", 1, "final_call");
        FINAL_CALL = enumC973870bRx2;
        EnumC973870bRx enumC973870bRx3 = new EnumC973870bRx("VICTORY_LAP", 2, "victory_lap");
        VICTORY_LAP = enumC973870bRx3;
        EnumC973870bRx[] enumC973870bRxArr = {enumC973870bRx, enumC973870bRx2, enumC973870bRx3};
        LLILLJJLI = enumC973870bRxArr;
        LLILLL = new C2254308sP(enumC973870bRxArr);
    }

    public static EnumC973870bRx[] values() {
        return (EnumC973870bRx[]) LLILLJJLI.clone();
    }

    public final boolean isPerformance() {
        return this == PERFORMANCE;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC973870bRx valueOf(String str) {
        return (EnumC973870bRx) C08FF.LIZ(EnumC973870bRx.class, str);
    }

    public EnumC973870bRx(String str, int i, String str2) {
        this.LL = str2;
    }
}
