package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869730Y9z {
    public static final EnumC869730Y9z COLUMN_BINARY_VALUE;
    public static final EnumC869730Y9z COLUMN_CONVERSATION_ID;
    public static final EnumC869730Y9z COLUMN_KEY;
    public static final EnumC869730Y9z COLUMN_MSG_ID;
    public static final EnumC869730Y9z COLUMN_NUM_VALUE;
    public static final EnumC869730Y9z COLUMN_VALUE;
    public static final /* synthetic */ EnumC869730Y9z[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC869730Y9z> getEntries() {
        return LLILZ;
    }

    static {
        EnumC869730Y9z enumC869730Y9z = new EnumC869730Y9z("COLUMN_MSG_ID", 0, "uuid", "TEXT");
        COLUMN_MSG_ID = enumC869730Y9z;
        EnumC869730Y9z enumC869730Y9z2 = new EnumC869730Y9z("COLUMN_KEY", 1, "key", "TEXT");
        COLUMN_KEY = enumC869730Y9z2;
        EnumC869730Y9z enumC869730Y9z3 = new EnumC869730Y9z("COLUMN_VALUE", 2, "value", "TEXT");
        COLUMN_VALUE = enumC869730Y9z3;
        EnumC869730Y9z enumC869730Y9z4 = new EnumC869730Y9z("COLUMN_BINARY_VALUE", 3, "binary_value", "BLOB");
        COLUMN_BINARY_VALUE = enumC869730Y9z4;
        EnumC869730Y9z enumC869730Y9z5 = new EnumC869730Y9z("COLUMN_CONVERSATION_ID", 4, "conversation_id", "TEXT");
        COLUMN_CONVERSATION_ID = enumC869730Y9z5;
        EnumC869730Y9z enumC869730Y9z6 = new EnumC869730Y9z("COLUMN_NUM_VALUE", 5, "num_value", "REAL");
        COLUMN_NUM_VALUE = enumC869730Y9z6;
        EnumC869730Y9z[] enumC869730Y9zArr = {enumC869730Y9z, enumC869730Y9z2, enumC869730Y9z3, enumC869730Y9z4, enumC869730Y9z5, enumC869730Y9z6};
        LLILLL = enumC869730Y9zArr;
        LLILZ = new C2254308sP(enumC869730Y9zArr);
    }

    public static EnumC869730Y9z[] values() {
        return (EnumC869730Y9z[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC869730Y9z valueOf(String str) {
        return (EnumC869730Y9z) C08FF.LIZ(EnumC869730Y9z.class, str);
    }

    public EnumC869730Y9z(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
