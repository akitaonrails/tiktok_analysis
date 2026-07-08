package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03uP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC992703uP {
    public static final EnumC992703uP AD_MAIL;
    public static final EnumC992703uP CHAT_WITH_WHATSAPP;
    public static final EnumC992703uP ECOMMERCE_THIRD_PARTY;
    public static final /* synthetic */ EnumC992703uP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992703uP PAYMENT_BIND;
    public static final EnumC992703uP PAYMENT_RESULT_REDIRECT;
    public static final EnumC992703uP PIPO_NON_ISOLATE_CONTAINER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992703uP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992703uP enumC992703uP = new EnumC992703uP("ECOMMERCE_THIRD_PARTY", 0, "0x18008003");
        ECOMMERCE_THIRD_PARTY = enumC992703uP;
        EnumC992703uP enumC992703uP2 = new EnumC992703uP("PAYMENT_RESULT_REDIRECT", 1, "0x18007000");
        PAYMENT_RESULT_REDIRECT = enumC992703uP2;
        EnumC992703uP enumC992703uP3 = new EnumC992703uP("PAYMENT_BIND", 2, "0x18007000");
        PAYMENT_BIND = enumC992703uP3;
        EnumC992703uP enumC992703uP4 = new EnumC992703uP("CHAT_WITH_WHATSAPP", 3, "0x48000302");
        CHAT_WITH_WHATSAPP = enumC992703uP4;
        EnumC992703uP enumC992703uP5 = new EnumC992703uP("AD_MAIL", 4, "0x48001203");
        AD_MAIL = enumC992703uP5;
        EnumC992703uP enumC992703uP6 = new EnumC992703uP("PIPO_NON_ISOLATE_CONTAINER", 5, "0x18007001");
        PIPO_NON_ISOLATE_CONTAINER = enumC992703uP6;
        EnumC992703uP[] enumC992703uPArr = {enumC992703uP, enumC992703uP2, enumC992703uP3, enumC992703uP4, enumC992703uP5, enumC992703uP6};
        LLILLJJLI = enumC992703uPArr;
        LLILLL = new C2254308sP(enumC992703uPArr);
    }

    public static EnumC992703uP[] values() {
        return (EnumC992703uP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC992703uP valueOf(String str) {
        return (EnumC992703uP) C08FF.LIZ(EnumC992703uP.class, str);
    }

    public EnumC992703uP(String str, int i, String str2) {
        this.LL = str2;
    }
}
