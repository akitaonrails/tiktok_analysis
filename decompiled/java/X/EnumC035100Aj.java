package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035100Aj {
    public static final EnumC035100Aj FYP_LIVE;
    public static final EnumC035100Aj LIVE_REDEEM_POPUP;
    public static final EnumC035100Aj LIVE_SHOP_BAG;
    public static final /* synthetic */ EnumC035100Aj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035100Aj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035100Aj enumC035100Aj = new EnumC035100Aj("FYP_LIVE", 0, 1);
        FYP_LIVE = enumC035100Aj;
        EnumC035100Aj enumC035100Aj2 = new EnumC035100Aj("LIVE_SHOP_BAG", 1, 2);
        LIVE_SHOP_BAG = enumC035100Aj2;
        EnumC035100Aj enumC035100Aj3 = new EnumC035100Aj("LIVE_REDEEM_POPUP", 2, 3);
        LIVE_REDEEM_POPUP = enumC035100Aj3;
        EnumC035100Aj[] enumC035100AjArr = {enumC035100Aj, enumC035100Aj2, enumC035100Aj3};
        LLILLJJLI = enumC035100AjArr;
        LLILLL = new C2254308sP(enumC035100AjArr);
    }

    public static EnumC035100Aj[] values() {
        return (EnumC035100Aj[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC035100Aj valueOf(String str) {
        return (EnumC035100Aj) C08FF.LIZ(EnumC035100Aj.class, str);
    }

    public EnumC035100Aj(String str, int i, int i2) {
        this.LL = i2;
    }
}
