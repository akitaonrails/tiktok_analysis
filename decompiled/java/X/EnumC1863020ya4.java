package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ya4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1863020ya4 {
    public static final EnumC1863020ya4 GRID;
    public static final EnumC1863020ya4 HORIZONTAL;
    public static final /* synthetic */ EnumC1863020ya4[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1863020ya4 QUERY_RECOMMEND;
    public static final EnumC1863020ya4 VERTICAL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1863020ya4> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1863020ya4 enumC1863020ya4 = new EnumC1863020ya4("VERTICAL", 0, 1, "vertical");
        VERTICAL = enumC1863020ya4;
        EnumC1863020ya4 enumC1863020ya42 = new EnumC1863020ya4("GRID", 1, 2, "four_grid");
        GRID = enumC1863020ya42;
        EnumC1863020ya4 enumC1863020ya43 = new EnumC1863020ya4("HORIZONTAL", 2, 3, "horizontal");
        HORIZONTAL = enumC1863020ya43;
        EnumC1863020ya4 enumC1863020ya44 = new EnumC1863020ya4("QUERY_RECOMMEND", 3, 4, "query_guide");
        QUERY_RECOMMEND = enumC1863020ya44;
        EnumC1863020ya4[] enumC1863020ya4Arr = {enumC1863020ya4, enumC1863020ya42, enumC1863020ya43, enumC1863020ya44};
        LLILLL = enumC1863020ya4Arr;
        LLILZ = new C2254308sP(enumC1863020ya4Arr);
    }

    public static EnumC1863020ya4[] values() {
        return (EnumC1863020ya4[]) LLILLL.clone();
    }

    public final int getComponentType() {
        return this.LL;
    }

    public final String getMobOnboardingStyle() {
        return this.LLILLJJLI;
    }

    public static EnumC1863020ya4 valueOf(String str) {
        return (EnumC1863020ya4) C08FF.LIZ(EnumC1863020ya4.class, str);
    }

    public EnumC1863020ya4(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
