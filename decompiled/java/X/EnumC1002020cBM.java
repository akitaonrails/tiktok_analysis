package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1002020cBM implements InterfaceC593520NPq<String> {
    public static final EnumC1002020cBM AUTO;
    public static final /* synthetic */ EnumC1002020cBM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1002020cBM MANUAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1002020cBM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1002020cBM enumC1002020cBM = new EnumC1002020cBM("AUTO", 0, "auto");
        AUTO = enumC1002020cBM;
        EnumC1002020cBM enumC1002020cBM2 = new EnumC1002020cBM("MANUAL", 1, "manual");
        MANUAL = enumC1002020cBM2;
        EnumC1002020cBM[] enumC1002020cBMArr = {enumC1002020cBM, enumC1002020cBM2};
        LLILLJJLI = enumC1002020cBMArr;
        LLILLL = new C2254308sP(enumC1002020cBMArr);
    }

    public static EnumC1002020cBM[] values() {
        return (EnumC1002020cBM[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1002020cBM valueOf(String str) {
        return (EnumC1002020cBM) C08FF.LIZ(EnumC1002020cBM.class, str);
    }

    public EnumC1002020cBM(String str, int i, String str2) {
        this.LL = str2;
    }
}
