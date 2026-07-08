package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1787510wcH {
    public static final EnumC1787510wcH CASHIER_DISMISS;
    public static final EnumC1787510wcH INIT;
    public static final /* synthetic */ EnumC1787510wcH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1787510wcH PENDING_RESTORE;
    public static final EnumC1787510wcH PURCHASE_UPDATE_NO_ORDER;
    public static final EnumC1787510wcH UPLOAD_TOKEN_FAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1787510wcH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1787510wcH enumC1787510wcH = new EnumC1787510wcH("INIT", 0, "query_restore-settings_init");
        INIT = enumC1787510wcH;
        EnumC1787510wcH enumC1787510wcH2 = new EnumC1787510wcH("UPLOAD_TOKEN_FAIL", 1, "query_restore-upload_token_fail");
        UPLOAD_TOKEN_FAIL = enumC1787510wcH2;
        EnumC1787510wcH enumC1787510wcH3 = new EnumC1787510wcH("CASHIER_DISMISS", 2, "query_restore-gp_panel_dismiss");
        CASHIER_DISMISS = enumC1787510wcH3;
        EnumC1787510wcH enumC1787510wcH4 = new EnumC1787510wcH("PENDING_RESTORE", 3, "no_query_restore-gp_cb_late_after_order_is_finished");
        PENDING_RESTORE = enumC1787510wcH4;
        EnumC1787510wcH enumC1787510wcH5 = new EnumC1787510wcH("PURCHASE_UPDATE_NO_ORDER", 4, "query_restore-empty_billing_listener");
        PURCHASE_UPDATE_NO_ORDER = enumC1787510wcH5;
        EnumC1787510wcH[] enumC1787510wcHArr = {enumC1787510wcH, enumC1787510wcH2, enumC1787510wcH3, enumC1787510wcH4, enumC1787510wcH5};
        LLILLJJLI = enumC1787510wcHArr;
        LLILLL = new C2254308sP(enumC1787510wcHArr);
    }

    public static EnumC1787510wcH[] values() {
        return (EnumC1787510wcH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1787510wcH valueOf(String str) {
        return (EnumC1787510wcH) C08FF.LIZ(EnumC1787510wcH.class, str);
    }

    public EnumC1787510wcH(String str, int i, String str2) {
        this.LL = str2;
    }
}
