package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1585320rMA {
    public static final EnumC1585320rMA FINAL_CHECK;
    public static final /* synthetic */ EnumC1585320rMA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1585320rMA PRE_CHECK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1585320rMA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1585320rMA enumC1585320rMA = new EnumC1585320rMA("PRE_CHECK", 0, "pre_check");
        PRE_CHECK = enumC1585320rMA;
        EnumC1585320rMA enumC1585320rMA2 = new EnumC1585320rMA("FINAL_CHECK", 1, "final_check");
        FINAL_CHECK = enumC1585320rMA2;
        EnumC1585320rMA[] enumC1585320rMAArr = {enumC1585320rMA, enumC1585320rMA2};
        LLILLJJLI = enumC1585320rMAArr;
        LLILLL = new C2254308sP(enumC1585320rMAArr);
    }

    public static EnumC1585320rMA[] values() {
        return (EnumC1585320rMA[]) LLILLJJLI.clone();
    }

    public final String getStageStr() {
        return this.LL;
    }

    public static EnumC1585320rMA valueOf(String str) {
        return (EnumC1585320rMA) C08FF.LIZ(EnumC1585320rMA.class, str);
    }

    public EnumC1585320rMA(String str, int i, String str2) {
        this.LL = str2;
    }
}
