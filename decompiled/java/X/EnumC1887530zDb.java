package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1887530zDb {
    public static final C1887560zDe Companion;
    public static final EnumC1887530zDb DARK;
    public static final EnumC1887530zDb LIGHT;
    public static final /* synthetic */ EnumC1887530zDb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1887530zDb UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1887530zDb> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0zDe] */
    static {
        EnumC1887530zDb enumC1887530zDb = new EnumC1887530zDb("DARK", 0, "dark");
        DARK = enumC1887530zDb;
        EnumC1887530zDb enumC1887530zDb2 = new EnumC1887530zDb("LIGHT", 1, "light");
        LIGHT = enumC1887530zDb2;
        EnumC1887530zDb enumC1887530zDb3 = new EnumC1887530zDb("UNKNOWN", 2, null);
        UNKNOWN = enumC1887530zDb3;
        EnumC1887530zDb[] enumC1887530zDbArr = {enumC1887530zDb, enumC1887530zDb2, enumC1887530zDb3};
        LLILLJJLI = enumC1887530zDbArr;
        LLILLL = new C2254308sP(enumC1887530zDbArr);
        Companion = new Object() { // from class: X.0zDe
        };
    }

    public static EnumC1887530zDb[] values() {
        return (EnumC1887530zDb[]) LLILLJJLI.clone();
    }

    public final String getStyle() {
        return this.LL;
    }

    public static EnumC1887530zDb valueOf(String str) {
        return (EnumC1887530zDb) C08FF.LIZ(EnumC1887530zDb.class, str);
    }

    public EnumC1887530zDb(String str, int i, String str2) {
        this.LL = str2;
    }
}
