package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC474020IiO {
    public static final EnumC474020IiO CREATE_ORDER_FAIL;
    public static final EnumC474020IiO IAP_CALLBACK;
    public static final /* synthetic */ EnumC474020IiO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC474020IiO WEBSOCKET_ORDER_SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC474020IiO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC474020IiO enumC474020IiO = new EnumC474020IiO("CREATE_ORDER_FAIL", 0, "create_order_fail");
        CREATE_ORDER_FAIL = enumC474020IiO;
        EnumC474020IiO enumC474020IiO2 = new EnumC474020IiO("IAP_CALLBACK", 1, "iap_callback");
        IAP_CALLBACK = enumC474020IiO2;
        EnumC474020IiO enumC474020IiO3 = new EnumC474020IiO("WEBSOCKET_ORDER_SUCCESS", 2, "websocket_order_success");
        WEBSOCKET_ORDER_SUCCESS = enumC474020IiO3;
        EnumC474020IiO[] enumC474020IiOArr = {enumC474020IiO, enumC474020IiO2, enumC474020IiO3};
        LLILLJJLI = enumC474020IiOArr;
        LLILLL = new C2254308sP(enumC474020IiOArr);
    }

    public static EnumC474020IiO[] values() {
        return (EnumC474020IiO[]) LLILLJJLI.clone();
    }

    public final String getTrackingName() {
        return this.LL;
    }

    public static EnumC474020IiO valueOf(String str) {
        return (EnumC474020IiO) C08FF.LIZ(EnumC474020IiO.class, str);
    }

    public EnumC474020IiO(String str, int i, String str2) {
        this.LL = str2;
    }
}
