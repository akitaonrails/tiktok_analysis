package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1581606He {
    public static final C1581906Hh Companion;
    public static final /* synthetic */ EnumC1581606He[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1581606He STREAK;
    public static final EnumC1581606He STREAK_PET;
    public static final EnumC1581606He UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1581606He> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.06Hh] */
    static {
        EnumC1581606He enumC1581606He = new EnumC1581606He("UNKNOWN", 0, 0);
        UNKNOWN = enumC1581606He;
        EnumC1581606He enumC1581606He2 = new EnumC1581606He("STREAK", 1, 1);
        STREAK = enumC1581606He2;
        EnumC1581606He enumC1581606He3 = new EnumC1581606He("STREAK_PET", 2, 2);
        STREAK_PET = enumC1581606He3;
        EnumC1581606He[] enumC1581606HeArr = {enumC1581606He, enumC1581606He2, enumC1581606He3};
        LLILLJJLI = enumC1581606HeArr;
        LLILLL = new C2254308sP(enumC1581606HeArr);
        Companion = new Object() { // from class: X.06Hh
        };
    }

    public static EnumC1581606He[] values() {
        return (EnumC1581606He[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1581606He valueOf(String str) {
        return (EnumC1581606He) C08FF.LIZ(EnumC1581606He.class, str);
    }

    public EnumC1581606He(String str, int i, int i2) {
        this.LL = i2;
    }
}
