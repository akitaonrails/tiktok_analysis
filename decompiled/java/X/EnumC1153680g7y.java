package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153680g7y {
    public static final EnumC1153680g7y ADDRESS_DISTRICT_INCOMPLETE;
    public static final EnumC1153680g7y ADDRESS_DISTRICT_UPGRADE;
    public static final EnumC1153680g7y DISTRICT_UPGRADE;
    public static final EnumC1153680g7y INCOMPLETE_ADDRESS;
    public static final /* synthetic */ EnumC1153680g7y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153680g7y POSTCODE_INVALID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153680g7y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153680g7y enumC1153680g7y = new EnumC1153680g7y("INCOMPLETE_ADDRESS", 0, 1);
        INCOMPLETE_ADDRESS = enumC1153680g7y;
        EnumC1153680g7y enumC1153680g7y2 = new EnumC1153680g7y("DISTRICT_UPGRADE", 1, 2);
        DISTRICT_UPGRADE = enumC1153680g7y2;
        EnumC1153680g7y enumC1153680g7y3 = new EnumC1153680g7y("POSTCODE_INVALID", 2, 3);
        POSTCODE_INVALID = enumC1153680g7y3;
        EnumC1153680g7y enumC1153680g7y4 = new EnumC1153680g7y("ADDRESS_DISTRICT_INCOMPLETE", 3, 4);
        ADDRESS_DISTRICT_INCOMPLETE = enumC1153680g7y4;
        EnumC1153680g7y enumC1153680g7y5 = new EnumC1153680g7y("ADDRESS_DISTRICT_UPGRADE", 4, 5);
        ADDRESS_DISTRICT_UPGRADE = enumC1153680g7y5;
        EnumC1153680g7y[] enumC1153680g7yArr = {enumC1153680g7y, enumC1153680g7y2, enumC1153680g7y3, enumC1153680g7y4, enumC1153680g7y5};
        LLILLJJLI = enumC1153680g7yArr;
        LLILLL = new C2254308sP(enumC1153680g7yArr);
    }

    public static EnumC1153680g7y[] values() {
        return (EnumC1153680g7y[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153680g7y valueOf(String str) {
        return (EnumC1153680g7y) C08FF.LIZ(EnumC1153680g7y.class, str);
    }

    public EnumC1153680g7y(String str, int i, int i2) {
        this.LL = i2;
    }
}
