package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC969803qi {
    public static final /* synthetic */ EnumC969803qi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC969803qi TEMPLATE_ADDRESS;
    public static final EnumC969803qi TEMPLATE_DESCRIPTION;
    public static final EnumC969803qi TEMPLATE_DISTRICT;
    public static final EnumC969803qi TEMPLATE_ZIPCODE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC969803qi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC969803qi enumC969803qi = new EnumC969803qi("TEMPLATE_DESCRIPTION", 0, 1);
        TEMPLATE_DESCRIPTION = enumC969803qi;
        EnumC969803qi enumC969803qi2 = new EnumC969803qi("TEMPLATE_ZIPCODE", 1, 2);
        TEMPLATE_ZIPCODE = enumC969803qi2;
        EnumC969803qi enumC969803qi3 = new EnumC969803qi("TEMPLATE_DISTRICT", 2, 3);
        TEMPLATE_DISTRICT = enumC969803qi3;
        EnumC969803qi enumC969803qi4 = new EnumC969803qi("TEMPLATE_ADDRESS", 3, 4);
        TEMPLATE_ADDRESS = enumC969803qi4;
        EnumC969803qi[] enumC969803qiArr = {enumC969803qi, enumC969803qi2, enumC969803qi3, enumC969803qi4};
        LLILLJJLI = enumC969803qiArr;
        LLILLL = new C2254308sP(enumC969803qiArr);
    }

    public static EnumC969803qi[] values() {
        return (EnumC969803qi[]) LLILLJJLI.clone();
    }

    public final int getTemplate() {
        return this.LL;
    }

    public static EnumC969803qi valueOf(String str) {
        return (EnumC969803qi) C08FF.LIZ(EnumC969803qi.class, str);
    }

    public EnumC969803qi(String str, int i, int i2) {
        this.LL = i2;
    }
}
