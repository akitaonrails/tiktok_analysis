package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1284950jXh {
    public static final /* synthetic */ EnumC1284950jXh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1284950jXh TYPE_DEFAULT;
    public static final EnumC1284950jXh TYPE_HIGH;
    public static final EnumC1284950jXh TYPE_LOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1284950jXh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1284950jXh enumC1284950jXh = new EnumC1284950jXh("TYPE_LOW", 0, "low");
        TYPE_LOW = enumC1284950jXh;
        EnumC1284950jXh enumC1284950jXh2 = new EnumC1284950jXh("TYPE_DEFAULT", 1, "default");
        TYPE_DEFAULT = enumC1284950jXh2;
        EnumC1284950jXh enumC1284950jXh3 = new EnumC1284950jXh("TYPE_HIGH", 2, "high");
        TYPE_HIGH = enumC1284950jXh3;
        EnumC1284950jXh[] enumC1284950jXhArr = {enumC1284950jXh, enumC1284950jXh2, enumC1284950jXh3};
        LLILLJJLI = enumC1284950jXhArr;
        LLILLL = new C2254308sP(enumC1284950jXhArr);
    }

    public static EnumC1284950jXh[] values() {
        return (EnumC1284950jXh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1284950jXh valueOf(String str) {
        return (EnumC1284950jXh) C08FF.LIZ(EnumC1284950jXh.class, str);
    }

    public EnumC1284950jXh(String str, int i, String str2) {
        this.LL = str2;
    }
}
