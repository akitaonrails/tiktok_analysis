package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1794750wnx {
    public static final EnumC1794750wnx CASHIER_DESTROY;
    public static final EnumC1794750wnx CASHIER_RESUME;
    public static final EnumC1794750wnx LAUNCH_CASHIER_API;
    public static final /* synthetic */ EnumC1794750wnx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1794750wnx PURCHASE_COMPLETED;
    public static final EnumC1794750wnx START_CASHIER;

    public static InterfaceC2044707zh<EnumC1794750wnx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1794750wnx enumC1794750wnx = new EnumC1794750wnx("START_CASHIER", 0);
        START_CASHIER = enumC1794750wnx;
        EnumC1794750wnx enumC1794750wnx2 = new EnumC1794750wnx("LAUNCH_CASHIER_API", 1);
        LAUNCH_CASHIER_API = enumC1794750wnx2;
        EnumC1794750wnx enumC1794750wnx3 = new EnumC1794750wnx("CASHIER_RESUME", 2);
        CASHIER_RESUME = enumC1794750wnx3;
        EnumC1794750wnx enumC1794750wnx4 = new EnumC1794750wnx("PURCHASE_COMPLETED", 3);
        PURCHASE_COMPLETED = enumC1794750wnx4;
        EnumC1794750wnx enumC1794750wnx5 = new EnumC1794750wnx("CASHIER_DESTROY", 4);
        CASHIER_DESTROY = enumC1794750wnx5;
        EnumC1794750wnx[] enumC1794750wnxArr = {enumC1794750wnx, enumC1794750wnx2, enumC1794750wnx3, enumC1794750wnx4, enumC1794750wnx5};
        LL = enumC1794750wnxArr;
        LLILLJJLI = new C2254308sP(enumC1794750wnxArr);
    }

    public static EnumC1794750wnx[] values() {
        return (EnumC1794750wnx[]) LL.clone();
    }

    public static EnumC1794750wnx valueOf(String str) {
        return (EnumC1794750wnx) C08FF.LIZ(EnumC1794750wnx.class, str);
    }

    public EnumC1794750wnx(String str, int i) {
    }
}
