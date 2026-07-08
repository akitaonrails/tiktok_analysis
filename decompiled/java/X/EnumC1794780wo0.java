package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1794780wo0 {
    public static final EnumC1794780wo0 CASHIER_DESTROY;
    public static final EnumC1794780wo0 CASHIER_RESUME;
    public static final EnumC1794780wo0 LAUNCH_CASHIER_API;
    public static final /* synthetic */ EnumC1794780wo0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1794780wo0 PURCHASE_COMPLETED;
    public static final EnumC1794780wo0 START_CASHIER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1794780wo0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1794780wo0 enumC1794780wo0 = new EnumC1794780wo0("START_CASHIER", 0, 0);
        START_CASHIER = enumC1794780wo0;
        EnumC1794780wo0 enumC1794780wo02 = new EnumC1794780wo0("LAUNCH_CASHIER_API", 1, 1);
        LAUNCH_CASHIER_API = enumC1794780wo02;
        EnumC1794780wo0 enumC1794780wo03 = new EnumC1794780wo0("CASHIER_RESUME", 2, 2);
        CASHIER_RESUME = enumC1794780wo03;
        EnumC1794780wo0 enumC1794780wo04 = new EnumC1794780wo0("PURCHASE_COMPLETED", 3, 3);
        PURCHASE_COMPLETED = enumC1794780wo04;
        EnumC1794780wo0 enumC1794780wo05 = new EnumC1794780wo0("CASHIER_DESTROY", 4, 4);
        CASHIER_DESTROY = enumC1794780wo05;
        EnumC1794780wo0[] enumC1794780wo0Arr = {enumC1794780wo0, enumC1794780wo02, enumC1794780wo03, enumC1794780wo04, enumC1794780wo05};
        LLILLJJLI = enumC1794780wo0Arr;
        LLILLL = new C2254308sP(enumC1794780wo0Arr);
    }

    public static EnumC1794780wo0[] values() {
        return (EnumC1794780wo0[]) LLILLJJLI.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public static EnumC1794780wo0 valueOf(String str) {
        return (EnumC1794780wo0) C08FF.LIZ(EnumC1794780wo0.class, str);
    }

    public EnumC1794780wo0(String str, int i, int i2) {
        this.LL = i2;
    }
}
