package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20656915sN {
    public static final EnumC20656915sN ALL;
    public static final EnumC20656915sN DISPERSION;
    public static final EnumC20656915sN INTERCEPT;
    public static final /* synthetic */ EnumC20656915sN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20656915sN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20656915sN enumC20656915sN = new EnumC20656915sN("ALL", 0, "all");
        ALL = enumC20656915sN;
        EnumC20656915sN enumC20656915sN2 = new EnumC20656915sN("INTERCEPT", 1, "intercept");
        INTERCEPT = enumC20656915sN2;
        EnumC20656915sN enumC20656915sN3 = new EnumC20656915sN("DISPERSION", 2, "dispersion");
        DISPERSION = enumC20656915sN3;
        EnumC20656915sN[] enumC20656915sNArr = {enumC20656915sN, enumC20656915sN2, enumC20656915sN3};
        LLILLJJLI = enumC20656915sNArr;
        LLILLL = new C2254308sP(enumC20656915sNArr);
    }

    public static EnumC20656915sN[] values() {
        return (EnumC20656915sN[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC20656915sN valueOf(String str) {
        return (EnumC20656915sN) C08FF.LIZ(EnumC20656915sN.class, str);
    }

    public EnumC20656915sN(String str, int i, String str2) {
        this.LL = str2;
    }
}
