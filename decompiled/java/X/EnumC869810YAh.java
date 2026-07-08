package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869810YAh {
    public static final EnumC869810YAh COLUMN_CONV_ID;
    public static final EnumC869810YAh COLUMN_MSG_UUID;
    public static final EnumC869810YAh COLUMN_REGION_ID;
    public static final /* synthetic */ EnumC869810YAh[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC869810YAh> getEntries() {
        return LLILZ;
    }

    static {
        EnumC869810YAh enumC869810YAh = new EnumC869810YAh("COLUMN_MSG_UUID", 0, "msg_uuid", "TEXT UNIQUE");
        COLUMN_MSG_UUID = enumC869810YAh;
        EnumC869810YAh enumC869810YAh2 = new EnumC869810YAh("COLUMN_CONV_ID", 1, "conv_id", "TEXT");
        COLUMN_CONV_ID = enumC869810YAh2;
        EnumC869810YAh enumC869810YAh3 = new EnumC869810YAh("COLUMN_REGION_ID", 2, "region_id", "INTEGER");
        COLUMN_REGION_ID = enumC869810YAh3;
        EnumC869810YAh[] enumC869810YAhArr = {enumC869810YAh, enumC869810YAh2, enumC869810YAh3};
        LLILLL = enumC869810YAhArr;
        LLILZ = new C2254308sP(enumC869810YAhArr);
    }

    public static EnumC869810YAh[] values() {
        return (EnumC869810YAh[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC869810YAh valueOf(String str) {
        return (EnumC869810YAh) C08FF.LIZ(EnumC869810YAh.class, str);
    }

    public EnumC869810YAh(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
