package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222760hvO {
    public static final /* synthetic */ EnumC1222760hvO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1222760hvO TAG_0;
    public static final EnumC1222760hvO TAG_1;
    public static final EnumC1222760hvO TAG_2;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1222760hvO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222760hvO enumC1222760hvO = new EnumC1222760hvO("TAG_0", 0, "//minis_internal/main_0");
        TAG_0 = enumC1222760hvO;
        EnumC1222760hvO enumC1222760hvO2 = new EnumC1222760hvO("TAG_1", 1, "//minis_internal/main_1");
        TAG_1 = enumC1222760hvO2;
        EnumC1222760hvO enumC1222760hvO3 = new EnumC1222760hvO("TAG_2", 2, "//minis_internal/main_2");
        TAG_2 = enumC1222760hvO3;
        EnumC1222760hvO[] enumC1222760hvOArr = {enumC1222760hvO, enumC1222760hvO2, enumC1222760hvO3};
        LLILLJJLI = enumC1222760hvOArr;
        LLILLL = new C2254308sP(enumC1222760hvOArr);
    }

    public static EnumC1222760hvO[] values() {
        return (EnumC1222760hvO[]) LLILLJJLI.clone();
    }

    public final String getUrl() {
        return this.LL;
    }

    public static EnumC1222760hvO valueOf(String str) {
        return (EnumC1222760hvO) C08FF.LIZ(EnumC1222760hvO.class, str);
    }

    public EnumC1222760hvO(String str, int i, String str2) {
        this.LL = str2;
    }
}
