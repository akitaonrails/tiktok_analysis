package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1614850s7n {
    public static final EnumC1614850s7n EMPTY_MARKETPLACE_RESULT;
    public static final EnumC1614850s7n EMPTY_SDK_PAYLOAD;
    public static final /* synthetic */ EnumC1614850s7n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1614850s7n OFFER_MATCH_FAILED;
    public static final EnumC1614850s7n PRODUCT_DETAIL_NOT_FOUND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1614850s7n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1614850s7n enumC1614850s7n = new EnumC1614850s7n("EMPTY_MARKETPLACE_RESULT", 0, "empty_marketplace_result");
        EMPTY_MARKETPLACE_RESULT = enumC1614850s7n;
        EnumC1614850s7n enumC1614850s7n2 = new EnumC1614850s7n("PRODUCT_DETAIL_NOT_FOUND", 1, "product_detail_not_found");
        PRODUCT_DETAIL_NOT_FOUND = enumC1614850s7n2;
        EnumC1614850s7n enumC1614850s7n3 = new EnumC1614850s7n("OFFER_MATCH_FAILED", 2, "offer_match_failed");
        OFFER_MATCH_FAILED = enumC1614850s7n3;
        EnumC1614850s7n enumC1614850s7n4 = new EnumC1614850s7n("EMPTY_SDK_PAYLOAD", 3, "empty_sdk_payload");
        EMPTY_SDK_PAYLOAD = enumC1614850s7n4;
        EnumC1614850s7n[] enumC1614850s7nArr = {enumC1614850s7n, enumC1614850s7n2, enumC1614850s7n3, enumC1614850s7n4};
        LLILLJJLI = enumC1614850s7nArr;
        LLILLL = new C2254308sP(enumC1614850s7nArr);
    }

    public static EnumC1614850s7n[] values() {
        return (EnumC1614850s7n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1614850s7n valueOf(String str) {
        return (EnumC1614850s7n) C08FF.LIZ(EnumC1614850s7n.class, str);
    }

    public EnumC1614850s7n(String str, int i, String str2) {
        this.LL = str2;
    }
}
