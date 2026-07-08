package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1B0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2197951B0n {
    public static final EnumC2197951B0n ENTITLEMENT_PRECHECK_FAILED;
    public static final EnumC2197951B0n ENVIRONMENT_PRECHECK_FAILED;
    public static final /* synthetic */ EnumC2197951B0n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2197951B0n ORDER_CREATION_FAILED;
    public static final EnumC2197951B0n PRODUCT_FETCH_FAILED;
    public static final EnumC2197951B0n PRODUCT_PAYLOAD_MISSING;
    public static final EnumC2197951B0n PURCHASE_CANCELLED;
    public static final EnumC2197951B0n PURCHASE_FAILED;
    public static final EnumC2197951B0n PURCHASE_PENDING;
    public static final EnumC2197951B0n UNKNOWN;
    public static final EnumC2197951B0n USER_SYNC_FAILED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2197951B0n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2197951B0n enumC2197951B0n = new EnumC2197951B0n("ENVIRONMENT_PRECHECK_FAILED", 0, "environment_precheck_failed");
        ENVIRONMENT_PRECHECK_FAILED = enumC2197951B0n;
        EnumC2197951B0n enumC2197951B0n2 = new EnumC2197951B0n("ENTITLEMENT_PRECHECK_FAILED", 1, "entitlement_precheck_failed");
        ENTITLEMENT_PRECHECK_FAILED = enumC2197951B0n2;
        EnumC2197951B0n enumC2197951B0n3 = new EnumC2197951B0n("PRODUCT_FETCH_FAILED", 2, "product_fetch_failed");
        PRODUCT_FETCH_FAILED = enumC2197951B0n3;
        EnumC2197951B0n enumC2197951B0n4 = new EnumC2197951B0n("PRODUCT_PAYLOAD_MISSING", 3, "product_payload_missing");
        PRODUCT_PAYLOAD_MISSING = enumC2197951B0n4;
        EnumC2197951B0n enumC2197951B0n5 = new EnumC2197951B0n("ORDER_CREATION_FAILED", 4, "order_creation_failed");
        ORDER_CREATION_FAILED = enumC2197951B0n5;
        EnumC2197951B0n enumC2197951B0n6 = new EnumC2197951B0n("PURCHASE_CANCELLED", 5, "purchase_cancelled");
        PURCHASE_CANCELLED = enumC2197951B0n6;
        EnumC2197951B0n enumC2197951B0n7 = new EnumC2197951B0n("PURCHASE_FAILED", 6, "purchase_failed");
        PURCHASE_FAILED = enumC2197951B0n7;
        EnumC2197951B0n enumC2197951B0n8 = new EnumC2197951B0n("PURCHASE_PENDING", 7, "purchase_pending");
        PURCHASE_PENDING = enumC2197951B0n8;
        EnumC2197951B0n enumC2197951B0n9 = new EnumC2197951B0n("USER_SYNC_FAILED", 8, "user_sync_failed");
        USER_SYNC_FAILED = enumC2197951B0n9;
        EnumC2197951B0n enumC2197951B0n10 = new EnumC2197951B0n("UNKNOWN", 9, "unknown");
        UNKNOWN = enumC2197951B0n10;
        EnumC2197951B0n[] enumC2197951B0nArr = {enumC2197951B0n, enumC2197951B0n2, enumC2197951B0n3, enumC2197951B0n4, enumC2197951B0n5, enumC2197951B0n6, enumC2197951B0n7, enumC2197951B0n8, enumC2197951B0n9, enumC2197951B0n10};
        LLILLJJLI = enumC2197951B0nArr;
        LLILLL = new C2254308sP(enumC2197951B0nArr);
    }

    public static EnumC2197951B0n[] values() {
        return (EnumC2197951B0n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2197951B0n valueOf(String str) {
        return (EnumC2197951B0n) C08FF.LIZ(EnumC2197951B0n.class, str);
    }

    public EnumC2197951B0n(String str, int i, String str2) {
        this.LL = str2;
    }
}
