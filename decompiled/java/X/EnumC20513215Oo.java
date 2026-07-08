package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20513215Oo {
    public static final /* synthetic */ EnumC20513215Oo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20513215Oo PURCHASE_MONTHLY;
    public static final EnumC20513215Oo PURCHASE_MONTHLY_FROM_COIN;
    public static final EnumC20513215Oo PURCHASE_MONTHLY_WITH_CURRENT_WEEKLY_ONETIME;
    public static final EnumC20513215Oo PURCHASE_WEEKLY;
    public static final EnumC20513215Oo PURCHASE_WEEKLY_FROM_COIN;
    public static final EnumC20513215Oo RESUBSCRIBE_AFTER_CANCELLATION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20513215Oo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20513215Oo enumC20513215Oo = new EnumC20513215Oo("PURCHASE_WEEKLY", 0, 1);
        PURCHASE_WEEKLY = enumC20513215Oo;
        EnumC20513215Oo enumC20513215Oo2 = new EnumC20513215Oo("PURCHASE_MONTHLY", 1, 2);
        PURCHASE_MONTHLY = enumC20513215Oo2;
        EnumC20513215Oo enumC20513215Oo3 = new EnumC20513215Oo("PURCHASE_MONTHLY_FROM_COIN", 2, 3);
        PURCHASE_MONTHLY_FROM_COIN = enumC20513215Oo3;
        EnumC20513215Oo enumC20513215Oo4 = new EnumC20513215Oo("RESUBSCRIBE_AFTER_CANCELLATION", 3, 4);
        RESUBSCRIBE_AFTER_CANCELLATION = enumC20513215Oo4;
        EnumC20513215Oo enumC20513215Oo5 = new EnumC20513215Oo("PURCHASE_MONTHLY_WITH_CURRENT_WEEKLY_ONETIME", 4, 5);
        PURCHASE_MONTHLY_WITH_CURRENT_WEEKLY_ONETIME = enumC20513215Oo5;
        EnumC20513215Oo enumC20513215Oo6 = new EnumC20513215Oo("PURCHASE_WEEKLY_FROM_COIN", 5, 6);
        PURCHASE_WEEKLY_FROM_COIN = enumC20513215Oo6;
        EnumC20513215Oo[] enumC20513215OoArr = {enumC20513215Oo, enumC20513215Oo2, enumC20513215Oo3, enumC20513215Oo4, enumC20513215Oo5, enumC20513215Oo6};
        LLILLJJLI = enumC20513215OoArr;
        LLILLL = new C2254308sP(enumC20513215OoArr);
    }

    public static EnumC20513215Oo[] values() {
        return (EnumC20513215Oo[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20513215Oo valueOf(String str) {
        return (EnumC20513215Oo) C08FF.LIZ(EnumC20513215Oo.class, str);
    }

    public EnumC20513215Oo(String str, int i, int i2) {
        this.LL = i2;
    }
}
