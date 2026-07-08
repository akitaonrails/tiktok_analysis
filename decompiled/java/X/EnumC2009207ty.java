package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009207ty {
    public static final /* synthetic */ EnumC2009207ty[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009207ty MINIS_TRADE_ORDER_STATUS_PENDING;
    public static final EnumC2009207ty MINIS_TRADE_ORDER_STATUS_SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009207ty> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009207ty enumC2009207ty = new EnumC2009207ty("MINIS_TRADE_ORDER_STATUS_PENDING", 0, 1);
        MINIS_TRADE_ORDER_STATUS_PENDING = enumC2009207ty;
        EnumC2009207ty enumC2009207ty2 = new EnumC2009207ty("MINIS_TRADE_ORDER_STATUS_SUCCESS", 1, 2);
        MINIS_TRADE_ORDER_STATUS_SUCCESS = enumC2009207ty2;
        EnumC2009207ty[] enumC2009207tyArr = {enumC2009207ty, enumC2009207ty2};
        LLILLJJLI = enumC2009207tyArr;
        LLILLL = new C2254308sP(enumC2009207tyArr);
    }

    public static EnumC2009207ty[] values() {
        return (EnumC2009207ty[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009207ty valueOf(String str) {
        return (EnumC2009207ty) C08FF.LIZ(EnumC2009207ty.class, str);
    }

    public EnumC2009207ty(String str, int i, int i2) {
        this.LL = i2;
    }
}
