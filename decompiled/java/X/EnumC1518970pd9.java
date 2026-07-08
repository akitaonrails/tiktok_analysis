package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1518970pd9 {
    public static final EnumC1518970pd9 APP_LEVEL;
    public static final EnumC1518970pd9 FEATURE_LEVEL;
    public static final /* synthetic */ EnumC1518970pd9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1518970pd9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1518970pd9 enumC1518970pd9 = new EnumC1518970pd9("APP_LEVEL", 0, "app");
        APP_LEVEL = enumC1518970pd9;
        EnumC1518970pd9 enumC1518970pd92 = new EnumC1518970pd9("FEATURE_LEVEL", 1, "feature");
        FEATURE_LEVEL = enumC1518970pd92;
        EnumC1518970pd9[] enumC1518970pd9Arr = {enumC1518970pd9, enumC1518970pd92};
        LLILLJJLI = enumC1518970pd9Arr;
        LLILLL = new C2254308sP(enumC1518970pd9Arr);
    }

    public static EnumC1518970pd9[] values() {
        return (EnumC1518970pd9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1518970pd9 valueOf(String str) {
        return (EnumC1518970pd9) C08FF.LIZ(EnumC1518970pd9.class, str);
    }

    public EnumC1518970pd9(String str, int i, String str2) {
        this.LL = str2;
    }
}
