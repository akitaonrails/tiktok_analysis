package X;

/* JADX INFO: renamed from: X.0uZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709000uZe {
    public static final C1708990uZd LIZ = new C1708990uZd("TTLS", "ttls", "pipo_ttls", "ttls", "ttls", null, null, false, null, false, true, null, null, false, "merchant_user_id", true, true, false, 146400);
    public static final C1708990uZd LIZIZ = new C1708990uZd("ucp_cashier", "agent_cashier", "ucp_cashier", "agent_cashier", "agent_cashier", null, null, false, null, false, false, null, null, false, "merchant_user_id", false, false, true, 114656);
    public static final C1708990uZd LIZJ;
    public static final C1708990uZd LIZLLL;
    public static final C1708990uZd LJ;

    static {
        EnumC992340bvk enumC992340bvk = EnumC992340bvk.PRODUCT_CODE;
        EnumC992380bvo enumC992380bvo = EnumC992380bvo.PAYIN_NATIVE_CASHIER;
        LIZJ = new C1708990uZd("AutoRepayment", "auto_repayment", "bnpl_agreement", "bnpl_agreement", "bnpl_agreement", enumC992340bvk, enumC992380bvo, true, EnumC992350bvl.RETURN_TO_BIZ, false, false, null, null, true, null, false, false, false, 253440);
        LIZLLL = new C1708990uZd("GiftCard", "gift_card", "gift_card", "gift_card", "gift_card", null, null, false, null, true, true, null, null, false, "merchant_user_id", false, false, false, 244192);
        LJ = new C1708990uZd("ecp_cashier", "agent_cashier", "ecp_cashier", "agent_cashier", "agent_cashier", null, enumC992380bvo, false, null, false, false, "pipo_cashier_selection_result", "pipo_cashier_bind_refresh", true, "merchant_user_id", false, false, false, 231328);
    }
}
