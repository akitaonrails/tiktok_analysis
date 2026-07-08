package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1805430x5B {
    public static final C1806540x6y Companion;
    public static final EnumC1805430x5B EXCHANGE_SUCCESS;
    public static final /* synthetic */ EnumC1805430x5B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1805430x5B OTHERS;
    public static final EnumC1805430x5B PREFETCH;
    public static final EnumC1805430x5B UG_COIN_INCENTIVE_TASK;
    public static final EnumC1805430x5B UG_POINTS_GIFT;
    public static final EnumC1805430x5B WALLET_WS_MSG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1805430x5B> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0x6y] */
    static {
        EnumC1805430x5B enumC1805430x5B = new EnumC1805430x5B("PREFETCH", 0, "prefetch");
        PREFETCH = enumC1805430x5B;
        EnumC1805430x5B enumC1805430x5B2 = new EnumC1805430x5B("EXCHANGE_SUCCESS", 1, "exchange_success");
        EXCHANGE_SUCCESS = enumC1805430x5B2;
        EnumC1805430x5B enumC1805430x5B3 = new EnumC1805430x5B("UG_POINTS_GIFT", 2, "ug_points_gift");
        UG_POINTS_GIFT = enumC1805430x5B3;
        EnumC1805430x5B enumC1805430x5B4 = new EnumC1805430x5B("UG_COIN_INCENTIVE_TASK", 3, "ug_coin_incentive_task");
        UG_COIN_INCENTIVE_TASK = enumC1805430x5B4;
        EnumC1805430x5B enumC1805430x5B5 = new EnumC1805430x5B("WALLET_WS_MSG", 4, "wallet_ws_msg");
        WALLET_WS_MSG = enumC1805430x5B5;
        EnumC1805430x5B enumC1805430x5B6 = new EnumC1805430x5B("OTHERS", 5, "others");
        OTHERS = enumC1805430x5B6;
        EnumC1805430x5B[] enumC1805430x5BArr = {enumC1805430x5B, enumC1805430x5B2, enumC1805430x5B3, enumC1805430x5B4, enumC1805430x5B5, enumC1805430x5B6};
        LLILLJJLI = enumC1805430x5BArr;
        LLILLL = new C2254308sP(enumC1805430x5BArr);
        Companion = new Object() { // from class: X.0x6y
        };
    }

    public static EnumC1805430x5B[] values() {
        return (EnumC1805430x5B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1805430x5B valueOf(String str) {
        return (EnumC1805430x5B) C08FF.LIZ(EnumC1805430x5B.class, str);
    }

    public EnumC1805430x5B(String str, int i, String str2) {
        this.LL = str2;
    }
}
