package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804803Ck {
    public static final /* synthetic */ EnumC804803Ck[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804803Ck SELLER_CRM;
    public static final EnumC804803Ck SHOPIFY_EMAIL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804803Ck> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804803Ck enumC804803Ck = new EnumC804803Ck("SHOPIFY_EMAIL", 0, 1);
        SHOPIFY_EMAIL = enumC804803Ck;
        EnumC804803Ck enumC804803Ck2 = new EnumC804803Ck("SELLER_CRM", 1, 2);
        SELLER_CRM = enumC804803Ck2;
        EnumC804803Ck[] enumC804803CkArr = {enumC804803Ck, enumC804803Ck2};
        LLILLJJLI = enumC804803CkArr;
        LLILLL = new C2254308sP(enumC804803CkArr);
    }

    public static EnumC804803Ck[] values() {
        return (EnumC804803Ck[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804803Ck valueOf(String str) {
        return (EnumC804803Ck) C08FF.LIZ(EnumC804803Ck.class, str);
    }

    public EnumC804803Ck(String str, int i, int i2) {
        this.LL = i2;
    }
}
