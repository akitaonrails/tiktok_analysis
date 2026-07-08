package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155020gA8 {
    public static final EnumC1155020gA8 LANDING_DEEPLINK_IN_MALL_SCHEMA;
    public static final EnumC1155020gA8 LANDING_DEEPLINK_IN_MALL_SPARK_VIEW_IN_DIVERSION_CONFIG;
    public static final /* synthetic */ EnumC1155020gA8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1155020gA8 MALL_SPARK_VIEW_IN_DIVERSION_CONFIG;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1155020gA8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1155020gA8 enumC1155020gA8 = new EnumC1155020gA8("LANDING_DEEPLINK_IN_MALL_SCHEMA", 0, 1);
        LANDING_DEEPLINK_IN_MALL_SCHEMA = enumC1155020gA8;
        EnumC1155020gA8 enumC1155020gA82 = new EnumC1155020gA8("LANDING_DEEPLINK_IN_MALL_SPARK_VIEW_IN_DIVERSION_CONFIG", 1, 2);
        LANDING_DEEPLINK_IN_MALL_SPARK_VIEW_IN_DIVERSION_CONFIG = enumC1155020gA82;
        EnumC1155020gA8 enumC1155020gA83 = new EnumC1155020gA8("MALL_SPARK_VIEW_IN_DIVERSION_CONFIG", 2, 3);
        MALL_SPARK_VIEW_IN_DIVERSION_CONFIG = enumC1155020gA83;
        EnumC1155020gA8[] enumC1155020gA8Arr = {enumC1155020gA8, enumC1155020gA82, enumC1155020gA83};
        LLILLJJLI = enumC1155020gA8Arr;
        LLILLL = new C2254308sP(enumC1155020gA8Arr);
    }

    public static EnumC1155020gA8[] values() {
        return (EnumC1155020gA8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1155020gA8 valueOf(String str) {
        return (EnumC1155020gA8) C08FF.LIZ(EnumC1155020gA8.class, str);
    }

    public EnumC1155020gA8(String str, int i, int i2) {
        this.LL = i2;
    }
}
