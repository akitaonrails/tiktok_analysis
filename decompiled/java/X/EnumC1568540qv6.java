package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1568540qv6 {
    public static final EnumC1568540qv6 FROZEN_COINS;
    public static final /* synthetic */ EnumC1568540qv6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1568540qv6 QUICK_CHARGE;
    public static final EnumC1568540qv6 RETENTION_TASK;
    public static final EnumC1568540qv6 REVENUE_RECHARGE_BANNER;
    public static final EnumC1568540qv6 VAULT_RECHARGE_TO_UNLOCK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1568540qv6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1568540qv6 enumC1568540qv6 = new EnumC1568540qv6("QUICK_CHARGE", 0, 0);
        QUICK_CHARGE = enumC1568540qv6;
        EnumC1568540qv6 enumC1568540qv62 = new EnumC1568540qv6("VAULT_RECHARGE_TO_UNLOCK", 1, 1);
        VAULT_RECHARGE_TO_UNLOCK = enumC1568540qv62;
        EnumC1568540qv6 enumC1568540qv63 = new EnumC1568540qv6("RETENTION_TASK", 2, 2);
        RETENTION_TASK = enumC1568540qv63;
        EnumC1568540qv6 enumC1568540qv64 = new EnumC1568540qv6("FROZEN_COINS", 3, 3);
        FROZEN_COINS = enumC1568540qv64;
        EnumC1568540qv6 enumC1568540qv65 = new EnumC1568540qv6("REVENUE_RECHARGE_BANNER", 4, 4);
        REVENUE_RECHARGE_BANNER = enumC1568540qv65;
        EnumC1568540qv6[] enumC1568540qv6Arr = {enumC1568540qv6, enumC1568540qv62, enumC1568540qv63, enumC1568540qv64, enumC1568540qv65};
        LLILLJJLI = enumC1568540qv6Arr;
        LLILLL = new C2254308sP(enumC1568540qv6Arr);
    }

    public static EnumC1568540qv6[] values() {
        return (EnumC1568540qv6[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC1568540qv6 valueOf(String str) {
        return (EnumC1568540qv6) C08FF.LIZ(EnumC1568540qv6.class, str);
    }

    public EnumC1568540qv6(String str, int i, int i2) {
        this.LL = i2;
    }
}
