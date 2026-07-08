package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC094700Xh {
    public static final EnumC094700Xh FlashSaleViewWithCountDown;
    public static final EnumC094700Xh FlashSaleViewWithoutCountDown;
    public static final /* synthetic */ EnumC094700Xh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC094700Xh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC094700Xh enumC094700Xh = new EnumC094700Xh("FlashSaleViewWithCountDown", 0);
        FlashSaleViewWithCountDown = enumC094700Xh;
        EnumC094700Xh enumC094700Xh2 = new EnumC094700Xh("FlashSaleViewWithoutCountDown", 1);
        FlashSaleViewWithoutCountDown = enumC094700Xh2;
        EnumC094700Xh[] enumC094700XhArr = {enumC094700Xh, enumC094700Xh2};
        LL = enumC094700XhArr;
        LLILLJJLI = new C2254308sP(enumC094700XhArr);
    }

    public static EnumC094700Xh[] values() {
        return (EnumC094700Xh[]) LL.clone();
    }

    public static EnumC094700Xh valueOf(String str) {
        return (EnumC094700Xh) C08FF.LIZ(EnumC094700Xh.class, str);
    }

    public EnumC094700Xh(String str, int i) {
    }
}
