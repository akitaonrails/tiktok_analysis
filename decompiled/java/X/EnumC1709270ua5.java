package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ua5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709270ua5 {
    public static final EnumC1709270ua5 AGENT_CASHIER;
    public static final EnumC1709270ua5 BNPL_AGREEMENT;
    public static final EnumC1709270ua5 GIFT_CARD;
    public static final /* synthetic */ EnumC1709270ua5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1709270ua5 TTLS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1709270ua5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1709270ua5 enumC1709270ua5 = new EnumC1709270ua5("TTLS", 0, "ttls");
        TTLS = enumC1709270ua5;
        EnumC1709270ua5 enumC1709270ua52 = new EnumC1709270ua5("BNPL_AGREEMENT", 1, "bnpl_agreement");
        BNPL_AGREEMENT = enumC1709270ua52;
        EnumC1709270ua5 enumC1709270ua53 = new EnumC1709270ua5("GIFT_CARD", 2, "gift_card");
        GIFT_CARD = enumC1709270ua53;
        EnumC1709270ua5 enumC1709270ua54 = new EnumC1709270ua5("AGENT_CASHIER", 3, "agent_cashier");
        AGENT_CASHIER = enumC1709270ua54;
        EnumC1709270ua5[] enumC1709270ua5Arr = {enumC1709270ua5, enumC1709270ua52, enumC1709270ua53, enumC1709270ua54};
        LLILLJJLI = enumC1709270ua5Arr;
        LLILLL = new C2254308sP(enumC1709270ua5Arr);
    }

    public static EnumC1709270ua5[] values() {
        return (EnumC1709270ua5[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1709270ua5 valueOf(String str) {
        return (EnumC1709270ua5) C08FF.LIZ(EnumC1709270ua5.class, str);
    }

    public EnumC1709270ua5(String str, int i, String str2) {
        this.LL = str2;
    }
}
