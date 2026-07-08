package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1187020gzk {
    public static final EnumC1187020gzk INITIAL_FETCH;
    public static final /* synthetic */ EnumC1187020gzk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1187020gzk REFRESH_BY_EXCEPTION_UX;
    public static final EnumC1187020gzk REFRESH_CASHIER;
    public static final EnumC1187020gzk REFRESH_COUPON_PANEL;
    public static final EnumC1187020gzk SKU_QUANTITY_CHANGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1187020gzk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1187020gzk enumC1187020gzk = new EnumC1187020gzk("INITIAL_FETCH", 0, 1);
        INITIAL_FETCH = enumC1187020gzk;
        EnumC1187020gzk enumC1187020gzk2 = new EnumC1187020gzk("SKU_QUANTITY_CHANGE", 1, 2);
        SKU_QUANTITY_CHANGE = enumC1187020gzk2;
        EnumC1187020gzk enumC1187020gzk3 = new EnumC1187020gzk("REFRESH_COUPON_PANEL", 2, 3);
        REFRESH_COUPON_PANEL = enumC1187020gzk3;
        EnumC1187020gzk enumC1187020gzk4 = new EnumC1187020gzk("REFRESH_CASHIER", 3, 4);
        REFRESH_CASHIER = enumC1187020gzk4;
        EnumC1187020gzk enumC1187020gzk5 = new EnumC1187020gzk("REFRESH_BY_EXCEPTION_UX", 4, 5);
        REFRESH_BY_EXCEPTION_UX = enumC1187020gzk5;
        EnumC1187020gzk[] enumC1187020gzkArr = {enumC1187020gzk, enumC1187020gzk2, enumC1187020gzk3, enumC1187020gzk4, enumC1187020gzk5};
        LLILLJJLI = enumC1187020gzkArr;
        LLILLL = new C2254308sP(enumC1187020gzkArr);
    }

    public static EnumC1187020gzk[] values() {
        return (EnumC1187020gzk[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1187020gzk valueOf(String str) {
        return (EnumC1187020gzk) C08FF.LIZ(EnumC1187020gzk.class, str);
    }

    public EnumC1187020gzk(String str, int i, int i2) {
        this.LL = i2;
    }
}
